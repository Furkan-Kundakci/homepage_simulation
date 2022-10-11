package kodlamaioHomePageSimulation.dataAccess.concretes.jdbc;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.CourseDao;
import kodlamaioHomePageSimulation.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public List<Course> getAll() {
		System.out.println("Jdbc ile veriler getirildi.");
		return null;
	}

	@Override
	public Course getById(Long courseId) {
		System.out.println("Jdbc ile " + courseId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long courseId, Course course) {
		System.out.println("Jdbc ile " + courseId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long courseId) {
		System.out.println("Jdbc ile " + courseId + ". veri silindi");
	}

}
