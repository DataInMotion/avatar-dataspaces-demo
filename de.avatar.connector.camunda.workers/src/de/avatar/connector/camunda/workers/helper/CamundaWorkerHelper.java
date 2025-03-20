/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.connector.camunda.workers.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.JavaResult;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.ResponseResult;
import de.avatar.status.ErrorStatusResult;
import de.avatar.status.PendingStatusResult;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryStatusType;
import de.avatar.status.StatusFactory;
import de.avatar.status.StatusResult;
import de.avatar.status.SuccessStatusResult;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
public class CamundaWorkerHelper {
	
	private static final Logger LOGGER = Logger.getLogger(CamundaWorkerHelper.class.getName());
	
	public static EObject loadEObjectFromString(String value,  ComponentServiceObjects<ResourceSet> rsFactory) {
		ResourceSet resSet = rsFactory.getService();
		try {
			Resource res = resSet.createResource(URI.createURI(UUID.randomUUID().toString()), "application/json");
			res.load(new ByteArrayInputStream(value.getBytes()), null);
			if(res.getContents() != null && !res.getContents().isEmpty()) {
				EObject obj = res.getContents().get(0);
				return obj;
			} else {
				LOGGER.severe(String.format("No content in loaded res"));
				return null;
			}
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while loading EObject from String"));
			e.printStackTrace();
			return null;
		} finally {
			rsFactory.ungetService(resSet);
		}
	}
	
	public static String saveEObjectToString(EObject obj,  ComponentServiceObjects<ResourceSet> rsFactory) {
		ResourceSet resSet = rsFactory.getService();
		try {
			Resource res = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
			res.getContents().add(obj);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			res.save(baos, null);
			return new String(baos.toByteArray());
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while converting EObject to String"));
			return null;
		} finally {
			rsFactory.ungetService(resSet);
		}
	}

	public static  EndpointRequest convertQueryToEndpointRequest(QueryRequest queryRequest) {
		EndpointRequest endpointRequest = AConnectorFactory.eINSTANCE.createEndpointRequest();
		endpointRequest.setSourceId(queryRequest.getConsumerId());
		endpointRequest.setId(queryRequest.getRequestId());
		return endpointRequest;
	}
	
	public static  QueryStatusType getQueryStatusType(ResponseCode code) {
		switch(code) {
		case ERROR:
			return QueryStatusType.ERROR;
		case NO_CONTENT:
			return QueryStatusType.NO_CONTENT;
		case OK:
			return QueryStatusType.SUCCESS;
		case DRYRUN_OK:
			return QueryStatusType.DRYRUN_SUCCESS;
		case PENDING:
			return QueryStatusType.PENDING;
		case TIMEOUT:
			return QueryStatusType.TIMEOUT;
		case OTHER: default:
			return QueryStatusType.OTHER;
		}
	}
	
	public static  StatusResult getStatusResult(ResponseResult responseResult) {
		if(responseResult instanceof PendingResult pendingRes) {
			PendingStatusResult pendingStatusRes = StatusFactory.eINSTANCE.createPendingStatusResult();
			pendingStatusRes.setEstRuntime(pendingRes.getEstRuntime());
			return pendingStatusRes;
		}
		if(responseResult instanceof DryRunResult pendingRes) {
			SuccessStatusResult okRes = StatusFactory.eINSTANCE.createSuccessStatusResult();
			okRes.setMessage(String.format("Estimated time for query is %d seconds", pendingRes.getEstRuntime()));
			return okRes;
		}
		else if(responseResult instanceof ErrorResult errResult) {
			ErrorStatusResult errStatusRes = StatusFactory.eINSTANCE.createErrorStatusResult();
			errStatusRes.setErrorMessage(errResult.getError() != null ? errResult.getError() : errResult.getErrorText());
			return errStatusRes;
		} else if(responseResult instanceof EcoreResult || responseResult instanceof JavaResult) {
			SuccessStatusResult okRes = StatusFactory.eINSTANCE.createSuccessStatusResult();
			okRes.setMessage(String.format("Results are available under endpoint donwloads/{requestId}"));
			return okRes;
		}
		return StatusFactory.eINSTANCE.createStatusResult();
	}

}
