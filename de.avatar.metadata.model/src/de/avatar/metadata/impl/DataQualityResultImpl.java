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

import de.avatar.metadata.DataQualityResult;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Quality Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.DataQualityResultImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.DataQualityResultImpl#getElementsBeforeQualityFilter <em>Elements Before Quality Filter</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.DataQualityResultImpl#getElementsAfterQualityFilter <em>Elements After Quality Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQualityResultImpl extends MinimalEObjectImpl.Container implements DataQualityResult {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The default value of the '{@link #getElementsBeforeQualityFilter() <em>Elements Before Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsBeforeQualityFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENTS_BEFORE_QUALITY_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementsBeforeQualityFilter() <em>Elements Before Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsBeforeQualityFilter()
	 * @generated
	 * @ordered
	 */
	protected Integer elementsBeforeQualityFilter = ELEMENTS_BEFORE_QUALITY_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementsAfterQualityFilter() <em>Elements After Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsAfterQualityFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENTS_AFTER_QUALITY_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementsAfterQualityFilter() <em>Elements After Quality Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsAfterQualityFilter()
	 * @generated
	 * @ordered
	 */
	protected Integer elementsAfterQualityFilter = ELEMENTS_AFTER_QUALITY_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQualityResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.DATA_QUALITY_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(EStructuralFeature newFeature, NotificationChain msgs) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetadataPackage.DATA_QUALITY_RESULT__FEATURE, oldFeature, newFeature);
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
	public void setFeature(EStructuralFeature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.DATA_QUALITY_RESULT__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.DATA_QUALITY_RESULT__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.DATA_QUALITY_RESULT__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementsBeforeQualityFilter() {
		return elementsBeforeQualityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementsBeforeQualityFilter(Integer newElementsBeforeQualityFilter) {
		Integer oldElementsBeforeQualityFilter = elementsBeforeQualityFilter;
		elementsBeforeQualityFilter = newElementsBeforeQualityFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER, oldElementsBeforeQualityFilter, elementsBeforeQualityFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementsAfterQualityFilter() {
		return elementsAfterQualityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementsAfterQualityFilter(Integer newElementsAfterQualityFilter) {
		Integer oldElementsAfterQualityFilter = elementsAfterQualityFilter;
		elementsAfterQualityFilter = newElementsAfterQualityFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER, oldElementsAfterQualityFilter, elementsAfterQualityFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.DATA_QUALITY_RESULT__FEATURE:
				return basicSetFeature(null, msgs);
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
			case MetadataPackage.DATA_QUALITY_RESULT__FEATURE:
				return getFeature();
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER:
				return getElementsBeforeQualityFilter();
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER:
				return getElementsAfterQualityFilter();
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
			case MetadataPackage.DATA_QUALITY_RESULT__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER:
				setElementsBeforeQualityFilter((Integer)newValue);
				return;
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER:
				setElementsAfterQualityFilter((Integer)newValue);
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
			case MetadataPackage.DATA_QUALITY_RESULT__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER:
				setElementsBeforeQualityFilter(ELEMENTS_BEFORE_QUALITY_FILTER_EDEFAULT);
				return;
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER:
				setElementsAfterQualityFilter(ELEMENTS_AFTER_QUALITY_FILTER_EDEFAULT);
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
			case MetadataPackage.DATA_QUALITY_RESULT__FEATURE:
				return feature != null;
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_BEFORE_QUALITY_FILTER:
				return ELEMENTS_BEFORE_QUALITY_FILTER_EDEFAULT == null ? elementsBeforeQualityFilter != null : !ELEMENTS_BEFORE_QUALITY_FILTER_EDEFAULT.equals(elementsBeforeQualityFilter);
			case MetadataPackage.DATA_QUALITY_RESULT__ELEMENTS_AFTER_QUALITY_FILTER:
				return ELEMENTS_AFTER_QUALITY_FILTER_EDEFAULT == null ? elementsAfterQualityFilter != null : !ELEMENTS_AFTER_QUALITY_FILTER_EDEFAULT.equals(elementsAfterQualityFilter);
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
		result.append(" (elementsBeforeQualityFilter: ");
		result.append(elementsBeforeQualityFilter);
		result.append(", elementsAfterQualityFilter: ");
		result.append(elementsAfterQualityFilter);
		result.append(')');
		return result.toString();
	}

} //DataQualityResultImpl
