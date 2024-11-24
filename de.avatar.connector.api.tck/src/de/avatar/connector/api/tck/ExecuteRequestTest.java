/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package de.avatar.connector.api.tck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ResponseResult;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Execute Request Tests
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class ExecuteRequestTest {
	
	/**
	 * Test {@link IllegalStateException} when providing a null request instance to an execution request
	 * @param connectorAware
	 */
	@Test
	public void testNullExecuteRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertThrows(IllegalArgumentException.class, ()->connector.executeRequest(null));
	}
	
	
	/**
	 * Test an invalid execution request returning error results in the response
	 * @param connectorAware
	 */
	@Test
	public void testInvalidExecuteRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		
		// empty request
		EndpointResponse response = connector.executeRequest(request);
		verifyResult(request, response);
		
		// set request id
		request.setId("test");
		response = connector.executeRequest(request);
		verifyResult(request, response);
		assertEquals(request.getId(), response.getId());
		
		// set request source id
		request.setSourceId("tck-test");
		response = connector.executeRequest(request);
		verifyResult(request, response);
		// set empty request  endpoint
		ConnectorEndpoint endpoint = AConnectorFactory.eINSTANCE.createConnectorEndpoint();
		request.setEndpoint(endpoint);
		response = connector.executeRequest(request);
		verifyResult(request, response);
		// set endpoint id
		endpoint.setId("test-endpoint");
		response = connector.executeRequest(request);
		assertNotNull(response);
		assertNotNull(response.getId());
		assertNotNull(response.getSourceId());
		// need a result 
		assertNotNull(response.getResult());
	}

	/**
	 * Test a valid execution request returning a corresponding response
	 * @param connectorAware
	 */
	@Test
	public void testValidExecuteResponse(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		request.setId("test");
		request.setSourceId("tck-test");
		ConnectorEndpoint endpoint = AConnectorFactory.eINSTANCE.createConnectorEndpoint();
		request.setEndpoint(endpoint);
		request.setTimestamp(Instant.now().toEpochMilli());
		endpoint.setId("test-endpoint");
		
		EndpointResponse response = connector.executeRequest(request);
		assertNotNull(response);
		assertNotNull(response.getId());
		assertEquals(request.getId(), response.getId());
		assertNotNull(response.getSourceId());
		assertEquals(request.getSourceId(), response.getSourceId());
		// verify timestamp
		assertNotNull(response.getTimestamp());
		assertTrue(request.getTimestamp() <= response.getTimestamp());
		// need a result 
		assertNotNull(response.getResult());
		ResponseResult result = response.getResult();
		// result type must be of type DryRunResult for the DryRunrequest
		assertFalse(result instanceof DryRunResult);
		assertFalse(result instanceof ErrorResult);
	}

	/**
	 * @param request
	 * @param response
	 */
	private void verifyResult(EndpointRequest request, EndpointResponse response) {
		ResponseResult result;
		ErrorResult errorResult;
		assertNotNull(response);
		assertNotNull(response.getId());
		assertNotNull(response.getSourceId());
		// need a result 
		assertNotNull(response.getResult());
		result = response.getResult();
		// result type must be of type ErrorResult for error responses
		assertTrue(result instanceof ErrorResult);
		errorResult = (ErrorResult) result;
		assertNotNull(errorResult.getError());
		assertNotNull(errorResult.getErrorText());
	}
}
