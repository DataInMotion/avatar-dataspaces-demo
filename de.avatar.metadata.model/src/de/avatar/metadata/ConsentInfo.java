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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.ConsentInfo#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link de.avatar.metadata.ConsentInfo#getPolicyId <em>Policy Id</em>}</li>
 *   <li>{@link de.avatar.metadata.ConsentInfo#getPolicyVersion <em>Policy Version</em>}</li>
 *   <li>{@link de.avatar.metadata.ConsentInfo#getConsentIdType <em>Consent Id Type</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getConsentInfo()
 * @model
 * @generated
 */
@ProviderType
public interface ConsentInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Id</em>' attribute.
	 * @see #setDomainId(String)
	 * @see de.avatar.metadata.MetadataPackage#getConsentInfo_DomainId()
	 * @model
	 * @generated
	 */
	String getDomainId();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentInfo#getDomainId <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Id</em>' attribute.
	 * @see #getDomainId()
	 * @generated
	 */
	void setDomainId(String value);

	/**
	 * Returns the value of the '<em><b>Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Id</em>' attribute.
	 * @see #setPolicyId(String)
	 * @see de.avatar.metadata.MetadataPackage#getConsentInfo_PolicyId()
	 * @model
	 * @generated
	 */
	String getPolicyId();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentInfo#getPolicyId <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Id</em>' attribute.
	 * @see #getPolicyId()
	 * @generated
	 */
	void setPolicyId(String value);

	/**
	 * Returns the value of the '<em><b>Policy Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Version</em>' attribute.
	 * @see #setPolicyVersion(String)
	 * @see de.avatar.metadata.MetadataPackage#getConsentInfo_PolicyVersion()
	 * @model
	 * @generated
	 */
	String getPolicyVersion();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentInfo#getPolicyVersion <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Version</em>' attribute.
	 * @see #getPolicyVersion()
	 * @generated
	 */
	void setPolicyVersion(String value);

	/**
	 * Returns the value of the '<em><b>Consent Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Id Type</em>' attribute.
	 * @see #setConsentIdType(String)
	 * @see de.avatar.metadata.MetadataPackage#getConsentInfo_ConsentIdType()
	 * @model
	 * @generated
	 */
	String getConsentIdType();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ConsentInfo#getConsentIdType <em>Consent Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Id Type</em>' attribute.
	 * @see #getConsentIdType()
	 * @generated
	 */
	void setConsentIdType(String value);

} // ConsentInfo
