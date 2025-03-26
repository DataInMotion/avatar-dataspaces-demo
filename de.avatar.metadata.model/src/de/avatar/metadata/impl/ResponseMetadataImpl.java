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

import de.avatar.metadata.MetadataPackage;
import de.avatar.metadata.ResponseMetadata;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.ResponseMetadataImpl#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ResponseMetadataImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ResponseMetadataImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.ResponseMetadataImpl#getTotConnectorsPerRequest <em>Tot Connectors Per Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseMetadataImpl extends MetadataImpl implements ResponseMetadata {
	/**
	 * The default value of the '{@link #getResponseId() <em>Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseId() <em>Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected String responseId = RESPONSE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected String responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotConnectorsPerRequest() <em>Tot Connectors Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotConnectorsPerRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOT_CONNECTORS_PER_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotConnectorsPerRequest() <em>Tot Connectors Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotConnectorsPerRequest()
	 * @generated
	 * @ordered
	 */
	protected Integer totConnectorsPerRequest = TOT_CONNECTORS_PER_REQUEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.RESPONSE_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseId() {
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseId(String newResponseId) {
		String oldResponseId = responseId;
		responseId = newResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.RESPONSE_METADATA__RESPONSE_ID, oldResponseId, responseId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.RESPONSE_METADATA__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTime(String newResponseTime) {
		String oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.RESPONSE_METADATA__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTotConnectorsPerRequest() {
		return totConnectorsPerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotConnectorsPerRequest(Integer newTotConnectorsPerRequest) {
		Integer oldTotConnectorsPerRequest = totConnectorsPerRequest;
		totConnectorsPerRequest = newTotConnectorsPerRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST, oldTotConnectorsPerRequest, totConnectorsPerRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_ID:
				return getResponseId();
			case MetadataPackage.RESPONSE_METADATA__REQUEST_ID:
				return getRequestId();
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_TIME:
				return getResponseTime();
			case MetadataPackage.RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST:
				return getTotConnectorsPerRequest();
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
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_ID:
				setResponseId((String)newValue);
				return;
			case MetadataPackage.RESPONSE_METADATA__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_TIME:
				setResponseTime((String)newValue);
				return;
			case MetadataPackage.RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST:
				setTotConnectorsPerRequest((Integer)newValue);
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
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_ID:
				setResponseId(RESPONSE_ID_EDEFAULT);
				return;
			case MetadataPackage.RESPONSE_METADATA__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case MetadataPackage.RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST:
				setTotConnectorsPerRequest(TOT_CONNECTORS_PER_REQUEST_EDEFAULT);
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
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_ID:
				return RESPONSE_ID_EDEFAULT == null ? responseId != null : !RESPONSE_ID_EDEFAULT.equals(responseId);
			case MetadataPackage.RESPONSE_METADATA__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case MetadataPackage.RESPONSE_METADATA__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case MetadataPackage.RESPONSE_METADATA__TOT_CONNECTORS_PER_REQUEST:
				return TOT_CONNECTORS_PER_REQUEST_EDEFAULT == null ? totConnectorsPerRequest != null : !TOT_CONNECTORS_PER_REQUEST_EDEFAULT.equals(totConnectorsPerRequest);
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
		result.append(" (responseId: ");
		result.append(responseId);
		result.append(", requestId: ");
		result.append(requestId);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", totConnectorsPerRequest: ");
		result.append(totConnectorsPerRequest);
		result.append(')');
		return result.toString();
	}

} //ResponseMetadataImpl
