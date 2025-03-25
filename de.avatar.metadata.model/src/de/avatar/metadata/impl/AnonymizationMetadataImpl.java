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

import de.avatar.metadata.AnonymizationInfo;
import de.avatar.metadata.AnonymizationMetadata;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymization Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationMetadataImpl#getAnonymizationInfo <em>Anonymization Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymizationMetadataImpl extends MetadataImpl implements AnonymizationMetadata {
	/**
	 * The cached value of the '{@link #getAnonymizationInfo() <em>Anonymization Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymizationInfo()
	 * @generated
	 * @ordered
	 */
	protected AnonymizationInfo anonymizationInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymizationMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.ANONYMIZATION_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationInfo getAnonymizationInfo() {
		return anonymizationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymizationInfo(AnonymizationInfo newAnonymizationInfo, NotificationChain msgs) {
		AnonymizationInfo oldAnonymizationInfo = anonymizationInfo;
		anonymizationInfo = newAnonymizationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO, oldAnonymizationInfo, newAnonymizationInfo);
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
	public void setAnonymizationInfo(AnonymizationInfo newAnonymizationInfo) {
		if (newAnonymizationInfo != anonymizationInfo) {
			NotificationChain msgs = null;
			if (anonymizationInfo != null)
				msgs = ((InternalEObject)anonymizationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO, null, msgs);
			if (newAnonymizationInfo != null)
				msgs = ((InternalEObject)newAnonymizationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO, null, msgs);
			msgs = basicSetAnonymizationInfo(newAnonymizationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO, newAnonymizationInfo, newAnonymizationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO:
				return basicSetAnonymizationInfo(null, msgs);
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
			case MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO:
				return getAnonymizationInfo();
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
			case MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO:
				setAnonymizationInfo((AnonymizationInfo)newValue);
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
			case MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO:
				setAnonymizationInfo((AnonymizationInfo)null);
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
			case MetadataPackage.ANONYMIZATION_METADATA__ANONYMIZATION_INFO:
				return anonymizationInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //AnonymizationMetadataImpl
