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
package de.avatar.connector.other;

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
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaParameter;
import de.avatar.model.connector.Parameter;
import de.avatar.model.connector.StatusType;

@Component(immediate = true, property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
		"connector=other.hl7"})
public class OtherConnectorImpl implements AvatarConnector {
	
	@Reference
	private AConnectorFactory connectorFactory;
	private long startTimestamp;
	
	@Activate
	public void activate() {
		System.out.println("Activate Other-Connector-Implementation");
		startTimestamp = Instant.now().getEpochSecond();
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("De-activate Other-Connector-Implementation");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 */
	@Override
	public List<ConnectorEndpoint> getEndpoints() {
		List<ConnectorEndpoint> eps = new ArrayList<>();
		ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("mqtt://other/hl7");
		ep.setId("mqtt_other_hl7");
		ep.setName("Some HL7 MQTT Endpoint");
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("http://other/hl7/rest");
		ep.setId("rest_other_hl7");
		ep.setName("Some HL7 Rest Endpoint");
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
		info.setId("other_hl7");
		info.setName("Some HL7 Connector");
		info.setVersion((short)1);
		ConnectorMetric metric = connectorFactory.createConnectorMetric();
		metric.setStatus(StatusType.RUNNING);
		metric.setTimestamp(Instant.now().toEpochMilli());
		metric.setUptime(Instant.now().getEpochSecond() - startTimestamp);
		info.setMetric(metric);
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
		for (Parameter p : request.getParameter()) {
			if (p instanceof JavaParameter jp) {
				System.out.println(String.format("  - Java Parameter %s with name '%s' and type '%s' - value = '%s'", jp.getNumber(), jp.getName(), jp.getTypeString(), Objects.isNull(jp.getValue()) ? "<null>" : jp.getValue().toString()));
			} else {
				System.out.println(String.format("  - Parameter %s with name '%s'", p.getNumber(), p.getName()));
			}
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
		for (Parameter p : request.getParameter()) {
			if (p instanceof JavaParameter jp) {
				System.out.println(String.format("  - Java Parameter %s with name '%s' and type '%s' - value = '%s'", jp.getNumber(), jp.getName(), jp.getTypeString(), Objects.isNull(jp.getValue()) ? "<null>" : jp.getValue().toString()));
			} else {
				System.out.println(String.format("  - Parameter %s with name '%s'", p.getNumber(), p.getName()));
			}
		}
		return response;
	}


}
