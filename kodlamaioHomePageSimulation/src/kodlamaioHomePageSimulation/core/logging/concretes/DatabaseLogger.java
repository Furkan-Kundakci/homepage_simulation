package kodlamaioHomePageSimulation.core.logging.concretes;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;

public class DatabaseLogger implements BaseLogger {

	@Override
	public void log(String message) {
		System.out.println("Database'e loglandı.");
	}

}
