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
package de.avatar.connector.isma;

import static java.util.Objects.nonNull;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaParameter;
import de.avatar.model.connector.Parameter;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.StatusType;
import de.avatar.model.connector.helper.ConnectorHelper;

@Component(immediate = true, name = "ISMAConnector", property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
"connector=isma.himsa"})
public class ISMAConnectorImpl implements AvatarConnector {

	@Reference
	private AConnectorFactory connectorFactory;
	private long startTimestamp;

	@Activate
	public void activate() {
		System.out.println("Activate ISMA-Connector-Implementation");
		startTimestamp = Instant.now().getEpochSecond();
	}

	@Deactivate
	public void deactivate() {
		System.out.println("De-activate ISMA-Connector-Implementation");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 */
	@Override
	public List<ConnectorEndpoint> getEndpoints() {
		List<ConnectorEndpoint> eps = new ArrayList<>();
		ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("mqtt://isma/himsa");
		ep.setId("mqtt_isma_himsa");
		ep.setName("ISMA HIMSA MQTT Endpoint");
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setUri("http://isma/himsa/rest");
		ep.setId("rest_isma_himsa");
		ep.setName("ISMA HIMSA Rest Endpoint");
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
		info.setId("isma_himsa");
		info.setName("ISMA Himsa Connector");
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
		if (Objects.isNull(request)) {
			throw new IllegalArgumentException("Request must not be null");
		}
		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {
			EndpointResponse response = ConnectorHelper.createResponse(request);
			response.setCode(ResponseCode.PENDING);
			DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
			result.setEstRuntime(12);
			result.setResultCount(1);
			response.setResult(result);
			System.out.println(String.format("Dry-Test  request %s to endpoint '%s'", request.getId(), request.getEndpoint().getUri()));
			for (Parameter p : request.getParameter()) {
				if (p instanceof JavaParameter jp) {
					System.out.println(String.format("  - Java Parameter %s with name '%s' and type '%s' - value = '%s'", jp.getNumber(), jp.getName(), jp.getTypeString(), Objects.isNull(jp.getValue()) ? "<null>" : jp.getValue().toString()));
				} else {
					System.out.println(String.format("  - Parameter %s with name '%s'", p.getNumber(), p.getName()));
				}
			}
			return response;
		} else {
			return ConnectorHelper.validateResponse(request);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse executeRequest(EndpointRequest request) {
		if (Objects.isNull(request)) {
			throw new IllegalArgumentException("Request must not be null");
		}
		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {
			EndpointResponse response = ConnectorHelper.createResponse(request);
			response.setCode(ResponseCode.OK);
			EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
			response.setResult(result);
			System.out.println(String.format("Execute  request %s to endpoint '%s'", request.getId(), request.getEndpoint().getUri()));
			for (Parameter p : request.getParameter()) {
				if (p instanceof JavaParameter jp) {
					System.out.println(String.format("  - Java Parameter %s with name '%s' and type '%s' - value = '%s'", jp.getNumber(), jp.getName(), jp.getTypeString(), Objects.isNull(jp.getValue()) ? "<null>" : jp.getValue().toString()));
				} else {
					System.out.println(String.format("  - Parameter %s with name '%s'", p.getNumber(), p.getName()));
				}
			}
			return response;
		} else {
			return ConnectorHelper.validateResponse(request);
		}
	}


}
