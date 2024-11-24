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
package de.avatar.model.connector.impl;

import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.ErrorResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.ErrorResultImpl#getError <em>Error</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ErrorResultImpl#getErrorText <em>Error Text</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ErrorResultImpl#getThrowable <em>Throwable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorResultImpl extends ResponseResultImpl implements ErrorResult {
	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected String error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorText() <em>Error Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorText()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorText() <em>Error Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorText()
	 * @generated
	 * @ordered
	 */
	protected String errorText = ERROR_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrowable() <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowable()
	 * @generated
	 * @ordered
	 */
	protected static final Throwable THROWABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrowable() <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowable()
	 * @generated
	 * @ordered
	 */
	protected Throwable throwable = THROWABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.ERROR_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(String newError) {
		String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.ERROR_RESULT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorText() {
		return errorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorText(String newErrorText) {
		String oldErrorText = errorText;
		errorText = newErrorText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.ERROR_RESULT__ERROR_TEXT, oldErrorText, errorText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Throwable getThrowable() {
		return throwable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrowable(Throwable newThrowable) {
		Throwable oldThrowable = throwable;
		throwable = newThrowable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.ERROR_RESULT__THROWABLE, oldThrowable, throwable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AConnectorPackage.ERROR_RESULT__ERROR:
				return getError();
			case AConnectorPackage.ERROR_RESULT__ERROR_TEXT:
				return getErrorText();
			case AConnectorPackage.ERROR_RESULT__THROWABLE:
				return getThrowable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AConnectorPackage.ERROR_RESULT__ERROR:
				setError((String)newValue);
				return;
			case AConnectorPackage.ERROR_RESULT__ERROR_TEXT:
				setErrorText((String)newValue);
				return;
			case AConnectorPackage.ERROR_RESULT__THROWABLE:
				setThrowable((Throwable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AConnectorPackage.ERROR_RESULT__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case AConnectorPackage.ERROR_RESULT__ERROR_TEXT:
				setErrorText(ERROR_TEXT_EDEFAULT);
				return;
			case AConnectorPackage.ERROR_RESULT__THROWABLE:
				setThrowable(THROWABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AConnectorPackage.ERROR_RESULT__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
			case AConnectorPackage.ERROR_RESULT__ERROR_TEXT:
				return ERROR_TEXT_EDEFAULT == null ? errorText != null : !ERROR_TEXT_EDEFAULT.equals(errorText);
			case AConnectorPackage.ERROR_RESULT__THROWABLE:
				return THROWABLE_EDEFAULT == null ? throwable != null : !THROWABLE_EDEFAULT.equals(throwable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (error: ");
		result.append(error);
		result.append(", errorText: ");
		result.append(errorText);
		result.append(", throwable: ");
		result.append(throwable);
		result.append(')');
		return result.toString();
	}

} //ErrorResultImpl
