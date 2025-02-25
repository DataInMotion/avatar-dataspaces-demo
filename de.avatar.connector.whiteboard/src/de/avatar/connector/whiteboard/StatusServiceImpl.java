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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.client.topic.TopicSubscription;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.whiteboard.api.ConnectorStatusWhiteboard;
import de.avatar.connector.whiteboard.api.OrchestratorWorker;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.generator.api.api.AvatarGenerator;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ResponseCode;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusPackage;

/**
 * 
 * @author ilenia
 * @since Jan 13, 2025
 */
@Component(immediate = true, name = "StatusService", service = StatusService.class)
public class StatusServiceImpl implements StatusService{

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;

	@Reference
	ConnectorStatusWhiteboard statusWhiteboard;

	@Reference
	AvatarGenerator avatarGenerator;

	private static final Logger LOGGER = Logger.getLogger(StatusServiceImpl.class.getName());
	
	private ExecutorService executor = Executors.newSingleThreadExecutor();
	private TopicSubscription camundaSubscription;

	Map<String, QueryRequest> cachedRequests = new ConcurrentHashMap<>();
	Map<String, QueryResponse> cachedStatuses = new ConcurrentHashMap<>();

	private OrchestratorWorker statusCamundaWorker;
	
	@Activate
	public StatusServiceImpl(@Reference(target = "(camunda.worker.name=update-status)")
	OrchestratorWorker statusCamundaWorker) {
		this.statusCamundaWorker = statusCamundaWorker;
		executor.submit(this::handleOrchestratorTask);
	}
	
	@Deactivate
	public void deactivate() {
		camundaSubscription.close();
		executor.shutdown();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#isRequestCached(de.avatar.status.QueryRequest)
	 */
	public boolean isRequestCached(QueryRequest request) {
		if(request.getRequestId() == null) return false;
		if(cachedRequests.containsKey(request.getRequestId())) return true;
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#getCachedRequest(java.lang.String)
	 */
	public QueryRequest getCachedRequest(String requestId) {
		return cachedRequests.getOrDefault(requestId, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#cacheRequest(de.avatar.status.QueryRequest)
	 */
	public void cacheRequest(QueryRequest request) {
		if(request.getRequestId() != null) {
			cachedRequests.put(request.getRequestId(), request);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#updateStatus(de.avatar.model.connector.EndpointResponse)
	 */
	@Override
	public void updateStatus(EndpointResponse endpointResponse) {

		if(ResponseCode.OK.equals(endpointResponse.getCode())) {
			LOGGER.info(String.format("I am aggregating response for %s", endpointResponse.getRequest().getId()));
			avatarGenerator.aggregateResponse(endpointResponse);
		}

	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.StatusService#executeStatusRequest(java.lang.String)
	 */
	@Override
	public QueryStatusResponse executeStatusRequest(String requestId) {

		QueryRequest request = getCachedRequest(requestId);
		if(request == null) {
			LOGGER.severe(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
		}
		QueryStatusResponse response = statusWhiteboard.executeStatusRequest(request);
//		updateStatus(response);
		
		if(QueryStatusType.SUCCESS.equals(response.getStatus())) {
			cachedStatuses.remove(response.getRequestId());
			cachedRequests.remove(response.getRequestId());
		} else {
			cachedStatuses.put(response.getRequestId(), response);
		}

		response.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {

			//				We do not want to display the full response result when the status is SUCCESS
			scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);

		});
		return response;
	}

	private void handleOrchestratorTask() {
		try {
			camundaSubscription = statusCamundaWorker.getTopicSubscriptionBuilder()
			.handler(this::doHandleOrchestratorTask)
			.open();
		} catch(Exception e) {
			e.printStackTrace();
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

	private void doHandleOrchestratorTask(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		// Get a process variable
		byte[] enpointResponse = externalTask.getVariable("endpointRes");
		LOGGER.info(String.format("Got enpointResponse task %s", new String(enpointResponse)));
		EObject obj = loadEObjectFromString( new String(enpointResponse));
		if(obj instanceof EndpointResponse response) {
			updateStatus(response);
		} else {
			LOGGER.severe("No EndpointResponse in process variable!");
		}
		// Complete the task
		externalTaskService.complete(externalTask);
		
	}
}
