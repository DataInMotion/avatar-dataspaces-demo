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
 * A representation of the model object '<em><b>Connector Pending Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ConnectorPendingResult#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorPendingResult#getConnectorProviderId <em>Connector Provider Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.ConnectorPendingResult#getResponseCode <em>Response Code</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getConnectorPendingResult()
 * @model
 * @generated
 */
@ProviderType
public interface ConnectorPendingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #setConnectorId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorPendingResult_ConnectorId()
	 * @model required="true"
	 * @generated
	 */
	String getConnectorId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorPendingResult#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(String value);

	/**
	 * Returns the value of the '<em><b>Connector Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Provider Id</em>' attribute.
	 * @see #setConnectorProviderId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorPendingResult_ConnectorProviderId()
	 * @model required="true"
	 * @generated
	 */
	String getConnectorProviderId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorPendingResult#getConnectorProviderId <em>Connector Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Provider Id</em>' attribute.
	 * @see #getConnectorProviderId()
	 * @generated
	 */
	void setConnectorProviderId(String value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.model.connector.ResponseCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' attribute.
	 * @see de.avatar.model.connector.ResponseCode
	 * @see #setResponseCode(ResponseCode)
	 * @see de.avatar.model.connector.AConnectorPackage#getConnectorPendingResult_ResponseCode()
	 * @model required="true"
	 * @generated
	 */
	ResponseCode getResponseCode();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ConnectorPendingResult#getResponseCode <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' attribute.
	 * @see de.avatar.model.connector.ResponseCode
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(ResponseCode value);

} // ConnectorPendingResult
