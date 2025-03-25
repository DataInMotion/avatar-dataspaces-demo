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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymization Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.AnonymizationMetadata#getAnonymizationInfo <em>Anonymization Info</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getAnonymizationMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface AnonymizationMetadata extends Metadata {
	/**
	 * Returns the value of the '<em><b>Anonymization Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymization Info</em>' containment reference.
	 * @see #setAnonymizationInfo(AnonymizationInfo)
	 * @see de.avatar.metadata.MetadataPackage#getAnonymizationMetadata_AnonymizationInfo()
	 * @model containment="true"
	 * @generated
	 */
	AnonymizationInfo getAnonymizationInfo();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.AnonymizationMetadata#getAnonymizationInfo <em>Anonymization Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymization Info</em>' containment reference.
	 * @see #getAnonymizationInfo()
	 * @generated
	 */
	void setAnonymizationInfo(AnonymizationInfo value);

} // AnonymizationMetadata
