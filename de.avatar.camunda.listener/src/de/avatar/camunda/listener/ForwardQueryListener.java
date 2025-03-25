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
package de.avatar.camunda.listener;

import org.osgi.service.component.annotations.*;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

@Component(immediate=true, name ="ForwardQueryListener")
public class ForwardQueryListener implements ExecutionListener{

	/* 
	 * (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.ExecutionListener#notify(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		System.out.println("I am in the ForwardQueryListener");
		
	}

}
