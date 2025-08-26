/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.query.backend.api;

import java.time.Instant;

import de.avatar.status.QueryLinkResponse;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusFactory;

/**
 * 
 * @author ilenia
 * @since May 16, 2025
 */
public class QueryStatusHelper {
	
	public static QueryResponse createQueryResponse(String reqId, QueryStatusType statusType, String msg) {
		QueryResponse queryStatus = StatusFactory.eINSTANCE.createQueryResponse();
		queryStatus.setRequestId(reqId);
		queryStatus.setTimestamp(Instant.now().toEpochMilli());
		queryStatus.setStatus(statusType);
		queryStatus.setMessage(msg);
		return queryStatus;
	}
	
	public static QueryLinkResponse createQueryLinkResponse(String reqId, String link) {
		QueryLinkResponse linkResponse = StatusFactory.eINSTANCE.createQueryLinkResponse();
		linkResponse.setRequestId(reqId);
		linkResponse.setTimestamp(Instant.now().toEpochMilli());
		linkResponse.setDownloadLink(link);
		linkResponse.setStatus(QueryStatusType.PUBLIC_LINK_AVAILABLE);
		linkResponse.setMessage("Public link available for data download");
		return linkResponse;
	}


}
