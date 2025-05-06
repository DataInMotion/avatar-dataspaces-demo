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
package de.avatar.connector.camunda.process.launcher;

import java.util.Base64;
import java.util.logging.Logger;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.Header;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.connector.camunda.process.launcher.helper.TestResponseHandler;
import de.avatar.keycloak.service.api.KeycloakService;

/**
 * 
 * @author ilenia
 * @since Apr 25, 2025
 */
@Component(name = "TestComponent", immediate = true)
public class TestComponent {
	
	private static final Logger LOGGER = Logger.getLogger(TestComponent.class.getName());
	
	@Reference(target = "(service.name=QueryForwardService)", cardinality = ReferenceCardinality.MANDATORY)
	KeycloakService keycloakService;
	
	@Activate
	public void activate() {
		sendTestRequest();
	}
	
	private void sendTestRequest() {
		LOGGER.info("TestComponent sending request");
		String url = "http://apisix-gateway:9080/api/camundainterface/engine-rest/task";
		HttpClient httpClient = HttpClients.createDefault();
		try {			
			HttpGet request = new HttpGet(url);
			request.addHeader("Content-Type", "application/json");
			String strToken = keycloakService.getAccessToken().getToken();
			String encodedToken = Base64.getEncoder().encodeToString(strToken.getBytes());
			LOGGER.info(String.format("Token: %s", strToken));
			LOGGER.info(String.format("Econded Token: %s", encodedToken));
			request.addHeader("Authorization","Bearer " + strToken);
			LOGGER.info(String.format("REQUEST: %s", request.toString()));
			for(Header header : request.getHeaders()) {
				LOGGER.info(String.format("HEADER: %s %s ", header.getName(), header.getValue()));
			}			
			httpClient.execute(request, new TestResponseHandler());
			LOGGER.info("TestComponent sent request");
		} catch(Exception e) {
			LOGGER.severe(String.format("TestComponent Exception while sending request to %s", url));
			return;
		}		
	}

}
