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
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

import biz.aQute.scheduler.api.Constants;
import biz.aQute.scheduler.api.CronExpression;
import biz.aQute.scheduler.api.CronJob;
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
@Component(immediate = true, name = "StatusService", service = {StatusService.class, CronJob.class})
@CronExpression(name = "StatusServiceCleanup", cron = { Constants.CRON_EXPRESSION_DAILY,
		Constants.CRON_EXPRESSION_REBOOT })
public class StatusServiceImpl implements StatusService, CronJob{

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;



	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());	

//	private Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
//	private Map<String, QueryResponse> cachedStatuses = new ConcurrentHashMap<>();

	private Map<String, Map<String, QueryRequest>> cachedRequestsWithAuth = new ConcurrentHashMap<>();
	private Map<String, Map<String, QueryResponse>> cachedStatusesWithAuth = new ConcurrentHashMap<>();

	private AvatarDataCleanupConfig cleanupConfig;
//	private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

	@Activate
	public void activate(AvatarDataCleanupConfig cleanupConfig) {
		this.cleanupConfig = cleanupConfig;	
//		executor.scheduleAtFixedRate(this::run, cleanupConfig.cleanupDelay(), cleanupConfig.cleanupRate(), TimeUnit.valueOf(cleanupConfig.cleanupUnit()));
	}

