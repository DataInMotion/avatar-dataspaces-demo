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
package de.avatar.connector.camunda.process.launcher.helper;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;

/**
 * 
 * @author ilenia
 * @since Apr 25, 2025
 */
public class TestResponseHandler  implements HttpClientResponseHandler<String> {

	private static final Logger LOGGER = Logger.getLogger(TestResponseHandler.class.getName());
	/* 
	 * (non-Javadoc)
	 * @see org.apache.hc.core5.http.io.HttpClientResponseHandler#handleResponse(org.apache.hc.core5.http.ClassicHttpResponse)
	 */
	@Override
	public String handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
		LOGGER.info(String.format("Test Component response code %d", response.getCode()));
		if(response.getEntity() != null && response.getEntity().getContent() != null) {
			LOGGER.info(String.format("Test Component response entity %s", new String(response.getEntity().getContent().readAllBytes())));
		}
		return "";
	}

}
