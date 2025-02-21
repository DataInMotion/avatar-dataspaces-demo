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
package org.camunda.bpm.getstarted.chargecard;

import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.camunda.bpm.client.ExternalTaskClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, name = "ChargeCardWorker")
public class ChargeCardWorker {

	private final static Logger LOGGER = Logger.getLogger(ChargeCardWorker.class.getName());
	private ExecutorService executor = Executors.newSingleThreadExecutor();

	@Activate
	public void activate() {
		executor.submit(this::subscribe);
	}

	private void subscribe() {
		try {
			ExternalTaskClient client = ExternalTaskClient.create()
					.baseUrl("http://localhost:8080/engine-rest")
					.asyncResponseTimeout(10000) // long polling timeout
					.build();

			// subscribe to an external task topic as specified in the process
			client.subscribe("charge-card")
			.lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
			.handler((externalTask, externalTaskService) -> {
				// Put your business logic here

				// Get a process variable
				String item = externalTask.getVariable("item");
				Integer amount = externalTask.getVariable("amount");

				LOGGER.info("Charging credit card with an amount of '" + amount + "'€ for the item '" + item + "'...");

				try {
					java.awt.Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
				} catch (Exception e) {
					e.printStackTrace();
				}

				// Complete the task
				externalTaskService.complete(externalTask);
			})
			.open();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
