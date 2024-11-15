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
package de.avatar.model.connector;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ResponseMetaData#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getResponseMetaData()
 * @model
 * @generated
 */
@ProviderType
public interface ResponseMetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getResponseMetaData_Hash()
	 * @model
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ResponseMetaData#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

} // ResponseMetaData
