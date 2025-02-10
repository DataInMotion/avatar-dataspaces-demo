/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package de.avatar.connector.whiteboard.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.UUID;

import org.avatar.himsa.export.PatientExportPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.utilities.FeaturePath;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.avatar.connector.whiteboard.api.ConnectorRequestWhiteboard;
import de.avatar.connector.whiteboard.api.StatusService;
import de.avatar.query.And;
import de.avatar.query.IsAfter;
import de.avatar.query.QSubject;
import de.avatar.query.Query;
import de.avatar.query.QueryFactory;
import de.avatar.query.QueryPackage;
import de.avatar.status.QueryRequest;
import de.avatar.status.QueryResponse;
import de.avatar.status.QueryStatusResponse;
import de.avatar.status.QueryStatusType;
import de.avatar.status.SingleConnectorQueryStatus;
import de.avatar.status.StatusFactory;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
//@ExtendWith(MockitoExtension.class)
public class ConnectorWhiteboardTest {
	
//	@Mock
//	TestInterface test;
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		System.out.println("Test");
	}
	
	
	@Disabled
	@Test
	public void test(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
	}
	
	
	@Disabled
	@Test
	public void testDryRun(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		
		request.setQuery(query);
		
		QueryStatusResponse response = whiteboard.executeDryRun(request);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.SUCCESS);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}
	
	
	@Disabled
	@Test
	public void testRequestNoId(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(null);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		QueryResponse response = whiteboard.executeRequest(request);
		assertThat(response).isNotNull();
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.ERROR);
	}
	
	
	@Disabled
	@Test
	public void testRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		QueryStatusResponse response = whiteboard.executeRequest(request);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.PENDING);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}

	@Disabled
	@Test
	public void testSameRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		whiteboard.executeRequest(request);
		assertThrows(IllegalArgumentException.class, () -> whiteboard.executeRequest(request));
	}
	
	@Disabled
	@Test
	public void testStatusRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware,
			@InjectService(timeout = 2000l) ServiceAware<StatusService> statusAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		assertThat(statusAware).isNotNull();
		StatusService statusService = statusAware.getService();
		assertThat(statusService).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		whiteboard.executeRequest(request);
		QueryStatusResponse response = statusService.executeStatusRequest(reqId);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}
	
	@Disabled
	@Test
	public void testStatusRequestNoCache(@InjectService(timeout = 2000l) ServiceAware<StatusService> statusAware) {
		assertThat(statusAware).isNotNull();
		StatusService statusService = statusAware.getService();
		assertThat(statusService).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		Query query = QueryFactory.eINSTANCE.createQuery();
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		assertThrows(IllegalArgumentException.class, () -> statusService.executeStatusRequest(reqId));
	}
	
	@Disabled
	@Test
	public void testPatientRequest(@InjectService(timeout = 2000l) ServiceAware<ConnectorRequestWhiteboard> whiteboardAware) {
		assertThat(whiteboardAware).isNotNull();
		ConnectorRequestWhiteboard whiteboard = whiteboardAware.getService();
		assertThat(whiteboard).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		
		Query query = QueryFactory.eINSTANCE.createQuery();
		QSubject subject = QueryFactory.eINSTANCE.createQSubject();
		subject.setIsExclude(false);
		FeaturePath featurePath = UtilitiesFactory.eINSTANCE.createFeaturePath();
		featurePath.getFeature().add(PatientExportPackage.Literals.PATIENT__PROVINCE);
		subject.setFeaturePath(featurePath);
		And where = QueryFactory.eINSTANCE.createAnd();
		FeaturePath fp2 = UtilitiesFactory.eINSTANCE.createFeaturePath();
		fp2.getFeature().add(PatientExportPackage.Literals.PATIENT__BIRTH_DATE);
		where.setFeaturePath(fp2);
		IsAfter comparator = QueryFactory.eINSTANCE.createIsAfter();
		comparator.setValue("1980-01-01");
		where.setComparator(comparator);
		query.getSubject().add(subject);
		query.getWhere().add(where);
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		QueryStatusResponse response = whiteboard.executeRequest(request);
		assertThat(response).isNotNull();
		assertThat(response.getRequestId()).isEqualTo(reqId);
		assertThat(response.getStatus()).isEqualTo(QueryStatusType.PENDING);
		assertThat(response.getDetailedStatus()).isNotNull();
		assertThat(response.getDetailedStatus().getSingleConnectorQueryStatus()).hasSize(2);
		SingleConnectorQueryStatus sc1 = null, sc2 = null;
		for(SingleConnectorQueryStatus sc : response.getDetailedStatus().getSingleConnectorQueryStatus()) {
			if("isma_himsa".equals(sc.getConnectorId())) {
				sc1 = sc;
			} else if("other_hl7".equals(sc.getConnectorId())) {
				sc2 = sc;
			}
		}
		assertThat(sc1).isNotNull();
		assertThat(sc2).isNotNull();
	}
	
	@Test
	public void printRequest(
//			@InjectService ServiceAware<PatientExportPackage> modelPackageAware,
			@InjectService(timeout = 2000l, filter = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)") ServiceAware<ResourceSet> resSetAware) throws IOException {
		
		assertThat(resSetAware).isNotNull();
		ResourceSet resSet = resSetAware.getService();
		assertThat(resSet).isNotNull();
		
		String reqId = UUID.randomUUID().toString();
		String consumerId = UUID.randomUUID().toString();
		QueryRequest request = StatusFactory.eINSTANCE.createQueryRequest();
		request.setRequestId(reqId);
		request.setConsumerId(consumerId);
		
		Query query = QueryFactory.eINSTANCE.createQuery();
		QSubject subject = QueryFactory.eINSTANCE.createQSubject();
		subject.setIsExclude(false);
		FeaturePath featurePath = UtilitiesFactory.eINSTANCE.createFeaturePath();
		featurePath.getFeature().add(QueryPackage.Literals.QUERY__COUNT);
		subject.setFeaturePath(featurePath);
		And where = QueryFactory.eINSTANCE.createAnd();
		FeaturePath fp2 = UtilitiesFactory.eINSTANCE.createFeaturePath();
		fp2.getFeature().add(QueryPackage.Literals.QUERY__COUNT);
		where.setFeaturePath(fp2);
		IsAfter comparator = QueryFactory.eINSTANCE.createIsAfter();
		comparator.setValue("1980-01-01");
		where.setComparator(comparator);
		query.getSubject().add(subject);
		query.getWhere().add(where);
		query.setCount(true);
		query.setDistinct(true);
		request.setQuery(query);
		
		Resource res = resSet.createResource(URI.createFileURI(System.getProperty("data").concat("test.json")));
		res.getContents().add(request);
		res.save(null);
		
	}
	
	
//	private Date fromLocalDateToDate(LocalDate localDate) {
//		return Date.from(                     // Convert from modern java.time class to troublesome old legacy class.  DO NOT DO THIS unless you must, to inter operate with old code not yet updated for java.time.
//				localDate                          // `LocalDate` class represents a date-only, without time-of-day and without time zone nor offset-from-UTC. 
//			    .atStartOfDay(                       // Let java.time determine the first moment of the day on that date in that zone. Never assume the day starts at 00:00:00.
//			        ZoneId.of( "America/Montreal" )  // Specify time zone using proper name in `continent/region` format, never 3-4 letter pseudo-zones such as “PST”, “CST”, “IST”. 
//			    )                                    // Produce a `ZonedDateTime` object. 
//			    .toInstant()                         // Extract an `Instant` object, a moment always in UTC.
//			);
//	}

}
