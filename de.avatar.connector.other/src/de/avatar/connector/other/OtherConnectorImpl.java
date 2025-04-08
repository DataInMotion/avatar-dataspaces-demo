/**
 * Copyright (c) 2012 - 2021 Paremus Ltd., Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 		Paremus Ltd. - initial API and implementation
 *      Data In Motion
 */
package de.avatar.connector.other;

import static java.util.Objects.nonNull;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.himsa.export.PatientExportPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.metadata.MetadataFactory;
import de.avatar.metadata.ResponseMetadata;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ModelInfo;
import de.avatar.model.connector.ProtocolType;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.StatusType;
import de.avatar.model.connector.helper.ConnectorHelper;
import de.avatar.query.Query;
import de.avatar.status.QueryRequest;

@Component(immediate = true, name="OtherConnector", property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
		"connector=other.hl7"}, configurationPid = "OtherAvatarConnector", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class OtherConnectorImpl implements AvatarConnector {
	
	@Reference
	private AConnectorFactory connectorFactory;
	
	private static final Logger LOGGER = Logger.getLogger(OtherConnectorImpl.class.getName());
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'")
			.withZone(ZoneId.of("Europe/Berlin"));
	
	private long startTimestamp;
	private ComponentServiceObjects<ResourceSet> rsFactory;
	private Map<String, Object> properties;
	
	@Activate
	public OtherConnectorImpl(@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) 
	ComponentServiceObjects<ResourceSet> rsFactory, Map<String, Object> properties) {
		this.rsFactory = rsFactory;
		this.properties = properties;
		System.out.println("Activate Other-Connector-Implementation");
		startTimestamp = Instant.now().getEpochSecond();
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("De-activate Other-Connector-Implementation");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 */
	@Override
	public List<ConnectorEndpoint> getEndpoints() {
		List<ConnectorEndpoint> eps = new ArrayList<>();
		int i = 1;
		while(i != 0) {
			if(!properties.containsKey("endpoint.id."+i) || !properties.containsKey("endpoint.uri."+i)) {
				i = 0;
				break;
			}
			ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
			ep.setId((String) properties.get("endpoint.id."+i));
			ep.setUri((String) properties.get("endpoint.uri."+i));
			ep.setName((String) properties.getOrDefault("endpoint.name."+i, ep.getId()));
			ep.setMethod((String) properties.getOrDefault("endpoint.method."+i, "GET"));
			ep.setMediaType((String) properties.getOrDefault("endpoint.mediatype."+i, null));
			ep.setProtocol(ProtocolType.valueOf((String)properties.getOrDefault("endpoint.protocol."+i, "HTTP_REST")));			
			eps.add(ep);
			i++;
		}	
		return eps;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getInfo()
	 */
	@Override
	public ConnectorInfo getInfo() {
		ConnectorInfo info = connectorFactory.createConnectorInfo();
		info.setId((String) properties.get("connector.id"));
		info.setName((String) properties.get("connector.name"));
		info.setVersion((short)(int)(long)properties.get("connector.version"));
		ConnectorMetric metric = connectorFactory.createConnectorMetric();
		metric.setStatus(StatusType.RUNNING);
		metric.setTimestamp(Instant.now().toEpochMilli());
		metric.setUptime(Instant.now().getEpochSecond() - startTimestamp);
		info.setMetric(metric);
		info.getEndpoint().addAll(getEndpoints());
		info.getModelInfo().addAll(getModelInfos());
		info.getConsentInfo().addAll(getConsentInfos());
		return info;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#dryRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse dryRequest(EndpointRequest request) {
		return doExecuteRequest(request);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse executeRequest(EndpointRequest request) {
		return doExecuteRequest(request);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getModelInfos()
	 */
	@Override
	public List<ModelInfo> getModelInfos() {
		ModelInfo modelInfo = connectorFactory.createModelInfo();
		modelInfo.setName(PatientExportPackage.eNAME);
		modelInfo.setUri(PatientExportPackage.eNS_URI);
		modelInfo.setDescription("A model for Patients and their hearing data");
		return List.of(modelInfo);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getConsentInfos()
	 */
	@Override
	public List<ConsentInfo> getConsentInfos() {
		ConsentInfo consentInfo = connectorFactory.createConsentInfo();
		consentInfo.setDomain("avatar");
		consentInfo.setPolicy("hearing_policy");
		consentInfo.setTemplate("");
		return List.of(consentInfo);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#canHandleModel(java.lang.String)
	 */
	@Override
	public boolean canHandleModel(String modelUri) {
		return getModelInfos().stream().map(mi -> mi.getUri()).filter(uri -> uri.equals(modelUri)).count() > 0;
	}
	
	private EndpointResponse doExecuteRequest(EndpointRequest request) {

		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {

			String reqUri = request.getEndpoint().getUri();
			reqUri = reqUri.concat("/").concat(request.getId());
			if(request.getEndpoint().getId().contains("status")) {				
				ResourceSet set = rsFactory.getService();
				try {
					Resource res = set.createResource(URI.createURI(reqUri), "application/json");
					return sendRequest(request, res);
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.severe(String.format("Error while sending request to ISMA", e.getMessage()));
					return createErrorResponse(request, String.format("Error while sending request to ISMA", e.getMessage()));
				} 
				finally {
					rsFactory.ungetService(set);
				}
			} else {
				ResourceSet set = rsFactory.getService();
				Resource requestRes = set.createResource(URI.createURI(reqUri), "application/json");
				Resource responseRes = set.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
				try {
					if(!request.getParameter().isEmpty()) {
						if(request.getParameter().get(0) instanceof EcoreParameter ecorePar) {
							QueryRequest queryReq = (QueryRequest) ecorePar.getValue();
							Query query = queryReq.getQuery();
							requestRes.getContents().add(query);							
							return sendRequest(request, requestRes, responseRes);
						} 
						else {
							LOGGER.severe(String.format("Expecting an EcoreParameter in the request for %s", reqUri));
							return createErrorResponse(request, String.format("Expecting an EcoreParameter in the request for %s", reqUri));
						} 
					}
					else {
						LOGGER.severe(String.format("Parameter list in Request is empty for %s", reqUri));
						return createErrorResponse(request, String.format("Parameter list in Request is empty for %s", reqUri));
					}
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.severe(String.format("Error while sending Request to OTHER %s", e.getMessage()));
					return createErrorResponse(request, String.format("Error while sending Request to OTHER %s", e.getMessage()));
				} 
				finally {
					rsFactory.ungetService(set);
				}
			} 
		} else {
			LOGGER.warning(String.format("Request is incomplete"));
			return ConnectorHelper.validateResponse(request);
		}
	}
	

	private EndpointResponse sendRequest(EndpointRequest request, Resource ...   resources) throws IOException {
		if(resources == null || resources.length == 0) {
			return createErrorResponse(request, String.format("Cannot send a request with 0 resources for request with id %s", request.getId()));
		}
		Map<String, Object> options = new HashMap<>();
		Map<String, Object> headers = new HashMap<>();		
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json");
		if(resources.length == 1) {
			headers.put("Method", "GET");
			options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "GET");	
			options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
			resources[0].load(options);
			if(!resources[0].getContents().isEmpty()) {
				if(resources[0].getContents().get(0) instanceof EndpointResponse response) {
					response.setRequest(request);
					return response;
				} else {
					LOGGER.severe(String.format("Response object is not of expected type EndpointResponse for request %s", request.getId()));
					return createErrorResponse(request, String.format("Response object is not of expected type EndpointResponse for request %s", request.getId()));
				}
			} else {
				LOGGER.severe(String.format("Response does NOT contain any object for request %s", request.getId()));
				return createErrorResponse(request, String.format("Response does NOT contain any object for request %s", request.getId()));
			}
		} else if(resources.length == 2) {
			headers.put("Method", "POST");
			options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "POST");	
			options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
			options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE, resources[1]);
			Map<String, Object> responseOptions = new HashMap<>();
			responseOptions.put(EMFJs.OPTION_ROOT_ELEMENT, AConnectorPackage.Literals.ENDPOINT_RESPONSE);
			responseOptions.put("Accepts", "application/json");
			options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE_OPTIONS, responseOptions);
			resources[0].save(System.out, options);
			resources[0].save(options);
			if(!resources[1].getContents().isEmpty()) {
				if(resources[1].getContents().get(0) instanceof EndpointResponse response) {
					response.setRequest(request);
					return response;
				} else {
					LOGGER.severe(String.format("Response object is not of expected type EndpointResponse for request %s", request.getId()));
					return createErrorResponse(request, String.format("Response object is not of expected type EndpointResponse for request %s", request.getId()));
				}
			} else {
				LOGGER.severe(String.format("Response does NOT contain any object for request %s", request.getId()));
				return createErrorResponse(request, String.format("Response does NOT contain any object for request %s", request.getId()));
			}
		} else {
			return createErrorResponse(request, String.format("More than 2 resources are not supported for sending a request", request.getId()));
		}
	}
	
	private EndpointResponse createErrorResponse(EndpointRequest request, String errMsg) {
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setCode(ResponseCode.ERROR);
		ErrorResult result = AConnectorFactory.eINSTANCE.createErrorResult();
		result.setError(errMsg);
		result.setErrorText(errMsg);
		response.setResult(result);
		response.setRequest(request);
		addResponseMetadata(response, request.getId());
		return response;
	}
	
	private void addResponseMetadata(EndpointResponse response, String requestId) {
		ResponseMetadata metadata = MetadataFactory.eINSTANCE.createResponseMetadata();
		metadata.setId(UUID.randomUUID().toString());
		metadata.setRequestId(requestId);
		if(response.getId() == null) response.setId(UUID.randomUUID().toString());
		metadata.setResponseId(response.getId());
		response.setTimestamp(Instant.now().toEpochMilli());
		metadata.setResponseTime(DATE_TIME_FORMATTER.format(Instant.ofEpochMilli(response.getTimestamp())));
		response.getMetadata().add(metadata);
	}

	
	private EndpointResponse sendRequest(EndpointRequest request, Resource res) throws IOException {
		Map<String, Object> options = new HashMap<>();
		Map<String, Object> headers = new HashMap<>();		
		headers.put("Accept", "*/*");
		headers.put("Method", "GET");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "GET");		
		res.load(options);
		if(!res.getContents().isEmpty()) {
			if(res.getContents().get(0) instanceof EndpointResponse response) {
				response.setRequest(request);
				return response;
			} else {
				LOGGER.severe(String.format("Response object is not of expected type EndpointResponse for request %s", res.getURI()));
				return null;
			}
		} else {
			LOGGER.severe(String.format("Response does NOT contain any object for request %s", res.getURI()));
			return null;
		}
	}

}
