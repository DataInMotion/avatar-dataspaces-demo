package de.avatar.connectors.demo.tasks.demo;

import org.osgi.service.component.annotations.Component;

import de.avatar.connectors.demo.tasks.AbstractTask;
import de.avatar.connectors.demo.tasks.Task;
import de.avatar.connectors.demo.tasks.annotations.RequireTasks;
import de.avatar.connectors.demo.workmode.annotations.RequireWorkmode;

@RequireTasks
@RequireWorkmode
@Component(service = Task.class)
public class ExampleInitializationTask extends AbstractTask {

	@Override
	public String getName() {
		return "EXTERNAL 1 - INITIALIZATION TASK";
	}
	
	@Override
	public String getId() {
		return "externalTest";
	}
	
	@Override
	protected void doActivate() {
		System.out.println("Started activation EXTERNAL 1 ...");
		try {
			Thread.sleep(8000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished initialization EXTERNAL 1");
	}

	@Override
	protected void doDeactivate() {
		System.out.println("Started deactivation EXTERNAL 1 ...");
		try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished deactivation EXTERNAL 1");
	}
}
