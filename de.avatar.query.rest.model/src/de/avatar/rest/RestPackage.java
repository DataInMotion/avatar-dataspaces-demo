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
package de.avatar.rest;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

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
 * @see de.avatar.rest.RestFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = RestPackage.eNS_URI, genModel = "/model/rest.genmodel", genModelSourceLocations = {"model/rest.genmodel","de.avatar.query.rest.model/model/rest.genmodel"}, ecore="/model/rest.ecore", ecoreSourceLocations="/model/rest.ecore")
public interface RestPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://avatar.de/query/rest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = de.avatar.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.avatar.rest.AvatarRestQuery <em>Avatar Rest Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.avatar.rest.AvatarRestQuery
	 * @see de.avatar.rest.impl.RestPackageImpl#getAvatarRestQuery()
	 * @generated
	 */
	int AVATAR_REST_QUERY = 0;

	/**
	 * The number of structural features of the '<em>Avatar Rest Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Connetors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY___GET_CONNETORS = 0;

	/**
	 * The operation id for the '<em>Get Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY___GET_STATUS__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Dryrun</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY___DRYRUN__QUERYSTATUS = 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY___RUN__QUERYSTATUS = 3;

	/**
	 * The number of operations of the '<em>Avatar Rest Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVATAR_REST_QUERY_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link de.avatar.rest.AvatarRestQuery <em>Avatar Rest Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avatar Rest Query</em>'.
	 * @see de.avatar.rest.AvatarRestQuery
	 * @generated
	 */
	EClass getAvatarRestQuery();

	/**
	 * Returns the meta object for the '{@link de.avatar.rest.AvatarRestQuery#getConnetors() <em>Get Connetors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connetors</em>' operation.
	 * @see de.avatar.rest.AvatarRestQuery#getConnetors()
	 * @generated
	 */
	EOperation getAvatarRestQuery__GetConnetors();

	/**
	 * Returns the meta object for the '{@link de.avatar.rest.AvatarRestQuery#getStatus(java.lang.String, java.lang.String, java.lang.String) <em>Get Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status</em>' operation.
	 * @see de.avatar.rest.AvatarRestQuery#getStatus(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAvatarRestQuery__GetStatus__String_String_String();

	/**
	 * Returns the meta object for the '{@link de.avatar.rest.AvatarRestQuery#dryrun(de.avatar.status.QueryStatus) <em>Dryrun</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dryrun</em>' operation.
	 * @see de.avatar.rest.AvatarRestQuery#dryrun(de.avatar.status.QueryStatus)
	 * @generated
	 */
	EOperation getAvatarRestQuery__Dryrun__QueryStatus();

	/**
	 * Returns the meta object for the '{@link de.avatar.rest.AvatarRestQuery#run(de.avatar.status.QueryStatus) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see de.avatar.rest.AvatarRestQuery#run(de.avatar.status.QueryStatus)
	 * @generated
	 */
	EOperation getAvatarRestQuery__Run__QueryStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

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
		 * The meta object literal for the '{@link de.avatar.rest.AvatarRestQuery <em>Avatar Rest Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.avatar.rest.AvatarRestQuery
		 * @see de.avatar.rest.impl.RestPackageImpl#getAvatarRestQuery()
		 * @generated
		 */
		EClass AVATAR_REST_QUERY = eINSTANCE.getAvatarRestQuery();

		/**
		 * The meta object literal for the '<em><b>Get Connetors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_REST_QUERY___GET_CONNETORS = eINSTANCE.getAvatarRestQuery__GetConnetors();

		/**
		 * The meta object literal for the '<em><b>Get Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_REST_QUERY___GET_STATUS__STRING_STRING_STRING = eINSTANCE.getAvatarRestQuery__GetStatus__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Dryrun</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_REST_QUERY___DRYRUN__QUERYSTATUS = eINSTANCE.getAvatarRestQuery__Dryrun__QueryStatus();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVATAR_REST_QUERY___RUN__QUERYSTATUS = eINSTANCE.getAvatarRestQuery__Run__QueryStatus();

	}

} //RestPackage
