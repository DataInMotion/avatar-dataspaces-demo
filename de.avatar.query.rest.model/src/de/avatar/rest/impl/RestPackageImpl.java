/**
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
package de.avatar.rest.impl;

import de.avatar.model.connector.AConnectorPackage;

import de.avatar.query.QueryPackage;

import de.avatar.rest.AvatarRestQuery;
import de.avatar.rest.RestFactory;
import de.avatar.rest.RestPackage;

import de.avatar.status.StatusPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestPackageImpl extends EPackageImpl implements RestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avatarRestQueryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.avatar.rest.RestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestPackageImpl() {
		super(eNS_URI, RestFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestPackage init() {
		if (isInited) return (RestPackage)EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RestPackageImpl theRestPackage = registeredRestPackage instanceof RestPackageImpl ? (RestPackageImpl)registeredRestPackage : new RestPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AConnectorPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		QueryPackage.eINSTANCE.eClass();
		StatusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRestPackage.createPackageContents();

		// Initialize created meta-data
		theRestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestPackage.eNS_URI, theRestPackage);
		return theRestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvatarRestQuery() {
		return avatarRestQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarRestQuery__GetConnetors() {
		return avatarRestQueryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarRestQuery__GetStatus__String_String_String() {
		return avatarRestQueryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarRestQuery__Dryrun__QueryStatus() {
		return avatarRestQueryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarRestQuery__Run__QueryStatus() {
		return avatarRestQueryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestFactory getRestFactory() {
		return (RestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		avatarRestQueryEClass = createEClass(AVATAR_REST_QUERY);
		createEOperation(avatarRestQueryEClass, AVATAR_REST_QUERY___GET_CONNETORS);
		createEOperation(avatarRestQueryEClass, AVATAR_REST_QUERY___GET_STATUS__STRING_STRING_STRING);
		createEOperation(avatarRestQueryEClass, AVATAR_REST_QUERY___DRYRUN__QUERYSTATUS);
		createEOperation(avatarRestQueryEClass, AVATAR_REST_QUERY___RUN__QUERYSTATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(avatarRestQueryEClass, AvatarRestQuery.class, "AvatarRestQuery", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAvatarRestQuery__GetConnetors(), ecorePackage.getEString(), "getConnetors", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAvatarRestQuery__GetStatus__String_String_String(), theStatusPackage.getQueryStatus(), "getStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "username", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAvatarRestQuery__Dryrun__QueryStatus(), theStatusPackage.getQueryStatus(), "dryrun", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatusPackage.getQueryStatus(), "queryStatus", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAvatarRestQuery__Run__QueryStatus(), theStatusPackage.getQueryStatus(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatusPackage.getQueryStatus(), "queryStatus", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// avatar.rest
		createAvatarAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>avatar.rest</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAvatarAnnotations() {
		String source = "avatar.rest";
		addAnnotation
		  (avatarRestQueryEClass,
		   source,
		   new String[] {
			   "ContentType", "application/json",
			   "Version", "1.0"
		   });
		addAnnotation
		  (getAvatarRestQuery__GetConnetors(),
		   source,
		   new String[] {
			   "Path", "/connectors",
			   "Method", "GET"
		   });
		addAnnotation
		  (getAvatarRestQuery__GetStatus__String_String_String(),
		   source,
		   new String[] {
			   "Path", "/status",
			   "Method", "GET"
		   });
		addAnnotation
		  (getAvatarRestQuery__Dryrun__QueryStatus(),
		   source,
		   new String[] {
			   "Path", "/dryrun",
			   "Method", "GET"
		   });
		addAnnotation
		  (getAvatarRestQuery__Run__QueryStatus(),
		   source,
		   new String[] {
			   "Path", "/run",
			   "Method", "GET"
		   });
	}

} //RestPackageImpl
