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
package de.avatar.connector.whiteboard;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.remoteserviceadmin.RemoteConstants;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;

@Component(immediate = true)
public class ConnectorWhiteboardImpl implements ConnectorWhiteboard {
	
	@Reference
	private AConnectorFactory connectorFactory;
	
	private List<AvatarConnector> connectors = new LinkedList<>();
	private List<AvatarConnector> externalConnectors = new LinkedList<>();
	private Map<AvatarConnector, ConnectorInfo> infoMap = new ConcurrentHashMap<>();
	
	@Activate
	public void activate() {
		System.out.println("Activate AvatarConnector-Whiteboard");
//		EndpointRequest request = connectorFactory.createEndpointRequest();
//		request.setId(UUID.randomUUID().toString());
//		request.setSourceId("getData");
//		ConnectorEndpoint connectorEndpoint = info.getEndpoint().get(0);
//		request.setEndpoint(connectorEndpoint);
//		JavaParameter p = connectorFactory.createJavaParameter();
//		p.setNumber((short) 0);
//		p.setName("limit");
//		p.setTypeString(Integer.class.getName());
//		p.setValue(20);
//		request.getParameter().add(p);
//		request.setTimestamp(Instant.now().toEpochMilli());
//		long start = request.getTimestamp();
//		EndpointResponse response = connector.dryRequest(request);
//		long millies = response.getTimestamp() - start;
//		System.out.println(String.format("Dry-Run took %s ms", millies));
		
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("De-activate AvatarConnector-Whiteboard");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connectors.demo.rsa.consumer.ConnectorWhiteboard#getAllConnectors()
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
	 * @see de.avatar.connectors.demo.rsa.consumer.ConnectorWhiteboard#getExternalConnectors()
	 */
	@Override
	public List<ConnectorInfo> getExternalConnectors() {
		return Collections.unmodifiableList(externalConnectors.
				stream().
				map(AvatarConnector::getInfo).
				collect(Collectors.toList()));
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

	/**
	 * @param add if a connector was added
	 */
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
