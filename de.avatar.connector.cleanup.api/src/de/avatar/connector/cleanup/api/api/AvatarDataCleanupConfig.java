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
package de.avatar.connector.cleanup.api.api;

/**
 * 
 * @author ilenia
 * @since Mar 20, 2025
 */
public @interface AvatarDataCleanupConfig {
	
	String cleanupRootFolder();
	
	long cleanupDelay() default 0;
	
	long cleanupRate() default 1;
	
	String cleanupUnit() default "DAYS";
	
	long removeOlderThan() default 1;
	
	String removeOlderThanUnit() default "DAYS";
	
}
