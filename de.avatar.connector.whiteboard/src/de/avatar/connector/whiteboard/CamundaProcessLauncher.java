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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.ServiceScope;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.avatar.connector.whiteboard.api.OrchestratorProcessLauncher;

/**
 * 
 * @author ilenia
 * @since Feb 25, 2025
 */
@Component(name = "CamundaProcessLauncher", configurationPid = "CamundaProcessLauncher", 
configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class CamundaProcessLauncher implements OrchestratorProcessLauncher {
	
	
	private static final Logger LOGGER = Logger.getLogger(CamundaProcessLauncher.class.getName());
	private Map<String, Object> properties;

	@Activate
	public void activate(Map<String, Object> properties) {
		this.properties = properties;		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.OrchestratorProcessLauncher#launchProcess(java.util.Map)
	 */
	@Override
	public void launchProcess(Map<String, HashMap<String, HashMap<String, Object>>> processVariables) {
		HttpClient httpClient = HttpClients.createDefault();
		try {			
			ObjectMapper objectMapper = new ObjectMapper();
			String jacksonData = objectMapper.writeValueAsString(processVariables);
			HttpPost post = new HttpPost((String)properties.get("camunda.process.url"));
			StringEntity params =new StringEntity(jacksonData);
			post.addHeader("content-type", "application/json");
			post.setEntity(params);
			httpClient.execute(post, new MyResponseHandler());
		} catch(Exception e) {
			LOGGER.severe(String.format("Exception while sending request %s to Orchestrator", (String)properties.get("camunda.process.url")));
			return;
		}		

	}
	
	class MyResponseHandler implements HttpClientResponseHandler<Integer>{

		/* 
		 * (non-Javadoc)
		 * @see org.apache.hc.core5.http.io.HttpClientResponseHandler#handleResponse(org.apache.hc.core5.http.ClassicHttpResponse)
		 */
		@Override
		public Integer handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
			System.out.println(response.getCode());
			return response.getCode();
		}
	}

}
