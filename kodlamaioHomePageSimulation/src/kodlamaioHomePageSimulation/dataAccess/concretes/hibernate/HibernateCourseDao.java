package kodlamaioHomePageSimulation.dataAccess.concretes.hibernate;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.CourseDao;
import kodlamaioHomePageSimulation.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public List<Course> getAll() {
		System.out.println("Hibernate ile veriler getirildi.");
		return null;
	}

	@Override
	public Course getById(Long courseId) {
		System.out.println("Hibernate ile " + courseId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long courseId, Course course) {
		System.out.println("Hibernate ile " + courseId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long courseId) {
		System.out.println("Hibernate ile " + courseId + ". veri silindi");
	}

}
