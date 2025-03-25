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
import de.avatar.metadata.AnonymizationModelConfig;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymization Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationInfoImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationInfoImpl#getModelDescription <em>Model Description</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationInfoImpl#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationInfoImpl#getModelProvider <em>Model Provider</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationInfoImpl#getModelConfig <em>Model Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymizationInfoImpl extends MinimalEObjectImpl.Container implements AnonymizationInfo {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelDescription() <em>Model Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelDescription() <em>Model Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDescription()
	 * @generated
	 * @ordered
	 */
	protected String modelDescription = MODEL_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected String modelVersion = MODEL_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelProvider() <em>Model Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelProvider() <em>Model Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelProvider()
	 * @generated
	 * @ordered
	 */
	protected String modelProvider = MODEL_PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelConfig() <em>Model Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelConfig()
	 * @generated
	 * @ordered
	 */
	protected AnonymizationModelConfig modelConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymizationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.ANONYMIZATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelDescription() {
		return modelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelDescription(String newModelDescription) {
		String oldModelDescription = modelDescription;
		modelDescription = newModelDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_DESCRIPTION, oldModelDescription, modelDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelVersion() {
		return modelVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelVersion(String newModelVersion) {
		String oldModelVersion = modelVersion;
		modelVersion = newModelVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_VERSION, oldModelVersion, modelVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelProvider() {
		return modelProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelProvider(String newModelProvider) {
		String oldModelProvider = modelProvider;
		modelProvider = newModelProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_PROVIDER, oldModelProvider, modelProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationModelConfig getModelConfig() {
		return modelConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelConfig(AnonymizationModelConfig newModelConfig, NotificationChain msgs) {
		AnonymizationModelConfig oldModelConfig = modelConfig;
		modelConfig = newModelConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG, oldModelConfig, newModelConfig);
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
	public void setModelConfig(AnonymizationModelConfig newModelConfig) {
		if (newModelConfig != modelConfig) {
			NotificationChain msgs = null;
			if (modelConfig != null)
				msgs = ((InternalEObject)modelConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG, null, msgs);
			if (newModelConfig != null)
				msgs = ((InternalEObject)newModelConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG, null, msgs);
			msgs = basicSetModelConfig(newModelConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG, newModelConfig, newModelConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG:
				return basicSetModelConfig(null, msgs);
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
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_NAME:
				return getModelName();
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_DESCRIPTION:
				return getModelDescription();
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_VERSION:
				return getModelVersion();
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_PROVIDER:
				return getModelProvider();
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG:
				return getModelConfig();
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
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_DESCRIPTION:
				setModelDescription((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_VERSION:
				setModelVersion((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_PROVIDER:
				setModelProvider((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG:
				setModelConfig((AnonymizationModelConfig)newValue);
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
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_DESCRIPTION:
				setModelDescription(MODEL_DESCRIPTION_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_VERSION:
				setModelVersion(MODEL_VERSION_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_PROVIDER:
				setModelProvider(MODEL_PROVIDER_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG:
				setModelConfig((AnonymizationModelConfig)null);
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
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_DESCRIPTION:
				return MODEL_DESCRIPTION_EDEFAULT == null ? modelDescription != null : !MODEL_DESCRIPTION_EDEFAULT.equals(modelDescription);
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_VERSION:
				return MODEL_VERSION_EDEFAULT == null ? modelVersion != null : !MODEL_VERSION_EDEFAULT.equals(modelVersion);
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_PROVIDER:
				return MODEL_PROVIDER_EDEFAULT == null ? modelProvider != null : !MODEL_PROVIDER_EDEFAULT.equals(modelProvider);
			case MetadataPackage.ANONYMIZATION_INFO__MODEL_CONFIG:
				return modelConfig != null;
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", modelDescription: ");
		result.append(modelDescription);
		result.append(", modelVersion: ");
		result.append(modelVersion);
		result.append(", modelProvider: ");
		result.append(modelProvider);
		result.append(')');
		return result.toString();
	}

} //AnonymizationInfoImpl
