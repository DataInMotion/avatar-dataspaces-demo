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
package de.avatar.generator.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 
 * @author ilenia
 * @since Mar 20, 2025
 */
public class PublicLinkCleanup implements Runnable {
	
	private static final Logger LOGGER = Logger.getLogger(PublicLinkCleanup.class.getName());
	private long removePublicLinkssOlderThan;
	private TemporalUnit removePublicLinksOlderThanUnit;
	
	public PublicLinkCleanup(long removePublicLinkssOlderThan, String removePublicLinksOlderThanUnit) {
		this.removePublicLinkssOlderThan = removePublicLinkssOlderThan;
		this.removePublicLinksOlderThanUnit = ChronoUnit.valueOf(removePublicLinksOlderThanUnit);
	}
	

	/* 
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		LOGGER.info(String.format("Starting PublicLinkCleanup job!"));
		Instant now = Instant.now();
		Instant criticInstant = now.minus(removePublicLinkssOlderThan, removePublicLinksOlderThanUnit);
		List<Path> filesToBeRemoved = new LinkedList<>();
		try {
			Files.list(Path.of(System.getProperty("data"))).
			filter(p -> p.getFileName().toString().endsWith(".zip") && p.getFileName().toString().startsWith("aggregated-")).
			forEach(p -> {
				try {
					if(Files.readAttributes(p, BasicFileAttributes.class).lastModifiedTime().toInstant().isBefore(criticInstant)) {
						filesToBeRemoved.add(p);
					}
				} catch(IOException e) {
					LOGGER.warning(String.format("IOException while trying to get modified time of file %s", p.toString()));
				}		
			});
			if(filesToBeRemoved.isEmpty()) {
				LOGGER.info("Nothing to cleanup for PublickLinkCleanup Service");
			} else {
				filesToBeRemoved.forEach(p -> {
					try {
						Files.deleteIfExists(p);
					} catch (IOException e) {
						LOGGER.warning(String.format("IOException while trying to remove file %s", p.toString()));
					}
				});
			}
		} catch (IOException e) {
			LOGGER.severe(String.format("IOException while executing PublicLinkCleanup job!"));
		}
	}
}
