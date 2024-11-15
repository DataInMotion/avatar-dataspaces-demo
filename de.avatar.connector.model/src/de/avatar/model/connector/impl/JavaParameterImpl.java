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
package de.avatar.model.connector.impl;

import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.JavaParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.model.connector.impl.JavaParameterImpl#getTypeString <em>Type String</em>}</li>
 *   <li>{@link de.avatar.model.connector.impl.JavaParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaParameterImpl extends ParameterImpl implements JavaParameter {
	/**
	 * The default value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected String typeString = TYPE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AConnectorPackage.Literals.JAVA_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeString() {
		return typeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeString(String newTypeString) {
		String oldTypeString = typeString;
		typeString = newTypeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.JAVA_PARAMETER__TYPE_STRING, oldTypeString, typeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AConnectorPackage.JAVA_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AConnectorPackage.JAVA_PARAMETER__TYPE_STRING:
				return getTypeString();
			case AConnectorPackage.JAVA_PARAMETER__VALUE:
				return getValue();
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
			case AConnectorPackage.JAVA_PARAMETER__TYPE_STRING:
				setTypeString((String)newValue);
				return;
			case AConnectorPackage.JAVA_PARAMETER__VALUE:
				setValue(newValue);
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
			case AConnectorPackage.JAVA_PARAMETER__TYPE_STRING:
				setTypeString(TYPE_STRING_EDEFAULT);
				return;
			case AConnectorPackage.JAVA_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case AConnectorPackage.JAVA_PARAMETER__TYPE_STRING:
				return TYPE_STRING_EDEFAULT == null ? typeString != null : !TYPE_STRING_EDEFAULT.equals(typeString);
			case AConnectorPackage.JAVA_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (typeString: ");
		result.append(typeString);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //JavaParameterImpl
