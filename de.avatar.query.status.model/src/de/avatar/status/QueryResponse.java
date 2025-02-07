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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.QueryResponse#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.status.QueryResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link de.avatar.status.QueryResponse#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getQueryResponse()
 * @model
 * @generated
 */
@ProviderType
public interface QueryResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.avatar.status.StatusPackage#getQueryResponse_RequestId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryResponse#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.status.QueryStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.avatar.status.QueryStatusType
	 * @see #setStatus(QueryStatusType)
	 * @see de.avatar.status.StatusPackage#getQueryResponse_Status()
	 * @model
	 * @generated
	 */
	QueryStatusType getStatus();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.avatar.status.QueryStatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(QueryStatusType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.avatar.status.StatusPackage#getQueryResponse_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

} // QueryResponse
