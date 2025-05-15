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
import org.camunda.bpm.client.ExternalTaskClientBuilder;
import org.camunda.bpm.client.interceptor.ClientRequestContext;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.connector.camunda.api.OrchestratorWorker;
import de.avatar.connector.camunda.workers.task.handlers.DoNothingTaskHandler;
import de.avatar.connector.camunda.workers.task.handlers.ManualTerminationTaskHandler;
import de.avatar.connector.camunda.workers.task.handlers.StatusUpdateTaskHandler;
import de.avatar.keycloak.service.api.KeycloakService;
import de.avatar.query.backend.api.StatusService;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
@Component(service = OrchestratorWorker.class, configurationPid = "OrchestratorWorker", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CamundaWorker  implements OrchestratorWorker {
	
	@Reference
	private KeycloakService keycloakService;
	
	@Reference
	private ResourceSet resourceSet;
	
	@Reference
	StatusService statusService;
	
	@Reference(target="(component.name=ManualTerminationCacheTaskService)")
	OrchestratorTaskCacheService cacheTaskService;
	
	
	private static final Logger LOGGER = Logger.getLogger(CamundaWorker.class.getName());
	
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
		requestContext.addHeader("Authorization","Bearer " + keycloakService.getAccessToken().getToken());
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
		handler(getTaskHandler()).
		open();
	}
	
	private ExternalTaskHandler getTaskHandler() {
		String handlerType = (String) properties.getOrDefault("worker.task.handler.type", null);
		if(handlerType == null) {
			return new DoNothingTaskHandler();
		} else {
			switch(handlerType) {
			case "STATUS_UPDATE":
				return new StatusUpdateTaskHandler(statusService, resourceSet, cacheTaskService);
			case "MANUAL_TERMINATION":
				return new ManualTerminationTaskHandler(statusService, resourceSet, cacheTaskService);
			default:
				LOGGER.warning(String.format("No ExternalTaskHandler implemented for type %s", handlerType));
				return new DoNothingTaskHandler();
			}
		}
	}
}
