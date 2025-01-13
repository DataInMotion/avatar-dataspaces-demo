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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.QueryRequest#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.status.QueryRequest#getConsumerId <em>Consumer Id</em>}</li>
 *   <li>{@link de.avatar.status.QueryRequest#getQuery <em>Query</em>}</li>
 *   <li>{@link de.avatar.status.QueryRequest#getSrcUri <em>Src Uri</em>}</li>
 *   <li>{@link de.avatar.status.QueryRequest#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see de.avatar.status.StatusPackage#getQueryRequest()
 * @model
 * @generated
 */
@ProviderType
public interface QueryRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.avatar.status.StatusPackage#getQueryRequest_RequestId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryRequest#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for whoever did the request
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Id</em>' attribute.
	 * @see #setConsumerId(String)
	 * @see de.avatar.status.StatusPackage#getQueryRequest_ConsumerId()
	 * @model required="true"
	 * @generated
	 */
	String getConsumerId();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryRequest#getConsumerId <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Id</em>' attribute.
	 * @see #getConsumerId()
	 * @generated
	 */
	void setConsumerId(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see de.avatar.status.StatusPackage#getQueryRequest_Query()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryRequest#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Src Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Uri</em>' attribute.
	 * @see #setSrcUri(String)
	 * @see de.avatar.status.StatusPackage#getQueryRequest_SrcUri()
	 * @model
	 * @generated
	 */
	String getSrcUri();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryRequest#getSrcUri <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Uri</em>' attribute.
	 * @see #getSrcUri()
	 * @generated
	 */
	void setSrcUri(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see de.avatar.status.StatusPackage#getQueryRequest_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link de.avatar.status.QueryRequest#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // QueryRequest
