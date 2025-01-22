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
 * A representation of the model object '<em><b>Endpoint Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getCode <em>Code</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getResult <em>Result</em>}</li>
 *   <li>{@link de.avatar.model.connector.EndpointResponse#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse()
 * @model
 * @generated
 */
@ProviderType
public interface EndpointResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(EndpointRequest)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_Request()
	 * @model containment="true" keys="id" required="true"
	 * @generated
	 */
	EndpointRequest getRequest();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(EndpointRequest value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.model.connector.ResponseCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see de.avatar.model.connector.ResponseCode
	 * @see #setCode(ResponseCode)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_Code()
	 * @model required="true"
	 * @generated
	 */
	ResponseCode getCode();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see de.avatar.model.connector.ResponseCode
	 * @see #getCode()
	 * @generated
	 */
	void setCode(ResponseCode value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(ResponseResult)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_Result()
	 * @model containment="true"
	 * @generated
	 */
	ResponseResult getResult();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResponseResult value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getEndpointResponse_SourceId()
	 * @model required="true"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.EndpointResponse#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

} // EndpointResponse