//	@Deactivate
//	public void deactivate() {
//		executor.shutdown();
//	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#isRequestCached(de.avatar.status.QueryRequest)
	 */
	public boolean isRequestCached(QueryRequest request, String token) {
		if(request.getRequestId() == null) return false;
		String userId = extractUserIdFromToken(token);
		if(userId == null) return false;
		if(!cachedRequestsWithAuth.containsKey(userId)) return false;
		if(cachedRequestsWithAuth.get(userId).containsKey(request.getRequestId())) return true;
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#getCachedRequest(java.lang.String)
	 */
//	public QueryRequest getCachedRequest(String requestId) {
//		return cachedRequests.getOrDefault(requestId, null);
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.connector.whiteboard.api.StatusService#cacheRequest(de.avatar.status.QueryRequest)
//	 */
//	public void cacheRequest(QueryRequest request) {
//		if(request.getRequestId() != null) {
//			cachedRequests.put(request.getRequestId(), request);
//		}
//	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.status.QueryResponse)
	 */
//	@Override
//	public void updateStatus(QueryResponse queryResponse) {
//		cachedStatuses.put(queryResponse.getRequestId(), queryResponse);
//	}
//
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.connector.whiteboard.api.StatusService#getStatusUpdate(java.lang.String)
//	 */
//	@Override
//	public QueryResponse getStatusUpdate(String requestId) {		
//		return cachedStatuses.getOrDefault(requestId, createErrorResponse(requestId, String.format("No cached status for request %s", requestId)));
//	}
//
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse, de.avatar.status.SingleConnectorQueryStatus, java.lang.String, boolean)
//	 */
//	@Override
//	public void updateStatus(EndpointResponse endpointResponse, SingleConnectorQueryStatus sgConnQueryStatus, String reqType, boolean isPartialUpdate) {
//
//		LOGGER.info(String.format("I am updating the status for request %s", endpointResponse.getSourceId()));
//		String reqId = endpointResponse.getSourceId();
//		if(!cachedStatuses.containsKey(reqId) || !(cachedStatuses.get(reqId) instanceof QueryStatusResponse)) {
//			QueryStatusResponse qsr = StatusFactory.eINSTANCE.createQueryStatusResponse();
//			qsr.setRequestId(reqId);
//			cachedStatuses.put(reqId, qsr);
//		}
//		QueryStatusResponse statusResponse = (QueryStatusResponse) cachedStatuses.get(reqId);
//		statusResponse.setTimestamp(Instant.now().toEpochMilli());
//		DetailedQueryStatus detailedStatus = statusResponse.getDetailedStatus();
//		if(detailedStatus == null) {
//			detailedStatus = StatusFactory.eINSTANCE.createDetailedQueryStatus();
//			statusResponse.setDetailedStatus(detailedStatus);
//		} else {
//			//			check if a sgConnStatus for the same connector already exists and if so we replace it with the new one
//			SingleConnectorQueryStatus oldConnStatus = detailedStatus.getSingleConnectorQueryStatus().
//					stream().
//					filter(scqs -> scqs.getConnectorId().equals(sgConnQueryStatus.getConnectorId())).
//					findAny().
//					orElse(null);
//			if(oldConnStatus != null) {
//				detailedStatus.getSingleConnectorQueryStatus().remove(oldConnStatus);
//			}
//		}
//		detailedStatus.getSingleConnectorQueryStatus().add(sgConnQueryStatus);
//
//		if(isPartialUpdate) statusResponse.setStatus(QueryStatusType.QUERY_PENDING);
//		else if(reqType.equals("dryrun")) statusResponse.setStatus(QueryStatusType.QUERY_DRYRUN_COMPLETED);
//		else statusResponse.setStatus(QueryStatusType.QUERY_COMPLETED);
//	}

	/* 
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		LOGGER.info(String.format("[%s] Starting", cleanupConfig.jobName()));
		Instant now = Instant.now();
		Instant criticInstant = now.minus(cleanupConfig.removeOlderThan(), ChronoUnit.valueOf(cleanupConfig.removeOlderThanUnit()));
//		cachedStatuses.
//		entrySet(). 
//		removeIf(entry -> criticInstant.isAfter(Instant.ofEpochMilli(entry.getValue().getTimestamp()))); 
//		cachedRequests.
//		entrySet().
//		removeIf(entry -> !cachedStatuses.containsKey(entry.getKey()));		

		cachedStatusesWithAuth.
		values().
		forEach(v -> {
			v.entrySet().removeIf(entry -> criticInstant.isAfter(Instant.ofEpochMilli(entry.getValue().getTimestamp()))); 
		});
		cachedStatusesWithAuth.
		entrySet().
		removeIf(entry -> entry.getValue().isEmpty());

		cachedRequestsWithAuth.entrySet().removeIf(entry -> !cachedStatusesWithAuth.containsKey(entry.getKey()));
		cachedRequestsWithAuth.entrySet().forEach(
				entry -> {
					if(cachedStatusesWithAuth.containsKey(entry.getKey())) {
						entry.getValue().entrySet().removeIf(ev -> !cachedStatusesWithAuth.get(entry.getKey()).containsKey(ev.getKey()));
					}
				}
				);

		cachedRequestsWithAuth.
		entrySet().
		removeIf(entry -> entry.getValue().isEmpty());
		LOGGER.info(String.format("[%s] Finished", cleanupConfig.jobName()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getCachedRequest(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryRequest getCachedRequest(String requestId, String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe(String.format("Cannot get cached request %s because userId from token is null", requestId));
			return null;
		}
		Map<String, QueryRequest> requestsForUser = cachedRequestsWithAuth.getOrDefault(userId, null);
		if(requestsForUser == null) return null;
		return requestsForUser.getOrDefault(requestId, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getStatusUpdate(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse getStatusUpdate(String requestId, String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe(String.format("Cannot get status for request %s because userId from token is null", requestId));
			return createErrorResponse(requestId, String.format("Cannot get status for request %s because userId from token is null", requestId));
		}
		Map<String, QueryResponse> statusesForUser = cachedStatusesWithAuth.getOrDefault(userId, null);
		if(statusesForUser == null) return createErrorResponse(requestId, String.format("No cached status for request %s", requestId));
		return statusesForUser.getOrDefault(requestId, createErrorResponse(requestId, String.format("No cached status for request %s", requestId)));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#cacheRequest(de.avatar.status.QueryRequest, java.lang.String)
	 */
	@Override
	public void cacheRequest(QueryRequest request, String token) {
		if(request.getRequestId() != null) {
			String userId = extractUserIdFromToken(token);
			if(userId == null) {
				LOGGER.severe(String.format("userId from token is null. Cannot cache request %s", request.getRequestId()));
				return;
			}		
			if(!cachedRequestsWithAuth.containsKey(userId)) {
				cachedRequestsWithAuth.put(userId, new HashMap<>());
			}
			cachedRequestsWithAuth.get(userId).put(request.getRequestId(), request);
			LOGGER.info("Cached request with id " + request.getRequestId() + " " + cachedRequestsWithAuth.get(userId).size());
		} else {
			LOGGER.severe(String.format("Cannot cache request with null id!"));
			return;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getCachedRequestIds(java.lang.String)
	 */
	@Override
	public List<String> getCachedRequestIds(String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe("Cannot retrieve queries for user because userId from token is null");
			return Collections.emptyList();
		}
		if(!cachedRequestsWithAuth.containsKey(userId)) return Collections.emptyList();
		LOGGER.info("Cached request for user are " + cachedRequestsWithAuth.get(userId).size());
		return cachedRequestsWithAuth.get(userId).keySet().stream().toList();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#getCachedStatuses(java.lang.String)
	 */
	@Override
	public List<QueryResponse> getCachedStatuses(String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe("Cannot retrieve queries for user because userId from token is null");
			return Collections.emptyList();
		}
		if(!cachedStatusesWithAuth.containsKey(userId)) return Collections.emptyList();
		LOGGER.info("Cached request for user are " + cachedStatusesWithAuth.get(userId).size());
		return cachedStatusesWithAuth.get(userId).values().stream().toList();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#updateStatus(de.avatar.status.QueryResponse, java.lang.String)
	 */
	@Override
	public void updateStatus(QueryResponse queryResponse, String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe(String.format("Cannot update status for request %s for user because userId is not found in token", queryResponse.getRequestId()));
			return;
		}
		if(!cachedStatusesWithAuth.containsKey(userId)) cachedStatusesWithAuth.put(userId, new HashMap<>());
		cachedStatusesWithAuth.get(userId).put(queryResponse.getRequestId(), queryResponse);		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse, de.avatar.status.SingleConnectorQueryStatus, java.lang.String, boolean, java.lang.String)
	 */
	@Override
	public void updateStatus(EndpointResponse endpointResponse, SingleConnectorQueryStatus sgConnQueryStatus,
			String reqType, boolean isPartialUpdate, String token) {
		String userId = extractUserIdFromToken(token);
		if(userId == null) {
			LOGGER.severe(String.format("Cannot update status for request %s for user because userId is not found in token", endpointResponse.getSourceId()));
			return;
		}

		LOGGER.info(String.format("I am updating the status for user for request %s", endpointResponse.getSourceId()));
		String reqId = endpointResponse.getSourceId();
		if(!cachedStatusesWithAuth.containsKey(userId)) cachedStatusesWithAuth.put(userId, new HashMap<>());
		if(!cachedStatusesWithAuth.get(userId).containsKey(reqId) || !(cachedStatusesWithAuth.get(userId).get(reqId) instanceof QueryStatusResponse)) {
			QueryStatusResponse qsr = StatusFactory.eINSTANCE.createQueryStatusResponse();
			qsr.setRequestId(reqId);
			cachedStatusesWithAuth.get(userId).put(reqId, qsr);
		}
		QueryStatusResponse statusResponse = (QueryStatusResponse) cachedStatusesWithAuth.get(userId).get(reqId);
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

	private String extractUserIdFromToken(String token) {
		DecodedJWT decodedJWT = JWT.decode(token);
		// Get claims from the payload
		String userId = decodedJWT.getClaim("sub").asString();
		return userId;
	}

	private QueryResponse createErrorResponse(String requestId, String msg) {
		QueryStatusResponse response = StatusFactory.eINSTANCE.createQueryStatusResponse();
		response.setRequestId(requestId);
		response.setStatus(QueryStatusType.OPERATION_ERROR);
		response.setMessage(msg);
		return response;
	}

	


}


