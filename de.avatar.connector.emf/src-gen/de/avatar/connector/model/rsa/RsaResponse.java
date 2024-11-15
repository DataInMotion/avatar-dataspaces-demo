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
package de.avatar.connector.model.rsa;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.connector.model.rsa.RsaResponse#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaResponse#getResponse <em>Response</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaResponse#isError <em>Error</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaResponse#isEmpty <em>Empty</em>}</li>
 * </ul>
 *
 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaResponse()
 * @model
 * @generated
 */
@ProviderType
public interface RsaResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaResponse_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(RsaObject)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaResponse_Response()
	 * @model containment="true"
	 * @generated
	 */
	RsaObject getResponse();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaResponse#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(RsaObject value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(boolean)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaResponse_Error()
	 * @model
	 * @generated
	 */
	boolean isError();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaResponse#isError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #isError()
	 * @generated
	 */
	void setError(boolean value);

	/**
	 * Returns the value of the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' attribute.
	 * @see #setEmpty(boolean)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaResponse_Empty()
	 * @model
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaResponse#isEmpty <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' attribute.
	 * @see #isEmpty()
	 * @generated
	 */
	void setEmpty(boolean value);

} // RsaResponse
