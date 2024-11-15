package de.avatar.connectors.demo.tasks.annotations;

import org.osgi.annotation.bundle.Requirement;

import de.avatar.connectors.demo.tasks.TaskConstants;

@Requirement(namespace = TaskConstants.CAPABILITY_TASK, name = TaskConstants.CAPABILITY_TASK_NAME)
public @interface RequireTasks {

}
