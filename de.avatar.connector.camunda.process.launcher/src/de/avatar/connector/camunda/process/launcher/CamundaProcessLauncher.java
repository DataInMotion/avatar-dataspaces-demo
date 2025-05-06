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
package de.avatar.connector.camunda.process.launcher;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.avatar.connector.camunda.api.OrchestratorProcessLauncher;
import de.avatar.connector.camunda.process.launcher.helper.MyResponseHandler;
import de.avatar.keycloak.service.api.KeycloakService;

/**
 * 
 * @author ilenia
 * @since Feb 25, 2025
 */
@Component(immediate = true, name = "CamundaProcessLauncher", configurationPid = "CamundaProcessLauncher", 
configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CamundaProcessLauncher implements OrchestratorProcessLauncher {
	
	@Reference
	KeycloakService keycloakService;
	
	
	private static final Logger LOGGER = Logger.getLogger(CamundaProcessLauncher.class.getName());
	private Map<String, Object> properties;

	@Activate
	public void activate(Map<String, Object> properties) {
		this.properties = properties;		
		LOGGER.info(String.format("Activated Camunda Process Launcher with process name %s", (String)properties.get("camunda.process.name")));

	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.OrchestratorProcessLauncher#launchProcess(java.util.Map)
	 */
	@Override
	public void launchProcessToEngine(Map<String, HashMap<String, HashMap<String, Object>>> processVariables) {
		HttpClient httpClient = HttpClients.createDefault();
		try {			
			ObjectMapper objectMapper = new ObjectMapper();
			String jacksonData = objectMapper.writeValueAsString(processVariables);
			HttpPost post = new HttpPost((String)properties.get("camunda.process.url"));
			StringEntity params = new StringEntity(jacksonData);
			post.addHeader("content-type", "application/json");
			post.setEntity(params);
			httpClient.execute(post, new MyResponseHandler());
			LOGGER.info("I sent the process to camunda");
		} catch(Exception e) {
			LOGGER.severe(String.format("Exception while sending request %s to Orchestrator", (String)properties.get("camunda.process.url")));
			return;
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorProcessLauncher#isLocal()
	 */
	@Override
	public boolean isLocal() {
		return "local".equals((String) properties.get("camunda.process.type"));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.camunda.api.OrchestratorProcessLauncher#launchProcessToProcessUserInterface(java.util.Map)
	 */
	@Override
	public void launchProcessToProcessUserInterface(Map<String, HashMap<String, Object>> processVariables) {
		HttpClient httpClient = HttpClients.createDefault();
		try {			
			ObjectMapper objectMapper = new ObjectMapper();
			String jacksonData = objectMapper.writeValueAsString(processVariables);
			HttpPost post = new HttpPost((String)properties.get("camunda.process.url"));
			StringEntity params = new StringEntity(jacksonData);
			post.addHeader("Content-Type", "application/json");
			post.addHeader("Authorization","Bearer " + keycloakService.getAccessToken().getToken());
			post.setEntity(params);
			httpClient.execute(post, new MyResponseHandler());
			LOGGER.info("I sent the process to process user interface");
		} catch(Exception e) {
			LOGGER.severe(String.format("Exception while sending request %s to process user interface", (String)properties.get("camunda.process.url")));
			return;
		}		
	}

	
}
