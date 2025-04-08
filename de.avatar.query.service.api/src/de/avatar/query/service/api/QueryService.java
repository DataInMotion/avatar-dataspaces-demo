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
package de.avatar.query.service.api;


import org.osgi.annotation.versioning.ProviderType;
import de.avatar.query.Query;

@ProviderType
public interface QueryService {

	Query saveQuery(Query query);
	
	Query getQueryByName(String queryName);

}
