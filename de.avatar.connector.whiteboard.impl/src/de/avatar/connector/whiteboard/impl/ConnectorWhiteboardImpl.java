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
package de.avatar.connector.whiteboard.impl;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.remoteserviceadmin.RemoteConstants;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.ModelInfo;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
@Component(immediate = true, name = "ConnectorWhiteboardImpl", service = ConnectorWhiteboard.class)
public class ConnectorWhiteboardImpl implements ConnectorWhiteboard{
	
	private static final Logger LOGGER = Logger.getLogger(ConnectorWhiteboardImpl.class.getName());
	
	private List<AvatarConnector> connectors = new LinkedList<>();
	private List<AvatarConnector> externalConnectors = new LinkedList<>();
	private Map<AvatarConnector, ConnectorInfo> infoMap = new ConcurrentHashMap<>();
	
	@Activate
	public ConnectorWhiteboardImpl() {
		LOGGER.info("ConnectorWhiteboard is active!");
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

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getAllConnectors()
	 */
	@Override
	public List<ConnectorInfo> getAllConnectorsInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getExternalConnectors()
	 */
	@Override
	public List<ConnectorInfo> getExternalConnectorsInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getModelInfoForAllConnectors()
	 */
	@Override
	public List<ModelInfo> getModelInfoForAllConnectors() {
		return Stream.concat(connectors.stream(), externalConnectors.stream()).map(c -> c.getInfo().getModelInfo()).flatMap(c -> c.stream()).toList();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getConsentInfoForAllConnectors()
	 */
	@Override
	public List<ConsentInfo> getConsentInfoForAllConnectors() {
		return Stream.concat(connectors.stream(), externalConnectors.stream()).map(c -> c.getInfo().getConsentInfo()).flatMap(c -> c.stream()).toList();
	}

	private void printConnectionInfo(AvatarConnector connector, boolean add) {
		long start = Instant.now().toEpochMilli();
		ConnectorInfo info = add ? connector.getInfo() : infoMap.remove(connector);
		Objects.requireNonNull(info);
		long time = Instant.now().toEpochMilli() - start;
		String added = add ? "Added" : "Removed";
		LOGGER.info(String.format("%s connector with name %s (%s) within %s ms", added, info.getName(), info.getId(), time));
		if (add) {
			infoMap.put(connector, info);
			for(ConnectorEndpoint ep : info.getEndpoint()) {
				LOGGER.info(String.format("  - Detected endpoint with name %s (%s) and method %s iwth media type %s", ep.getName(), ep.getId(), ep.getMethod(), ep.getMediaType()));
			}
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#getAllConnectors()
	 */
	@Override
	public List<AvatarConnector> getAllConnectors() {
		return Stream.concat(connectors.stream(), externalConnectors.stream()).toList();
	}
}
