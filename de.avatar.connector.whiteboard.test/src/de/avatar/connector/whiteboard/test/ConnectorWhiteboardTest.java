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
package de.avatar.connector.whiteboard.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.avatar.connector.whiteboard.api.ConnectorWhiteboard;
import de.avatar.query.Query;
import de.avatar.query.QueryFactory;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;

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
//@ExtendWith(MockitoExtension.class)
public class ConnectorWhiteboardTest {
	
//	@Mock
//	TestInterface test;
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		
	}
	
	@Test
	public void test(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
	}
	
	@Test
	public void testDryRun(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		QueryResponse response = whiteboard.executeDryRun(request);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.PENDING);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}
	
	@Test
	public void testRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		QueryResponse response = whiteboard.executeRequest(request);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.SUCCESS);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}

	@Test
	public void testSameRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		whiteboard.executeRequest(request);
		assertThrows(IllegalArgumentException.class, () -> whiteboard.executeRequest(request));
	}
	
	@Test
	public void testStatusRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		whiteboard.executeRequest(request);
		QueryResponse response = whiteboard.executeStatusRequest(reqId);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.SUCCESS);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}
	
	@Test
	public void testStatusRequestNoCache(@InjectService(timeout = 2000l) ServiceAware<ConnectorWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		assertThrows(IllegalArgumentException.class, () -> whiteboard.executeStatusRequest(reqId));
	}

}
