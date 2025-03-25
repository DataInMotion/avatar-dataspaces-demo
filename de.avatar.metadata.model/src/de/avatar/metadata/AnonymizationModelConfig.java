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
 * A representation of the model object '<em><b>Anonymization Model Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.AnonymizationModelConfig#getFeatureConfig <em>Feature Config</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelConfig()
 * @model
 * @generated
 */
@ProviderType
public interface AnonymizationModelConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Config</b></em>' containment reference list.
	 * The list contents are of type {@link de.avatar.metadata.AnonymizationModelFeatureConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Config</em>' containment reference list.
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationModelConfig_FeatureConfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnonymizationModelFeatureConfig> getFeatureConfig();

} // AnonymizationModelConfig
