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
package de.avatar.connector.isma;

import static java.util.Objects.nonNull;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.connector.api.AvatarConnector;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ProtocolType;
import de.avatar.model.connector.StatusType;
import de.avatar.model.connector.helper.ConnectorHelper;
import de.avatar.query.QSubject;
import de.avatar.query.QWhere;
import de.avatar.query.Query;
import de.avatar.status.QueryRequest;

@Component(immediate = true, name = "ISMAConnector", property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
"connector=isma.himsa"})
public class ISMAConnectorImpl implements AvatarConnector {

	@Reference
	private AConnectorFactory connectorFactory;

	private static final Logger LOGGER = Logger.getLogger(ISMAConnectorImpl.class.getName());
	private long startTimestamp;
	private ComponentServiceObjects<ResourceSet> rsFactory;

	@Activate
	public ISMAConnectorImpl(@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<ResourceSet> rsFactory) {
		this.rsFactory = rsFactory;
		System.out.println("Activate ISMA-Connector-Implementation");
		startTimestamp = Instant.now().getEpochSecond();
	}

	@Deactivate
	public void deactivate() {
		System.out.println("De-activate ISMA-Connector-Implementation");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getEndpoints()
	 */
	@Override
	public List<ConnectorEndpoint> getEndpoints() {
		List<ConnectorEndpoint> eps = new ArrayList<>();
		ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
		ep.setProtocol(ProtocolType.MQTT);
		ep.setUri("mqtt://isma/himsa");
		ep.setId("mqtt_isma_himsa");
		ep.setName("ISMA HIMSA MQTT Endpoint");
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setProtocol(ProtocolType.HTTP_REST);
		ep.setUri("http://localhost:8088/himsa/rest/dryrun");
		ep.setId("rest_isma_himsa_dryrun");
		ep.setName("ISMA HIMSA Rest Endpoint for Dry Run");	
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setProtocol(ProtocolType.HTTP_REST);
		ep.setUri("http://localhost:8088/himsa/rest/request");
		ep.setId("rest_isma_himsa_request");
		ep.setName("ISMA HIMSA Rest Endpoint for Request");	
		eps.add(ep);
		ep = connectorFactory.createConnectorEndpoint();
		ep.setProtocol(ProtocolType.HTTP_REST);
		ep.setUri("http://localhost:8088/himsa/rest/status");
		ep.setId("rest_isma_himsa_status");
		ep.setName("ISMA HIMSA Rest Endpoint for Status");	
		eps.add(ep);
		return eps;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnectorInfo#getInfo()
	 */
	@Override
	public ConnectorInfo getInfo() {
		ConnectorInfo info = connectorFactory.createConnectorInfo();
		info.setId("isma_himsa");
		info.setName("ISMA Himsa Connector");
		info.setVersion((short)1);
		ConnectorMetric metric = connectorFactory.createConnectorMetric();
		metric.setStatus(StatusType.RUNNING);
		metric.setTimestamp(Instant.now().toEpochMilli());
		metric.setUptime(Instant.now().getEpochSecond() - startTimestamp);
		info.setMetric(metric);
		info.getEndpoint().addAll(getEndpoints());
		return info;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#dryRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse dryRequest(EndpointRequest request) {
		if (Objects.isNull(request)) {
			throw new IllegalArgumentException("Request must not be null");
		}
		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {

			String reqUri = request.getEndpoint().getUri();
			reqUri = reqUri.concat("/").concat(request.getSourceId());
			ResourceSet set = rsFactory.getService();
			Resource res = null;
			try {
				if(!request.getParameter().isEmpty()) {
					if(request.getParameter().get(0) instanceof EcoreParameter ecorePar) {
						QueryRequest queryReq = (QueryRequest) ecorePar.getValue();
						boolean count = queryReq.getQuery().isCount();
						boolean distinct = queryReq.getQuery().isDistinct();
						reqUri = reqUri.
								concat("?count=").
								concat(String.valueOf(count)).
								concat("&distinct=").
								concat(String.valueOf(distinct));
						res = set.createResource(URI.createURI(reqUri), "application/json");
						return sendRequest(request, res);
					} else {
						LOGGER.severe(String.format("Expecting an EcoreParameter in the request for %s", reqUri));
						return null;
					} 
				}
				else {
					LOGGER.severe(String.format("Expecting an EcoreParameter in the request for %s", reqUri));
					return null;
				}
			} catch (IOException e) {
				e.printStackTrace();
				LOGGER.severe(String.format("Error while sending Dry Run Request to ISMA", e.getMessage()));
				return null;
			} 
			finally {
				rsFactory.ungetService(set);
			}

		} else {
			LOGGER.warning(String.format("Request is incomplete"));
			return ConnectorHelper.validateResponse(request);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.connector.api.AvatarConnector#executeRequest(de.avatar.model.connector.EndpointRequest)
	 */
	@Override
	public EndpointResponse executeRequest(EndpointRequest request) {
		if (Objects.isNull(request)) {
			throw new IllegalArgumentException("Request must not be null");
		}
		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {
			String reqUri = request.getEndpoint().getUri();

			if(request.getEndpoint().getId().contains("status")) {
				reqUri = reqUri.concat("/").concat(request.getSourceId());
				ResourceSet set = rsFactory.getService();
				try {
					Resource res = set.createResource(URI.createURI(reqUri), "application/json");
					return sendRequest(request, res);
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.severe(String.format("Error while sending Dry Run Request to ISMA", e.getMessage()));
					return null;
				} 
				finally {
					rsFactory.ungetService(set);
				}
			} else {
				reqUri = reqUri.concat("/").concat(request.getSourceId());
				ResourceSet set = rsFactory.getService();
				Resource res = null;
				try {
					if(!request.getParameter().isEmpty()) {
						if(request.getParameter().get(0) instanceof EcoreParameter ecorePar) {
							QueryRequest queryReq = (QueryRequest) ecorePar.getValue();
							Query query = queryReq.getQuery();
							
//							subject are the projections
							String projections = "";
							for(QSubject subject : query.getSubject()) {
								projections += "projections=";
								for(EStructuralFeature feature : subject.getFeaturePath().getFeature()) {
									projections += feature.getName()+",";
								}
								projections = projections.substring(0, projections.length()-1); //to remove the last ","
							}
							
//							where are the feature on which to apply the comparator for the actual query
							for(QWhere where : query.getWhere()) {
								
							}
							
							boolean count = query.isCount();
							boolean distinct = query.isDistinct();
							reqUri = reqUri.
									concat("?count=").
									concat(String.valueOf(count)).
									concat("&distinct=").
									concat(String.valueOf(distinct));
							res = set.createResource(URI.createURI(reqUri), "application/json");
							return sendRequest(request, res);
						} 
						else {
							LOGGER.severe(String.format("Expecting an EcoreParameter in the request for %s", reqUri));
							return null;
						} 
					}
					else {
						LOGGER.severe(String.format("Expecting an EcoreParameter in the request for %s", reqUri));
						return null;
					}
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.severe(String.format("Error while sending Dry Run Request to ISMA", e.getMessage()));
					return null;
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
