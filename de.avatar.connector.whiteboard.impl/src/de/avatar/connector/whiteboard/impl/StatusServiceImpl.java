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
package de.avatar.connector.whiteboard.impl;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
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
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.generator.api.api.AvatarGenerator;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.Metadata;
import de.avatar.model.connector.ResponseCode;
import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusPackage;

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

	@Reference
	AvatarGenerator avatarGenerator;

	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());	

	private Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	private Map<String, QueryStatusResponse> cachedStatuses = new ConcurrentHashMap<>();
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
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse)
	 */
	@Override
	public void updateStatus(EndpointResponse endpointResponse) {
		
		if(!cachedStatuses.containsKey(endpointResponse.getRequest().getId())) {
			cachedStatuses.put(endpointResponse.getRequest().getId(), StatusFactory.eINSTANCE.createQueryStatusResponse());
		}
		QueryStatusResponse statusResponse = cachedStatuses.get(endpointResponse.getRequest().getId());
		statusResponse.setRequestId(endpointResponse.getRequest().getId());
		statusResponse.setTimestamp(Instant.now().toEpochMilli());		
		
		if(ResponseCode.OK.equals(endpointResponse.getCode())) {
			LOGGER.info(String.format("I am aggregating response for %s", endpointResponse.getRequest().getId()));
			avatarGenerator.aggregateResponse(endpointResponse);
		}

	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#getStatusUpdate(java.lang.String)
	 */
	@Override
	public QueryStatusResponse getStatusUpdate(String requestId) {		
		return cachedStatuses.getOrDefault(requestId, null);
	}



	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse, de.avatar.status.SingleConnectorQueryStatus)
	 */
	@Override
	public void updateStatus(EndpointResponse endpointResponse, SingleConnectorQueryStatus sgConnQueryStatus) {
		
		LOGGER.info(String.format("I am updating the status for request %s", endpointResponse.getRequest().getId()));
		if(!cachedStatuses.containsKey(endpointResponse.getRequest().getId())) {
			cachedStatuses.put(endpointResponse.getRequest().getId(), StatusFactory.eINSTANCE.createQueryStatusResponse());
		}
		QueryStatusResponse statusResponse = cachedStatuses.get(endpointResponse.getRequest().getId());
		statusResponse.setRequestId(endpointResponse.getRequest().getId());
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
		
		determineGlobalStatusType(endpointResponse, statusResponse);
		
		
		if(ResponseCode.OK.equals(endpointResponse.getCode())) {
			LOGGER.info(String.format("I am aggregating response for %s", endpointResponse.getRequest().getId()));
			avatarGenerator.aggregateResponse(endpointResponse);
		}		
		
		statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
			//				We do not want to display the full response result when the status is SUCCESS
			scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
		});
	}
	
	private void determineGlobalStatusType(EndpointResponse endpointResponse, QueryStatusResponse statusResponse) {
		QueryStatusType queryStatusType = QueryStatusType.SUCCESS;
		Metadata totConnForRequest = endpointResponse.getMetadata().stream().filter(m -> "tot.connectors.for.request".equals(m.getKey())).findAny().orElse(null);
		if(totConnForRequest != null) {
			int numConnForReq = Integer.valueOf(totConnForRequest.getValue());
			int numConnUpdates = statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().size();
			
//			if all the connectors have a success --> SUCCESS
//			if all the connectors have a dryrun_success --> DRYRUN_SUCCESS
//			if at least one connector is pending --> PENDING
//			if not all the connectors responded --> PENDING
//			if there are no pending connectors and at least one has an error --> ERROR			
			if(numConnForReq > numConnUpdates) {
				queryStatusType = QueryStatusType.PENDING;
			} else {
				for(QueryStatusType connStatus : statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().stream().map(c -> c.getStatusResult().getStatus()).toList()) {
					if(QueryStatusType.PENDING.equals(connStatus)) {
						queryStatusType = QueryStatusType.PENDING;
						break;
					} else if(QueryStatusType.ERROR.equals(connStatus)) {
						queryStatusType = QueryStatusType.ERROR;
					}
				}
			}		
			if(QueryStatusType.SUCCESS.equals(queryStatusType) && (numConnForReq == numConnUpdates)) {
				if(QueryStatusType.SUCCESS.equals(statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().stream().map(c -> c.getStatusResult().getStatus()).findFirst().orElse(null))) {
					queryStatusType = QueryStatusType.SUCCESS;
				} else if(QueryStatusType.DRYRUN_SUCCESS.equals(statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().stream().map(c -> c.getStatusResult().getStatus()).findFirst().orElse(null))) {
					queryStatusType = QueryStatusType.DRYRUN_SUCCESS;
				}
			}
		} else {
			LOGGER.severe(String.format("No metadata for tot.connectors.for.request: cannot determine global status, so setting to error"));
			queryStatusType = QueryStatusType.ERROR;
			statusResponse.setMessage(String.format("No metadata for tot.connectors.for.request: cannot determine global status, so setting to error"));
		}
		statusResponse.setStatus(queryStatusType);
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

}


