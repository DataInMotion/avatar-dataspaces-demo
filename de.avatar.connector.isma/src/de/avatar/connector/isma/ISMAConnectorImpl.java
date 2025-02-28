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
import java.util.logging.Logger;

import org.avatar.himsa.export.PatientExportPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.ConnectorEndpoint;
import de.avatar.model.connector.ConnectorInfo;
import de.avatar.model.connector.ConnectorMetric;
import de.avatar.model.connector.ConsentInfo;
import de.avatar.model.connector.EcoreParameter;
import de.avatar.model.connector.EndpointRequest;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ModelInfo;
import de.avatar.model.connector.ProtocolType;
import de.avatar.model.connector.StatusType;
import de.avatar.model.connector.helper.ConnectorHelper;
import de.avatar.query.And;
import de.avatar.query.Comparator;
import de.avatar.query.DateComparator;
import de.avatar.query.Eq;
import de.avatar.query.Gt;
import de.avatar.query.Gte;
import de.avatar.query.IsAfter;
import de.avatar.query.IsAfterOrEqual;
import de.avatar.query.IsBefore;
import de.avatar.query.IsBeforeOrEqual;
import de.avatar.query.IsInRange;
import de.avatar.query.Lt;
import de.avatar.query.Lte;
import de.avatar.query.Not;
import de.avatar.query.NumberComparator;
import de.avatar.query.Or;
import de.avatar.query.QSubject;
import de.avatar.query.QWhere;
import de.avatar.query.Query;
import de.avatar.query.SortEntity;
import de.avatar.query.StringComparator;
import de.avatar.status.QueryRequest;

