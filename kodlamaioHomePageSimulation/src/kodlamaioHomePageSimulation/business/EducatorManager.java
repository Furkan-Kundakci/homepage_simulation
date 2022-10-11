package kodlamaioHomePageSimulation.business;

import java.util.List;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;
import kodlamaioHomePageSimulation.dataAccess.abstracts.EducatorDao;
import kodlamaioHomePageSimulation.entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
	private BaseLogger[] loggers;

	public EducatorManager(EducatorDao educatorDao, BaseLogger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	public void logger(BaseLogger[] loggers) {
		for (BaseLogger logger : loggers) {
			logger.log(logger + "Loglandı.");
		}
	}

	public List<Educator> getAll() {
		logger(loggers);
		return educatorDao.getAll();
	}

	public Educator getById(Long educatorId) {
		logger(loggers);
		return educatorDao.getById(educatorId);
	}

	public void add(Educator educator) {
		educatorDao.add(educator);
		logger(loggers);
	}

	public void update(Long educatorId, Educator educator) {
		List<Educator> educators = educatorDao.getAll();

		for (Educator educatorBrowsing : educators) {
			if (educatorBrowsing.getEducatorId() == educatorId) {
				educatorDao.add(educator);
				;
			}
		}
		logger(loggers);
	}

	public void delete(Long educatorId) {
		List<Educator> educators = educatorDao.getAll();

		for (Educator educatorBrowsing : educators) {
			if (educatorBrowsing.getEducatorId() == educatorId) {
				educatorDao.delete(educatorId);
			}
		}
		logger(loggers);
	}

}
