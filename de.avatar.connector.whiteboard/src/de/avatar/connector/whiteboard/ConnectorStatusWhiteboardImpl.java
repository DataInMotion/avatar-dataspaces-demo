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

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.remoteserviceadmin.RemoteConstants;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.whiteboard.api.ConnectorStatusWhiteboard;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.StatusFactory;

/**
 * 
 * @author ilenia
 * @since Jan 16, 2025
 */
@Component(immediate = true, name = "ConnectorStatusWhiteboard", service = ConnectorStatusWhiteboard.class)
public class ConnectorStatusWhiteboardImpl implements ConnectorStatusWhiteboard {
	
	private static final Logger LOGGER = Logger.getLogger(ConnectorStatusWhiteboardImpl.class.getName());
	
	private List<AvatarConnector> connectors = new LinkedList<>();
	private List<AvatarConnector> externalConnectors = new LinkedList<>();
	private Map<AvatarConnector, ConnectorInfo> infoMap = new ConcurrentHashMap<>();
	
	@Activate
	public void activate() {
		LOGGER.info("Activate AvatarConnector-StatusWhiteboard");
	}
	
	@Deactivate
	public void deactivate() {
		LOGGER.info("De-activate AvatarConnector-StatusWhiteboard");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getAllConnectors()
	 */
	@Override
	public List<ConnectorInfo> getAllConnectors() {
		List<ConnectorInfo> cons = new ArrayList<>();
		cons.addAll(connectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
		cons.addAll(externalConnectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
		return Collections.unmodifiableList(cons);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getExternalConnectors()
	 */
	@Override
	public List<ConnectorInfo> getExternalConnectors() {
		return Collections.unmodifiableList(externalConnectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorStatusWhiteboard#executeStatusRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryResponse executeStatusRequest(QueryRequest request) {
		return doExecuteRequest(request, "status");
	}
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	public void addConnector(AvatarConnector connector, Map<String, Object> properties) {
		if (properties.containsKey(RemoteConstants.SERVICE_IMPORTED)) {
			synchronized (externalConnectors) {
				externalConnectors.add(connector);
			}
		} else {
			synchronized (connectors) {
				connectors.add(connector);
			}
		}
		printConnectionInfo(connector, true);
	}
	
	public void removeConnector(AvatarConnector connector, Map<String, Object> properties) {
		if (properties.containsKey(RemoteConstants.SERVICE_IMPORTED)) {
			synchronized (externalConnectors) {
				externalConnectors.remove(connector);
			}
		} else {
			synchronized (connectors) {
				connectors.remove(connector);
			}
		}
		printConnectionInfo(connector, false);
	}
	
	private QueryResponse doExecuteRequest(QueryRequest request, String reqType) {
		QueryResponse queryResponse = StatusFactory.eINSTANCE.createQueryResponse();
		queryResponse.setRequestId(request.getRequestId());
		connectors.forEach(c -> {
			ConnectorEndpoint endpoint = c.getEndpoints().stream().filter(e -> e.getId().contains(reqType)).findFirst().orElse(null);
			if(endpoint != null) {
				EndpointRequest endpointReq = ConnectorWhiteboardHelper.convertQueryToEndpointRequest(request);
				endpointReq.setEndpoint(endpoint);
				EcoreParameter parameter = AConnectorFactory.eINSTANCE.createEcoreParameter();
				parameter.setName("request");
				parameter.setNumber((short)0);
				parameter.setValue(request);
				endpointReq.getParameter().add(parameter);
				EndpointResponse enpointRes = c.executeRequest(endpointReq);
				ConnectorWhiteboardHelper.addSingleConnectorQueryStatus(queryResponse, enpointRes, c);	
			}			
		});	
		return ConnectorWhiteboardHelper.derermineGlobalResponseStatus(queryResponse, request);
	}
	
	private void printConnectionInfo(AvatarConnector connector, boolean add) {
		long start = Instant.now().toEpochMilli();
		ConnectorInfo info = add ? connector.getInfo() : infoMap.remove(connector);
		Objects.requireNonNull(info);
		long time = Instant.now().toEpochMilli() - start;
		String added = add ? "Added" : "Removed";
		System.out.println(String.format("%s connector with name %s (%s) within %s ms", added, info.getName(), info.getId(), time));
		if (add) {
			infoMap.put(connector, info);
			for(ConnectorEndpoint ep : info.getEndpoint()) {
				System.out.println(String.format("  - Detected endpoint with name %s (%s) and method %s iwth media type %s", ep.getName(), ep.getId(), ep.getMethod(), ep.getMediaType()));
			}
		}
	}

}