@Component(immediate = true, name = "ISMAConnector", property = {
		"service.exported.configs=com.paremus.dosgi.net", 
		"service.exported.interfaces=*", 
		"com.paremus.dosgi.scope=global", 
		"com.paremus.dosgi.target.clusters=DIMC", 
		"com.paremus.dosgi.net.serialization=ecore",
"connector=isma.himsa"}, configurationPid = "AvatarConnector", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ISMAConnectorImpl implements AvatarConnector {

	@Reference
	private AConnectorFactory connectorFactory;

	private static final Logger LOGGER = Logger.getLogger(ISMAConnectorImpl.class.getName());

	private long startTimestamp;
	private ComponentServiceObjects<ResourceSet> rsFactory;
	private Map<String, Object> properties;

	@Activate
	public ISMAConnectorImpl(@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) 
	ComponentServiceObjects<ResourceSet> rsFactory, Map<String, Object> properties) {
		this.rsFactory = rsFactory;
		this.properties = properties;
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
		int i = 1;
		while(i == 0) {
			if(!properties.containsKey("endpoint.id."+i) || !properties.containsKey("endpoint.uri."+i)) {
				i = 0;
				break;
			}
			ConnectorEndpoint ep = connectorFactory.createConnectorEndpoint();
			ep.setId((String) properties.get("endpoint.id."+i));
			ep.setUri((String) properties.get("endpoint.uri."+i));
			ep.setName((String) properties.getOrDefault("endpoint.name."+i, ep.getId()));
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

	private EndpointResponse doExecuteRequest(EndpointRequest request) {

		if (nonNull(request) && 
				nonNull(request.getId()) && 
				nonNull(request.getSourceId()) && 
				nonNull(request.getEndpoint()) && 
				nonNull(request.getEndpoint().getId())) {

			String reqUri = request.getEndpoint().getUri();

			if(request.getEndpoint().getId().contains("status")) {
				reqUri = reqUri.concat("/").concat(request.getId());
				ResourceSet set = rsFactory.getService();
				try {
					Resource res = set.createResource(URI.createURI(reqUri), "application/json");
					return sendRequest(request, res);
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.severe(String.format("Error while sending request to ISMA", e.getMessage()));
					return null;
				} 
				finally {
					rsFactory.ungetService(set);
				}
			} else {
				reqUri = reqUri.concat("/").concat(request.getId()).concat("?");
				ResourceSet set = rsFactory.getService();
				Resource res = null;
				try {
					if(!request.getParameter().isEmpty()) {
						if(request.getParameter().get(0) instanceof EcoreParameter ecorePar) {
							QueryRequest queryReq = (QueryRequest) ecorePar.getValue();
							Query query = queryReq.getQuery();

							//							subject are the projections
							List<String> subjectURIs = new ArrayList<>(query.getSubject().size());
							for(QSubject subject : query.getSubject()) {
								String projections = "projections=";
								String operation = subject.getOperation() != null ? "operation=".concat(subject.getOperation().eClass().getName()) : "";
								for(EStructuralFeature feature : subject.getFeaturePath().getFeature()) {
									projections += feature.getName()+"-";
								}
								projections = projections.substring(0, projections.length()-1); //to remove the last "-"
								String subjectURI = new StringBuilder("subject=").
										append(projections).
										append(operation.isEmpty() ? "" : ",".concat(operation)).
										toString();
								subjectURIs.add(subjectURI);
							}

							List<String> sortURIs = new ArrayList<>(query.getSortBy().size());
							for(SortEntity se : query.getSortBy()) {
								String sort = "sort=";
								sort += "sortOrder=" + se.getSortOrder().getLiteral()+",";
								sort += "sortFeature=" + se.getSortFeature().getName();
								sortURIs.add(sort);					
							}
							//							where are the feature on which to apply the comparator for the actual query
							List<String> whereURIs = new ArrayList<>(query.getWhere().size());
							for(QWhere where : query.getWhere()) {
								String queryType = "queryType=";
								String featurePath = "feature=";
								String operation = where.getOperation() != null ? "operation=".concat(where.getOperation().eClass().getName()) : "";
								String comparatorName = "comparatorName=".concat(where.getComparator().eClass().getName());
								String[] values = buildValueFromComparator(where.getComparator());
								if(where instanceof And) queryType += "AND";
								else if(where instanceof Or) queryType += "OR";
								else if(where instanceof Not) queryType += "NOT";
								for(EStructuralFeature feature : where.getFeaturePath().getFeature()) {
									featurePath += feature.getName()+"-";
								}

								featurePath = featurePath.substring(0, featurePath.length()-1); //to remove the last ","
								String whereURI = new StringBuilder("where=").
										append(queryType).
										append(",").
										append(operation.isEmpty() ? "" : operation + ",").
										append(featurePath).
										append(",").
										append(comparatorName).
										append(",").
										append("comparatorType=").
										append(values[0]+",").
										append(values[1] != null ? "start="+values[1]+"," : "").
										append(values[2] != null ? "end="+values[2]+"," : "").
										append(values[3] != null ? "includeStart="+values[3]+"," : "").
										append(values[4] != null ? "includeEnd="+values[4] : "").
										toString();
								if(whereURI.endsWith(",")) whereURI = whereURI.substring(0, whereURI.length()-1);
								whereURIs.add(whereURI);								
							}
							StringBuilder sb = new StringBuilder(reqUri);
							for(String sortURI : sortURIs) {
								sb.
								append(sortURI).
								append("&");								
							}
							if(query.getLimit() != 0) {
								sb.append("limit="+query.getLimit()+"&");
							}
							if(query.getSkip() != 0) {
								sb.append("skip="+query.getSkip()+"&");
							}
							for(String subjectURI : subjectURIs) {
								sb.
								append(subjectURI).
								append("&");								
							}
							for(String whereURI : whereURIs) {
								sb.
								append(whereURI).
								append("&");								
							}
							reqUri = sb.toString();
							reqUri = reqUri.substring(0, reqUri.length()-1); //to remove the last "&"

							System.out.println(reqUri);
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
					LOGGER.severe(String.format("Error while sending Request to ISMA", e.getMessage()));
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

	private String[] buildValueFromComparator(Comparator comparator) {
		String start = null, end = null, includeStart = null, includeEnd = null, comparatorType = null;
		comparatorType = comparator.getSuitableForType().toString();
		if(comparator instanceof StringComparator strComparator) {
			start = (String) strComparator.getValue();
		}
		else if(comparator instanceof DateComparator dateComparator) {
			if(dateComparator instanceof IsBefore) {
				end = String.valueOf(dateComparator.getValue());
				includeEnd = "false";
			} else if(dateComparator instanceof IsBeforeOrEqual) {
				end = String.valueOf(dateComparator.getValue());
				includeEnd = "true";
			} else if(dateComparator instanceof IsAfter) {
				try {
					start = String.valueOf(dateComparator.getValue());
					includeStart = "false";
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if(dateComparator instanceof IsAfterOrEqual) {
				start = String.valueOf(dateComparator.getValue());
				includeStart = "true";
			}
		} 
		else if(comparator instanceof NumberComparator numComparator) {
			if(numComparator instanceof Lt) {
				end = String.valueOf(numComparator.getValue());
				includeEnd = "false";
			} else if(numComparator instanceof Lte) {
				end = String.valueOf(numComparator.getValue());
				includeEnd = "true";
			} else if(numComparator instanceof Gt) {
				start = String.valueOf(numComparator.getValue());
				includeStart = "false";
			} else if(numComparator instanceof Gte) {
				start = String.valueOf(numComparator.getValue());
				includeStart = "true";
			} else if(numComparator instanceof Eq) {
				start = String.valueOf(numComparator.getValue());
			}
		} else if(comparator instanceof IsInRange rangeComparator) {
			start = String.valueOf(rangeComparator.getStartValue());
			end = String.valueOf(rangeComparator.getEndValue());
			includeStart = String.valueOf(rangeComparator.isStartIncluded());
			includeEnd = String.valueOf(rangeComparator.isEndIncluded());
		}
		return new String[] {comparatorType, start, end, includeStart, includeEnd};
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
}
