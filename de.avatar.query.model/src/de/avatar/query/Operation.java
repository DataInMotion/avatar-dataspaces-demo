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
package de.avatar.query;

import org.eclipse.emf.ecore.EObject;

import org.gecko.emf.utilities.FeaturePath;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.Operation#getFeaturePath <em>Feature Path</em>}</li>
 *   <li>{@link de.avatar.query.Operation#getSuitableForType <em>Suitable For Type</em>}</li>
 * </ul>
 *
 * @see de.avatar.query.QueryPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Path</em>' reference.
	 * @see #setFeaturePath(FeaturePath)
	 * @see de.avatar.query.QueryPackage#getOperation_FeaturePath()
	 * @model
	 * @generated
	 */
	FeaturePath getFeaturePath();

	/**
	 * Sets the value of the '{@link de.avatar.query.Operation#getFeaturePath <em>Feature Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Path</em>' reference.
	 * @see #getFeaturePath()
	 * @generated
	 */
	void setFeaturePath(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Suitable For Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suitable For Type</em>' attribute.
	 * @see #setSuitableForType(String)
	 * @see de.avatar.query.QueryPackage#getOperation_SuitableForType()
	 * @model required="true"
	 * @generated
	 */
	String getSuitableForType();

	/**
	 * Sets the value of the '{@link de.avatar.query.Operation#getSuitableForType <em>Suitable For Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suitable For Type</em>' attribute.
	 * @see #getSuitableForType()
	 * @generated
	 */
	void setSuitableForType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject execute();

} // Operation
