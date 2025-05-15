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
package de.avatar.connector.camunda.workers.task.handlers;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.avatar.connector.camunda.api.OrchestratorTaskCacheService;
import de.avatar.query.backend.api.StatusService;

/**
 * 
 * @author ilenia
 * @since May 15, 2025
 */
public class ManualTerminationTaskHandler implements ExternalTaskHandler {
	
	private OrchestratorTaskCacheService taskCacheService;
	
	public ManualTerminationTaskHandler(StatusService statusService, ResourceSet resSet, OrchestratorTaskCacheService taskCacheService) {
		this.taskCacheService = taskCacheService;
		
	}
	/* 
	 * (non-Javadoc)
	 * @see org.camunda.bpm.client.task.ExternalTaskHandler#execute(org.camunda.bpm.client.task.ExternalTask, org.camunda.bpm.client.task.ExternalTaskService)
	 */
	@Override
	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		taskCacheService.cacheTask(externalTask, externalTaskService);
	}

}
