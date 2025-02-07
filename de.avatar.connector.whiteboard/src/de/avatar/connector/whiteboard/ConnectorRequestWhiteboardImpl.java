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
import de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ResponseCode;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusPackage;

@Component(immediate = true, name = "ConnectorRequestWhiteboard", service = ConnectorRequestWhiteboard.class)
public class ConnectorRequestWhiteboardImpl implements ConnectorRequestWhiteboard {
	
	@Reference
	private AConnectorFactory connectorFactory;
	
	@Reference
	StatusService statusService;
	
	private static final Logger LOGGER = Logger.getLogger(ConnectorRequestWhiteboardImpl.class.getName());
	
	private List<AvatarConnector> connectors = new LinkedList<>();
	private List<AvatarConnector> externalConnectors = new LinkedList<>();
	private Map<AvatarConnector, ConnectorInfo> infoMap = new ConcurrentHashMap<>();
	
	@Activate
	public void activate() {
		System.out.println("Activate AvatarConnector-RequestWhiteboard");
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("De-activate AvatarConnector-RequestWhiteboard");
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
	 * @see de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard#executeDryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryStatusResponse executeDryRun(QueryRequest request) {		
		try {
			QueryStatusResponse response = doExecuteRequest(request, "dryrun");
			response.setTimestamp(Instant.now().toEpochMilli());
			response.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
				//				We do not want to display the full response result when the status is SUCCESS
				scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
			});
			return response;
		} catch(Exception e) {
			LOGGER.severe(String.format("Something went wrong when executing dry run request %s", request.getRequestId()));
			e.printStackTrace();
			return null;
		}
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard#executeRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryStatusResponse executeRequest(QueryRequest request) {
		if(statusService.isRequestCached(request)) {
			LOGGER.severe(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
		}
		try {
			QueryStatusResponse response = doExecuteRequest(request, "request");
			response.setTimestamp(Instant.now().toEpochMilli());
			if(!QueryStatusType.ERROR.equals(response.getStatus())) statusService.cacheRequest(request);	
			response.getDetailedStatus().getSingleConnectorQueryStatus().forEach(scs -> {
				//				We do not want to display the full response result when the status is SUCCESS
				scs.getStatusResult().eUnset(StatusPackage.Literals.STATUS__RESPONSE);
			});
			return response;
		} catch(Exception e) {
			LOGGER.severe(String.format("Something went wrong when executing request %s", request.getRequestId()));
			e.printStackTrace();
			return null;
		}
	}
	
	private QueryStatusResponse doExecuteRequest(QueryRequest request, String reqType) {
		
		QueryStatusResponse queryResponse = StatusFactory.eINSTANCE.createQueryStatusResponse();
		queryResponse.setRequestId(request.getRequestId());
		queryResponse.setStatus(QueryStatusType.SUCCESS);
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
				try {
					EndpointResponse endpointRes = "request".equals(reqType) ? c.executeRequest(endpointReq) : c.dryRequest(endpointReq);
					endpointRes.setSourceId(c.getInfo().getId());
					statusService.updateStatus(endpointRes);
					if(ResponseCode.ERROR.equals(endpointRes.getCode())) {
						queryResponse.setStatus(QueryStatusType.ERROR);
					} else if(QueryStatusType.SUCCESS.equals(queryResponse.getStatus()) && ResponseCode.PENDING.equals(endpointRes.getCode())) {
						queryResponse.setStatus(QueryStatusType.PENDING);	
					}
					ConnectorWhiteboardHelper.addSingleConnectorQueryStatus((QueryStatusResponse )queryResponse, endpointRes, c);	
				} catch(Exception e) {
					e.printStackTrace();
				}
			}			
		});	
		return queryResponse;
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
