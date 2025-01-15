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

import org.osgi.service.component.annotations.Component;

import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;

/**
 * 
 * @author ilenia
 * @since Jan 13, 2025
 */
@Component(immediate = true, name = "RequestCacheService", service = RequestCacheService.class)
public class RequestCacheService {
	
	Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	Map<String, QueryResponse> cachedStatuses = new ConcurrentHashMap<>();
	
	public boolean isRequestCached(QueryRequest request) {
		if(request.getRequestId() == null) return false;
		if(cachedRequests.containsKey(request.getRequestId())) return true;
		return false;
	}
	
	public QueryRequest getCachedRequest(String requestId) {
		return cachedRequests.getOrDefault(requestId, null);
	}
	
	public void cacheRequest(QueryRequest request) {
		if(request.getRequestId() != null) {
			cachedRequests.put(request.getRequestId(), request);
		}
	}
	
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

}
