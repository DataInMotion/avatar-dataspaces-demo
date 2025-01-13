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

import de.avatar.model.connector.EndpointRequest;

/**
 * 
 * @author ilenia
 * @since Jan 13, 2025
 */
@Component(immediate = true, name = "RequestCacheService", service = RequestCacheService.class)
public class RequestCacheService {
	
	Map<String, EndpointRequest> cachedRequests = new ConcurrentHashMap<>();
	
	public boolean isRequestCached(EndpointRequest request) {
		if(cachedRequests.containsKey(request.getId())) return true;
		return false;
	}
	
	public void cacheRequest(EndpointRequest request) {
		cachedRequests.put(request.getId(), request);
	}

}
