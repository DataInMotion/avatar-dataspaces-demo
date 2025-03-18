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

import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;

/**
 * 
 * @author ilenia
 * @since Mar 18, 2025
 */
public class MyResponseHandler implements HttpClientResponseHandler<Integer> {

	/* 
	 * (non-Javadoc)
	 * @see org.apache.hc.core5.http.io.HttpClientResponseHandler#handleResponse(org.apache.hc.core5.http.ClassicHttpResponse)
	 */
	@Override
	public Integer handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
		System.out.println("Response Code from Camunda " + response.getCode());
		return response.getCode();
	}

}
