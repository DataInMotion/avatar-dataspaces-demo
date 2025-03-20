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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
@Component(immediate = true, name = "StatusService", service = StatusService.class)
public class StatusServiceImpl implements StatusService{

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;

	@Reference
	AvatarGenerator avatarGenerator;

	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());
	

	Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	Map<String, QueryStatusResponse> cachedStatuses = new ConcurrentHashMap<>();


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
				orElseGet(null);
			if(oldConnStatus != null) {
				detailedStatus.getSingleConnectorQueryStatus().remove(oldConnStatus);
			}
		}
		detailedStatus.getSingleConnectorQueryStatus().add(sgConnQueryStatus);
		
		Metadata totConnForRequest = endpointResponse.getMetadata().stream().filter(m -> "tot.connectors.for.request".equals(m.getKey())).findAny().orElse(null);
		if(totConnForRequest != null) {
			int numConnForReq = Integer.valueOf(totConnForRequest.getValue());
			int numConnUpdates = detailedStatus.getSingleConnectorQueryStatus().size();
			QueryStatusType queryStatusType = QueryStatusType.SUCCESS;
			for(QueryStatusType connStatus : detailedStatus.getSingleConnectorQueryStatus().stream().map(c -> c.getStatusResult().getStatus()).toList()) {
				if(QueryStatusType.ERROR.equals(connStatus) && !QueryStatusType.ERROR.equals(queryStatusType)) {
					queryStatusType = QueryStatusType.ERROR;
				} else if(QueryStatusType.PENDING.equals(connStatus) && !QueryStatusType.ERROR.equals(queryStatusType)) {
					queryStatusType = QueryStatusType.PENDING;
				} else if(QueryStatusType.DRYRUN_SUCCESS.equals(connStatus) && (!QueryStatusType.ERROR.equals(queryStatusType) && !QueryStatusType.PENDING.equals(queryStatusType))) {
					queryStatusType = QueryStatusType.DRYRUN_SUCCESS;
				}
			}
			if(QueryStatusType.SUCCESS.equals(queryStatusType) && (numConnForReq > numConnUpdates)) {
				LOGGER.info(String.format("Setting status to pending for %s", endpointResponse.getRequest().getId()));
				queryStatusType = QueryStatusType.PENDING;
			}
			statusResponse.setStatus(queryStatusType);
		}
		
		
		if(ResponseCode.OK.equals(endpointResponse.getCode())) {
			LOGGER.info(String.format("I am aggregating response for %s", endpointResponse.getRequest().getId()));
			avatarGenerator.aggregateResponse(endpointResponse);
		}		
		
		statusResponse.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
			//				We do not want to display the full response result when the status is SUCCESS
			scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
		});
	}

}


