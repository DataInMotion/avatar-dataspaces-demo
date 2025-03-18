///**
// * Copyright (c) 2012 - 2025 Data In Motion and others.
// * All rights reserved. 
// * 
// * This program and the accompanying materials are made
// * available under the terms of the Eclipse Public License 2.0
// * which is available at https://www.eclipse.org/legal/epl-2.0/
// *
// * SPDX-License-Identifier: EPL-2.0
// * 
// * Contributors:
// *     Data In Motion - initial API and implementation
// */
//package de.avatar.connector.camunda;
//
//import java.util.Map;
//
//import org.camunda.bpm.client.ExternalTaskClient;
//import org.camunda.bpm.client.interceptor.ClientRequestContext;
//import org.camunda.bpm.client.topic.TopicSubscriptionBuilder;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.ConfigurationPolicy;
//import org.osgi.service.component.annotations.Reference;
//import org.osgi.service.component.annotations.ServiceScope;
//
//import de.avatar.connector.camunda.api.OrchestratorWorker;
//import de.avatar.keycloak.service.api.KeycloakService;
//
///**
// * 
// * @author ilenia
// * @since Feb 25, 2025
// */
//@Component(name = "CamundaOrchestratorWorker", service = OrchestratorWorker.class,
//configurationPid = "CamundaWorker", configurationPolicy = ConfigurationPolicy.REQUIRE, 
//scope = ServiceScope.PROTOTYPE, property = {
//		"service.exported.configs=com.paremus.dosgi.net", 
//		"service.exported.interfaces=*", 
//		"com.paremus.dosgi.scope=global", 
//		"com.paremus.dosgi.target.clusters=DIMC", 
//		"com.paremus.dosgi.net.serialization=ecore",
//"camunda=camunda.worker"})
//public class CamundaOrchestratorWorker implements OrchestratorWorker {
//	
//	@Reference
//	KeycloakService keycloakService;
//	
//	private Map<String, Object> properties;
//
//	@Activate
//	public void activate(Map<String, Object> properties) {
//		this.properties = properties;
//		System.out.println(String.format("Activated Camunda Worker with task topic %s", (String)properties.get("camunda.task.topic")));
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.connector.whiteboard.api.OrchestratorWorker#getTopicSubscriptionBuilder()
//	 */
//	@Override
//	public TopicSubscriptionBuilder getTopicSubscriptionBuilder() {
//		return subscribe();
//	}
//	
//	private TopicSubscriptionBuilder subscribe() {
//		ExternalTaskClient client = ExternalTaskClient.create()
//				.baseUrl((String)properties.get("camunda.engine.url"))
//				.asyncResponseTimeout((Long)properties.get("camunda.polling.timeout") == null ? 10000 : (Long)properties.get("camunda.polling.timeout")) // long polling timeout
//				.addInterceptor(this)
//				.build();
//		// subscribe to an external task topic as specified in the process
//		System.out.println(client.toString());
//		return client.
//				subscribe((String)properties.get("camunda.task.topic")).
//				lockDuration((Long)properties.get("camunda.task.lock.duration") == null ? 1000 : (Long)properties.get("camunda.task.lock.duration"));
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see org.camunda.bpm.client.interceptor.ClientRequestInterceptor#intercept(org.camunda.bpm.client.interceptor.ClientRequestContext)
//	 */
//	@Override
//	public void intercept(ClientRequestContext requestContext) {
//		requestContext.addHeader("Authorization","bearer " + keycloakService.getAccessToken());
//	}
//
//}
