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

import de.avatar.query.QueryPackage;
import de.avatar.query.SortEntity;
import de.avatar.query.SortOrder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.impl.SortEntityImpl#getSortOrder <em>Sort Order</em>}</li>
 *   <li>{@link de.avatar.query.impl.SortEntityImpl#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortEntityImpl extends MinimalEObjectImpl.Container implements SortEntity {
	/**
	 * The default value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected static final SortOrder SORT_ORDER_EDEFAULT = SortOrder.DESC;

	/**
	 * The cached value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected SortOrder sortOrder = SORT_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeaturePath() <em>Feature Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePath()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature featurePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SORT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortOrder getSortOrder() {
		return sortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortOrder(SortOrder newSortOrder) {
		SortOrder oldSortOrder = sortOrder;
		sortOrder = newSortOrder == null ? SORT_ORDER_EDEFAULT : newSortOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SORT_ENTITY__SORT_ORDER, oldSortOrder, sortOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getFeaturePath() {
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturePath(EStructuralFeature newFeaturePath, NotificationChain msgs) {
		EStructuralFeature oldFeaturePath = featurePath;
		featurePath = newFeaturePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SORT_ENTITY__FEATURE_PATH, oldFeaturePath, newFeaturePath);
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
	public void setFeaturePath(EStructuralFeature newFeaturePath) {
		if (newFeaturePath != featurePath) {
			NotificationChain msgs = null;
			if (featurePath != null)
				msgs = ((InternalEObject)featurePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SORT_ENTITY__FEATURE_PATH, null, msgs);
			if (newFeaturePath != null)
				msgs = ((InternalEObject)newFeaturePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SORT_ENTITY__FEATURE_PATH, null, msgs);
			msgs = basicSetFeaturePath(newFeaturePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SORT_ENTITY__FEATURE_PATH, newFeaturePath, newFeaturePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SORT_ENTITY__FEATURE_PATH:
				return basicSetFeaturePath(null, msgs);
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
			case QueryPackage.SORT_ENTITY__SORT_ORDER:
				return getSortOrder();
			case QueryPackage.SORT_ENTITY__FEATURE_PATH:
				return getFeaturePath();
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
			case QueryPackage.SORT_ENTITY__SORT_ORDER:
				setSortOrder((SortOrder)newValue);
				return;
			case QueryPackage.SORT_ENTITY__FEATURE_PATH:
				setFeaturePath((EStructuralFeature)newValue);
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
			case QueryPackage.SORT_ENTITY__SORT_ORDER:
				setSortOrder(SORT_ORDER_EDEFAULT);
				return;
			case QueryPackage.SORT_ENTITY__FEATURE_PATH:
				setFeaturePath((EStructuralFeature)null);
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
			case QueryPackage.SORT_ENTITY__SORT_ORDER:
				return sortOrder != SORT_ORDER_EDEFAULT;
			case QueryPackage.SORT_ENTITY__FEATURE_PATH:
				return featurePath != null;
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
		result.append(" (sortOrder: ");
		result.append(sortOrder);
		result.append(')');
		return result.toString();
	}

} //SortEntityImpl
