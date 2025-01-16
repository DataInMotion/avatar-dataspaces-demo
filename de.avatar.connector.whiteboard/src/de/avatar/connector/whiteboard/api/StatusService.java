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
package de.avatar.connector.whiteboard.api;

import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;

/**
 * 
 * @author ilenia
 * @since Jan 16, 2025
 */
public interface StatusService {
	
	boolean isRequestCached(QueryRequest request);
	
	QueryRequest getCachedRequest(String requestId);
	
	void cacheRequest(QueryRequest request);
	
	void updateStatus(QueryResponse response);
	
	QueryResponse executeStatusRequest(String requestId);

}
