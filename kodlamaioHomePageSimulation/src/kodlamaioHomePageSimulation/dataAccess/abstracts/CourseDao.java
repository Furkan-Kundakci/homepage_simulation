package kodlamaioHomePageSimulation.dataAccess.abstracts;

import java.util.List;

import kodlamaioHomePageSimulation.entities.Course;

public interface CourseDao {

	List<Course> getAll();

	Course getById(Long courseId);

	void add(Course course);

	void update(Long courseId, Course course);

	void delete(Long courseId);

}
