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
package de.avatar.connector.camunda.workers;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.ExternalTaskClientBuilder;
import org.camunda.bpm.client.interceptor.ClientRequestContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.camunda.api.OrchestratorProcessLauncher;
import de.avatar.connector.camunda.api.OrchestratorWorker;
import de.avatar.connector.camunda.workers.helper.CamundaWorkerHelper;
import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.keycloak.service.api.KeycloakService;
import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.Metadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.metadata.ResponseMetadata;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.query.QObject;
import de.avatar.query.QSubject;
import de.avatar.query.Query;
import de.avatar.status.QueryRequest;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
@Component(immediate = true, name = "CamundaQueryWorker", service = OrchestratorWorker.class,
configurationPid = "CamundaQueryWorker", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CamundaQueryWorker implements OrchestratorWorker {
	
	@Reference(target = "(serviceName=QueryForwardService)")
	KeycloakService keycloakService;
	
	@Reference
	ConnectorWhiteboard connectorWhiteboard;	
	
	@Reference
	private ResourceSet resourceSet;

	
	private static final Logger LOGGER = Logger.getLogger(CamundaQueryWorker.class.getName());
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'")
			.withZone(ZoneId.of("Europe/Berlin"));
	
	
	private ExecutorService executor = Executors.newSingleThreadExecutor();
	
	private Map<String, Object> properties;
	private OrchestratorProcessLauncher statusCamundaProcessLauncher;

	@Activate
	public CamundaQueryWorker(@Reference(target = "(camunda.process.name=update-status)")
	OrchestratorProcessLauncher statusCamundaProcessLauncher, Map<String, Object> properties) {
		this.statusCamundaProcessLauncher = statusCamundaProcessLauncher;
		this.properties = properties;
		LOGGER.info(String.format("Activated Camunda Worker with task topic %s", (String)properties.get("camunda.task.topic")));
		executor.execute(this::handleTask);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdown();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.camunda.bpm.client.interceptor.ClientRequestInterceptor#intercept(org.camunda.bpm.client.interceptor.ClientRequestContext)
	 */
	@Override
	public void intercept(ClientRequestContext requestContext) {
		requestContext.addHeader("Authorization","Bearer " + keycloakService.getAccessToken());
		requestContext.addHeader("Content-Type","application/json");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorWorker#handleTask()
	 */
	@Override
	public void handleTask() {

		
		ExternalTaskClientBuilder taskBuilder = ExternalTaskClient.create()
				.baseUrl((String)properties.get("camunda.engine.url"))
				.asyncResponseTimeout((Long)properties.get("camunda.polling.timeout") == null ? 10000 : (Long)properties.get("camunda.polling.timeout"));
		
		if("prod".equals((String) properties.get("camunda.worker.type"))) {
			taskBuilder = taskBuilder.addInterceptor(this);
		}
		ExternalTaskClient client = taskBuilder.build();
		
		
		client.
		subscribe((String)properties.get("camunda.task.topic")).
		lockDuration((Long)properties.get("camunda.task.lock.duration") == null ? 1000 : (Long)properties.get("camunda.task.lock.duration")).
		handler((externalTask, externalTaskService) -> {
			String queryStr = externalTask.getVariable("query");
			String reqType = externalTask.getVariable("reqType");
			String reqId = externalTask.getVariable("reqId");
			LOGGER.info(String.format("I got the query in CamundaQueryWorker %s", queryStr));

			//send the query to all connectors that can handle it
			try {
				EObject obj = CamundaWorkerHelper.loadEObjectFromString(queryStr, resourceSet);
				if(obj instanceof QueryRequest queryRequest) {
					
					List<AvatarConnector> availableConnectors = connectorWhiteboard.getAllConnectors().stream().filter(c -> canConnectorHandleQuery(c, queryRequest.getQuery())).toList();
					int i = 1;
					for(AvatarConnector c : availableConnectors) {
						LOGGER.info(String.format("Sending request for connector"));
						LOGGER.info(c.getInfo().getId());
						EndpointResponse connectorResponse = doForwardQueryRequestToConnector(c, queryRequest, reqType);						
						if(connectorResponse != null) {
							LOGGER.info(String.format("Got an EndpointRes from connector for request %s", connectorResponse.getRequest().getId()));
							connectorResponse.getMetadata().addAll(createConnectorResponseMetadata(c, connectorResponse, availableConnectors.size(), i, reqId));
							i++;
//							Update status - trigger status update process on camunda
							launchStatusUpdateProcess(connectorResponse, c);
						}
					}					
				}		
			} catch(Exception e) {
				LOGGER.severe("Something went worng while processing task forward-query");
				e.printStackTrace();
			} finally {
				externalTaskService.complete(externalTask);
			}				
			
		})
		.open();
	}
	
	private List<Metadata> createConnectorResponseMetadata(AvatarConnector connector, EndpointResponse response, int totConnectors, int thisConnectorNum, String reqId) {
		List<Metadata> metadatas = new ArrayList<>(5);
		ConnectorMetadata metadata = MetadataFactory.eINSTANCE.createConnectorMetadata();
		
		metadata.setId(UUID.randomUUID().toString());
		metadata.setConnectorId(connector.getInfo().getId());
		metadata.setConnectorName(connector.getInfo().getName());
		metadata.setConnectorRelativeNumber(thisConnectorNum);
		metadatas.add(metadata);
		
		ResponseMetadata responseMetadata = response.getMetadata().stream().filter(m -> m instanceof ResponseMetadata).map(m -> (ResponseMetadata) m).findAny().orElse(null);
		if(responseMetadata == null) {
			responseMetadata = MetadataFactory.eINSTANCE.createResponseMetadata();
			responseMetadata.setResponseId(response.getId());
			responseMetadata.setRequestId(reqId);
			responseMetadata.setResponseTime(DATE_TIME_FORMATTER.format(response.getTimestamp() != 0 ? Instant.ofEpochMilli(response.getTimestamp()) : Instant.now()));
		}
		responseMetadata.setTotConnectorsPerRequest(totConnectors);
		metadatas.add(responseMetadata);		
		return metadatas;
		
	}
	
	private void launchStatusUpdateProcess(EndpointResponse endpointResponse, AvatarConnector connector) {
		SingleConnectorQueryStatus sgConnQueryStatus = StatusFactory.eINSTANCE.createSingleConnectorQueryStatus();
		sgConnQueryStatus.setConnectorId(connector.getInfo().getId());
		sgConnQueryStatus.setConnectorName(connector.getInfo().getName());
		sgConnQueryStatus.setStatusResult(CamundaWorkerHelper.getStatusResult(endpointResponse.getResult()));
		sgConnQueryStatus.getStatusResult().setStatus(CamundaWorkerHelper.getQueryStatusType(endpointResponse.getCode()));
		sgConnQueryStatus.getStatusResult().setResponse(EcoreUtil.copy(endpointResponse));
		sgConnQueryStatus.getMetadata().addAll(EcoreUtil.copyAll(endpointResponse.getMetadata()));
		
		if(statusCamundaProcessLauncher.isLocal()) {
			Map<String, HashMap<String, HashMap<String, Object>>> variables = new HashMap<>();
			variables.put("variables", new HashMap<String, HashMap<String, Object>>());
			variables.get("variables").put("sgConnQueryStatus", new HashMap<String, Object>());
			variables.get("variables").get("sgConnQueryStatus").put("value", CamundaWorkerHelper.saveEObjectToString(sgConnQueryStatus, resourceSet).getBytes());
			variables.get("variables").get("sgConnQueryStatus").put("type", "bytes");
			variables.get("variables").put("endpointRes", new HashMap<String, Object>());
			variables.get("variables").get("endpointRes").put("value", CamundaWorkerHelper.saveEObjectToString(endpointResponse, resourceSet).getBytes());
			variables.get("variables").get("endpointRes").put("type", "bytes");
			variables.get("variables").put("reqId", new HashMap<String, Object>());
			variables.get("variables").get("reqId").put("value", endpointResponse.getRequest().getId());
			statusCamundaProcessLauncher.launchProcessToEngine(variables);		
		} else {
			Map<String, HashMap<String, Object>> variables = new HashMap<>();
			variables.put("tenant", new HashMap<String, Object>());
			variables.get("tenant").put("value", "TENANT_DIM");
			variables.get("tenant").put("type", "String");
			variables.put("sgConnQueryStatus", new HashMap<String, Object>());
			variables.get("sgConnQueryStatus").put("value", CamundaWorkerHelper.saveEObjectToString(sgConnQueryStatus, resourceSet).getBytes());
			variables.get("sgConnQueryStatus").put("type", "bytes");
			variables.put("reqId", new HashMap<String, Object>());
			variables.get("reqId").put("value", endpointResponse.getRequest().getId());
			variables.get("reqId").put("type", "String");
			variables.put("endpointRes", new HashMap<String, Object>());
			variables.get("endpointRes").put("value", CamundaWorkerHelper.saveEObjectToString(endpointResponse, resourceSet).getBytes());
			variables.get("endpointRes").put("type", "bytes");
			statusCamundaProcessLauncher.launchProcessToProcessUserInterface(variables);
		}
		
	}

	private EndpointResponse doForwardQueryRequestToConnector(AvatarConnector c, QueryRequest request, String reqType) {
		ConnectorEndpoint endpoint = c.getInfo().getEndpoint().stream().filter(e -> e.getId().contains(reqType)).findFirst().orElse(null);
		if(endpoint != null) {
			EndpointRequest endpointReq = CamundaWorkerHelper.convertQueryToEndpointRequest(request);
			endpointReq.setEndpoint(endpoint);
			EcoreParameter parameter = AConnectorFactory.eINSTANCE.createEcoreParameter();
			parameter.setName("request");
			parameter.setNumber((short)0);
			parameter.setValue(request);
			endpointReq.getParameter().add(parameter);
			try {
				EndpointResponse endpointRes = "dryrun".equals(reqType) ? c.dryRequest(endpointReq) : c.executeRequest(endpointReq);
				endpointRes.setSourceId(c.getInfo().getId());
				return endpointRes;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}	
		return null;
		
	}

	private boolean canConnectorHandleQuery(AvatarConnector connector, Query query) {
		
		for(QObject qo : query.getFrom()) {
			if(!connector.canHandleModel(qo.getEClass().getEPackage().getNsURI())) {
				return false;
			}
		}
		for(QSubject qsubj : query.getSubject()) {
			if(!connector.canHandleModel(qsubj.getFeaturePath().getFeature().get(0).getEContainingClass().getEPackage().getNsURI())) {
				return false;
			}
		}
		return true;
	}
}
