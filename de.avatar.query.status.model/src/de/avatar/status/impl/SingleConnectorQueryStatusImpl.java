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

import de.avatar.metadata.Metadata;

import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusPackage;
import de.avatar.status.StatusResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Connector Query Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl#getStatusResult <em>Status Result</em>}</li>
 *   <li>{@link de.avatar.status.impl.SingleConnectorQueryStatusImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleConnectorQueryStatusImpl extends MinimalEObjectImpl.Container implements SingleConnectorQueryStatus {
	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected String connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorName() <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorName() <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorName()
	 * @generated
	 * @ordered
	 */
	protected String connectorName = CONNECTOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusResult() <em>Status Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusResult()
	 * @generated
	 * @ordered
	 */
	protected StatusResult statusResult;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleConnectorQueryStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.SINGLE_CONNECTOR_QUERY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(String newConnectorId) {
		String oldConnectorId = connectorId;
		connectorId = newConnectorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID, oldConnectorId, connectorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectorName() {
		return connectorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorName(String newConnectorName) {
		String oldConnectorName = connectorName;
		connectorName = newConnectorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME, oldConnectorName, connectorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusResult getStatusResult() {
		return statusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusResult(StatusResult newStatusResult, NotificationChain msgs) {
		StatusResult oldStatusResult = statusResult;
		statusResult = newStatusResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT, oldStatusResult, newStatusResult);
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
	public void setStatusResult(StatusResult newStatusResult) {
		if (newStatusResult != statusResult) {
			NotificationChain msgs = null;
			if (statusResult != null)
				msgs = ((InternalEObject)statusResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT, null, msgs);
			if (newStatusResult != null)
				msgs = ((InternalEObject)newStatusResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT, null, msgs);
			msgs = basicSetStatusResult(newStatusResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT, newStatusResult, newStatusResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT:
				return basicSetStatusResult(null, msgs);
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID:
				return getConnectorId();
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME:
				return getConnectorName();
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT:
				return getStatusResult();
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA:
				return getMetadata();
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
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID:
				setConnectorId((String)newValue);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME:
				setConnectorName((String)newValue);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT:
				setStatusResult((StatusResult)newValue);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
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
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID:
				setConnectorId(CONNECTOR_ID_EDEFAULT);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME:
				setConnectorName(CONNECTOR_NAME_EDEFAULT);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT:
				setStatusResult((StatusResult)null);
				return;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA:
				getMetadata().clear();
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
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorId != null : !CONNECTOR_ID_EDEFAULT.equals(connectorId);
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__CONNECTOR_NAME:
				return CONNECTOR_NAME_EDEFAULT == null ? connectorName != null : !CONNECTOR_NAME_EDEFAULT.equals(connectorName);
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__STATUS_RESULT:
				return statusResult != null;
			case StatusPackage.SINGLE_CONNECTOR_QUERY_STATUS__METADATA:
				return metadata != null && !metadata.isEmpty();
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
		result.append(" (connectorId: ");
		result.append(connectorId);
		result.append(", connectorName: ");
		result.append(connectorName);
		result.append(')');
		return result.toString();
	}

} //SingleConnectorQueryStatusImpl
