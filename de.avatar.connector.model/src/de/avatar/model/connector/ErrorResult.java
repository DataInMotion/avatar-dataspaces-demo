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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.ErrorResult#getError <em>Error</em>}</li>
 *   <li>{@link de.avatar.model.connector.ErrorResult#getErrorText <em>Error Text</em>}</li>
 *   <li>{@link de.avatar.model.connector.ErrorResult#getThrowable <em>Throwable</em>}</li>
 * </ul>
 *
 * @see de.avatar.model.connector.AConnectorPackage#getErrorResult()
 * @model
 * @generated
 */
@ProviderType
public interface ErrorResult extends ResponseResult {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getErrorResult_Error()
	 * @model required="true"
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ErrorResult#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Error Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Text</em>' attribute.
	 * @see #setErrorText(String)
	 * @see de.avatar.model.connector.AConnectorPackage#getErrorResult_ErrorText()
	 * @model
	 * @generated
	 */
	String getErrorText();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ErrorResult#getErrorText <em>Error Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Text</em>' attribute.
	 * @see #getErrorText()
	 * @generated
	 */
	void setErrorText(String value);

	/**
	 * Returns the value of the '<em><b>Throwable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throwable</em>' attribute.
	 * @see #setThrowable(Throwable)
	 * @see de.avatar.model.connector.AConnectorPackage#getErrorResult_Throwable()
	 * @model dataType="de.avatar.model.connector.JavaThrowable"
	 * @generated
	 */
	Throwable getThrowable();

	/**
	 * Sets the value of the '{@link de.avatar.model.connector.ErrorResult#getThrowable <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throwable</em>' attribute.
	 * @see #getThrowable()
	 * @generated
	 */
	void setThrowable(Throwable value);

} // ErrorResult
