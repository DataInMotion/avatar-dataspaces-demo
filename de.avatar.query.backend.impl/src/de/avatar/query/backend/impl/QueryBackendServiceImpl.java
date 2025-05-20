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
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
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
import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.query.Query;
import de.avatar.query.backend.api.QueryBackendService;
import de.avatar.query.backend.api.QueryStatusHelper;
import de.avatar.query.backend.api.StatusService;
import de.avatar.query.service.api.QueryService;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;

@Component(name = "QueryBackendService")
public class QueryBackendServiceImpl implements QueryBackendService{

	private static final Logger LOGGER = Logger.getLogger(QueryBackendServiceImpl.class.getName());

	@Reference
	StatusService statusService;

	@Reference(target="(task.status.type=QUERY_INTERRUPTED)")
	OrchestratorTaskCacheService terminationCacheTaskService;

	@Reference(target="(task.status.type=PUBLIC_LINK_REQUEST)")
	OrchestratorTaskCacheService linkCacheTaskService;
	
	@Reference(target="(task.status.type=PROCESS_CANCEL_REQUEST)")
	OrchestratorTaskCacheService cancelCacheTaskService;

	@Reference
	QueryService queryService;

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
	 * @see de.avatar.query.backend.api.QueryBackendService#executeDryRun(de.avatar.query.backend.api.QueryRequest)
	 */
	@Override
	public QueryResponse executeDryRun(QueryRequest queryRequest) {
		String reqId = queryRequest.getRequestId();
		//		what if you send a dry run for a request that already exists? You should get back the status if it's already available
		if(statusService.getCachedRequest(reqId) != null) {
			LOGGER.warning(String.format("A request with the id %s already exists. Giving back its chaced status", reqId));
			return statusService.getStatusUpdate(reqId);
		}
		try {
			sendQueryRequest(queryRequest, "dryrun", reqId);

			//			here we just ping the status for updates
			QueryResponse response = pingForStatus(reqId, true, null);
			if(response == null) {
				response = QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.QUERY_PENDING, "Request has been sent, but no updates from connectors arrived yet");
			}
			return response;	
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
			e.printStackTrace();
			return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.OPERATION_ERROR, String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
		}

	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeQuery(de.avatar.query.backend.api.QueryRequest)
	 */
	@Override
	public QueryResponse executeQuery(QueryRequest queryRequest) {
		String reqId = queryRequest.getRequestId();
		//		what if you send a query for a request that already exists? You should get back the status if it's already available
		if(statusService.getCachedRequest(reqId) != null) {
			LOGGER.warning(String.format("A request with the id %s already exists. Giving back its chaced status", reqId));
			return statusService.getStatusUpdate(reqId);
		}
		try {
			sendQueryRequest(queryRequest, "request", reqId);	
			//			here we just ping the status for updates
			QueryResponse response = pingForStatus(reqId, false, null);
			if(response == null) {
				response = QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.QUERY_PENDING, "Request has been sent, but no updates from connectors arrived yet");
			}
			statusService.cacheRequest(queryRequest);
			return response;
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
			e.printStackTrace();
			return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.OPERATION_ERROR, String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeStatusRequest(java.lang.String)
	 */
	@Override
	public QueryResponse executeStatusRequest(String requestId) {	
		return statusService.getStatusUpdate(requestId);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#cancelRequest(java.lang.String)
	 */
	@Override
	public QueryResponse cancelRequest(String requestId) {
		if(statusService.getCachedRequest(requestId) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}		
		return cancelCacheTaskService.completeTask(requestId);
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#publicLinkRequest(java.lang.String, boolean)
	 */
	@Override
	public QueryResponse publicLinkRequest(String requestId, boolean generateLink) {
		if(statusService.getCachedRequest(requestId) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}
		//		if the status is not QUERY_PENDING we cannot interrupt the request
		if(!QueryStatusType.DATA_ANONYMIZED_READY.equals(statusUpdate.getStatus())) {
			LOGGER.severe(String.format("Cannot request public link for request %s because the status is %s.", requestId, statusUpdate.getStatus()));
			throw new IllegalArgumentException(String.format("Cannot request public link for request %s because the status is %s.", requestId, statusUpdate.getStatus()));
		}
		Map<String, Object> variables = new HashMap<>();
		variables.put("generateLink", generateLink);
		return linkCacheTaskService.completeTask(requestId, variables);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#interruptRequest(java.lang.String)
	 */
	@Override
	public QueryResponse interruptRequest(String requestId) {
		if(statusService.getCachedRequest(requestId) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}
		//		if the status is not QUERY_PENDING we cannot interrupt the request
		if(!QueryStatusType.QUERY_PENDING.equals(statusUpdate.getStatus())) {
			LOGGER.severe(String.format("Cannot interrupt request %s because all the connectors already replied.", requestId));
			throw new IllegalArgumentException(String.format("Cannot interrupt request %s because all the connectors already replied.", requestId));
		}
		return terminationCacheTaskService.completeTask(requestId);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#saveQuery(de.avatar.query.backend.api.Query)
	 */
	@Override
	public Query saveQuery(Query query) {
		return queryService.saveQuery(query);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#getQueryByName(java.lang.String)
	 */
	@Override
	public Query getQueryByName(String queryName) {
		return queryService.getQueryByName(queryName);
	}

	private QueryResponse pingForStatus(String requestId, boolean fromCache, String token) {
		Long now = Instant.now().toEpochMilli();
		for(int i = 0; i < 10; i ++) {
			ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
			ScheduledFuture<QueryResponse> schedule = executor.schedule(new MyCheckStatusWork(requestId, token), 1, TimeUnit.SECONDS);
			QueryResponse statusResponse;
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

	class MyCheckStatusWork implements Callable<QueryResponse> {

		private String requestId;
		private String token;

		public MyCheckStatusWork(String requestId) {
			this.requestId = requestId;			
		}
		
		public MyCheckStatusWork(String requestId, String token) {
			this.requestId = requestId;
			this.token = token;			
		}

		/* 
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public QueryResponse call() throws Exception {
			if(token == null) return statusService.getStatusUpdate(requestId);
			else return statusService.getStatusUpdate(requestId, token);
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

	private void sendQueryRequest(QueryRequest queryRequest, String reqType, String reqId) throws IOException{

		if(queryCamundaProcessLauncher.isLocal()) {
			Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
			variables.put("variables", new HashMap<String, HashMap<String, Object>>());
			if(queryRequest != null) {
				variables.get("variables").put("query", new HashMap<String, Object>());
				variables.get("variables").get("query").put("value", saveEObjectToString(queryRequest));
				variables.get("variables").put("contentType", new HashMap<String, Object>());
				variables.get("variables").get("contentType").put("value", queryRequest.getContentType());
			}			
			variables.get("variables").put("reqId", new HashMap<String, Object>());
			variables.get("variables").get("reqId").put("value", reqId);
			variables.get("variables").put("reqType", new HashMap<String, Object>());
			variables.get("variables").get("reqType").put("value", reqType);
			variables.get("variables").put("reqType", new HashMap<String, Object>());
			variables.get("variables").get("reqType").put("value", reqType);
			queryCamundaProcessLauncher.launchProcessToEngine(variables);		
		} else {
			Map<String, HashMap<String, Object>> variables = new HashMap<>();
			variables.put("tenant", new HashMap<String, Object>());
			variables.get("tenant").put("value", "TENANT_DIM");
			variables.get("tenant").put("type", "String");
			if(queryRequest != null) {
				variables.put("query", new HashMap<String, Object>());
				variables.get("query").put("value", saveEObjectToString(queryRequest));
				variables.get("query").put("type", "String");
				variables.put("contentType", new HashMap<String, Object>());
				variables.get("contentType").put("value", queryRequest.getContentType());
				variables.get("contentType").put("type", "String");
			}	
			variables.put("reqId", new HashMap<String, Object>());
			variables.get("reqId").put("value", reqId);
			variables.get("reqId").put("type", "String");
			variables.put("reqType", new HashMap<String, Object>());
			variables.get("reqType").put("value", reqType);
			variables.get("reqType").put("type", "String");
			queryCamundaProcessLauncher.launchProcessToProcessUserInterface(variables);
		}		
	}

	private void sendQueryRequest(QueryRequest queryRequest, String reqType, String reqId, String token) throws IOException{

		Map<String, HashMap<String, Object>> variables = new HashMap<>();
		variables.put("tenant", new HashMap<String, Object>());
		variables.get("tenant").put("value", "TENANT_DIM");
		variables.get("tenant").put("type", "String");
		if(queryRequest != null) {
			variables.put("query", new HashMap<String, Object>());
			variables.get("query").put("value", saveEObjectToString(queryRequest));
			variables.get("query").put("type", "String");
			variables.put("contentType", new HashMap<String, Object>());
			variables.get("contentType").put("value", queryRequest.getContentType());
			variables.get("contentType").put("type", "String");
		}	
		variables.put("reqId", new HashMap<String, Object>());
		variables.get("reqId").put("value", reqId);
		variables.get("reqId").put("type", "String");
		variables.put("reqType", new HashMap<String, Object>());
		variables.get("reqType").put("value", reqType);
		variables.get("reqType").put("type", "String");
		queryCamundaProcessLauncher.launchProcessToProcessUserInterface(variables, token);
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeDryRun(de.avatar.status.QueryRequest, java.lang.String)
	 */
	@Override
	public QueryResponse executeDryRun(QueryRequest queryRequest, String token) {
		String reqId = queryRequest.getRequestId();
		//		what if you send a dry run for a request that already exists? You should get back the status if it's already available
		if(statusService.getCachedRequest(reqId, token) != null) {
			LOGGER.warning(String.format("A request with the id %s already exists. Giving back its chaced status", reqId));
			return statusService.getStatusUpdate(reqId, token);
		}
		try {
			sendQueryRequest(queryRequest, "dryrun", reqId, token);

			//			here we just ping the status for updates
			QueryResponse response = pingForStatus(reqId, true, token);
			if(response == null) {
				response = QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.QUERY_PENDING, "Request has been sent, but no updates from connectors arrived yet");
			}
			return response;	
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
			e.printStackTrace();
			return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.OPERATION_ERROR, String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeQuery(de.avatar.status.QueryRequest, java.lang.String)
	 */
	@Override
	public QueryResponse executeQuery(QueryRequest queryRequest, String token) {
		String reqId = queryRequest.getRequestId();
		//		what if you send a query for a request that already exists? You should get back the status if it's already available
		if(statusService.getCachedRequest(reqId, token) != null) {
			LOGGER.warning(String.format("A request with the id %s already exists. Giving back its chaced status", reqId));
			return statusService.getStatusUpdate(reqId, token);
		}
		try {
			sendQueryRequest(queryRequest, "request", reqId, token);	
			//			here we just ping the status for updates
			QueryResponse response = pingForStatus(reqId, false, token);
			if(response == null) {
				response = QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.QUERY_PENDING, "Request has been sent, but no updates from connectors arrived yet");
			}
			statusService.cacheRequest(queryRequest, token);
			return response;
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
			e.printStackTrace();
			return QueryStatusHelper.createQueryResponse(reqId, QueryStatusType.OPERATION_ERROR, String.format("IOException while forwarding request %s to orchestrator: %s", reqId, e.getMessage()));
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#executeStatusRequest(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse executeStatusRequest(String requestId, String token) {
		return statusService.getStatusUpdate(requestId, token);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#interruptRequest(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse interruptRequest(String requestId, String token) {
		if(statusService.getCachedRequest(requestId, token) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId, token);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}
		//		if the status is not QUERY_PENDING we cannot interrupt the request
		if(!QueryStatusType.QUERY_PENDING.equals(statusUpdate.getStatus())) {
			LOGGER.severe(String.format("Cannot interrupt request %s because all the connectors already replied.", requestId));
			throw new IllegalArgumentException(String.format("Cannot interrupt request %s because all the connectors already replied.", requestId));
		}
		return terminationCacheTaskService.completeTask(requestId, token);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#publicLinkRequest(java.lang.String, boolean, java.lang.String)
	 */
	@Override
	public QueryResponse publicLinkRequest(String requestId, boolean generateLink, String token) {
		if(statusService.getCachedRequest(requestId, token) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId, token);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}
		//		if the status is not QUERY_PENDING we cannot interrupt the request
		if(!QueryStatusType.DATA_ANONYMIZED_READY.equals(statusUpdate.getStatus())) {
			LOGGER.severe(String.format("Cannot request public link for request %s because the status is %s.", requestId, statusUpdate.getStatus()));
			throw new IllegalArgumentException(String.format("Cannot request public link for request %s because the status is %s.", requestId, statusUpdate.getStatus()));
		}
		Map<String, Object> variables = new HashMap<>();
		variables.put("generateLink", generateLink);
		return linkCacheTaskService.completeTask(requestId, variables, token);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.backend.api.QueryBackendService#cancelRequest(java.lang.String, java.lang.String)
	 */
	@Override
	public QueryResponse cancelRequest(String requestId, String token) {
		if(statusService.getCachedRequest(requestId, token) == null) {
			LOGGER.severe(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("A request with the id %s does not exist. Cannot proceed.", requestId));
		}
		QueryResponse statusUpdate = statusService.getStatusUpdate(requestId, token);
		if(statusUpdate == null) {
			LOGGER.severe(String.format("No status update available for request %s. Cannot proceed.", requestId));
			throw new IllegalArgumentException(String.format("No status update available for request %s. Cannot proceed.", requestId));
		}
		return cancelCacheTaskService.completeTask(requestId, token);
	}
}
