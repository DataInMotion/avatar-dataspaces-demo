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

import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.QueryResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryResponseImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryResponseImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryResponseImpl extends MinimalEObjectImpl.Container implements QueryResponse {
	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final QueryStatusType STATUS_EDEFAULT = QueryStatusType.QUERY_COMPLETED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected QueryStatusType status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.QUERY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_RESPONSE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryStatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(QueryStatusType newStatus) {
		QueryStatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_RESPONSE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_RESPONSE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatusPackage.QUERY_RESPONSE__REQUEST_ID:
				return getRequestId();
			case StatusPackage.QUERY_RESPONSE__STATUS:
				return getStatus();
			case StatusPackage.QUERY_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case StatusPackage.QUERY_RESPONSE__MESSAGE:
				return getMessage();
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
			case StatusPackage.QUERY_RESPONSE__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case StatusPackage.QUERY_RESPONSE__STATUS:
				setStatus((QueryStatusType)newValue);
				return;
			case StatusPackage.QUERY_RESPONSE__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case StatusPackage.QUERY_RESPONSE__MESSAGE:
				setMessage((String)newValue);
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
			case StatusPackage.QUERY_RESPONSE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case StatusPackage.QUERY_RESPONSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StatusPackage.QUERY_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case StatusPackage.QUERY_RESPONSE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case StatusPackage.QUERY_RESPONSE__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case StatusPackage.QUERY_RESPONSE__STATUS:
				return status != STATUS_EDEFAULT;
			case StatusPackage.QUERY_RESPONSE__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case StatusPackage.QUERY_RESPONSE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (requestId: ");
		result.append(requestId);
		result.append(", status: ");
		result.append(status);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //QueryResponseImpl
