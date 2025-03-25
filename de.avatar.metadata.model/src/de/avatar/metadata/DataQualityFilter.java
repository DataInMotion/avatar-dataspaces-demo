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
package de.avatar.metadata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Quality Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.DataQualityFilter#getName <em>Name</em>}</li>
 *   <li>{@link de.avatar.metadata.DataQualityFilter#getDescription <em>Description</em>}</li>
 *   <li>{@link de.avatar.metadata.DataQualityFilter#getDataQualityResult <em>Data Quality Result</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getDataQualityFilter()
 * @model
 * @generated
 */
@ProviderType
public interface DataQualityFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityFilter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.DataQualityFilter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityFilter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.DataQualityFilter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Quality Result</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.metadata.DataQualityResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Result</em>' containment reference list.
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityFilter_DataQualityResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataQualityResult> getDataQualityResult();

} // DataQualityFilter
