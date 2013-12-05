package example.console;

import java.util.List;

import example.api.Agenda;
import example.api.Conference;

public class Console {
	private volatile Agenda agenda;
	
	public void lc() {
		List<Conference> listConferences = agenda.listConferences();
		for (Conference conference : listConferences) {
			System.out.println(conference);
		}
	}
	
	public void ac(String name) {
		agenda.addConference(new Conference(name));
	}
}
