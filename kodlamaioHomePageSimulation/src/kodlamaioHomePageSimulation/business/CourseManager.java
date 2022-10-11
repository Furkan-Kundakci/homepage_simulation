package kodlamaioHomePageSimulation.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;
import kodlamaioHomePageSimulation.dataAccess.abstracts.CourseDao;
import kodlamaioHomePageSimulation.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private BaseLogger[] loggers;
	List<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void logger(BaseLogger[] loggers) {
		for (BaseLogger logger : loggers) {
			logger.log(logger + "Loglandı.");
		}
	}

	public List<Course> getAll() {
		logger(loggers);
		return courseDao.getAll();
	}

	public Course getById(Long courseId) {
		logger(loggers);
		return courseDao.getById(courseId);
	}

	public void add(Course course) throws Exception {
		for (Course courseBrowsing : courses) {
			if (courseBrowsing.getName().equals(course.getName())) {
				throw new Exception("Mevcut kurs girişi.");
			}
		}

		if (course.getPrice() > 0) {
			courseDao.add(course);
		}
		logger(loggers);
	}

	public void update(Long courseId, Course course) {
		for (Course courseBrowsing : courses) {
			if (courseBrowsing.getCourseId() == courseId) {
				courseDao.add(course);
			}
		}
		logger(loggers);
	}

	public void delete(Long courseId) {
		courseDao.delete(courseId);
		logger(loggers);
	}
}
