///**
// * Copyright (c) 2012 - 2025 Data In Motion and others.
// * All rights reserved. 
// * 
// * This program and the accompanying materials are made available under the terms of the 
// * Eclipse Public License v1.0 which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// * 
// * Contributors:
// *     Data In Motion - initial API and implementation
// */
//package de.avatar.generator.impl;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.ConfigurationPolicy;
//import org.osgi.service.component.annotations.Deactivate;
//
//import de.avatar.connector.cleanup.impl.PublicLinkCleanup;
//import de.avatar.connector.cleanup.impl.ResponseDataCleanup;
//import de.avatar.generator.api.api.AvatarDataCleanup;
//import de.avatar.generator.api.api.AvatarDataCleanupConfig;
//
///**
// * 
// * @author ilenia
// * @since Mar 20, 2025
// */
//@Component(immediate = true, name = "AvatarDataCleanup", configurationPid = "AvatarDataCleanup", configurationPolicy = ConfigurationPolicy.REQUIRE)
//public class AvatarDataCleanupImpl implements AvatarDataCleanup {
//
//		
//	private final ScheduledExecutorService responseCleanupScheduler = Executors.newScheduledThreadPool(1);
//	private final ScheduledExecutorService linkCleanupScheduler = Executors.newScheduledThreadPool(1);
//	private AvatarDataCleanupConfig config;
//
//	@Activate
//	public AvatarDataCleanupImpl(AvatarDataCleanupConfig config) {
//		this.config = config;
//		responseCleanupScheduler.scheduleAtFixedRate(new ResponseDataCleanup(config.removeResponsesOlderThan(), config.removeResponsesOlderThanUnit()), config.responseCleanupDelay(), config.responseCleanupRate(), TimeUnit.valueOf(config.responseCleanupUnit())); 
//		linkCleanupScheduler.scheduleAtFixedRate(new PublicLinkCleanup(config.removePublicLinksOlderThan(), config.removePublicLinksOlderThanUnit()), config.publicLinkCleanupDelay(), config.publicLinkCleanupRate(), TimeUnit.valueOf(config.publicLinkCleanupUnit()));
//	}
//
//	@Deactivate
//	public void deactivate() {
//		responseCleanupScheduler.shutdown();
//		linkCleanupScheduler.shutdown();
//	}
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.generator.api.api.AvatarDataCleanup#cleanupPublicLinks()
//	 */
//	@Override
//	public void cleanupPublicLinks() {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		executor.submit(new PublicLinkCleanup(config.removePublicLinksOlderThan(), config.removePublicLinksOlderThanUnit()));
//		executor.shutdown();
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.avatar.generator.api.api.AvatarDataCleanup#cleanupResponseData()
//	 */
//	@Override
//	public void cleanupResponseData() {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		executor.submit(new ResponseDataCleanup(config.removeResponsesOlderThan(), config.removeResponsesOlderThanUnit()));
//		executor.shutdown();
//	}
//
//}
