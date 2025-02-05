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
package de.avatar.status.impl;

import de.avatar.status.DetailedQueryStatus;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.StatusPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Status Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.QueryStatusResponseImpl#getDetailedStatus <em>Detailed Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryStatusResponseImpl extends QueryResponseImpl implements QueryStatusResponse {
	/**
	 * The cached value of the '{@link #getDetailedStatus() <em>Detailed Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedStatus()
	 * @generated
	 * @ordered
	 */
	protected DetailedQueryStatus detailedStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryStatusResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.QUERY_STATUS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailedQueryStatus getDetailedStatus() {
		return detailedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailedStatus(DetailedQueryStatus newDetailedStatus, NotificationChain msgs) {
		DetailedQueryStatus oldDetailedStatus = detailedStatus;
		detailedStatus = newDetailedStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS, oldDetailedStatus, newDetailedStatus);
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
	public void setDetailedStatus(DetailedQueryStatus newDetailedStatus) {
		if (newDetailedStatus != detailedStatus) {
			NotificationChain msgs = null;
			if (detailedStatus != null)
				msgs = ((InternalEObject)detailedStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS, null, msgs);
			if (newDetailedStatus != null)
				msgs = ((InternalEObject)newDetailedStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS, null, msgs);
			msgs = basicSetDetailedStatus(newDetailedStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS, newDetailedStatus, newDetailedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS:
				return basicSetDetailedStatus(null, msgs);
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
			case StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS:
				return getDetailedStatus();
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
			case StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS:
				setDetailedStatus((DetailedQueryStatus)newValue);
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
			case StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS:
				setDetailedStatus((DetailedQueryStatus)null);
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
			case StatusPackage.QUERY_STATUS_RESPONSE__DETAILED_STATUS:
				return detailedStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryStatusResponseImpl
