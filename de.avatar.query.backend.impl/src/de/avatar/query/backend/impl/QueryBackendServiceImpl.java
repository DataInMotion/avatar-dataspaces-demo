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
package de.avatar.query.backend.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.camunda.api.OrchestratorProcessLauncher;
import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.generator.api.api.AvatarGenerator;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.ModelInfo;
import de.avatar.query.backend.api.QueryBackendService;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusFactory;

@Component(name = "QueryBackendService")
public class QueryBackendServiceImpl implements QueryBackendService{
	
	private static final Logger LOGGER = Logger.getLogger(QueryBackendServiceImpl.class.getName());
	
	@Reference
	ConnectorWhiteboard connectorWhiteboard;
	
	@Reference
	StatusService statusService;
	
	@Reference
	AvatarGenerator avatarGenerator;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;
	
	private OrchestratorProcessLauncher queryCamundaProcessLauncher;

	
	@Activate
	public QueryBackendServiceImpl(@Reference(target = "(camunda.process.name=forward-query)")
	OrchestratorProcessLauncher queryCamundaProcessLauncher) {
		this.queryCamundaProcessLauncher = queryCamundaProcessLauncher;		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#getConnectorsModelInfo()
	 */
	@Override
	public List<ModelInfo> getConnectorsModelInfo() {
		return connectorWhiteboard.getModelInfoForAllConnectors();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#getConnectorsConsentInfo()
	 */
	@Override
	public List<ConsentInfo> getConnectorsConsentInfo() {
		return connectorWhiteboard.getConsentInfoForAllConnectors();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeDryRun(de.avatar.query.backend.api.QueryRequest)
	 */
	@Override
	public QueryResponse executeDryRun(QueryRequest queryRequest) {
		sendQueryRequest(queryRequest, "dryrun");
		
//		here we just ping the status for updates
		QueryStatusResponse response = pingForStatus(queryRequest.getRequestId(), true);
		if(response == null) {
			response = getBasicPendingResponse(queryRequest.getRequestId());
		}
		return response;	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeQuery(de.avatar.query.backend.api.QueryRequest)
	 */
	@Override
	public QueryResponse executeQuery(QueryRequest queryRequest) {
		sendQueryRequest(queryRequest, "request");
		statusService.cacheRequest(queryRequest);
//		here we just ping the status for updates
		QueryStatusResponse response = pingForStatus(queryRequest.getRequestId(), true);
		if(response == null) {
			response = getBasicPendingResponse(queryRequest.getRequestId());
		}
		return response;		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeStatusRequest(java.lang.String)
	 */
	@Override
	public QueryStatusResponse executeStatusRequest(String requestId) {
		
		QueryRequest queryRequest = statusService.getCachedRequest(requestId);
		if(queryRequest == null) {
			throw new IllegalArgumentException(String.format("No cached request for id %s", requestId));
		}
		sendQueryRequest(queryRequest, "status");
		QueryStatusResponse response = pingForStatus(queryRequest.getRequestId(), false);
		if(response == null) {
			response = getBasicPendingResponse(queryRequest.getRequestId());
		}		
		return response;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#generatePublicLinkForRequest(java.lang.String)
	 */
	@Override
	public String generatePublicLinkForRequest(String requestId) {
		return avatarGenerator.generatePublicLinkForRequest(requestId);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#downloadResponseData(java.lang.String)
	 */
	@Override
	public File downloadResponseData(String requestId) {
		return avatarGenerator.getAggregatedResponse(requestId);
	}
	
	private QueryStatusResponse pingForStatus(String requestId, boolean fromCache) {
		Long now = Instant.now().toEpochMilli();
		for(int i = 0; i < 10; i ++) {
			ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
			ScheduledFuture<QueryStatusResponse> schedule = executor.schedule(new MyCheckStatusWork(requestId), 1, TimeUnit.SECONDS);
			QueryStatusResponse statusResponse;
			try {
				statusResponse = schedule.get();
				if(statusResponse != null) {
					if(!fromCache) {
						if(statusResponse.getTimestamp() > now) {
							return statusResponse;
						}
					} else {
						return statusResponse;
					}
				}
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			finally {
				executor.shutdown();				
			}
		}
		return null;
	}
	
	class MyCheckStatusWork implements Callable<QueryStatusResponse> {
		
		private String requestId;

		public MyCheckStatusWork(String requestId) {
			this.requestId = requestId;			
		}

		/* 
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public QueryStatusResponse call() throws Exception {
			return statusService.getStatusUpdate(requestId);
		}
	}

	

	private String saveEObjectToString(EObject obj) {
		ResourceSet resSet = rsFactory.getService();
		try {
			Resource res = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
			res.getContents().add(obj);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			res.save(baos, null);
			return new String(baos.toByteArray());
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while converting EObject to String"));
			return null;
		} finally {
			rsFactory.ungetService(resSet);
		}
	}
	
	private void sendQueryRequest(QueryRequest queryRequest, String reqType) {
		Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
		variables.put("variables", new HashMap<String, HashMap<String, Object>>());
		variables.get("variables").put("query", new HashMap<String, Object>());
		variables.get("variables").get("query").put("value", saveEObjectToString(queryRequest));
		variables.get("variables").put("reqId", new HashMap<String, Object>());
		variables.get("variables").get("reqId").put("value", queryRequest.getRequestId());
		variables.get("variables").put("reqType", new HashMap<String, Object>());
		variables.get("variables").get("reqType").put("value", reqType);
		queryCamundaProcessLauncher.launchProcess(variables);		
	}
	
	private QueryStatusResponse getBasicPendingResponse(String requestId) {
		QueryStatusResponse response = StatusFactory.eINSTANCE.createQueryStatusResponse();
		response.setRequestId(requestId);
		response.setStatus(QueryStatusType.PENDING);
		response.setTimestamp(Instant.now().toEpochMilli());
		response.setMessage("Request has been sent, but no updates from connectors arrived yet");	
		return response;
	}

}
