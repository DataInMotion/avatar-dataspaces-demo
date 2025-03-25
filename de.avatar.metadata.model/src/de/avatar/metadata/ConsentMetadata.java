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
 * A representation of the model object '<em><b>Consent Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.ConsentMetadata#getConsentInfo <em>Consent Info</em>}</li>
 *   <li>{@link de.avatar.metadata.ConsentMetadata#getResultsBeforeConsentFilter <em>Results Before Consent Filter</em>}</li>
 *   <li>{@link de.avatar.metadata.ConsentMetadata#getResultsAfterConsentFilter <em>Results After Consent Filter</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getConsentMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface ConsentMetadata extends Metadata {
	/**
	 * Returns the value of the '<em><b>Consent Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Info</em>' containment reference.
	 * @see #setConsentInfo(ConsentInfo)
	 * @see de.avatar.metadata.MetadataPackage#getConsentMetadata_ConsentInfo()
	 * @model containment="true"
	 * @generated
	 */
	ConsentInfo getConsentInfo();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentMetadata#getConsentInfo <em>Consent Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Info</em>' containment reference.
	 * @see #getConsentInfo()
	 * @generated
	 */
	void setConsentInfo(ConsentInfo value);

	/**
	 * Returns the value of the '<em><b>Results Before Consent Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Before Consent Filter</em>' attribute.
	 * @see #setResultsBeforeConsentFilter(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getConsentMetadata_ResultsBeforeConsentFilter()
	 * @model
	 * @generated
	 */
	Integer getResultsBeforeConsentFilter();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentMetadata#getResultsBeforeConsentFilter <em>Results Before Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Before Consent Filter</em>' attribute.
	 * @see #getResultsBeforeConsentFilter()
	 * @generated
	 */
	void setResultsBeforeConsentFilter(Integer value);

	/**
	 * Returns the value of the '<em><b>Results After Consent Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results After Consent Filter</em>' attribute.
	 * @see #setResultsAfterConsentFilter(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getConsentMetadata_ResultsAfterConsentFilter()
	 * @model
	 * @generated
	 */
	Integer getResultsAfterConsentFilter();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentMetadata#getResultsAfterConsentFilter <em>Results After Consent Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results After Consent Filter</em>' attribute.
	 * @see #getResultsAfterConsentFilter()
	 * @generated
	 */
	void setResultsAfterConsentFilter(Integer value);

} // ConsentMetadata
