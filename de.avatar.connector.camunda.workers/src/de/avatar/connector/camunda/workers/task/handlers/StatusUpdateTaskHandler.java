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
package de.avatar.connector.camunda.workers.task.handlers;

import java.util.logging.Logger;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.connector.camunda.api.StatusUpdateType;
import de.avatar.connector.camunda.workers.helper.CamundaWorkerHelper;
import de.avatar.metadata.ConnectorMetadata;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.query.backend.api.QueryStatusHelper;
import de.avatar.query.backend.api.StatusService;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
public class StatusUpdateTaskHandler implements ExternalTaskHandler {
	
	private static final Logger LOGGER = Logger.getLogger(StatusUpdateTaskHandler.class.getName());
	private StatusService statusService;
	private ResourceSet resSet;
	private OrchestratorTaskCacheService taskCacheService;
	
	public StatusUpdateTaskHandler(StatusService statusService, ResourceSet resSet, OrchestratorTaskCacheService taskCacheService) {
		this.statusService = statusService;
		this.resSet = resSet;
		this.taskCacheService = taskCacheService;		
	}
	/* 
	 * (non-Javadoc)
	 * @see org.camunda.bpm.client.task.ExternalTaskHandler#execute(org.camunda.bpm.client.task.ExternalTask, org.camunda.bpm.client.task.ExternalTaskService)
	 */
	@Override
	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		String reqId = externalTask.getVariable("reqId");
		if(reqId == null) {
			LOGGER.severe("Got a StatusUpdate task without reqId. Cannot do anything...");
			externalTaskService.complete(externalTask);
			return;
		}
		String reqType = externalTask.getVariable("reqType");
		String statusType = externalTask.getVariable("statusType");
		String token = externalTask.getVariable("credentials");
		String endpointResStr = null;
		StatusUpdateType statusTypeEnum = StatusUpdateType.valueOf(statusType);
		switch(statusTypeEnum) {
		case SINGLE_CONNECTOR_QUERY_RESPONSE:
			endpointResStr = new String((byte[]) externalTask.getVariable("endpointRes"));
			doStatusUpdate(endpointResStr, reqId, reqType, true);				
			break;
		case ALL_CONNECTORS_QUERY_RESPONSE:
			endpointResStr = new String((byte[]) externalTask.getVariable("endpointRes"));
			doStatusUpdate(endpointResStr, reqId, reqType, false);		
			taskCacheService.removeTask(reqId, token);
			break;
		case QUERY_INTERRUPTED:
			sendQueryStatus(reqId, QueryStatusType.QUERY_INTERRUPTED, "The query has been interrupted. We will continue with the data collected so far.");				
			break;
		case PROCESS_CANCELED:
			sendQueryStatus(reqId, QueryStatusType.PROCESS_CANCELED, "The process has been canceled and no data will be retrieved.");				
			break;
		case DATA_ANONYMIZED_READY:
			sendQueryStatus(reqId, QueryStatusType.DATA_ANONYMIZED_READY, "Data have been anonymized and a public link can be requested.");
			break;
		case PUBLIC_LINK_AVAILABLE:
			sendQueryStatus(reqId, QueryStatusType.PUBLIC_LINK_AVAILABLE, "Public link available for data download.");
			break;
		default:
			sendQueryStatus(reqId, QueryStatusType.OTHER, "Status update of type " + statusTypeEnum);
			break;
		}
		externalTaskService.complete(externalTask);
		
	}
	
	private void sendQueryStatus(String reqId, QueryStatusType statusType, String msg) {
		QueryResponse queryStatus = QueryStatusHelper.createQueryResponse(reqId, statusType, msg);
		statusService.updateStatus(queryStatus);		
	}

	private void doStatusUpdate(String endpointResStr, String reqId, String reqType, boolean isPartial) {
		if(endpointResStr == null) {
			LOGGER.severe(String.format("No variable endpointRes was found for status update on request %s.\n"
					+ "One must be sent when status type is %s", reqId, "SINGLE_CONNECTOR_QUERY_RESPONSE"));
			return;
		} else {
			EObject endpointResObj = CamundaWorkerHelper.loadEObjectFromString(endpointResStr, resSet);
			if(endpointResObj instanceof EndpointResponse endpointResponse) {
				statusService.updateStatus(endpointResponse, createSingleConnectorQueryStatus(endpointResponse), reqType, isPartial);
			}
		}
	}
	
	private SingleConnectorQueryStatus createSingleConnectorQueryStatus(EndpointResponse endpointResponse) {
		SingleConnectorQueryStatus sgConnQueryStatus = StatusFactory.eINSTANCE.createSingleConnectorQueryStatus();
		ConnectorMetadata connMetadata = endpointResponse.getMetadata().stream().
				filter(m -> m instanceof ConnectorMetadata).
				map(m -> (ConnectorMetadata) m).
				findFirst().orElse(null);
		if(connMetadata != null) {
			sgConnQueryStatus.setConnectorId(connMetadata.getConnectorId());
			sgConnQueryStatus.setConnectorName(connMetadata.getConnectorName());
		} else {
			sgConnQueryStatus.setConnectorId("unknown");
			sgConnQueryStatus.setConnectorName("unknown");
		}		
		sgConnQueryStatus.setStatusResult(CamundaWorkerHelper.getStatusResult(endpointResponse.getResult()));
		sgConnQueryStatus.getStatusResult().setStatus(CamundaWorkerHelper.getQueryStatusType(endpointResponse.getCode()));
		sgConnQueryStatus.getStatusResult().setResponse(EcoreUtil.copy(endpointResponse));
		sgConnQueryStatus.getMetadata().addAll(EcoreUtil.copyAll(endpointResponse.getMetadata()));
		return sgConnQueryStatus;
	}

}
