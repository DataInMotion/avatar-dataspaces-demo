/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.avatar.model.connector.helper;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;

/**
 * 
 * @author mark
 * @since 24.11.2024
 */
public class ConnectorHelper {
	
	private static final String UNKNOWN = "<unknown>";
	
	public static EndpointResponse createResponse(EndpointRequest request) {
		requireNonNull(request);
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(request.getId());
		response.setSourceId(request.getSourceId());
		response.setTimestamp(Instant.now().toEpochMilli());
		return response;
	}
	
	public static EndpointResponse validateResponse(EndpointRequest request) {
		requireNonNull(request);
		List<String> error = new ArrayList<>();
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(request.getId());
		if (isNull(request.getId())) {
			error.add("Request doesnt contain an mandatory id.");
			response.setId(UUID.randomUUID().toString());
		}
		response.setSourceId(request.getSourceId());
		if (isNull(request.getSourceId())) {
			error.add("Request doesnt contain an mandatory source-id.");
			response.setSourceId(UNKNOWN);
		}
		if (isNull(request.getEndpoint())) {
			error.add("Request has a NULL endpoint");
		} else if (isNull(request.getEndpoint().getId())) {
			error.add("Request has no defined endpoint id");
		}
		response.setTimestamp(Instant.now().toEpochMilli());
		if (!error.isEmpty()) {
			ErrorResult errorResult = AConnectorFactory.eINSTANCE.createErrorResult();
			errorResult.setError("invalid-request");
			errorResult.setErrorText(String.join(",", error.toArray(new String[0])));
			response.setResult(errorResult);
		}
		return response;
	}
	

}
