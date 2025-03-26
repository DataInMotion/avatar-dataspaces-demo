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
 * A representation of the model object '<em><b>Response Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.ResponseMetadata#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link de.avatar.metadata.ResponseMetadata#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.metadata.ResponseMetadata#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link de.avatar.metadata.ResponseMetadata#getTotConnectorsPerRequest <em>Tot Connectors Per Request</em>}</li>
 * </ul>
 *
 * @see de.avatar.metadata.MetadataPackage#getResponseMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface ResponseMetadata extends Metadata {
	/**
	 * Returns the value of the '<em><b>Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Id</em>' attribute.
	 * @see #setResponseId(String)
	 * @see de.avatar.metadata.MetadataPackage#getResponseMetadata_ResponseId()
	 * @model required="true"
	 * @generated
	 */
	String getResponseId();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ResponseMetadata#getResponseId <em>Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Id</em>' attribute.
	 * @see #getResponseId()
	 * @generated
	 */
	void setResponseId(String value);

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.avatar.metadata.MetadataPackage#getResponseMetadata_RequestId()
	 * @model required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ResponseMetadata#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time of the response from this connector, in ISO 8601
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(String)
	 * @see de.avatar.metadata.MetadataPackage#getResponseMetadata_ResponseTime()
	 * @model
	 * @generated
	 */
	String getResponseTime();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ResponseMetadata#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(String value);

	/**
	 * Returns the value of the '<em><b>Tot Connectors Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of total connectors that handled the request associated to this response
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tot Connectors Per Request</em>' attribute.
	 * @see #setTotConnectorsPerRequest(Integer)
	 * @see de.avatar.metadata.MetadataPackage#getResponseMetadata_TotConnectorsPerRequest()
	 * @model
	 * @generated
	 */
	Integer getTotConnectorsPerRequest();

	/**
	 * Sets the value of the '{@link de.avatar.metadata.ResponseMetadata#getTotConnectorsPerRequest <em>Tot Connectors Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tot Connectors Per Request</em>' attribute.
	 * @see #getTotConnectorsPerRequest()
	 * @generated
	 */
	void setTotConnectorsPerRequest(Integer value);

} // ResponseMetadata
