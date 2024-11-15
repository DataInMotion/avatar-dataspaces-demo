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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.avatar.connector.model.rsa.RsaFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = RsaPackage.eNS_URI, genModel = "/model/rsa.genmodel", genModelSourceLocations = {"model/rsa.genmodel","de.avatar.connector.emf/model/rsa.genmodel"}, ecore="/model/rsa.ecore", ecoreSourceLocations="/model/rsa.ecore")
public interface RsaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rsa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://geckoprojects.org/rsa/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rsa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RsaPackage eINSTANCE = de.avatar.connector.model.rsa.impl.RsaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.connector.model.rsa.impl.RsaRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.model.rsa.impl.RsaRequestImpl
	 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaRequest()
	 * @generated
	 */
	int RSA_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_REQUEST__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_REQUEST__SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.model.rsa.impl.RsaObjectImpl
	 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaObject()
	 * @generated
	 */
	int RSA_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT__EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Java Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT__JAVA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Byte Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT__BYTE_DATA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT__JAVA_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.connector.model.rsa.impl.RequestParameterImpl <em>Request Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.model.rsa.impl.RequestParameterImpl
	 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRequestParameter()
	 * @generated
	 */
	int REQUEST_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__EOBJECT = RSA_OBJECT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Java Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__JAVA_OBJECT = RSA_OBJECT__JAVA_OBJECT;

	/**
	 * The feature id for the '<em><b>Byte Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__BYTE_DATA = RSA_OBJECT__BYTE_DATA;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__TYPE = RSA_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__JAVA_CLASS = RSA_OBJECT__JAVA_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__NAME = RSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__INDEX = RSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER_FEATURE_COUNT = RSA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Request Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER_OPERATION_COUNT = RSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.model.rsa.impl.RsaResponseImpl
	 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaResponse()
	 * @generated
	 */
	int RSA_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE__RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE__EMPTY = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.avatar.connector.model.rsa.RsaObjectType <em>Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.connector.model.rsa.RsaObjectType
	 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaObjectType()
	 * @generated
	 */
	int RSA_OBJECT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link de.avatar.connector.model.rsa.RsaRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.avatar.connector.model.rsa.RsaRequest
	 * @generated
	 */
	EClass getRsaRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.connector.model.rsa.RsaRequest#getId()
	 * @see #getRsaRequest()
	 * @generated
	 */
	EAttribute getRsaRequest_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.avatar.connector.model.rsa.RsaRequest#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.avatar.connector.model.rsa.RsaRequest#getParameter()
	 * @see #getRsaRequest()
	 * @generated
	 */
	EReference getRsaRequest_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaRequest#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see de.avatar.connector.model.rsa.RsaRequest#getSignature()
	 * @see #getRsaRequest()
	 * @generated
	 */
	EAttribute getRsaRequest_Signature();

	/**
	 * Returns the meta object for class '{@link de.avatar.connector.model.rsa.RequestParameter <em>Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Parameter</em>'.
	 * @see de.avatar.connector.model.rsa.RequestParameter
	 * @generated
	 */
	EClass getRequestParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RequestParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.avatar.connector.model.rsa.RequestParameter#getName()
	 * @see #getRequestParameter()
	 * @generated
	 */
	EAttribute getRequestParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RequestParameter#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.avatar.connector.model.rsa.RequestParameter#getIndex()
	 * @see #getRequestParameter()
	 * @generated
	 */
	EAttribute getRequestParameter_Index();

	/**
	 * Returns the meta object for class '{@link de.avatar.connector.model.rsa.RsaResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.avatar.connector.model.rsa.RsaResponse
	 * @generated
	 */
	EClass getRsaResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.avatar.connector.model.rsa.RsaResponse#getId()
	 * @see #getRsaResponse()
	 * @generated
	 */
	EAttribute getRsaResponse_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.connector.model.rsa.RsaResponse#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see de.avatar.connector.model.rsa.RsaResponse#getResponse()
	 * @see #getRsaResponse()
	 * @generated
	 */
	EReference getRsaResponse_Response();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaResponse#isError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see de.avatar.connector.model.rsa.RsaResponse#isError()
	 * @see #getRsaResponse()
	 * @generated
	 */
	EAttribute getRsaResponse_Error();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaResponse#isEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see de.avatar.connector.model.rsa.RsaResponse#isEmpty()
	 * @see #getRsaResponse()
	 * @generated
	 */
	EAttribute getRsaResponse_Empty();

	/**
	 * Returns the meta object for class '{@link de.avatar.connector.model.rsa.RsaObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject
	 * @generated
	 */
	EClass getRsaObject();

	/**
	 * Returns the meta object for the containment reference '{@link de.avatar.connector.model.rsa.RsaObject#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EObject</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject#getEObject()
	 * @see #getRsaObject()
	 * @generated
	 */
	EReference getRsaObject_EObject();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaObject#getJavaObject <em>Java Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Object</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject#getJavaObject()
	 * @see #getRsaObject()
	 * @generated
	 */
	EAttribute getRsaObject_JavaObject();

	/**
	 * Returns the meta object for the attribute list '{@link de.avatar.connector.model.rsa.RsaObject#getByteData <em>Byte Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Data</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject#getByteData()
	 * @see #getRsaObject()
	 * @generated
	 */
	EAttribute getRsaObject_ByteData();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject#getType()
	 * @see #getRsaObject()
	 * @generated
	 */
	EAttribute getRsaObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.avatar.connector.model.rsa.RsaObject#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObject#getJavaClass()
	 * @see #getRsaObject()
	 * @generated
	 */
	EAttribute getRsaObject_JavaClass();

	/**
	 * Returns the meta object for enum '{@link de.avatar.connector.model.rsa.RsaObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type</em>'.
	 * @see de.avatar.connector.model.rsa.RsaObjectType
	 * @generated
	 */
	EEnum getRsaObjectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RsaFactory getRsaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.avatar.connector.model.rsa.impl.RsaRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.model.rsa.impl.RsaRequestImpl
		 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaRequest()
		 * @generated
		 */
		EClass RSA_REQUEST = eINSTANCE.getRsaRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_REQUEST__ID = eINSTANCE.getRsaRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSA_REQUEST__PARAMETER = eINSTANCE.getRsaRequest_Parameter();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_REQUEST__SIGNATURE = eINSTANCE.getRsaRequest_Signature();

		/**
		 * The meta object literal for the '{@link de.avatar.connector.model.rsa.impl.RequestParameterImpl <em>Request Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.model.rsa.impl.RequestParameterImpl
		 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRequestParameter()
		 * @generated
		 */
		EClass REQUEST_PARAMETER = eINSTANCE.getRequestParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PARAMETER__NAME = eINSTANCE.getRequestParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PARAMETER__INDEX = eINSTANCE.getRequestParameter_Index();

		/**
		 * The meta object literal for the '{@link de.avatar.connector.model.rsa.impl.RsaResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.model.rsa.impl.RsaResponseImpl
		 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaResponse()
		 * @generated
		 */
		EClass RSA_RESPONSE = eINSTANCE.getRsaResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_RESPONSE__ID = eINSTANCE.getRsaResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSA_RESPONSE__RESPONSE = eINSTANCE.getRsaResponse_Response();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_RESPONSE__ERROR = eINSTANCE.getRsaResponse_Error();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_RESPONSE__EMPTY = eINSTANCE.getRsaResponse_Empty();

		/**
		 * The meta object literal for the '{@link de.avatar.connector.model.rsa.impl.RsaObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.model.rsa.impl.RsaObjectImpl
		 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaObject()
		 * @generated
		 */
		EClass RSA_OBJECT = eINSTANCE.getRsaObject();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSA_OBJECT__EOBJECT = eINSTANCE.getRsaObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Java Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_OBJECT__JAVA_OBJECT = eINSTANCE.getRsaObject_JavaObject();

		/**
		 * The meta object literal for the '<em><b>Byte Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_OBJECT__BYTE_DATA = eINSTANCE.getRsaObject_ByteData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_OBJECT__TYPE = eINSTANCE.getRsaObject_Type();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSA_OBJECT__JAVA_CLASS = eINSTANCE.getRsaObject_JavaClass();

		/**
		 * The meta object literal for the '{@link de.avatar.connector.model.rsa.RsaObjectType <em>Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.connector.model.rsa.RsaObjectType
		 * @see de.avatar.connector.model.rsa.impl.RsaPackageImpl#getRsaObjectType()
		 * @generated
		 */
		EEnum RSA_OBJECT_TYPE = eINSTANCE.getRsaObjectType();

	}

} //RsaPackage
