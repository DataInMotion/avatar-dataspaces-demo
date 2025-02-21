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
 * A representation of the model object '<em><b>Consent Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ConsentInfo#getDomain <em>Domain</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConsentInfo#getPolicy <em>Policy</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConsentInfo#getTemplate <em>Template</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConsentInfo#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getConsentInfo()
 * @model
 * @generated
 */
@ProviderType
public interface ConsentInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the gICS domain key, e.g. the domain under which certain policies and consent templates are grouped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConsentInfo_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConsentInfo#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the gICS policy key. Every consent template refers to at least one policy in gICS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see #setPolicy(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConsentInfo_Policy()
	 * @model
	 * @generated
	 */
	String getPolicy();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConsentInfo#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the gICS consent template key. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConsentInfo_Template()
	 * @model
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConsentInfo#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConsentInfo_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConsentInfo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ConsentInfo
