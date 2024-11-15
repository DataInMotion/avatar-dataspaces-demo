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
package de.avatar.connector.model.rsa.impl;

import de.avatar.connector.model.rsa.RequestParameter;
import de.avatar.connector.model.rsa.RsaFactory;
import de.avatar.connector.model.rsa.RsaObject;
import de.avatar.connector.model.rsa.RsaObjectType;
import de.avatar.connector.model.rsa.RsaPackage;
import de.avatar.connector.model.rsa.RsaRequest;
import de.avatar.connector.model.rsa.RsaResponse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RsaPackageImpl extends EPackageImpl implements RsaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rsaObjectTypeEEnum = null;

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
	 * @see de.avatar.connector.model.rsa.RsaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RsaPackageImpl() {
		super(eNS_URI, RsaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RsaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RsaPackage init() {
		if (isInited) return (RsaPackage)EPackage.Registry.INSTANCE.getEPackage(RsaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRsaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RsaPackageImpl theRsaPackage = registeredRsaPackage instanceof RsaPackageImpl ? (RsaPackageImpl)registeredRsaPackage : new RsaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRsaPackage.createPackageContents();

		// Initialize created meta-data
		theRsaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRsaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RsaPackage.eNS_URI, theRsaPackage);
		return theRsaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRsaRequest() {
		return rsaRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaRequest_Id() {
		return (EAttribute)rsaRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRsaRequest_Parameter() {
		return (EReference)rsaRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaRequest_Signature() {
		return (EAttribute)rsaRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestParameter() {
		return requestParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestParameter_Name() {
		return (EAttribute)requestParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestParameter_Index() {
		return (EAttribute)requestParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRsaResponse() {
		return rsaResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaResponse_Id() {
		return (EAttribute)rsaResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRsaResponse_Response() {
		return (EReference)rsaResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaResponse_Error() {
		return (EAttribute)rsaResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaResponse_Empty() {
		return (EAttribute)rsaResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRsaObject() {
		return rsaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRsaObject_EObject() {
		return (EReference)rsaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaObject_JavaObject() {
		return (EAttribute)rsaObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaObject_ByteData() {
		return (EAttribute)rsaObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaObject_Type() {
		return (EAttribute)rsaObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRsaObject_JavaClass() {
		return (EAttribute)rsaObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRsaObjectType() {
		return rsaObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RsaFactory getRsaFactory() {
		return (RsaFactory)getEFactoryInstance();
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
		rsaRequestEClass = createEClass(RSA_REQUEST);
		createEAttribute(rsaRequestEClass, RSA_REQUEST__ID);
		createEReference(rsaRequestEClass, RSA_REQUEST__PARAMETER);
		createEAttribute(rsaRequestEClass, RSA_REQUEST__SIGNATURE);

		requestParameterEClass = createEClass(REQUEST_PARAMETER);
		createEAttribute(requestParameterEClass, REQUEST_PARAMETER__NAME);
		createEAttribute(requestParameterEClass, REQUEST_PARAMETER__INDEX);

		rsaResponseEClass = createEClass(RSA_RESPONSE);
		createEAttribute(rsaResponseEClass, RSA_RESPONSE__ID);
		createEReference(rsaResponseEClass, RSA_RESPONSE__RESPONSE);
		createEAttribute(rsaResponseEClass, RSA_RESPONSE__ERROR);
		createEAttribute(rsaResponseEClass, RSA_RESPONSE__EMPTY);

		rsaObjectEClass = createEClass(RSA_OBJECT);
		createEReference(rsaObjectEClass, RSA_OBJECT__EOBJECT);
		createEAttribute(rsaObjectEClass, RSA_OBJECT__JAVA_OBJECT);
		createEAttribute(rsaObjectEClass, RSA_OBJECT__BYTE_DATA);
		createEAttribute(rsaObjectEClass, RSA_OBJECT__TYPE);
		createEAttribute(rsaObjectEClass, RSA_OBJECT__JAVA_CLASS);

		// Create enums
		rsaObjectTypeEEnum = createEEnum(RSA_OBJECT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requestParameterEClass.getESuperTypes().add(this.getRsaObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(rsaRequestEClass, RsaRequest.class, "RsaRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRsaRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, RsaRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRsaRequest_Parameter(), this.getRequestParameter(), null, "parameter", null, 0, -1, RsaRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRsaRequest_Parameter().getEKeys().add(this.getRequestParameter_Index());
		getRsaRequest_Parameter().getEKeys().add(this.getRequestParameter_Name());
		initEAttribute(getRsaRequest_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, RsaRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestParameterEClass, RequestParameter.class, "RequestParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, RequestParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestParameter_Index(), ecorePackage.getEInt(), "index", null, 1, 1, RequestParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsaResponseEClass, RsaResponse.class, "RsaResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRsaResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, RsaResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRsaResponse_Response(), this.getRsaObject(), null, "response", null, 0, 1, RsaResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaResponse_Error(), ecorePackage.getEBoolean(), "error", null, 0, 1, RsaResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaResponse_Empty(), ecorePackage.getEBoolean(), "empty", null, 0, 1, RsaResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsaObjectEClass, RsaObject.class, "RsaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRsaObject_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, RsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaObject_JavaObject(), ecorePackage.getEJavaObject(), "javaObject", null, 0, 1, RsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaObject_ByteData(), ecorePackage.getEByteArray(), "byteData", null, 0, -1, RsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaObject_Type(), this.getRsaObjectType(), "type", null, 1, 1, RsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRsaObject_JavaClass(), ecorePackage.getEString(), "javaClass", null, 0, 1, RsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rsaObjectTypeEEnum, RsaObjectType.class, "RsaObjectType");
		addEEnumLiteral(rsaObjectTypeEEnum, RsaObjectType.JAVA);
		addEEnumLiteral(rsaObjectTypeEEnum, RsaObjectType.EMF);
		addEEnumLiteral(rsaObjectTypeEEnum, RsaObjectType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //RsaPackageImpl
