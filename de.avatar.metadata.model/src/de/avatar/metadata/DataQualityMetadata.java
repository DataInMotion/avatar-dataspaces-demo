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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Quality Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.DataQualityMetadata#getDataQualityFilter <em>Data Quality Filter</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getDataQualityMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface DataQualityMetadata extends Metadata {
	/**
	 * Returns the value of the '<em><b>Data Quality Filter</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.metadata.DataQualityFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Filter</em>' containment reference list.
	 * @see de.avatar.metadata.MetadataPackage#getDataQualityMetadata_DataQualityFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataQualityFilter> getDataQualityFilter();

} // DataQualityMetadata
