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
package de.avatar.query.service.impl;

import org.osgi.service.component.annotations.*;

import de.avatar.query.Query;
import de.avatar.query.QueryPackage;
import de.avatar.query.service.api.QueryService;

import java.util.logging.Logger;

import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;

@Component(name = "QueryService")
public class QueryServiceImpl implements QueryService{
	
	@Reference(target="(repo_id=query.query)")
	ComponentServiceObjects<EMFRepository> repoSO;
	
	private static final Logger LOGGER = Logger.getLogger(QueryServiceImpl.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.service.api.QueryService#saveQuery(de.avatar.query.Query)
	 */
	@Override
	public Query saveQuery(Query query) {
		if(query.getName() == null) {
			LOGGER.severe(String.format("Cannot save Query without a name"));
			throw new IllegalArgumentException(String.format("Cannot save Query without a name"));
		}
		if(getQueryByName(query.getName()) != null) {
			LOGGER.severe(String.format("Query with name %s already exists.", query.getName()));
			throw new IllegalArgumentException(String.format("Query with name %s already exists.", query.getName()));
		}
		EMFRepository repo = repoSO.getService();
		try {
			repo.save(query);
		} finally {
			repoSO.ungetService(repo);
		}
		return query;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.avatar.query.service.api.QueryService#getQueryByName(java.lang.String)
	 */
	@Override
	public Query getQueryByName(String queryName) {
		if(queryName == null) {
			LOGGER.severe(String.format("Cannot retrieve Query with null name."));
			throw new IllegalArgumentException(String.format("Cannot retrieve Query with null name."));
		}
		EMFRepository repo = repoSO.getService();
		try {
			return repo.getEObject(QueryPackage.Literals.QUERY, queryName);
		} finally {
			repoSO.ungetService(repo);
		}
	}
}
