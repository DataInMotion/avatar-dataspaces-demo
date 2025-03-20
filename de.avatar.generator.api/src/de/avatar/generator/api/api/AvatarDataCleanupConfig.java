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
package de.avatar.generator.api.api;

/**
 * 
 * @author ilenia
 * @since Mar 20, 2025
 */
public @interface AvatarDataCleanupConfig {
	
	long responseCleanupDelay() default 0;
	
	long responseCleanupRate() default 1;
	
	String responseCleanupUnit() default "DAYS";
	
	long removeResponsesOlderThan() default 1;
	
	String removeResponsesOlderThanUnit() default "DAYS";
	
	
	long publicLinkCleanupDelay() default 0;
	
	long publicLinkCleanupRate() default 1;
	
	String publicLinkCleanupUnit() default "DAYS";
	
    long removePublicLinksOlderThan() default 1;
	
	String removePublicLinksOlderThanUnit() default "DAYS";

}
