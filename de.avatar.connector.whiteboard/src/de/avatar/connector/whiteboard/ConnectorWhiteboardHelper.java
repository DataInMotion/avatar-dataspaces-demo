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

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.JavaResult;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.ResponseResult;
import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.ErrorStatusResult;
import de.avatar.status.PendingStatusResult;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusResult;
import de.avatar.status.SuccessStatusResult;

/**
 * 
 * @author ilenia
 * @since Jan 16, 2025
 */
public class ConnectorWhiteboardHelper {

	public static void addSingleConnectorQueryStatus(QueryStatusResponse queryResponse, EndpointResponse endpointResponse, AvatarConnector connector) {

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
		sgConnQueryStatus.getStatusResult().setResponse(EcoreUtil.copy(endpointResponse));
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
			errStatusRes.setErrorMessage(errResult.getError() != null ? errResult.getError() : errResult.getErrorText());
			return errStatusRes;
		} else if(responseResult instanceof EcoreResult || responseResult instanceof JavaResult) {
			SuccessStatusResult okRes = StatusFactory.eINSTANCE.createSuccessStatusResult();
			okRes.setMessage(String.format("Results are available under endpoint donwloads/{requestId}"));
			return okRes;
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
		endpointRequest.setSourceId(queryRequest.getConsumerId());
		endpointRequest.setId(queryRequest.getRequestId());
		return endpointRequest;
	}

}
