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

import de.avatar.query.Query;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.QueryStatus#getQuery <em>Query</em>}</li>
 *   <li>{@link de.avatar.status.QueryStatus#getMinResultCount <em>Min Result Count</em>}</li>
 *   <li>{@link de.avatar.status.QueryStatus#getMaxResultCount <em>Max Result Count</em>}</li>
 *   <li>{@link de.avatar.status.QueryStatus#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link de.avatar.status.QueryStatus#getResultFormat <em>Result Format</em>}</li>
 *   <li>{@link de.avatar.status.QueryStatus#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getQueryStatus()
 * @model
 * @generated
 */
@ProviderType
public interface QueryStatus extends Status {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see de.avatar.status.StatusPackage#getQueryStatus_Query()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatus#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Min Result Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Result Count</em>' attribute.
	 * @see #setMinResultCount(long)
	 * @see de.avatar.status.StatusPackage#getQueryStatus_MinResultCount()
	 * @model
	 * @generated
	 */
	long getMinResultCount();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatus#getMinResultCount <em>Min Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Result Count</em>' attribute.
	 * @see #getMinResultCount()
	 * @generated
	 */
	void setMinResultCount(long value);

	/**
	 * Returns the value of the '<em><b>Max Result Count</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Result Count</em>' attribute.
	 * @see #setMaxResultCount(long)
	 * @see de.avatar.status.StatusPackage#getQueryStatus_MaxResultCount()
	 * @model default="10000"
	 * @generated
	 */
	long getMaxResultCount();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatus#getMaxResultCount <em>Max Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Result Count</em>' attribute.
	 * @see #getMaxResultCount()
	 * @generated
	 */
	void setMaxResultCount(long value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"120"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timeout in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see de.avatar.status.StatusPackage#getQueryStatus_Timeout()
	 * @model default="120"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatus#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Result Format</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.status.ResultFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Format</em>' attribute.
	 * @see de.avatar.status.ResultFormatType
	 * @see #setResultFormat(ResultFormatType)
	 * @see de.avatar.status.StatusPackage#getQueryStatus_ResultFormat()
	 * @model
	 * @generated
	 */
	ResultFormatType getResultFormat();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryStatus#getResultFormat <em>Result Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Format</em>' attribute.
	 * @see de.avatar.status.ResultFormatType
	 * @see #getResultFormat()
	 * @generated
	 */
	void setResultFormat(ResultFormatType value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' attribute list.
	 * @see de.avatar.status.StatusPackage#getQueryStatus_Connector()
	 * @model
	 * @generated
	 */
	EList<String> getConnector();

} // QueryStatus
