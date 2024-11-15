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
package de.avatar.connector.model.rsa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.avatar.connector.model.rsa.RsaObject#getEObject <em>EObject</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaObject#getJavaObject <em>Java Object</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaObject#getByteData <em>Byte Data</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaObject#getType <em>Type</em>}</li>
 *   <li>{@link de.avatar.connector.model.rsa.RsaObject#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject()
 * @model
 * @generated
 */
@ProviderType
public interface RsaObject extends EObject {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' containment reference.
	 * @see #setEObject(EObject)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject_EObject()
	 * @model containment="true"
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaObject#getEObject <em>EObject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' containment reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Java Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Object</em>' attribute.
	 * @see #setJavaObject(Object)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject_JavaObject()
	 * @model
	 * @generated
	 */
	Object getJavaObject();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaObject#getJavaObject <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Object</em>' attribute.
	 * @see #getJavaObject()
	 * @generated
	 */
	void setJavaObject(Object value);

	/**
	 * Returns the value of the '<em><b>Byte Data</b></em>' attribute list.
	 * The list contents are of type {@link byte}<code>[]</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Data</em>' attribute list.
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject_ByteData()
	 * @model
	 * @generated
	 */
	EList<byte[]> getByteData();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.avatar.connector.model.rsa.RsaObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.avatar.connector.model.rsa.RsaObjectType
	 * @see #setType(RsaObjectType)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject_Type()
	 * @model required="true"
	 * @generated
	 */
	RsaObjectType getType();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.avatar.connector.model.rsa.RsaObjectType
	 * @see #getType()
	 * @generated
	 */
	void setType(RsaObjectType value);

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(String)
	 * @see de.avatar.connector.model.rsa.RsaPackage#getRsaObject_JavaClass()
	 * @model
	 * @generated
	 */
	String getJavaClass();

	/**
	 * Sets the value of the '{@link de.avatar.connector.model.rsa.RsaObject#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(String value);

} // RsaObject
