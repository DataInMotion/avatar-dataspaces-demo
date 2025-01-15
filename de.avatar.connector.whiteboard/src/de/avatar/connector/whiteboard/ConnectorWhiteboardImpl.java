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
import java.util.UUID;
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
import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.ResponseResult;
import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.ErrorStatusResult;
import de.avatar.status.PendingStatusResult;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusResult;

@Component(immediate = true, name = "ConnectorWhiteboard")
public class ConnectorWhiteboardImpl implements ConnectorWhiteboard {
	
	@Reference
	private AConnectorFactory connectorFactory;
	
	@Reference
	RequestCacheService cacheService;
	
	private static final Logger LOGGER = Logger.getLogger(ConnectorWhiteboardImpl.class.getName());
	
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

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#dryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryResponse executeDryRun(QueryRequest request) {		
		QueryResponse queryResponse = StatusFactory.eINSTANCE.createQueryResponse();
		queryResponse.setRequestId(request.getRequestId());
		connectors.forEach(c -> {
			ConnectorEndpoint endpoint = c.getEndpoints().stream().filter(e -> e.getId().contains("dryrun")).findFirst().orElse(null);
			if(endpoint != null) {
				EndpointRequest endpointReq = convertQueryToEndpointRequest(request);
				endpointReq.setEndpoint(endpoint);
				EcoreParameter parameter = AConnectorFactory.eINSTANCE.createEcoreParameter();
				parameter.setName("request");
				parameter.setNumber((short)0);
				parameter.setValue(request);
				endpointReq.getParameter().add(parameter);
				EndpointResponse enpointRes = c.dryRequest(endpointReq);
				addSingleConnectorQueryStatus(queryResponse, enpointRes, c);
			}
		});	
		return derermineGlobalResponseStatus(queryResponse, request);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#executeRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public QueryResponse executeRequest(QueryRequest request) {
		if(cacheService.isRequestCached(request)) {
			LOGGER.severe(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is already cached. This should not be the case!", request.getRequestId()));
		}
		cacheService.cacheRequest(request);		
		QueryResponse response = doExecuteRequest(request, "request");
		cacheService.updateStatus(response);
		return response;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.whiteboard.api.ConnectorWhiteboard#executeStatusRequest(java.lang.String)
	 */
	@Override
	public QueryResponse executeStatusRequest(String requestId) {
		
		QueryRequest request = cacheService.getCachedRequest(requestId);
		if(request == null) {
			LOGGER.severe(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
			throw new IllegalArgumentException(String.format("QueryRequest with id %s is NOT already cached. This should not be the case!", requestId));
		}
		QueryResponse response = doExecuteRequest(request, "status");
		cacheService.updateStatus(response);
		return response;
	}
	
	private QueryResponse doExecuteRequest(QueryRequest request, String reqType) {
		QueryResponse queryResponse = StatusFactory.eINSTANCE.createQueryResponse();
		queryResponse.setRequestId(request.getRequestId());
		connectors.forEach(c -> {
			ConnectorEndpoint endpoint = c.getEndpoints().stream().filter(e -> e.getId().contains(reqType)).findFirst().orElse(null);
			if(endpoint != null) {
				EndpointRequest endpointReq = convertQueryToEndpointRequest(request);
				endpointReq.setEndpoint(endpoint);
				EcoreParameter parameter = AConnectorFactory.eINSTANCE.createEcoreParameter();
				parameter.setName("request");
				parameter.setNumber((short)0);
				parameter.setValue(request);
				endpointReq.getParameter().add(parameter);
				EndpointResponse enpointRes = c.executeRequest(endpointReq);
				addSingleConnectorQueryStatus(queryResponse, enpointRes, c);	
			}			
		});	
		return derermineGlobalResponseStatus(queryResponse, request);
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

	
	private QueryResponse derermineGlobalResponseStatus(QueryResponse response, QueryRequest request) {
		List<QueryStatusType> statuses = response.
				getDetailedStatus().
				getSingleConnectorQueryStatus().
				stream().
				map(r -> r.getStatusResult().getStatus()).
				toList();
		
		if(statuses.contains(QueryStatusType.PENDING)) {
			response.setStatus(QueryStatusType.PENDING);
		} else if(!statuses.contains(QueryStatusType.PENDING) && !statuses.contains(QueryStatusType.SUCCESS)) {
			response.setStatus(QueryStatusType.ERROR);
		} else if(statuses.size() == statuses.stream().filter(s -> s.equals(QueryStatusType.SUCCESS)).count()) {
			response.setStatus(QueryStatusType.SUCCESS);
		} else {
			response.setStatus(QueryStatusType.OTHER);
		}
		return response;
	}
	
	private void addSingleConnectorQueryStatus(QueryResponse queryResponse, EndpointResponse endpointResponse, AvatarConnector connector) {
	
		DetailedQueryStatus detailedStatus = queryResponse.getDetailedStatus();
		if(detailedStatus == null) {
			detailedStatus = StatusFactory.eINSTANCE.createDetailedQueryStatus();
			queryResponse.setDetailedStatus(detailedStatus);
		}
		SingleConnectorQueryStatus sgConnQueryStatus = StatusFactory.eINSTANCE.createSingleConnectorQueryStatus();
		sgConnQueryStatus.setConnectorId(connector.getInfo().getId());
		sgConnQueryStatus.setConnectorName(connector.getInfo().getName());
		sgConnQueryStatus.setStatusResult(getStatusResult(endpointResponse.getResult()));
		sgConnQueryStatus.getStatusResult().setStatus(getQueryStatusType(endpointResponse.getCode()));
		detailedStatus.getSingleConnectorQueryStatus().add(sgConnQueryStatus);		
		
	}
	
	private StatusResult getStatusResult(ResponseResult responseResult) {
		if(responseResult instanceof PendingResult pendingRes) {
			PendingStatusResult pendingStatusRes = StatusFactory.eINSTANCE.createPendingStatusResult();
			pendingStatusRes.setEstRuntime(pendingRes.getEstRuntime());
			
			return pendingStatusRes;
		}
		if(responseResult instanceof DryRunResult pendingRes) {
			PendingStatusResult pendingStatusRes = StatusFactory.eINSTANCE.createPendingStatusResult();
			pendingStatusRes.setEstRuntime(pendingRes.getEstRuntime());
			return pendingStatusRes;
		}
		else if(responseResult instanceof ErrorResult errResult) {
			ErrorStatusResult errStatusRes = StatusFactory.eINSTANCE.createErrorStatusResult();
			errStatusRes.setErrorMessage(errResult.getErrorText());
			return errStatusRes;
		}
		return StatusFactory.eINSTANCE.createStatusResult();
	}
	
	private QueryStatusType getQueryStatusType(ResponseCode code) {
		switch(code) {
		case ERROR:
			return QueryStatusType.ERROR;
		case NO_CONTENT:
			return QueryStatusType.NO_CONTENT;
		case OK:
			return QueryStatusType.SUCCESS;
		case PENDING:
			return QueryStatusType.PENDING;
		case TIMEOUT:
			return QueryStatusType.TIMEOUT;
		case OTHER: default:
			return QueryStatusType.OTHER;
		}
	}
	
	private EndpointRequest convertQueryToEndpointRequest(QueryRequest queryRequest) {
		EndpointRequest endpointRequest = AConnectorFactory.eINSTANCE.createEndpointRequest();
		endpointRequest.setSourceId(queryRequest.getRequestId());
		endpointRequest.setId(UUID.randomUUID().toString());
		return endpointRequest;
	}

	

	
}
