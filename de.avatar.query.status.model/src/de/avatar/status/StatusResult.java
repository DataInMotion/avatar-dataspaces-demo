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
package de.avatar.status;

import de.avatar.model.connector.EndpointResponse;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.StatusResult#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.status.StatusResult#getStatus <em>Status</em>}</li>
 *   <li>{@link de.avatar.status.StatusResult#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getStatusResult()
 * @model
 * @generated
 */
@ProviderType
public interface StatusResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.status.StatusPackage#getStatusResult_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.status.StatusResult#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.status.QueryStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.avatar.status.QueryStatusType
	 * @see #setStatus(QueryStatusType)
	 * @see de.avatar.status.StatusPackage#getStatusResult_Status()
	 * @model
	 * @generated
	 */
	QueryStatusType getStatus();

	/**
	 * Sets the value of the '{@link de.avatar.status.StatusResult#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.avatar.status.QueryStatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(QueryStatusType value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(EndpointResponse)
	 * @see de.avatar.status.StatusPackage#getStatusResult_Response()
	 * @model containment="true"
	 * @generated
	 */
	EndpointResponse getResponse();

	/**
	 * Sets the value of the '{@link de.avatar.status.StatusResult#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(EndpointResponse value);

} // StatusResult
