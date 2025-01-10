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
import de.avatar.model.connector.ResponseCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Pending Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorPendingResultImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorPendingResultImpl#getConnectorProviderId <em>Connector Provider Id</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.ConnectorPendingResultImpl#getResponseCode <em>Response Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorPendingResultImpl extends MinimalEObjectImpl.Container implements ConnectorPendingResult {
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
	 * The default value of the '{@link #getConnectorProviderId() <em>Connector Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorProviderId() <em>Connector Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorProviderId()
	 * @generated
	 * @ordered
	 */
	protected String connectorProviderId = CONNECTOR_PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseCode RESPONSE_CODE_EDEFAULT = ResponseCode.OK;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected ResponseCode responseCode = RESPONSE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorPendingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.CONNECTOR_PENDING_RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_ID, oldConnectorId, connectorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectorProviderId() {
		return connectorProviderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorProviderId(String newConnectorProviderId) {
		String oldConnectorProviderId = connectorProviderId;
		connectorProviderId = newConnectorProviderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_PROVIDER_ID, oldConnectorProviderId, connectorProviderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseCode getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseCode(ResponseCode newResponseCode) {
		ResponseCode oldResponseCode = responseCode;
		responseCode = newResponseCode == null ? RESPONSE_CODE_EDEFAULT : newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.CONNECTOR_PENDING_RESULT__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_ID:
				return getConnectorId();
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_PROVIDER_ID:
				return getConnectorProviderId();
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__RESPONSE_CODE:
				return getResponseCode();
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
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_ID:
				setConnectorId((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_PROVIDER_ID:
				setConnectorProviderId((String)newValue);
				return;
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__RESPONSE_CODE:
				setResponseCode((ResponseCode)newValue);
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
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_ID:
				setConnectorId(CONNECTOR_ID_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_PROVIDER_ID:
				setConnectorProviderId(CONNECTOR_PROVIDER_ID_EDEFAULT);
				return;
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__RESPONSE_CODE:
				setResponseCode(RESPONSE_CODE_EDEFAULT);
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
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorId != null : !CONNECTOR_ID_EDEFAULT.equals(connectorId);
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__CONNECTOR_PROVIDER_ID:
				return CONNECTOR_PROVIDER_ID_EDEFAULT == null ? connectorProviderId != null : !CONNECTOR_PROVIDER_ID_EDEFAULT.equals(connectorProviderId);
			case AConnectorPackage.CONNECTOR_PENDING_RESULT__RESPONSE_CODE:
				return responseCode != RESPONSE_CODE_EDEFAULT;
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
		result.append(", connectorProviderId: ");
		result.append(connectorProviderId);
		result.append(", responseCode: ");
		result.append(responseCode);
		result.append(')');
		return result.toString();
	}

} //ConnectorPendingResultImpl
