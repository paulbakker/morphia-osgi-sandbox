package example.morphia;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

import example.api.Agenda;

public class Activator extends DependencyActivatorBase {

	@Override
	public void destroy(BundleContext arg0, DependencyManager arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(BundleContext arg0, DependencyManager dm)
			throws Exception {
		
		dm.add(createComponent()
				.setInterface(Agenda.class.getName(), null)
				.setImplementation(MorphiaAgenda.class));
		
	}

}
