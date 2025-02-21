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
package de.avatar.connector.api.impl;

import de.avatar.connector.api.ApiFactory;
import de.avatar.connector.api.ApiPackage;
import de.avatar.connector.api.AvatarConnector;
import de.avatar.connector.api.AvatarConnectorInfo;

import de.avatar.model.connector.AConnectorPackage;

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
public class ApiPackageImpl extends EPackageImpl implements ApiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avatarConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avatarConnectorInfoEClass = null;

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
	 * @see de.avatar.connector.api.ApiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApiPackageImpl() {
		super(eNS_URI, ApiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApiPackage init() {
		if (isInited) return (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApiPackageImpl theApiPackage = registeredApiPackage instanceof ApiPackageImpl ? (ApiPackageImpl)registeredApiPackage : new ApiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AConnectorPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApiPackage.createPackageContents();

		// Initialize created meta-data
		theApiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApiPackage.eNS_URI, theApiPackage);
		return theApiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvatarConnector() {
		return avatarConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnector__DryRequest__EndpointRequest() {
		return avatarConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnector__ExecuteRequest__EndpointRequest() {
		return avatarConnectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvatarConnectorInfo() {
		return avatarConnectorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnectorInfo__GetEndpoints() {
		return avatarConnectorInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnectorInfo__GetInfo() {
		return avatarConnectorInfoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnectorInfo__GetModelInfos() {
		return avatarConnectorInfoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAvatarConnectorInfo__GetConsentInfos() {
		return avatarConnectorInfoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiFactory getApiFactory() {
		return (ApiFactory)getEFactoryInstance();
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
		avatarConnectorEClass = createEClass(AVATAR_CONNECTOR);
		createEOperation(avatarConnectorEClass, AVATAR_CONNECTOR___DRY_REQUEST__ENDPOINTREQUEST);
		createEOperation(avatarConnectorEClass, AVATAR_CONNECTOR___EXECUTE_REQUEST__ENDPOINTREQUEST);

		avatarConnectorInfoEClass = createEClass(AVATAR_CONNECTOR_INFO);
		createEOperation(avatarConnectorInfoEClass, AVATAR_CONNECTOR_INFO___GET_ENDPOINTS);
		createEOperation(avatarConnectorInfoEClass, AVATAR_CONNECTOR_INFO___GET_INFO);
		createEOperation(avatarConnectorInfoEClass, AVATAR_CONNECTOR_INFO___GET_MODEL_INFOS);
		createEOperation(avatarConnectorInfoEClass, AVATAR_CONNECTOR_INFO___GET_CONSENT_INFOS);
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
		AConnectorPackage theAConnectorPackage = (AConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(AConnectorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		avatarConnectorEClass.getESuperTypes().add(this.getAvatarConnectorInfo());

		// Initialize classes, features, and operations; add parameters
		initEClass(avatarConnectorEClass, AvatarConnector.class, "AvatarConnector", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAvatarConnector__DryRequest__EndpointRequest(), theAConnectorPackage.getEndpointResponse(), "dryRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theAConnectorPackage.getEndpointRequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAvatarConnector__ExecuteRequest__EndpointRequest(), theAConnectorPackage.getEndpointResponse(), "executeRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theAConnectorPackage.getEndpointRequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avatarConnectorInfoEClass, AvatarConnectorInfo.class, "AvatarConnectorInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAvatarConnectorInfo__GetEndpoints(), theAConnectorPackage.getConnectorEndpoint(), "getEndpoints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAvatarConnectorInfo__GetInfo(), theAConnectorPackage.getConnectorInfo(), "getInfo", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAvatarConnectorInfo__GetModelInfos(), theAConnectorPackage.getModelInfo(), "getModelInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAvatarConnectorInfo__GetConsentInfos(), theAConnectorPackage.getConsentInfo(), "getConsentInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
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

} //ApiPackageImpl
