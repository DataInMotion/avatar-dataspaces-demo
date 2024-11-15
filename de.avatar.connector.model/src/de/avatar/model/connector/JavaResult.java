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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.JavaResult#getTypeString <em>Type String</em>}</li>
 *   <li>{@link de.avatar.model.connector.JavaResult#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getJavaResult()
 * @model
 * @generated
 */
@ProviderType
public interface JavaResult extends ResponseResult {
	/**
	 * Returns the value of the '<em><b>Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type String</em>' attribute.
	 * @see #setTypeString(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getJavaResult_TypeString()
	 * @model
	 * @generated
	 */
	String getTypeString();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.JavaResult#getTypeString <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type String</em>' attribute.
	 * @see #getTypeString()
	 * @generated
	 */
	void setTypeString(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see de.avatar.model.connector.AConnectorPackage#getJavaResult_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.JavaResult#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // JavaResult
