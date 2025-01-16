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
package de.avatar.connector.whiteboard;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.whiteboard.api.ConnectorStatusWhiteboard;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;

/**
 * 
 * @author ilenia
 * @since Jan 13, 2025
 */
@Component(immediate = true, name = "StatusService", service = StatusService.class)
public class StatusServiceImpl implements StatusService {

	@Reference
	ConnectorStatusWhiteboard statusWhiteboard;

	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());
	
	Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	Map<String, QueryResponse> cachedStatuses = new ConcurrentHashMap<>();

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
	public void updateStatus(QueryResponse response) {
		if(QueryStatusType.SUCCESS.equals(response.getStatus())) {
			cachedStatuses.remove(response.getRequestId());
			cachedRequests.remove(response.getRequestId());
		} else {
			if(response.getRequestId() != null) {
				cachedStatuses.put(response.getRequestId(), response);
			}

		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#executeStatusRequest(java.lang.String)
	 */
	@Override
	public QueryResponse executeStatusRequest(String requestId) {

		QueryRequest request = getCachedRequest(requestId);
		if(request == null) {
			LOGGER.severe(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
		}
		QueryResponse response = statusWhiteboard.executeStatusRequest(request);
		updateStatus(response);
		return response;
	}

}
