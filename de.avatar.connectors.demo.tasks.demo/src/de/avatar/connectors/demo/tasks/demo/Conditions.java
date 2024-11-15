package de.avatar.connectors.demo.tasks.demo;

import org.osgi.service.condition.Condition;

import de.avatar.connectors.demo.tasks.TaskConstants;
import de.avatar.connectors.demo.workmode.WorkmodeConstants;

public interface Conditions {
	
	public static final String CONDITION_UI = "(&(" + Condition.CONDITION_ID + "=" + TaskConstants.CONDITION_TASK + ")"
					+ "(" + TaskConstants.ACTIVE_TASKS + "=externalTwoAuth))";
	
	public static final String TARGET_ONLINE = "(&(" + Condition.CONDITION_ID + "=" + WorkmodeConstants.CONDITION_WORKMODE + ")"
					+ "(" + WorkmodeConstants.CONDITION_WORKMODE + "=ONLINE))";

}
