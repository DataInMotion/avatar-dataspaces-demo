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
package de.avatar.generator.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import org.eclipse.emf.ecore.util.EcoreUtil;
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

import de.avatar.generator.api.api.AvatarGenerator;
import de.avatar.generator.test.helper.TestJavaResult;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaResult;

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
public class AvatarGeneratorTest {
	
	
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		
	}
	
	@Test
	public void testService(@InjectService(timeout = 2000l) ServiceAware<AvatarGenerator> avatarGeneratorAware) {
		assertNotNull(avatarGeneratorAware);
		AvatarGenerator avatarGenerator = avatarGeneratorAware.getService();
		assertNotNull(avatarGenerator);	
	}
	
	@Test
	public void testAggregateResponseJavaResult(@InjectService(timeout = 2000l) ServiceAware<AvatarGenerator> avatarGeneratorAware) {
		assertNotNull(avatarGeneratorAware);
		AvatarGenerator avatarGenerator = avatarGeneratorAware.getService();
		assertNotNull(avatarGenerator);	
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		request.setId(UUID.randomUUID().toString());
		
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(UUID.randomUUID().toString());
		response.setRequest(request);
		
		JavaResult result = AConnectorFactory.eINSTANCE.createJavaResult();
		result.setValue(new TestJavaResult("Test", 77));	
		response.setResult(result);
		
		avatarGenerator.aggregateResponse(response);
		File file = new File(System.getProperty("data").concat(request.getId()).concat("-").concat(response.getId()).concat(".json"));
		assertTrue(file.exists());
	}
	
	@Test
	public void testAggregateResponseEcoreResult(@InjectService(timeout = 2000l) ServiceAware<AvatarGenerator> avatarGeneratorAware) {
		assertNotNull(avatarGeneratorAware);
		AvatarGenerator avatarGenerator = avatarGeneratorAware.getService();
		assertNotNull(avatarGenerator);	
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		request.setId(UUID.randomUUID().toString());
		
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(UUID.randomUUID().toString());
		response.setRequest(EcoreUtil.copy(request));
		
		EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
		
		result.setValue(request);	
		response.setResult(result);
		
		avatarGenerator.aggregateResponse(response);
		File file = new File(System.getProperty("data").concat(request.getId()).concat("-").concat(response.getId()).concat(".json"));
		assertTrue(file.exists());
	}
	
	@Test
	public void testGetAggregatedResponse(@InjectService(timeout = 2000l) ServiceAware<AvatarGenerator> avatarGeneratorAware) {
		assertNotNull(avatarGeneratorAware);
		AvatarGenerator avatarGenerator = avatarGeneratorAware.getService();
		assertNotNull(avatarGenerator);	
		
		EndpointRequest request = AConnectorFactory.eINSTANCE.createEndpointRequest();
		request.setId(UUID.randomUUID().toString());
		
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(UUID.randomUUID().toString());
		response.setRequest(request);
		
		JavaResult result = AConnectorFactory.eINSTANCE.createJavaResult();
		result.setValue(new TestJavaResult("Test", 77));	
		response.setResult(result);
		
		avatarGenerator.aggregateResponse(response);
		
		EndpointResponse response2 = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response2.setId(UUID.randomUUID().toString());
		response2.setRequest(EcoreUtil.copy(request));
		
		EcoreResult result2 = AConnectorFactory.eINSTANCE.createEcoreResult();
		
		result2.setValue(EcoreUtil.copy(request));	
		response2.setResult(result2);
		
		avatarGenerator.aggregateResponse(response2);
		
		File file = avatarGenerator.getAggregatedResponse(request.getId());
		assertTrue(file.exists());
	}
	
	@AfterEach
	public void afterEach() {
		try {
			Files.list(Path.of(System.getProperty("data"))).forEach(p -> p.toFile().delete());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
