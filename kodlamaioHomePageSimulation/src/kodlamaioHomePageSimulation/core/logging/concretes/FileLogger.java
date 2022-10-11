package kodlamaioHomePageSimulation.core.logging.concretes;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;

public class FileLogger implements BaseLogger {
	
	@Override
	public void log(String message) {
		System.out.println("Fila'a loglandı.");
	}
	
}
