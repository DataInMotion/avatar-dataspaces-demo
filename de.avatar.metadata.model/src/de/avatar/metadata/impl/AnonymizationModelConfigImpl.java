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

import de.avatar.metadata.AnonymizationModelConfig;
import de.avatar.metadata.AnonymizationModelFeatureConfig;
import de.avatar.metadata.MetadataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymization Model Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationModelConfigImpl#getFeatureConfig <em>Feature Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymizationModelConfigImpl extends MinimalEObjectImpl.Container implements AnonymizationModelConfig {
	/**
	 * The cached value of the '{@link #getFeatureConfig() <em>Feature Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymizationModelFeatureConfig> featureConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymizationModelConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.ANONYMIZATION_MODEL_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymizationModelFeatureConfig> getFeatureConfig() {
		if (featureConfig == null) {
			featureConfig = new EObjectContainmentEList<AnonymizationModelFeatureConfig>(AnonymizationModelFeatureConfig.class, this, MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG);
		}
		return featureConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG:
				return ((InternalEList<?>)getFeatureConfig()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG:
				return getFeatureConfig();
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
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG:
				getFeatureConfig().clear();
				getFeatureConfig().addAll((Collection<? extends AnonymizationModelFeatureConfig>)newValue);
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
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG:
				getFeatureConfig().clear();
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
			case MetadataPackage.ANONYMIZATION_MODEL_CONFIG__FEATURE_CONFIG:
				return featureConfig != null && !featureConfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnonymizationModelConfigImpl
