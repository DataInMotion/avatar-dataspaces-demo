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

import static java.util.Objects.nonNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.util.Collections;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ResponseResult;
import de.avatar.model.connector.SimpleResult;
import de.avatar.model.connector.helper.ConnectorHelper;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(MockitoExtension.class)
public class MockedRequestTest {
	
	@Mock
	private AvatarConnector connectorMock;
	private ServiceRegistration<AvatarConnector> registration;
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		Map<String, Object> properties = Map.of(Constants.SERVICE_RANKING, 10);
		registration = ctx.registerService(AvatarConnector.class, connectorMock, FrameworkUtil.asDictionary(properties));
	}
	
	@AfterEach
	public void after() {
		registration.unregister();
	}
	
	/**
	 * Test {@link IllegalStateException} when providing a null request instance to dry-run request
	 * @param connectorAware
	 */
	@Test
	public void testMockNullDryRunRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.dryRequest(isNull(EndpointRequest.class))).thenThrow(IllegalArgumentException.class);
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertThrows(IllegalArgumentException.class, ()->connector.dryRequest(null));
	}
	
	/**
	 * Test {@link IllegalStateException} when providing a null request instance to an execution request
	 * @param connectorAware
	 */
	@Test
	public void testMockNullExecuteRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.executeRequest(isNull(EndpointRequest.class))).thenThrow(IllegalArgumentException.class);
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertThrows(IllegalArgumentException.class, ()->connector.executeRequest(null));
	}
	
	/**
	 * Test an invalid dry-run request returning error results in the response
	 * @param connectorAware
	 */
	@Test
	public void testMockInvalidDryRunRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.dryRequest(any(EndpointRequest.class))).then((im)-> {
			EndpointRequest r = im.getArgument(0);
			if (nonNull(r) && 
					nonNull(r.getId()) && 
					nonNull(r.getSourceId()) && 
					nonNull(r.getEndpoint()) && 
					nonNull(r.getEndpoint().getId())) {
				EndpointResponse response = ConnectorHelper.createResponse(r);
				DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
				response.setResult(result);
				return response;
			} else {
				return ConnectorHelper.validateResponse(r);
			}
		});
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		
		// empty request
		EndpointResponse response = connector.dryRequest(request);
		verifyResult(request, response);
		
		// set request id
		request.setId("test");
		response = connector.dryRequest(request);
		verifyResult(request, response);
		assertEquals(request.getId(), response.getId());
		
		// set request source id
		request.setSourceId("tck-test");
		response = connector.dryRequest(request);
		verifyResult(request, response);
		// set empty request  endpoint
		ConnectorEndpoint endpoint = AConnectorFactory.eINSTANCE.createConnectorEndpoint();
		request.setEndpoint(endpoint);
		response = connector.dryRequest(request);
		verifyResult(request, response);
		// set endpoint id
		endpoint.setId("test-endpoint");
		response = connector.dryRequest(request);
		assertNotNull(response);
		assertNotNull(response.getId());
		assertNotNull(response.getSourceId());
		// need a result 
		assertNotNull(response.getResult());
	}
	
	/**
	 * Test an invalid execution request returning error results in the response
	 * @param connectorAware
	 */
	@Test
	public void testMockInvalidExecuteRequest(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.executeRequest(any(EndpointRequest.class))).then((im)-> {
			EndpointRequest r = im.getArgument(0);
			if (nonNull(r) && 
					nonNull(r.getId()) && 
					nonNull(r.getSourceId()) && 
					nonNull(r.getEndpoint()) && 
					nonNull(r.getEndpoint().getId())) {
				EndpointResponse response = ConnectorHelper.createResponse(r);
				DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
				response.setResult(result);
				return response;
			} else {
				return ConnectorHelper.validateResponse(r);
			}
		});
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
	 * Test a valid dry-run request returning a corresponding dry-run response
	 * @param connectorAware
	 */
	@Test
	public void testMockValidDryRunResponse(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.dryRequest(any(EndpointRequest.class))).then((im)-> {
			EndpointRequest r = im.getArgument(0);
			if (nonNull(r) && 
					nonNull(r.getId()) && 
					nonNull(r.getSourceId()) && 
					nonNull(r.getEndpoint()) && 
					nonNull(r.getEndpoint().getId())) {
				EndpointResponse response = ConnectorHelper.createResponse(r);
				DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
				response.setResult(result);
				return response;
			} else {
				throw new IllegalArgumentException("Request is not complete");
			}
		});
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		request.setId("test");
		request.setSourceId("tck-test");
		ConnectorEndpoint endpoint = AConnectorFactory.eINSTANCE.createConnectorEndpoint();
		request.setEndpoint(endpoint);
		request.setTimestamp(Instant.now().toEpochMilli());
		endpoint.setId("test-endpoint");
		
		EndpointResponse response = connector.dryRequest(request);
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
		assertTrue(result instanceof DryRunResult);
		DryRunResult drResult = (DryRunResult) result;
		assertTrue(drResult.getEstRuntime() >= 0);
		assertTrue(drResult.getResultCount() >= 0);
	}
	
	/**
	 * Test a valid execution request returning a corresponding response
	 * @param connectorAware
	 */
	@Test
	public void testMockValidExecuteResponse(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		when(connectorMock.executeRequest(any(EndpointRequest.class))).then((im)-> {
			EndpointRequest r = im.getArgument(0);
			if (nonNull(r) && 
					nonNull(r.getId()) && 
					nonNull(r.getSourceId()) && 
					nonNull(r.getEndpoint()) && 
					nonNull(r.getEndpoint().getId())) {
				EndpointResponse response = ConnectorHelper.createResponse(r);
				SimpleResult result = AConnectorFactory.eINSTANCE.createSimpleResult();
				response.setResult(result);
				return response;
			} else {
				throw new IllegalArgumentException("Request is not complete");
			}
		});
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
	 * Test minimum valid connector info
	 * @param connectorAware
	 */
	@Test
	public void testMockConnectorInfo(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		ConnectorInfo info = AConnectorFactory.eINSTANCE.createConnectorInfo();
		info.setId("connector-id");
		info.setVersion((short)2);
		when(connectorMock.getInfo()).thenReturn(info);
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertNotNull(connector.getInfo());
		assertNotNull(connector.getInfo().getId());
		assertNotNull(connector.getInfo().getVersion());
	}
	
	/**
	 * Test minimum get endpoint request
	 * @param connectorAware
	 */
	@Test
	public void testMockGetEndpoints(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		ConnectorEndpoint ep = AConnectorFactory.eINSTANCE.createConnectorEndpoint();
		ep.setId("test-endpoint");
		when(connectorMock.getEndpoints()).thenReturn(Collections.singletonList(ep));
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertNotNull(connector.getEndpoints());
		assertTrue(connector.getEndpoints().size() > 0);
		for (ConnectorEndpoint endpoint : connector.getEndpoints()) {
			assertNotNull(endpoint.getId());
		}
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
