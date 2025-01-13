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

import de.avatar.query.Query;

import de.avatar.status.QueryRequest;
import de.avatar.status.StatusPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.QueryRequestImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryRequestImpl#getConsumerId <em>Consumer Id</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryRequestImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryRequestImpl#getSrcUri <em>Src Uri</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryRequestImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryRequestImpl extends MinimalEObjectImpl.Container implements QueryRequest {
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
	 * The default value of the '{@link #getConsumerId() <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerId() <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerId()
	 * @generated
	 * @ordered
	 */
	protected String consumerId = CONSUMER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * The default value of the '{@link #getSrcUri() <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcUri() <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcUri()
	 * @generated
	 * @ordered
	 */
	protected String srcUri = SRC_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.QUERY_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumerId() {
		return consumerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumerId(String newConsumerId) {
		String oldConsumerId = consumerId;
		consumerId = newConsumerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__CONSUMER_ID, oldConsumerId, consumerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__QUERY, oldQuery, newQuery);
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
	public void setQuery(Query newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_REQUEST__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_REQUEST__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrcUri() {
		return srcUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcUri(String newSrcUri) {
		String oldSrcUri = srcUri;
		srcUri = newSrcUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__SRC_URI, oldSrcUri, srcUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_REQUEST__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatusPackage.QUERY_REQUEST__QUERY:
				return basicSetQuery(null, msgs);
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
			case StatusPackage.QUERY_REQUEST__REQUEST_ID:
				return getRequestId();
			case StatusPackage.QUERY_REQUEST__CONSUMER_ID:
				return getConsumerId();
			case StatusPackage.QUERY_REQUEST__QUERY:
				return getQuery();
			case StatusPackage.QUERY_REQUEST__SRC_URI:
				return getSrcUri();
			case StatusPackage.QUERY_REQUEST__CONTENT_TYPE:
				return getContentType();
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
			case StatusPackage.QUERY_REQUEST__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case StatusPackage.QUERY_REQUEST__CONSUMER_ID:
				setConsumerId((String)newValue);
				return;
			case StatusPackage.QUERY_REQUEST__QUERY:
				setQuery((Query)newValue);
				return;
			case StatusPackage.QUERY_REQUEST__SRC_URI:
				setSrcUri((String)newValue);
				return;
			case StatusPackage.QUERY_REQUEST__CONTENT_TYPE:
				setContentType((String)newValue);
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
			case StatusPackage.QUERY_REQUEST__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case StatusPackage.QUERY_REQUEST__CONSUMER_ID:
				setConsumerId(CONSUMER_ID_EDEFAULT);
				return;
			case StatusPackage.QUERY_REQUEST__QUERY:
				setQuery((Query)null);
				return;
			case StatusPackage.QUERY_REQUEST__SRC_URI:
				setSrcUri(SRC_URI_EDEFAULT);
				return;
			case StatusPackage.QUERY_REQUEST__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
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
			case StatusPackage.QUERY_REQUEST__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case StatusPackage.QUERY_REQUEST__CONSUMER_ID:
				return CONSUMER_ID_EDEFAULT == null ? consumerId != null : !CONSUMER_ID_EDEFAULT.equals(consumerId);
			case StatusPackage.QUERY_REQUEST__QUERY:
				return query != null;
			case StatusPackage.QUERY_REQUEST__SRC_URI:
				return SRC_URI_EDEFAULT == null ? srcUri != null : !SRC_URI_EDEFAULT.equals(srcUri);
			case StatusPackage.QUERY_REQUEST__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
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
		result.append(", consumerId: ");
		result.append(consumerId);
		result.append(", srcUri: ");
		result.append(srcUri);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(')');
		return result.toString();
	}

} //QueryRequestImpl
