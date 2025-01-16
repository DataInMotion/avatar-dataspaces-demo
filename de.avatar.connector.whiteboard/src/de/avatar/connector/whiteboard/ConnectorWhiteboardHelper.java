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

import java.util.List;
import java.util.UUID;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
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

/**
 * 
 * @author ilenia
 * @since Jan 16, 2025
 */
public class ConnectorWhiteboardHelper {

	public static QueryResponse derermineGlobalResponseStatus(QueryResponse response, QueryRequest request) {
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

	public static void addSingleConnectorQueryStatus(QueryResponse queryResponse, EndpointResponse endpointResponse, AvatarConnector connector) {

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

	public static  StatusResult getStatusResult(ResponseResult responseResult) {
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

	public static  QueryStatusType getQueryStatusType(ResponseCode code) {
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

	public static  EndpointRequest convertQueryToEndpointRequest(QueryRequest queryRequest) {
		EndpointRequest endpointRequest = AConnectorFactory.eINSTANCE.createEndpointRequest();
		endpointRequest.setSourceId(queryRequest.getRequestId());
		endpointRequest.setId(UUID.randomUUID().toString());
		return endpointRequest;
	}

}
