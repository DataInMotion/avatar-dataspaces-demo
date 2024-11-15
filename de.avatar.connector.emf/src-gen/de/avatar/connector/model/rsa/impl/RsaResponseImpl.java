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
package de.avatar.connector.model.rsa.impl;

import de.avatar.connector.model.rsa.RsaObject;
import de.avatar.connector.model.rsa.RsaPackage;
import de.avatar.connector.model.rsa.RsaResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl#isError <em>Error</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl#isEmpty <em>Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RsaResponseImpl extends MinimalEObjectImpl.Container implements RsaResponse {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected RsaObject response;

	/**
	 * The default value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected boolean error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean empty = EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RsaResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsaPackage.Literals.RSA_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_RESPONSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RsaObject getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(RsaObject newResponse, NotificationChain msgs) {
		RsaObject oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_RESPONSE__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponse(RsaObject newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RsaPackage.RSA_RESPONSE__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RsaPackage.RSA_RESPONSE__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_RESPONSE__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(boolean newError) {
		boolean oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_RESPONSE__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpty(boolean newEmpty) {
		boolean oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_RESPONSE__EMPTY, oldEmpty, empty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RsaPackage.RSA_RESPONSE__RESPONSE:
				return basicSetResponse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RsaPackage.RSA_RESPONSE__ID:
				return getId();
			case RsaPackage.RSA_RESPONSE__RESPONSE:
				return getResponse();
			case RsaPackage.RSA_RESPONSE__ERROR:
				return isError();
			case RsaPackage.RSA_RESPONSE__EMPTY:
				return isEmpty();
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
			case RsaPackage.RSA_RESPONSE__ID:
				setId((String)newValue);
				return;
			case RsaPackage.RSA_RESPONSE__RESPONSE:
				setResponse((RsaObject)newValue);
				return;
			case RsaPackage.RSA_RESPONSE__ERROR:
				setError((Boolean)newValue);
				return;
			case RsaPackage.RSA_RESPONSE__EMPTY:
				setEmpty((Boolean)newValue);
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
			case RsaPackage.RSA_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case RsaPackage.RSA_RESPONSE__RESPONSE:
				setResponse((RsaObject)null);
				return;
			case RsaPackage.RSA_RESPONSE__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case RsaPackage.RSA_RESPONSE__EMPTY:
				setEmpty(EMPTY_EDEFAULT);
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
			case RsaPackage.RSA_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RsaPackage.RSA_RESPONSE__RESPONSE:
				return response != null;
			case RsaPackage.RSA_RESPONSE__ERROR:
				return error != ERROR_EDEFAULT;
			case RsaPackage.RSA_RESPONSE__EMPTY:
				return empty != EMPTY_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", error: ");
		result.append(error);
		result.append(", empty: ");
		result.append(empty);
		result.append(')');
		return result.toString();
	}

} //RsaResponseImpl
