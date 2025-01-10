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
import de.avatar.model.connector.ConnectorPendingResult;
import de.avatar.model.connector.PendingResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pending Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.PendingResultImpl#getEstRuntime <em>Est Runtime</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.PendingResultImpl#getConnectorPendingResult <em>Connector Pending Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PendingResultImpl extends ResponseResultImpl implements PendingResult {
	/**
	 * The default value of the '{@link #getEstRuntime() <em>Est Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final long EST_RUNTIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEstRuntime() <em>Est Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRuntime()
	 * @generated
	 * @ordered
	 */
	protected long estRuntime = EST_RUNTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectorPendingResult() <em>Connector Pending Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorPendingResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorPendingResult> connectorPendingResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PendingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.PENDING_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getEstRuntime() {
		return estRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstRuntime(long newEstRuntime) {
		long oldEstRuntime = estRuntime;
		estRuntime = newEstRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.PENDING_RESULT__EST_RUNTIME, oldEstRuntime, estRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectorPendingResult> getConnectorPendingResult() {
		if (connectorPendingResult == null) {
			connectorPendingResult = new EObjectContainmentEList<ConnectorPendingResult>(ConnectorPendingResult.class, this, AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT);
		}
		return connectorPendingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT:
				return ((InternalEList<?>)getConnectorPendingResult()).basicRemove(otherEnd, msgs);
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
			case AConnectorPackage.PENDING_RESULT__EST_RUNTIME:
				return getEstRuntime();
			case AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT:
				return getConnectorPendingResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AConnectorPackage.PENDING_RESULT__EST_RUNTIME:
				setEstRuntime((Long)newValue);
				return;
			case AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT:
				getConnectorPendingResult().clear();
				getConnectorPendingResult().addAll((Collection<? extends ConnectorPendingResult>)newValue);
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
			case AConnectorPackage.PENDING_RESULT__EST_RUNTIME:
				setEstRuntime(EST_RUNTIME_EDEFAULT);
				return;
			case AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT:
				getConnectorPendingResult().clear();
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
			case AConnectorPackage.PENDING_RESULT__EST_RUNTIME:
				return estRuntime != EST_RUNTIME_EDEFAULT;
			case AConnectorPackage.PENDING_RESULT__CONNECTOR_PENDING_RESULT:
				return connectorPendingResult != null && !connectorPendingResult.isEmpty();
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
		result.append(" (estRuntime: ");
		result.append(estRuntime);
		result.append(')');
		return result.toString();
	}

} //PendingResultImpl
