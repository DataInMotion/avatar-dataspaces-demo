/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.avatar.generator.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.avatar.generator.api.api.AvatarGenerator;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaResult;
import de.avatar.model.connector.ResponseResult;

@Component(name = "AvatarGenerator", service = AvatarGenerator.class)
public class AvatarGeneratorImpl implements AvatarGenerator {

	private static final Logger LOGGER = Logger.getLogger(AvatarGeneratorImpl.class.getName());
	private Map<String, Map<String, String>> aggregateResponseMap = new ConcurrentHashMap<>();
	private ObjectMapper mapper = new ObjectMapper();

	private ComponentServiceObjects<ResourceSet> rsFactory;

	@Activate
	public AvatarGeneratorImpl(@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<ResourceSet> rsFactory) {
		this.rsFactory = rsFactory;
	}


	/* 
	 * (non-Javadoc)
	 * @see de.avatar.generator.api.api.AvatarGenerator#aggregateResponse(de.avatar.model.connector.EndpointResponse)
	 */
	@Override
	public void aggregateResponse(EndpointResponse response) {
		String requestId = response.getRequest().getId();
		String responseId = response.getId();
		Objects.requireNonNull(responseId, "Response ID cannot be null!");
		Objects.requireNonNull(requestId, "Request ID cannot be null!");
		if(aggregateResponseMap.get(requestId) == null) {
			aggregateResponseMap.put(requestId, new HashMap<String, String>());
		}
		if(aggregateResponseMap.get(requestId).containsKey(responseId)) {
			return;
		}
		String filePath = System.getProperty("data").
				concat(requestId).
				concat("-").
				concat(responseId).
				concat(".json");
		File responseFile = new File(filePath);
		try {
			responseFile.createNewFile();
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException when creating new file for response with id %s", responseId));
			e.printStackTrace();
		}

		aggregateResponseMap.get(requestId).put(responseId, responseFile.getAbsolutePath());

		ResponseResult result = response.getResult();
		if(result instanceof EcoreResult ecoreRes) {
			ResourceSet resourceSet = rsFactory.getService();
			try {
				Resource resource = resourceSet.createResource(URI.createFileURI(filePath), "application/json");
				resource.getContents().add(ecoreRes.getValue());
				resource.save(null);				
			} catch(IOException e) {
				LOGGER.severe(String.format("IOException while saving EcoreResult for response with id %s", responseId));
				e.printStackTrace();
				responseFile.delete();
			} finally {
				rsFactory.ungetService(resourceSet);
			}
		} else if(result instanceof JavaResult javaRes) {
			try {
				mapper.writeValue(responseFile, javaRes.getValue());				
			} catch(IOException e) {
				LOGGER.severe(String.format("Error serializing JavaResult for response with id %s", responseId));
				e.printStackTrace();
				responseFile.delete();
			}
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.generator.api.api.AvatarGenerator#getAggregatedResponse(java.lang.String)
	 */
	@Override
	public File getAggregatedResponse(String requestId) {
		String zipFilePath = System.getProperty("data").concat("aggregated-").concat(requestId).concat(".zip");
		File zipFile = new File(zipFilePath);
		if(zipFile.exists()) return zipFile;
		try {
			List<String> scrFiles = new LinkedList<>();
			Files.list(Path.of(System.getProperty("data"))).
			filter(p -> p.getFileName().toString().startsWith(requestId.concat("-"))).
			forEach(p -> {
				System.out.println(p.getFileName());
				scrFiles.add(p.toString());
			});
			zipAggregateResponse(zipFilePath, scrFiles);
			return zipFile;
		} catch(IOException e) {
			LOGGER.severe(String.format("Error creating aggregate response for request with id %s", requestId));
			e.printStackTrace();
		}
		return null;
	}

	private void zipAggregateResponse(String pathToZipFile, List<String> srcFiles) throws IOException {
		final FileOutputStream fos = new FileOutputStream(pathToZipFile);
		ZipOutputStream zipOut = new ZipOutputStream(fos);

		for (String srcFile : srcFiles) {
			File fileToZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];
			int length;
			while((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}

		zipOut.close();
		fos.close();
	}

}
