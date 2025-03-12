/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.keycloak.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.representations.AccessTokenResponse;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.avatar.keycloak.service.api.KeycloakService;

@Component(name = "KeycloakService", service =  KeycloakService.class, 
configurationPid = "KeycloakService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class KeycloakServiceImpl implements KeycloakService {
	
	private AuthzClient authzClient;
	private AccessTokenResponse token;
	
	@interface KeycloakConfig {
		String serviceName();
		String configurationFilePath() default "";
	}
	
	
	@Activate 
	public void activate(KeycloakConfig config) throws ConfigurationException {
		String configPath = config.configurationFilePath();
		if (configPath.isEmpty() || configPath.isBlank()) {
			throw new ConfigurationException("configFilePath", "The 'configFilePath' must be given");
		}
		try(InputStream configStream = new FileInputStream(configPath)) {
			authzClient = AuthzClient.create(configStream);	
		} catch(IOException e) {
			throw new ConfigurationException("configPath", String.format("Cannot load keycloak configuration from file path '%s'", configPath), e);
		}
	}
	

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.keycloak.service.api.KeycloakService#getAccessToken()
	 */
	@Override
	public AccessTokenResponse getAccessToken() {
		if(token == null) {
			token = authzClient.obtainAccessToken();
		}
		if(isTokenValid(token.getToken())) {
			return token;
		}
		else {
			token = authzClient.obtainAccessToken();
		}
		return token;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.keycloak.service.api.KeycloakService#getAccessTokenForUser(java.lang.String, java.lang.String)
	 */
	@Override
	public AccessTokenResponse getAccessTokenForUser(String username, String password) {
		return authzClient.obtainAccessToken(username, password);
	}
	
	private boolean isTokenValid(String tokenStr) {
		try {
			authzClient.authorization(tokenStr).authorize();
			return true;
		} catch(Exception e) {
			return false;
		}		
	}


	
}
