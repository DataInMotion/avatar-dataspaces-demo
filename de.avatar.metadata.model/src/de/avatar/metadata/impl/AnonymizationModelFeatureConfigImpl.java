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

import de.avatar.metadata.AnonymizationModelFeatureConfig;
import de.avatar.metadata.MetadataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymization Model Feature Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link de.avatar.metadata.impl.AnonymizationModelFeatureConfigImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymizationModelFeatureConfigImpl extends MinimalEObjectImpl.Container implements AnonymizationModelFeatureConfig {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected String metric = METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymizationModelFeatureConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.ANONYMIZATION_MODEL_FEATURE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(String newMetric) {
		String oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME:
				return getFeatureName();
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY:
				return getStrategy();
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC:
				return getMetric();
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
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY:
				setStrategy((String)newValue);
				return;
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC:
				setMetric((String)newValue);
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
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC:
				setMetric(METRIC_EDEFAULT);
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
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__STRATEGY:
				return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
			case MetadataPackage.ANONYMIZATION_MODEL_FEATURE_CONFIG__METRIC:
				return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(", strategy: ");
		result.append(strategy);
		result.append(", metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //AnonymizationModelFeatureConfigImpl
