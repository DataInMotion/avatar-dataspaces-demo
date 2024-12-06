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
package de.avatar.query.impl;

import de.avatar.query.FeaturePath;
import de.avatar.query.Operator;
import de.avatar.query.Query;
import de.avatar.query.QueryPackage;
import de.avatar.query.SortEntity;
import de.avatar.query.Subject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#isCount <em>Count</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.avatar.query.impl.QueryImpl#getSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> from;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> object;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Subject> subject;

	/**
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath groupBy;

	/**
	 * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SortEntity> sortBy;

	/**
	 * The default value of the '{@link #isCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCount()
	 * @generated
	 * @ordered
	 */
	protected boolean count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkip()
	 * @generated
	 * @ordered
	 */
	protected static final int SKIP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkip()
	 * @generated
	 * @ordered
	 */
	protected int skip = SKIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EStructuralFeature> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, QueryPackage.QUERY__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<Operator>(Operator.class, this, QueryPackage.QUERY__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Subject>(Subject.class, this, QueryPackage.QUERY__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath getGroupBy() {
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupBy(FeaturePath newGroupBy, NotificationChain msgs) {
		FeaturePath oldGroupBy = groupBy;
		groupBy = newGroupBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__GROUP_BY, oldGroupBy, newGroupBy);
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
	public void setGroupBy(FeaturePath newGroupBy) {
		if (newGroupBy != groupBy) {
			NotificationChain msgs = null;
			if (groupBy != null)
				msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY__GROUP_BY, null, msgs);
			if (newGroupBy != null)
				msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY__GROUP_BY, null, msgs);
			msgs = basicSetGroupBy(newGroupBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__GROUP_BY, newGroupBy, newGroupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortEntity> getSortBy() {
		if (sortBy == null) {
			sortBy = new EObjectContainmentEList<SortEntity>(SortEntity.class, this, QueryPackage.QUERY__SORT_BY);
		}
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(boolean newCount) {
		boolean oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSkip() {
		return skip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkip(int newSkip) {
		int oldSkip = skip;
		skip = newSkip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY__SKIP, oldSkip, skip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.QUERY__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case QueryPackage.QUERY__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case QueryPackage.QUERY__GROUP_BY:
				return basicSetGroupBy(null, msgs);
			case QueryPackage.QUERY__SORT_BY:
				return ((InternalEList<?>)getSortBy()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.QUERY__FROM:
				return getFrom();
			case QueryPackage.QUERY__OBJECT:
				return getObject();
			case QueryPackage.QUERY__SUBJECT:
				return getSubject();
			case QueryPackage.QUERY__GROUP_BY:
				return getGroupBy();
			case QueryPackage.QUERY__SORT_BY:
				return getSortBy();
			case QueryPackage.QUERY__COUNT:
				return isCount();
			case QueryPackage.QUERY__DISTINCT:
				return isDistinct();
			case QueryPackage.QUERY__LIMIT:
				return getLimit();
			case QueryPackage.QUERY__SKIP:
				return getSkip();
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
			case QueryPackage.QUERY__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case QueryPackage.QUERY__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends Operator>)newValue);
				return;
			case QueryPackage.QUERY__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Subject>)newValue);
				return;
			case QueryPackage.QUERY__GROUP_BY:
				setGroupBy((FeaturePath)newValue);
				return;
			case QueryPackage.QUERY__SORT_BY:
				getSortBy().clear();
				getSortBy().addAll((Collection<? extends SortEntity>)newValue);
				return;
			case QueryPackage.QUERY__COUNT:
				setCount((Boolean)newValue);
				return;
			case QueryPackage.QUERY__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case QueryPackage.QUERY__LIMIT:
				setLimit((Integer)newValue);
				return;
			case QueryPackage.QUERY__SKIP:
				setSkip((Integer)newValue);
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
			case QueryPackage.QUERY__FROM:
				getFrom().clear();
				return;
			case QueryPackage.QUERY__OBJECT:
				getObject().clear();
				return;
			case QueryPackage.QUERY__SUBJECT:
				getSubject().clear();
				return;
			case QueryPackage.QUERY__GROUP_BY:
				setGroupBy((FeaturePath)null);
				return;
			case QueryPackage.QUERY__SORT_BY:
				getSortBy().clear();
				return;
			case QueryPackage.QUERY__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case QueryPackage.QUERY__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case QueryPackage.QUERY__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case QueryPackage.QUERY__SKIP:
				setSkip(SKIP_EDEFAULT);
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
			case QueryPackage.QUERY__FROM:
				return from != null && !from.isEmpty();
			case QueryPackage.QUERY__OBJECT:
				return object != null && !object.isEmpty();
			case QueryPackage.QUERY__SUBJECT:
				return subject != null && !subject.isEmpty();
			case QueryPackage.QUERY__GROUP_BY:
				return groupBy != null;
			case QueryPackage.QUERY__SORT_BY:
				return sortBy != null && !sortBy.isEmpty();
			case QueryPackage.QUERY__COUNT:
				return count != COUNT_EDEFAULT;
			case QueryPackage.QUERY__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case QueryPackage.QUERY__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case QueryPackage.QUERY__SKIP:
				return skip != SKIP_EDEFAULT;
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
		result.append(" (count: ");
		result.append(count);
		result.append(", distinct: ");
		result.append(distinct);
		result.append(", limit: ");
		result.append(limit);
		result.append(", skip: ");
		result.append(skip);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
