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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.api.AvatarConnectorInfo;
import de.avatar.model.connector.ConnectorEndpoint;

/**
 * {@link AvatarConnectorInfo} tests
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class ConnectorInfoTest {
	
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
	}
	
	@AfterEach
	public void after() {
	}
	
	/**
	 * Test minimum valid connector info
	 * @param connectorAware
	 */
	@Test
	public void testConnectorInfo(@InjectService ServiceAware<AvatarConnector> connectorAware) {
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
	public void testGetEndpoints(@InjectService ServiceAware<AvatarConnector> connectorAware) {
		assertFalse(connectorAware.isEmpty());
		AvatarConnector connector = connectorAware.getService();
		assertNotNull(connector.getEndpoints());
		assertTrue(connector.getEndpoints().size() > 0);
		for (ConnectorEndpoint endpoint : connector.getEndpoints()) {
			assertNotNull(endpoint.getId());
		}
	}

}
