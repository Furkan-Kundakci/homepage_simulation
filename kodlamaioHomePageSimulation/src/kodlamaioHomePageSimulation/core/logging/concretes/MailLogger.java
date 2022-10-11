package kodlamaioHomePageSimulation.core.logging.concretes;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;

public class MailLogger implements BaseLogger {
	
	@Override
	public void log(String message) {
		System.out.println("Mail'e loglandı.");
	}
	
}
