/*
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
package de.avatar.connector.api;

import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avatar Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.avatar.connector.api.ApiPackage#getAvatarConnector()
 * @model interface="true" abstract="true"
 * @generated
 */
@ProviderType
public interface AvatarConnector extends AvatarConnectorInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" requestRequired="true"
	 * @generated
	 */
	EndpointResponse dryRequest(EndpointRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" requestRequired="true"
	 * @generated
	 */
	EndpointResponse executeRequest(EndpointRequest request);

} // AvatarConnector
