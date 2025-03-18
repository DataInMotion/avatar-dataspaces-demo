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

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.interceptor.ClientRequestContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.camunda.api.OrchestratorWorker;
import de.avatar.connector.camunda.workers.helper.CamundaWorkerHelper;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.keycloak.service.api.KeycloakService;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.SingleConnectorQueryStatus;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
@Component(immediate = true, name = "CamundaStatusWorker", service = OrchestratorWorker.class,
configurationPid = "CamundaStatusWorker", configurationPolicy = ConfigurationPolicy.REQUIRE
/**, 
scope = ServiceScope.PROTOTYPE, property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
"camunda=camunda.worker"}**/
)
public class CamundaStatusWorker implements OrchestratorWorker {
	
	@Reference
	KeycloakService keycloakService;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;
	
	@Reference
	StatusService statusService;
	
	
	private static final Logger LOGGER = Logger.getLogger(CamundaStatusWorker.class.getName());
	
	private ExecutorService executor = Executors.newSingleThreadExecutor();	
	private Map<String, Object> properties;

	@Activate
	public void activate(Map<String, Object> properties) {
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
		requestContext.addHeader("Authorization","bearer " + keycloakService.getAccessToken());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorWorker#handleTask()
	 */
	@Override
	public void handleTask() {
		ExternalTaskClient client = ExternalTaskClient.create()
				.baseUrl((String)properties.get("camunda.engine.url"))
				.asyncResponseTimeout((Long)properties.get("camunda.polling.timeout") == null ? 10000 : (Long)properties.get("camunda.polling.timeout")) // long polling timeout
//				.addInterceptor(this)
				.build();
		client.
		subscribe((String)properties.get("camunda.task.topic")).
		lockDuration((Long)properties.get("camunda.task.lock.duration") == null ? 1000 : (Long)properties.get("camunda.task.lock.duration")).
		handler((externalTask, externalTaskService) -> {
			String sgConnQueryStatusStr = new String((byte[]) externalTask.getVariable("sgConnQueryStatus"));
			String endpointResStr = new String((byte[]) externalTask.getVariable("endpointRes"));
			LOGGER.info(String.format("I got the  SingleConnectorQueryStatus in CamundaStatusWorker %s", sgConnQueryStatusStr));
			LOGGER.info(String.format("I got the  EndpointResponse in CamundaStatusWorker %s", endpointResStr));
			try {
				EObject sgConnStatusObj = CamundaWorkerHelper.loadEObjectFromString(sgConnQueryStatusStr, rsFactory);
				EObject endpointResObj = CamundaWorkerHelper.loadEObjectFromString(endpointResStr, rsFactory);
				if(sgConnStatusObj instanceof SingleConnectorQueryStatus sgConnQueryStatus && endpointResObj instanceof EndpointResponse endpointResponse) {
					statusService.updateStatus(endpointResponse, sgConnQueryStatus);
				}
			}
			catch(Exception e) {
				LOGGER.severe("Something went worng while processing task update-status");
				e.printStackTrace();
			} finally {
				externalTaskService.complete(externalTask);
			}				
		})
		.open();
	}

}
