package de.avatar.connectors.demo.workmode.annotations;

import org.osgi.annotation.bundle.Requirement;

import de.avatar.connectors.demo.workmode.WorkmodeConstants;

@Requirement(namespace = WorkmodeConstants.CAPABILITY_WORKMODE, name = WorkmodeConstants.CAPABILITY_WORKMODE_NAME)
public @interface RequireWorkmode {

}
