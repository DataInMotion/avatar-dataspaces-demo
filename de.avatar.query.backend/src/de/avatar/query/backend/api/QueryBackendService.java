/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
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

import java.io.File;
import java.util.List;


import org.osgi.annotation.versioning.ProviderType;

import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.ModelInfo;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.query.Query;

/**
 * Service responsible for communicating with the Query REST API 
 * @author ilenia
 * @since Mar 18, 2025
 */
@ProviderType
public interface QueryBackendService{
	
	List<ModelInfo> getConnectorsModelInfo();
	
	List<ConsentInfo> getConnectorsConsentInfo();
	
	QueryResponse executeDryRun(QueryRequest queryRequest);
	
	QueryResponse executeQuery(QueryRequest queryRequest);
	
	QueryStatusResponse executeStatusRequest(String requestId);
		
	String generatePublicLinkForRequest(String requestId);
	
	File downloadResponseData(String requestId);
	
	Query saveQuery(Query query);
	
	Query getQueryByName(String queryName);

}
