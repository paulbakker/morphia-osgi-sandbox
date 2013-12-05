package example.morphia;

import java.net.UnknownHostException;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import example.api.Agenda;
import example.api.Conference;

public class MorphiaAgenda implements Agenda {
	private volatile Datastore ds;
	
	public void start() throws UnknownHostException {
		ds = new Morphia().createDatastore("morphia");
		ds.save(new Conference("NgConf"));
	}

	@Override
	public List<Conference> listConferences() {
		return ds.find(Conference.class).asList();
	}

	@Override
	public void addConference(Conference conference) {

		ds.save(conference);
	}
}
