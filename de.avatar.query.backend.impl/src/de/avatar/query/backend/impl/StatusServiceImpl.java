/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.query.backend.impl;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.cleanup.api.api.AvatarDataCleanup;
import de.avatar.connector.cleanup.api.api.AvatarDataCleanupConfig;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.query.backend.api.StatusService;
import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;

/**
 * 
 * @author ilenia
 * @since Jan 13, 2025
 */
@Component(immediate = true, name = "StatusService", service = {StatusService.class, AvatarDataCleanup.class}, 
configurationPid = "StatusServiceCleanup", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class StatusServiceImpl implements StatusService, AvatarDataCleanup{

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;

	

	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());	

	private Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	private Map<String, QueryResponse> cachedStatuses = new ConcurrentHashMap<>();
	
	private Map<String, Map<String, QueryRequest>> cachedRequestsWithAuth = new ConcurrentHashMap<>();
	private Map<String, Map<String, QueryResponse>> cachedStatusesWithAuth = new ConcurrentHashMap<>();
	
	private AvatarDataCleanupConfig cleanupConfig;
	private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	
	@Activate
	public void activate(AvatarDataCleanupConfig cleanupConfig) {
		this.cleanupConfig = cleanupConfig;	
		executor.scheduleAtFixedRate(this::run, cleanupConfig.cleanupDelay(), cleanupConfig.cleanupRate(), TimeUnit.valueOf(cleanupConfig.cleanupUnit()));
	}
	
	@Deactivate
	public void deactivate() {
		executor.shutdown();
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#isRequestCached(de.avatar.status.QueryRequest)
	 */
	public boolean isRequestCached(QueryRequest request) {
		if(request.getRequestId() == null) return false;
		if(cachedRequests.containsKey(request.getRequestId())) return true;
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#getCachedRequest(java.lang.String)
	 */
	public QueryRequest getCachedRequest(String requestId) {
		return cachedRequests.getOrDefault(requestId, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#cacheRequest(de.avatar.status.QueryRequest)
	 */
	public void cacheRequest(QueryRequest request) {
		if(request.getRequestId() != null) {
			cachedRequests.put(request.getRequestId(), request);
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.status.QueryResponse)
	 */
	@Override
	public void updateStatus(QueryResponse queryResponse) {
		cachedStatuses.put(queryResponse.getRequestId(), queryResponse);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#getStatusUpdate(java.lang.String)
	 */
	@Override
	public QueryResponse getStatusUpdate(String requestId) {		
		return cachedStatuses.getOrDefault(requestId, null);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse, de.avatar.status.SingleConnectorQueryStatus, java.lang.String, boolean)
	 */
	@Override
	public void updateStatus(EndpointResponse endpointResponse, SingleConnectorQueryStatus sgConnQueryStatus, String reqType, boolean isPartialUpdate) {
		
		LOGGER.info(String.format("I am updating the status for request %s", endpointResponse.getSourceId()));
		String reqId = endpointResponse.getSourceId();
		if(!cachedStatuses.containsKey(reqId) || !(cachedStatuses.get(reqId) instanceof QueryStatusResponse)) {
			QueryStatusResponse qsr = StatusFactory.eINSTANCE.createQueryStatusResponse();
			qsr.setRequestId(reqId);
			cachedStatuses.put(reqId, qsr);
		}
		QueryStatusResponse statusResponse = (QueryStatusResponse) cachedStatuses.get(reqId);
		statusResponse.setTimestamp(Instant.now().toEpochMilli());
		DetailedQueryStatus detailedStatus = statusResponse.getDetailedStatus();
		if(detailedStatus == null) {
			detailedStatus = StatusFactory.eINSTANCE.createDetailedQueryStatus();
			statusResponse.setDetailedStatus(detailedStatus);
		} else {
//			check if a sgConnStatus for the same connector already exists and if so we replace it with the new one
			SingleConnectorQueryStatus oldConnStatus = detailedStatus.getSingleConnectorQueryStatus().
				stream().
				filter(scqs -> scqs.getConnectorId().equals(sgConnQueryStatus.getConnectorId())).
				findAny().
				orElse(null);
			if(oldConnStatus != null) {
				detailedStatus.getSingleConnectorQueryStatus().remove(oldConnStatus);
			}
		}
		detailedStatus.getSingleConnectorQueryStatus().add(sgConnQueryStatus);
		
		if(isPartialUpdate) statusResponse.setStatus(QueryStatusType.QUERY_PENDING);
		else if(reqType.equals("dryrun")) statusResponse.setStatus(QueryStatusType.QUERY_DRYRUN_COMPLETED);
		else statusResponse.setStatus(QueryStatusType.QUERY_COMPLETED);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		LOGGER.info(String.format("Starting StatusCleanup job! Initial Status Map Size %d", cachedStatuses.size()));
		Instant now = Instant.now();
		Instant criticInstant = now.minus(cleanupConfig.removeOlderThan(), ChronoUnit.valueOf(cleanupConfig.removeOlderThanUnit()));
		cachedStatuses.
			entrySet(). 
            removeIf(entry -> criticInstant.isAfter(Instant.ofEpochMilli(entry.getValue().getTimestamp()))); 
		cachedRequests.
			entrySet().
			removeIf(entry -> !cachedStatuses.containsKey(entry.getKey()));		
		LOGGER.info(String.format("Finished StatusCleanup job! Final Status Map Size %d", cachedStatuses.size()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getCachedRequest(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryRequest getCachedRequest(String requestId, String token) {
		Map<String, QueryRequest> requestsForUser = cachedRequestsWithAuth.getOrDefault(token, null);
		if(requestsForUser == null) return null;
		return requestsForUser.getOrDefault(requestId, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getStatusUpdate(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse getStatusUpdate(String requestId, String token) {
		Map<String, QueryResponse> statusesForUser = cachedStatusesWithAuth.getOrDefault(token, null);
		if(statusesForUser == null) return null;
		return statusesForUser.getOrDefault(requestId, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#cacheRequest(de.avatar.status.QueryRequest, java.lang.String)
	 */
	@Override
	public void cacheRequest(QueryRequest request, String token) {
		
		if(request.getRequestId() != null) {
			if(!cachedRequestsWithAuth.containsKey(token)) {
				cachedRequestsWithAuth.put(token, new HashMap<>());
			}
			cachedRequestsWithAuth.get(token).put(request.getRequestId(), request);
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getCachedRequestIds(java.lang.String)
	 */
	@Override
	public List<String> getCachedRequestIds(String token) {
		if(!cachedRequestsWithAuth.containsKey(token)) return Collections.emptyList();
		return cachedRequestsWithAuth.get(token).keySet().stream().toList();
	}
}


