/**
 * Copyright (c) 2012 - 2021 Paremus Ltd., Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 		Paremus Ltd. - initial API and implementation
 *      Data In Motion
 */
package de.avatar.connector.whiteboard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.camunda.bpm.client.topic.TopicSubscription;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.remoteserviceadmin.RemoteConstants;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard;
import de.avatar.connector.whiteboard.api.OrchestratorProcessLauncher;
import de.avatar.connector.whiteboard.api.OrchestratorWorker;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ModelInfo;
import de.avatar.model.connector.ResponseCode;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusPackage;

@Component(immediate = true, name = "ConnectorRequestWhiteboardImpl", service = ConnectorRequestWhiteboard.class)
public class ConnectorRequestWhiteboardImpl implements ConnectorRequestWhiteboard {

	@Reference
	private AConnectorFactory connectorFactory;

	@Reference
	StatusService statusService;

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;

	private static final Logger LOGGER = Logger.getLogger(ConnectorRequestWhiteboardImpl.class.getName());

	private List<AvatarConnector> connectors = new LinkedList<>();
	private List<AvatarConnector> externalConnectors = new LinkedList<>();
	private Map<AvatarConnector, ConnectorInfo> infoMap = new ConcurrentHashMap<>();

	private OrchestratorWorker queryCamundaWorker;
	private OrchestratorProcessLauncher queryCamundaProcessLauncher;
	private OrchestratorProcessLauncher statusCamundaProcessLauncher;


