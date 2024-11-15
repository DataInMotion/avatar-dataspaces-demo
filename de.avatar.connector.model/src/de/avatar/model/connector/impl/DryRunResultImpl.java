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
import de.avatar.model.connector.DryRunResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dry Run Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.DryRunResultImpl#getResultCount <em>Result Count</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.DryRunResultImpl#getEstRuntime <em>Est Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DryRunResultImpl extends ResponseResultImpl implements DryRunResult {
	/**
	 * The default value of the '{@link #getResultCount() <em>Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResultCount() <em>Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCount()
	 * @generated
	 * @ordered
	 */
	protected int resultCount = RESULT_COUNT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DryRunResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.DRY_RUN_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getResultCount() {
		return resultCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultCount(int newResultCount) {
		int oldResultCount = resultCount;
		resultCount = newResultCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.DRY_RUN_RESULT__RESULT_COUNT, oldResultCount, resultCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.DRY_RUN_RESULT__EST_RUNTIME, oldEstRuntime, estRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AConnectorPackage.DRY_RUN_RESULT__RESULT_COUNT:
				return getResultCount();
			case AConnectorPackage.DRY_RUN_RESULT__EST_RUNTIME:
				return getEstRuntime();
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
			case AConnectorPackage.DRY_RUN_RESULT__RESULT_COUNT:
				setResultCount((Integer)newValue);
				return;
			case AConnectorPackage.DRY_RUN_RESULT__EST_RUNTIME:
				setEstRuntime((Long)newValue);
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
			case AConnectorPackage.DRY_RUN_RESULT__RESULT_COUNT:
				setResultCount(RESULT_COUNT_EDEFAULT);
				return;
			case AConnectorPackage.DRY_RUN_RESULT__EST_RUNTIME:
				setEstRuntime(EST_RUNTIME_EDEFAULT);
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
			case AConnectorPackage.DRY_RUN_RESULT__RESULT_COUNT:
				return resultCount != RESULT_COUNT_EDEFAULT;
			case AConnectorPackage.DRY_RUN_RESULT__EST_RUNTIME:
				return estRuntime != EST_RUNTIME_EDEFAULT;
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
		result.append(" (resultCount: ");
		result.append(resultCount);
		result.append(", estRuntime: ");
		result.append(estRuntime);
		result.append(')');
		return result.toString();
	}

} //DryRunResultImpl
