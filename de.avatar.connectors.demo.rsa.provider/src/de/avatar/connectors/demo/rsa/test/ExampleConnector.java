/**
 * Copyright (c) 2012 - 2021 Paremus Ltd., Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 		Paremus Ltd. - initial API and implementation
 *      Data In Motion
 */
package de.avatar.connectors.demo.rsa.test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaParameter;

@Component(immediate = true, property = {"service.exported.configs=com.paremus.dosgi.net", "service.exported.interfaces=*", "com.paremus.dosgi.scope=global", "com.paremus.dosgi.target.clusters=DIMC", "com.paremus.dosgi.net.serialization=ecore"})
//@Component(service = HelloWorld.class ,immediate = true, property = {"service.exported.configs=com.paremus.dosgi.net", "service.exported.interfaces=*", "com.paremus.dosgi.scope=universal"})
public class ExampleConnector implements AvatarConnector {
	
	@Reference
	private AConnectorFactory connectorFactory;
	
	@Activate
	public void activate() {
		System.out.println("Activate ExampleConnector-Implementation");
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("De-activate ExampleConnector-Implementation");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 */
	@Override
	public List<ConnectorEndpoint> getEndpoints() {
		List<ConnectorEndpoint> eps = new ArrayList<>();
		ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("mqtt://example/bla");
		ep.setId("bla");
		ep.setName("Bla Endpoint");
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("mqtt://example/blub");
		ep.setId("blub");
		ep.setName("Blub Endpoint");
		eps.add(ep);
		return eps;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getInfo()
	 */
	@Override
	public ConnectorInfo getInfo() {
		ConnectorInfo info = connectorFactory.createConnectorInfo();
		info.setId("123");
		info.setName("ExampleProvider-123");
		info.setVersion((short)123);
		info.getEndpoint().addAll(getEndpoints());
		return info;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#dryRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse dryRequest(EndpointRequest request) {
		EndpointResponse response = connectorFactory.createEndpointResponse();
		response.setId(request.getId());
		response.setRequest(EcoreUtil.copy(request));
		response.setSourceId(request.getSourceId());
		response.setTimestamp(Instant.now().toEpochMilli());
		System.out.println(String.format("Dry-Test  request %s to endpoint '%s'", request.getId(), request.getEndpoint().getUri()));
		for (JavaParameter p : request.getParameter()) {
			System.out.println(String.format("  - Parameters %s with name '%s' and type '%s' - value = '%s'", p.getNumber(), p.getName(), p.getTypeString(), Objects.isNull(p.getValue()) ? "<null>" : p.getValue().toString()));
		}
		return response;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse executeRequest(EndpointRequest request) {
		EndpointResponse response = connectorFactory.createEndpointResponse();
		response.setId(request.getId());
		response.setRequest(EcoreUtil.copy(request));
		response.setSourceId(request.getSourceId());
		response.setTimestamp(Instant.now().toEpochMilli());
		System.out.println(String.format("Execute request %s to endpoint '%s'", request.getId(), request.getEndpoint().getUri()));
		for (JavaParameter p : request.getParameter()) {
			System.out.println(String.format("  - Parameters %s with name '%s' and type '%s' - value = '%s'", p.getNumber(), p.getName(), p.getTypeString(), Objects.isNull(p.getValue()) ? "<null>" : p.getValue().toString()));
		}
		return response;
	}


}
