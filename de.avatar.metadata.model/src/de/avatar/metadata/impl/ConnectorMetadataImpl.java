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
package de.avatar.metadata.impl;

import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.ConnectorMetadataImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConnectorMetadataImpl#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ConnectorMetadataImpl#getConnectorRelativeNumber <em>Connector Relative Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorMetadataImpl extends MetadataImpl implements ConnectorMetadata {
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
	 * The default value of the '{@link #getConnectorRelativeNumber() <em>Connector Relative Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorRelativeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTOR_RELATIVE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorRelativeNumber() <em>Connector Relative Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorRelativeNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer connectorRelativeNumber = CONNECTOR_RELATIVE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.CONNECTOR_METADATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONNECTOR_METADATA__CONNECTOR_ID, oldConnectorId, connectorId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONNECTOR_METADATA__CONNECTOR_NAME, oldConnectorName, connectorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectorRelativeNumber() {
		return connectorRelativeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorRelativeNumber(Integer newConnectorRelativeNumber) {
		Integer oldConnectorRelativeNumber = connectorRelativeNumber;
		connectorRelativeNumber = newConnectorRelativeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER, oldConnectorRelativeNumber, connectorRelativeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_ID:
				return getConnectorId();
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_NAME:
				return getConnectorName();
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER:
				return getConnectorRelativeNumber();
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
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_ID:
				setConnectorId((String)newValue);
				return;
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_NAME:
				setConnectorName((String)newValue);
				return;
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER:
				setConnectorRelativeNumber((Integer)newValue);
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
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_ID:
				setConnectorId(CONNECTOR_ID_EDEFAULT);
				return;
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_NAME:
				setConnectorName(CONNECTOR_NAME_EDEFAULT);
				return;
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER:
				setConnectorRelativeNumber(CONNECTOR_RELATIVE_NUMBER_EDEFAULT);
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
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorId != null : !CONNECTOR_ID_EDEFAULT.equals(connectorId);
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_NAME:
				return CONNECTOR_NAME_EDEFAULT == null ? connectorName != null : !CONNECTOR_NAME_EDEFAULT.equals(connectorName);
			case MetadataPackage.CONNECTOR_METADATA__CONNECTOR_RELATIVE_NUMBER:
				return CONNECTOR_RELATIVE_NUMBER_EDEFAULT == null ? connectorRelativeNumber != null : !CONNECTOR_RELATIVE_NUMBER_EDEFAULT.equals(connectorRelativeNumber);
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
		result.append(", connectorRelativeNumber: ");
		result.append(connectorRelativeNumber);
		result.append(')');
		return result.toString();
	}

} //ConnectorMetadataImpl
