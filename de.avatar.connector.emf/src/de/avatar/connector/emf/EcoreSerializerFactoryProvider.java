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
package de.avatar.connector.emf;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.paremus.dosgi.net.serialize.SerializationType;
import com.paremus.dosgi.net.serialize.SerializerFactory;
import com.paremus.dosgi.net.serialize.SerializerFactoryProvider;

import de.avatar.model.connector.AConnectorPackage;

/**
 * 
 * @author mark
 * @since 19.10.2024
 */
@Component(immediate = true, property = "serializerType=ecore")
public class EcoreSerializerFactoryProvider implements SerializerFactoryProvider {
	
	@Reference
	private AConnectorPackage acPackage;
	@Reference
	private ComponentServiceObjects<ResourceSet> soResourceSet;

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.SerializerFactoryProvider#createFromString(java.lang.String)
	 */
	@Override
	public SerializerFactory createFromString(String type) {
		if ("ecore".equals(type.toLowerCase())) {
			return new EcoreSerializerFactory(soResourceSet);
		}
		throw new IllegalArgumentException(String.format("This serialization type: '%s' is not provided", type));
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.SerializerFactoryProvider#create(com.paremus.dosgi.net.serialize.SerializationType)
	 */
	@Override
	public SerializerFactory create(SerializationType type) {
		throw new IllegalArgumentException("This serialization type: '%s' is not provided");
	}

}
