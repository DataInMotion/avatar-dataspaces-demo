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
import org.osgi.framework.Bundle;
import org.osgi.service.component.ComponentServiceObjects;

import com.paremus.dosgi.net.serialize.Serializer;
import com.paremus.dosgi.net.serialize.SerializerFactory;

/**
 * 
 * @author mark
 * @since 19.10.2024
 */
public class EcoreSerializerFactory implements SerializerFactory {
	
	private final ComponentServiceObjects<ResourceSet> soResourceSet;
	
	/**
	 * Creates a new instance.
	 */
	public EcoreSerializerFactory(ComponentServiceObjects<ResourceSet> soResourceSet) {
		this.soResourceSet = soResourceSet;
	}

	/* 
	 * (non-Javadoc)
	 * @see com.paremus.dosgi.net.serialize.SerializerFactory#create(org.osgi.framework.Bundle)
	 */
	@Override
	public Serializer create(Bundle classSpace) {
		return new EcoreSerializer(soResourceSet, classSpace);
	}

}
