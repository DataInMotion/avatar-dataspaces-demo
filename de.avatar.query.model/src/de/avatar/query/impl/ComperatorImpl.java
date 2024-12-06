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

import de.avatar.query.Comperator;
import de.avatar.query.QueryPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gecko.emf.utilities.FeaturePath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comperator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.query.impl.ComperatorImpl#getSuitableForType <em>Suitable For Type</em>}</li>
 *   <li>{@link de.avatar.query.impl.ComperatorImpl#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComperatorImpl extends MinimalEObjectImpl.Container implements Comperator {
	/**
	 * The default value of the '{@link #getSuitableForType() <em>Suitable For Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuitableForType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUITABLE_FOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuitableForType() <em>Suitable For Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuitableForType()
	 * @generated
	 * @ordered
	 */
	protected String suitableForType = SUITABLE_FOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeaturePath() <em>Feature Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePath()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath featurePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuitableForType() {
		return suitableForType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuitableForType(String newSuitableForType) {
		String oldSuitableForType = suitableForType;
		suitableForType = newSuitableForType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPERATOR__SUITABLE_FOR_TYPE, oldSuitableForType, suitableForType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath getFeaturePath() {
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturePath(FeaturePath newFeaturePath, NotificationChain msgs) {
		FeaturePath oldFeaturePath = featurePath;
		featurePath = newFeaturePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.COMPERATOR__FEATURE_PATH, oldFeaturePath, newFeaturePath);
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
	public void setFeaturePath(FeaturePath newFeaturePath) {
		if (newFeaturePath != featurePath) {
			NotificationChain msgs = null;
			if (featurePath != null)
				msgs = ((InternalEObject)featurePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPERATOR__FEATURE_PATH, null, msgs);
			if (newFeaturePath != null)
				msgs = ((InternalEObject)newFeaturePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.COMPERATOR__FEATURE_PATH, null, msgs);
			msgs = basicSetFeaturePath(newFeaturePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.COMPERATOR__FEATURE_PATH, newFeaturePath, newFeaturePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean compare() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.COMPERATOR__FEATURE_PATH:
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
			case QueryPackage.COMPERATOR__SUITABLE_FOR_TYPE:
				return getSuitableForType();
			case QueryPackage.COMPERATOR__FEATURE_PATH:
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
			case QueryPackage.COMPERATOR__SUITABLE_FOR_TYPE:
				setSuitableForType((String)newValue);
				return;
			case QueryPackage.COMPERATOR__FEATURE_PATH:
				setFeaturePath((FeaturePath)newValue);
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
			case QueryPackage.COMPERATOR__SUITABLE_FOR_TYPE:
				setSuitableForType(SUITABLE_FOR_TYPE_EDEFAULT);
				return;
			case QueryPackage.COMPERATOR__FEATURE_PATH:
				setFeaturePath((FeaturePath)null);
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
			case QueryPackage.COMPERATOR__SUITABLE_FOR_TYPE:
				return SUITABLE_FOR_TYPE_EDEFAULT == null ? suitableForType != null : !SUITABLE_FOR_TYPE_EDEFAULT.equals(suitableForType);
			case QueryPackage.COMPERATOR__FEATURE_PATH:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QueryPackage.COMPERATOR___COMPARE:
				return compare();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (suitableForType: ");
		result.append(suitableForType);
		result.append(')');
		return result.toString();
	}

} //ComperatorImpl
