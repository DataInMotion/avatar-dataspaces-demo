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
package de.avatar.model.connector.util;

import de.avatar.model.connector.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.avatar.model.connector.AConnectorPackage
 * @generated
 */
public class AConnectorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AConnectorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnectorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AConnectorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AConnectorSwitch<Adapter> modelSwitch =
		new AConnectorSwitch<Adapter>() {
			@Override
			public Adapter caseConnectorInfo(ConnectorInfo object) {
				return createConnectorInfoAdapter();
			}
			@Override
			public Adapter caseConnectorMetric(ConnectorMetric object) {
				return createConnectorMetricAdapter();
			}
			@Override
			public Adapter caseConnectorEndpoint(ConnectorEndpoint object) {
				return createConnectorEndpointAdapter();
			}
			@Override
			public Adapter caseEndpointRequest(EndpointRequest object) {
				return createEndpointRequestAdapter();
			}
			@Override
			public Adapter caseEndpointResponse(EndpointResponse object) {
				return createEndpointResponseAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseJavaParameter(JavaParameter object) {
				return createJavaParameterAdapter();
			}
			@Override
			public Adapter caseEcoreParameter(EcoreParameter object) {
				return createEcoreParameterAdapter();
			}
			@Override
			public Adapter caseResponseResult(ResponseResult object) {
				return createResponseResultAdapter();
			}
			@Override
			public Adapter caseResponseMetaData(ResponseMetaData object) {
				return createResponseMetaDataAdapter();
			}
			@Override
			public Adapter caseDryRunResult(DryRunResult object) {
				return createDryRunResultAdapter();
			}
			@Override
			public Adapter caseErrorResult(ErrorResult object) {
				return createErrorResultAdapter();
			}
			@Override
			public Adapter casePendingResult(PendingResult object) {
				return createPendingResultAdapter();
			}
			@Override
			public Adapter caseEcoreResult(EcoreResult object) {
				return createEcoreResultAdapter();
			}
			@Override
			public Adapter caseJavaResult(JavaResult object) {
				return createJavaResultAdapter();
			}
			@Override
			public Adapter caseSimpleResult(SimpleResult object) {
				return createSimpleResultAdapter();
			}
			@Override
			public Adapter caseConnectorPendingResult(ConnectorPendingResult object) {
				return createConnectorPendingResultAdapter();
			}
			@Override
			public Adapter caseConsentInfo(ConsentInfo object) {
				return createConsentInfoAdapter();
			}
			@Override
			public Adapter caseModelInfo(ModelInfo object) {
				return createModelInfoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ConnectorInfo <em>Connector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ConnectorInfo
	 * @generated
	 */
	public Adapter createConnectorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ConnectorMetric <em>Connector Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ConnectorMetric
	 * @generated
	 */
	public Adapter createConnectorMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ConnectorEndpoint <em>Connector Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ConnectorEndpoint
	 * @generated
	 */
	public Adapter createConnectorEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.EndpointRequest <em>Endpoint Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.EndpointRequest
	 * @generated
	 */
	public Adapter createEndpointRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.EndpointResponse <em>Endpoint Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.EndpointResponse
	 * @generated
	 */
	public Adapter createEndpointResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.JavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.JavaParameter
	 * @generated
	 */
	public Adapter createJavaParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.EcoreParameter <em>Ecore Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.EcoreParameter
	 * @generated
	 */
	public Adapter createEcoreParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ResponseResult <em>Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ResponseResult
	 * @generated
	 */
	public Adapter createResponseResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ResponseMetaData <em>Response Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ResponseMetaData
	 * @generated
	 */
	public Adapter createResponseMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.DryRunResult <em>Dry Run Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.DryRunResult
	 * @generated
	 */
	public Adapter createDryRunResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ErrorResult <em>Error Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ErrorResult
	 * @generated
	 */
	public Adapter createErrorResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.PendingResult <em>Pending Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.PendingResult
	 * @generated
	 */
	public Adapter createPendingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.EcoreResult <em>Ecore Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.EcoreResult
	 * @generated
	 */
	public Adapter createEcoreResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.JavaResult <em>Java Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.JavaResult
	 * @generated
	 */
	public Adapter createJavaResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.SimpleResult <em>Simple Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.SimpleResult
	 * @generated
	 */
	public Adapter createSimpleResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ConnectorPendingResult <em>Connector Pending Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ConnectorPendingResult
	 * @generated
	 */
	public Adapter createConnectorPendingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ConsentInfo <em>Consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ConsentInfo
	 * @generated
	 */
	public Adapter createConsentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.avatar.model.connector.ModelInfo <em>Model Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.avatar.model.connector.ModelInfo
	 * @generated
	 */
	public Adapter createModelInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AConnectorAdapterFactory
