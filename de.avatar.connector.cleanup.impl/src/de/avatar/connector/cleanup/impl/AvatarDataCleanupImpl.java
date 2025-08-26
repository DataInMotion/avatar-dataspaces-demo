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
package de.avatar.connector.cleanup.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import biz.aQute.scheduler.api.Constants;
import biz.aQute.scheduler.api.CronExpression;
import biz.aQute.scheduler.api.CronJob;
import de.avatar.connector.cleanup.api.api.AvatarDataCleanupConfig;

/**
 * 
 * @author ilenia
 * @since Mar 20, 2025
 */
@CronExpression(name = "AvatarDataCleanup", cron = { Constants.CRON_EXPRESSION_DAILY,
		Constants.CRON_EXPRESSION_REBOOT })
@Component(name = "AvatarDataCleanup", configurationPid = "AvatarDataCleanup", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class AvatarDataCleanupImpl implements  CronJob {
	
	private final static Logger LOGGER = Logger.getLogger(AvatarDataCleanupImpl.class.getName());
	private AvatarDataCleanupConfig config;
//	private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	private Predicate<Path> filter;
	
	@Activate
	public AvatarDataCleanupImpl(AvatarDataCleanupConfig config) {
		this.config = config;
		filter = createPredicate();
//		executor.scheduleAtFixedRate(this::run, config.cleanupDelay(), config.cleanupRate(), TimeUnit.valueOf(config.cleanupUnit()));
	}
	
//	@Deactivate
//	public void deactivate() {
//		executor.shutdown();
//	}
	
	/* 
	 * (non-Javadoc)
	 * @see biz.aQute.scheduler.api.CronJob#run()
	 */
	@Override
	public void run() {
		LOGGER.info(String.format("[%s] Starting", config.jobName()));
		Instant now = Instant.now();
		Instant criticInstant = now.minus(config.removeOlderThan(), ChronoUnit.valueOf(config.removeOlderThanUnit()));
		List<Path> filesToBeRemoved = new LinkedList<>();
		try {
			Files.list(Path.of(System.getProperty(config.cleanupRootFolder()))).
			filter(filter).
			forEach(p -> {
				try {
					if(Files.readAttributes(p, BasicFileAttributes.class).lastModifiedTime().toInstant().isBefore(criticInstant)) {
						filesToBeRemoved.add(p);
					}
				} catch(IOException e) {
					LOGGER.warning(String.format("[%s] IOException while trying to get modified time of file %s",config.jobName(), p.toString()));
				}				
			});
			if(filesToBeRemoved.isEmpty()) {
				LOGGER.info(String.format("[%s] Nothing to cleanup", config.jobName()));
			} else {
				LOGGER.info(String.format("[%s] Removing %d files", config.jobName(), filesToBeRemoved.size()));
				filesToBeRemoved.forEach(p -> {
					try {
						Files.deleteIfExists(p);
					} catch (IOException e) {
						LOGGER.warning(String.format("[%s] IOException while trying to remove file %s", config.jobName(), p.toString()));
					}
				});
			}
		} catch (IOException e) {
			LOGGER.severe(String.format("[%s] IOException while executing: %s", config.jobName(), e.getCause()));
		}
	}
	
	private Predicate<Path> createPredicate() {
//		Safe measure. If no file extension is specified we do not remove anything!
		Predicate<Path> base = p -> false;
		for(String extension : config.cleanupExtensions()) {
			base = base.or(p -> p.getFileName().toString().endsWith(extension));
		}
		return base;
	}
}