	@Activate
	public ConnectorRequestWhiteboardImpl(@Reference(target = "(camunda.worker.name=forward-query)")
	OrchestratorWorker queryCamundaWorker, @Reference(target = "(camunda.process.name=forward-query)")
	OrchestratorProcessLauncher queryCamundaProcessLauncher, @Reference(target = "(camunda.process.name=update-status)")
	OrchestratorProcessLauncher statusCamundaProcessLauncher) {
		this.queryCamundaWorker = queryCamundaWorker;
		this.queryCamundaProcessLauncher = queryCamundaProcessLauncher;
		this.statusCamundaProcessLauncher = statusCamundaProcessLauncher;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getAllConnectors()
	 */
	@Override
	public List<ConnectorInfo> getAllConnectors() {
		List<ConnectorInfo> cons = new ArrayList<>();
		cons.addAll(connectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
		cons.addAll(externalConnectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
		return Collections.unmodifiableList(cons);
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getExternalConnectors()
	 */
	@Override
	public List<ConnectorInfo> getExternalConnectors() {
		return Collections.unmodifiableList(externalConnectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	public void addConnector(AvatarConnector connector, Map<String, Object> properties) {
		if (properties.containsKey(RemoteConstants.SERVICE_IMPORTED)) {
			synchronized (externalConnectors) {
				externalConnectors.add(connector);
			}
		} else {
			synchronized (connectors) {
				connectors.add(connector);
			}
		}
		printConnectionInfo(connector, true);
	}

	public void removeConnector(AvatarConnector connector, Map<String, Object> properties) {
		if (properties.containsKey(RemoteConstants.SERVICE_IMPORTED)) {
			synchronized (externalConnectors) {
				externalConnectors.remove(connector);
			}
		} else {
			synchronized (connectors) {
				connectors.remove(connector);
			}
		}
		printConnectionInfo(connector, false);
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard#executeDryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryStatusResponse executeDryRun(QueryRequest request) {		
		try {
			Promise<String> promise = handleOrchestratorTask(Map.of("reqId",request.getRequestId(), "reqType", "dryrun"));			
			Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
			variables.put("variables", new HashMap<String, HashMap<String, Object>>());
			variables.get("variables").put("query", new HashMap<String, Object>());
			variables.get("variables").get("query").put("value", saveEObjectToString(request));
			variables.get("variables").put("reqId", new HashMap<String, Object>());
			variables.get("variables").get("reqId").put("value", request.getRequestId());
			variables.get("variables").put("reqType", new HashMap<String, Object>());
			variables.get("variables").get("reqType").put("value", "dryrun");
			queryCamundaProcessLauncher.launchProcess(variables);
			String value = promise.getValue();
			EObject obj = loadEObjectFromString(value);
			if(obj instanceof QueryRequest queryRequest) {
				QueryStatusResponse response = doExecuteRequest(queryRequest, "dryrun");
				response.setTimestamp(Instant.now().toEpochMilli());
				response.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
					//We do not want to display the full response result when the status is SUCCESS
					scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
				});
				return response;
			} else {
				LOGGER.severe(String.format("Object in loaded res is not of type QueryRequest for request %s", request.getRequestId()));
				return null;
			}
		} catch(Exception e) {
			LOGGER.severe(String.format("Something went wrong when executing dry run request %s", request.getRequestId()));
			e.printStackTrace();
			return null;
		}
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard#executeRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryStatusResponse executeRequest(QueryRequest request) {
		if(statusService.isRequestCached(request)) {
			LOGGER.severe(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
		}
		try {
			Promise<String> promise = handleOrchestratorTask(Map.of("reqId",request.getRequestId(), "reqType", "request"));			
			Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
			variables.put("variables", new HashMap<String, HashMap<String, Object>>());
			variables.get("variables").put("query", new HashMap<String, Object>());
			variables.get("variables").get("query").put("value", saveEObjectToString(request));
			variables.get("variables").put("reqId", new HashMap<String, Object>());
			variables.get("variables").get("reqId").put("value", request.getRequestId());
			variables.get("variables").put("reqType", new HashMap<String, Object>());
			variables.get("variables").get("reqType").put("value", "request");
			queryCamundaProcessLauncher.launchProcess(variables);
			String value = promise.getValue();
			EObject obj = loadEObjectFromString(value);
			if(obj instanceof QueryRequest queryRequest) {
				QueryStatusResponse response = doExecuteRequest(request, "request");
				response.setTimestamp(Instant.now().toEpochMilli());
				if(!QueryStatusType.ERROR.equals(response.getStatus())) statusService.cacheRequest(request);	
				response.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
					//				We do not want to display the full response result when the status is SUCCESS
					scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
				});
				return response;
			} else {
				LOGGER.severe(String.format("Object in loaded res is not of type QueryRequest for request %s", request.getRequestId()));
				return null;
			}
		} catch(Exception e) {
			LOGGER.severe(String.format("Something went wrong when executing request %s", request.getRequestId()));
			e.printStackTrace();
			return null;
		}
	}

	private QueryStatusResponse doExecuteRequest(QueryRequest request, String reqType) {

		QueryStatusResponse queryResponse = StatusFactory.eINSTANCE.createQueryStatusResponse();
		queryResponse.setRequestId(request.getRequestId());
		queryResponse.setStatus(QueryStatusType.SUCCESS);
		connectors.forEach(c -> {
			ConnectorEndpoint endpoint = c.getEndpoints().stream().filter(e -> e.getId().contains(reqType)).findFirst().orElse(null);
			if(endpoint != null) {
				EndpointRequest endpointReq = ConnectorWhiteboardHelper.convertQueryToEndpointRequest(request);
				endpointReq.setEndpoint(endpoint);
				EcoreParameter parameter = AConnectorFactory.eINSTANCE.createEcoreParameter();
				parameter.setName("request");
				parameter.setNumber((short)0);
				parameter.setValue(request);
				endpointReq.getParameter().add(parameter);
				try {
					EndpointResponse endpointRes = "request".equals(reqType) ? c.executeRequest(endpointReq) : c.dryRequest(endpointReq);
					endpointRes.setSourceId(c.getInfo().getId());
					if("request".equals(reqType)) {
						//						TODO: instead of updating status here, we send the EndpointResponse to Camunda
						//						statusService.updateStatus(endpointRes);
						Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
						variables.put("variables", new HashMap<String, HashMap<String, Object>>());
						variables.get("variables").put("endpointRes", new HashMap<String, Object>());
						variables.get("variables").get("endpointRes").put("value", saveEObjectToString(endpointRes).getBytes());
						variables.get("variables").get("endpointRes").put("type", "bytes");
						variables.get("variables").put("reqId", new HashMap<String, Object>());
						variables.get("variables").get("reqId").put("value", request.getRequestId());
						statusCamundaProcessLauncher.launchProcess(variables);
					}
					if(ResponseCode.ERROR.equals(endpointRes.getCode())) {
						queryResponse.setStatus(QueryStatusType.ERROR);
					} else if(QueryStatusType.SUCCESS.equals(queryResponse.getStatus()) && ResponseCode.PENDING.equals(endpointRes.getCode())) {
						queryResponse.setStatus(QueryStatusType.PENDING);	
					}
					ConnectorWhiteboardHelper.addSingleConnectorQueryStatus((QueryStatusResponse )queryResponse, endpointRes, c);	
				} catch(Exception e) {
					e.printStackTrace();
				}
			}			
		});	
		return queryResponse;
	}


	private void printConnectionInfo(AvatarConnector connector, boolean add) {
		long start = Instant.now().toEpochMilli();
		ConnectorInfo info = add ? connector.getInfo() : infoMap.remove(connector);
		Objects.requireNonNull(info);
		long time = Instant.now().toEpochMilli() - start;
		String added = add ? "Added" : "Removed";
		System.out.println(String.format("%s connector with name %s (%s) within %s ms", added, info.getName(), info.getId(), time));
		if (add) {
			infoMap.put(connector, info);
			for(ConnectorEndpoint ep : info.getEndpoint()) {
				System.out.println(String.format("  - Detected endpoint with name %s (%s) and method %s iwth media type %s", ep.getName(), ep.getId(), ep.getMethod(), ep.getMediaType()));
			}
		}
	}

	public Promise<String> handleOrchestratorTask(Map<String, Object> properties) {

		Deferred<String> deferred = new Deferred<>();
		try {
			System.out.println("ReqId " + properties.get("reqId") + " Type " + properties.get("reqType"));
			TopicSubscription subscription = queryCamundaWorker.getTopicSubscriptionBuilder()
			.processVariablesEqualsIn(properties)
			.handler((externalTask, externalTaskService) -> {
				String query = externalTask.getVariable("query");
				LOGGER.info(String.format("Got query task in request %s", properties.get("reqId")));
				externalTask.getAllVariables().forEach((k,v)->System.out.println("(k,v) " + k + " " + v));
				deferred.resolve(query);
				externalTaskService.complete(externalTask);
			})
			.open();
			deferred.getPromise().onResolve(() -> subscription.close());
		} catch(Exception e) {
			e.printStackTrace();
			deferred.fail(e);
		}
		return deferred.getPromise();
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

	private EObject loadEObjectFromString(String value) {
		ResourceSet resSet = rsFactory.getService();
		try {
			Resource res = resSet.createResource(URI.createURI(UUID.randomUUID().toString()), "application/json");
			res.load(new ByteArrayInputStream(value.getBytes()), null);
			if(res.getContents() != null && !res.getContents().isEmpty()) {
				EObject obj = res.getContents().get(0);
				return obj;
			} else {
				LOGGER.severe(String.format("No content in loaded res"));
				return null;
			}
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while loading EObject from String"));
			e.printStackTrace();
			return null;
		} finally {
			rsFactory.ungetService(resSet);
		}
	}
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getModelInfoForAllConnectors()
	 */
	@Override
	public List<ModelInfo> getModelInfoForAllConnectors() {
		return connectors.stream().map(c -> c.getModelInfos()).flatMap(c -> c.stream()).toList();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getConsentInfoForAllConnectors()
	 */
	@Override
	public List<ConsentInfo> getConsentInfoForAllConnectors() {
		return connectors.stream().map(c -> c.getConsentInfos()).flatMap(c -> c.stream()).toList();
	}

}
