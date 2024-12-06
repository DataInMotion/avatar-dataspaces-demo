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

import de.avatar.status.QueryStatus;
import de.avatar.status.ResultFormatType;
import de.avatar.status.StatusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getMinResultCount <em>Min Result Count</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getMaxResultCount <em>Max Result Count</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getResultFormat <em>Result Format</em>}</li>
 *   <li>{@link de.avatar.status.impl.QueryStatusImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryStatusImpl extends StatusImpl implements QueryStatus {
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
	 * The default value of the '{@link #getMinResultCount() <em>Min Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinResultCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_RESULT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinResultCount() <em>Min Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinResultCount()
	 * @generated
	 * @ordered
	 */
	protected long minResultCount = MIN_RESULT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxResultCount() <em>Max Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResultCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RESULT_COUNT_EDEFAULT = 10000L;

	/**
	 * The cached value of the '{@link #getMaxResultCount() <em>Max Result Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResultCount()
	 * @generated
	 * @ordered
	 */
	protected long maxResultCount = MAX_RESULT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 120;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultFormat() <em>Result Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ResultFormatType RESULT_FORMAT_EDEFAULT = ResultFormatType.JSON;

	/**
	 * The cached value of the '{@link #getResultFormat() <em>Result Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultFormat()
	 * @generated
	 * @ordered
	 */
	protected ResultFormatType resultFormat = RESULT_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<String> connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.QUERY_STATUS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__QUERY, oldQuery, newQuery);
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
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_STATUS__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatusPackage.QUERY_STATUS__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMinResultCount() {
		return minResultCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinResultCount(long newMinResultCount) {
		long oldMinResultCount = minResultCount;
		minResultCount = newMinResultCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__MIN_RESULT_COUNT, oldMinResultCount, minResultCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxResultCount() {
		return maxResultCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxResultCount(long newMaxResultCount) {
		long oldMaxResultCount = maxResultCount;
		maxResultCount = newMaxResultCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__MAX_RESULT_COUNT, oldMaxResultCount, maxResultCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultFormatType getResultFormat() {
		return resultFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultFormat(ResultFormatType newResultFormat) {
		ResultFormatType oldResultFormat = resultFormat;
		resultFormat = newResultFormat == null ? RESULT_FORMAT_EDEFAULT : newResultFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatusPackage.QUERY_STATUS__RESULT_FORMAT, oldResultFormat, resultFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConnector() {
		if (connector == null) {
			connector = new EDataTypeUniqueEList<String>(String.class, this, StatusPackage.QUERY_STATUS__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatusPackage.QUERY_STATUS__QUERY:
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
			case StatusPackage.QUERY_STATUS__QUERY:
				return getQuery();
			case StatusPackage.QUERY_STATUS__MIN_RESULT_COUNT:
				return getMinResultCount();
			case StatusPackage.QUERY_STATUS__MAX_RESULT_COUNT:
				return getMaxResultCount();
			case StatusPackage.QUERY_STATUS__TIMEOUT:
				return getTimeout();
			case StatusPackage.QUERY_STATUS__RESULT_FORMAT:
				return getResultFormat();
			case StatusPackage.QUERY_STATUS__CONNECTOR:
				return getConnector();
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
			case StatusPackage.QUERY_STATUS__QUERY:
				setQuery((Query)newValue);
				return;
			case StatusPackage.QUERY_STATUS__MIN_RESULT_COUNT:
				setMinResultCount((Long)newValue);
				return;
			case StatusPackage.QUERY_STATUS__MAX_RESULT_COUNT:
				setMaxResultCount((Long)newValue);
				return;
			case StatusPackage.QUERY_STATUS__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case StatusPackage.QUERY_STATUS__RESULT_FORMAT:
				setResultFormat((ResultFormatType)newValue);
				return;
			case StatusPackage.QUERY_STATUS__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends String>)newValue);
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
			case StatusPackage.QUERY_STATUS__QUERY:
				setQuery((Query)null);
				return;
			case StatusPackage.QUERY_STATUS__MIN_RESULT_COUNT:
				setMinResultCount(MIN_RESULT_COUNT_EDEFAULT);
				return;
			case StatusPackage.QUERY_STATUS__MAX_RESULT_COUNT:
				setMaxResultCount(MAX_RESULT_COUNT_EDEFAULT);
				return;
			case StatusPackage.QUERY_STATUS__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case StatusPackage.QUERY_STATUS__RESULT_FORMAT:
				setResultFormat(RESULT_FORMAT_EDEFAULT);
				return;
			case StatusPackage.QUERY_STATUS__CONNECTOR:
				getConnector().clear();
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
			case StatusPackage.QUERY_STATUS__QUERY:
				return query != null;
			case StatusPackage.QUERY_STATUS__MIN_RESULT_COUNT:
				return minResultCount != MIN_RESULT_COUNT_EDEFAULT;
			case StatusPackage.QUERY_STATUS__MAX_RESULT_COUNT:
				return maxResultCount != MAX_RESULT_COUNT_EDEFAULT;
			case StatusPackage.QUERY_STATUS__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case StatusPackage.QUERY_STATUS__RESULT_FORMAT:
				return resultFormat != RESULT_FORMAT_EDEFAULT;
			case StatusPackage.QUERY_STATUS__CONNECTOR:
				return connector != null && !connector.isEmpty();
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
		result.append(" (minResultCount: ");
		result.append(minResultCount);
		result.append(", maxResultCount: ");
		result.append(maxResultCount);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", resultFormat: ");
		result.append(resultFormat);
		result.append(", connector: ");
		result.append(connector);
		result.append(')');
		return result.toString();
	}

} //QueryStatusImpl
