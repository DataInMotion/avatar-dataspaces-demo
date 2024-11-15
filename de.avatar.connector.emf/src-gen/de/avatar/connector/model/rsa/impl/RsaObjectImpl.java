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
package de.avatar.connector.model.rsa.impl;

import de.avatar.connector.model.rsa.RsaObject;
import de.avatar.connector.model.rsa.RsaObjectType;
import de.avatar.connector.model.rsa.RsaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl#getEObject <em>EObject</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl#getJavaObject <em>Java Object</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl#getByteData <em>Byte Data</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RsaObjectImpl extends MinimalEObjectImpl.Container implements RsaObject {
	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject eObject;

	/**
	 * The default value of the '{@link #getJavaObject() <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object JAVA_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaObject() <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaObject()
	 * @generated
	 * @ordered
	 */
	protected Object javaObject = JAVA_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getByteData() <em>Byte Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteData()
	 * @generated
	 * @ordered
	 */
	protected EList<byte[]> byteData;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RsaObjectType TYPE_EDEFAULT = RsaObjectType.JAVA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RsaObjectType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected String javaClass = JAVA_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RsaObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsaPackage.Literals.RSA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getEObject() {
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEObject(EObject newEObject, NotificationChain msgs) {
		EObject oldEObject = eObject;
		eObject = newEObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_OBJECT__EOBJECT, oldEObject, newEObject);
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
	public void setEObject(EObject newEObject) {
		if (newEObject != eObject) {
			NotificationChain msgs = null;
			if (eObject != null)
				msgs = ((InternalEObject)eObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RsaPackage.RSA_OBJECT__EOBJECT, null, msgs);
			if (newEObject != null)
				msgs = ((InternalEObject)newEObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RsaPackage.RSA_OBJECT__EOBJECT, null, msgs);
			msgs = basicSetEObject(newEObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_OBJECT__EOBJECT, newEObject, newEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getJavaObject() {
		return javaObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaObject(Object newJavaObject) {
		Object oldJavaObject = javaObject;
		javaObject = newJavaObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_OBJECT__JAVA_OBJECT, oldJavaObject, javaObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<byte[]> getByteData() {
		if (byteData == null) {
			byteData = new EDataTypeUniqueEList<byte[]>(byte[].class, this, RsaPackage.RSA_OBJECT__BYTE_DATA);
		}
		return byteData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RsaObjectType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(RsaObjectType newType) {
		RsaObjectType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClass(String newJavaClass) {
		String oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsaPackage.RSA_OBJECT__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RsaPackage.RSA_OBJECT__EOBJECT:
				return basicSetEObject(null, msgs);
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
			case RsaPackage.RSA_OBJECT__EOBJECT:
				return getEObject();
			case RsaPackage.RSA_OBJECT__JAVA_OBJECT:
				return getJavaObject();
			case RsaPackage.RSA_OBJECT__BYTE_DATA:
				return getByteData();
			case RsaPackage.RSA_OBJECT__TYPE:
				return getType();
			case RsaPackage.RSA_OBJECT__JAVA_CLASS:
				return getJavaClass();
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
			case RsaPackage.RSA_OBJECT__EOBJECT:
				setEObject((EObject)newValue);
				return;
			case RsaPackage.RSA_OBJECT__JAVA_OBJECT:
				setJavaObject(newValue);
				return;
			case RsaPackage.RSA_OBJECT__BYTE_DATA:
				getByteData().clear();
				getByteData().addAll((Collection<? extends byte[]>)newValue);
				return;
			case RsaPackage.RSA_OBJECT__TYPE:
				setType((RsaObjectType)newValue);
				return;
			case RsaPackage.RSA_OBJECT__JAVA_CLASS:
				setJavaClass((String)newValue);
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
			case RsaPackage.RSA_OBJECT__EOBJECT:
				setEObject((EObject)null);
				return;
			case RsaPackage.RSA_OBJECT__JAVA_OBJECT:
				setJavaObject(JAVA_OBJECT_EDEFAULT);
				return;
			case RsaPackage.RSA_OBJECT__BYTE_DATA:
				getByteData().clear();
				return;
			case RsaPackage.RSA_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RsaPackage.RSA_OBJECT__JAVA_CLASS:
				setJavaClass(JAVA_CLASS_EDEFAULT);
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
			case RsaPackage.RSA_OBJECT__EOBJECT:
				return eObject != null;
			case RsaPackage.RSA_OBJECT__JAVA_OBJECT:
				return JAVA_OBJECT_EDEFAULT == null ? javaObject != null : !JAVA_OBJECT_EDEFAULT.equals(javaObject);
			case RsaPackage.RSA_OBJECT__BYTE_DATA:
				return byteData != null && !byteData.isEmpty();
			case RsaPackage.RSA_OBJECT__TYPE:
				return type != TYPE_EDEFAULT;
			case RsaPackage.RSA_OBJECT__JAVA_CLASS:
				return JAVA_CLASS_EDEFAULT == null ? javaClass != null : !JAVA_CLASS_EDEFAULT.equals(javaClass);
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
		result.append(" (javaObject: ");
		result.append(javaObject);
		result.append(", byteData: ");
		result.append(byteData);
		result.append(", type: ");
		result.append(type);
		result.append(", javaClass: ");
		result.append(javaClass);
		result.append(')');
		return result.toString();
	}

} //RsaObjectImpl
