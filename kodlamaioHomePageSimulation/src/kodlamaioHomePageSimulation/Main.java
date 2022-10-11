package kodlamaioHomePageSimulation;

import kodlamaioHomePageSimulation.business.CategoryManager;
import kodlamaioHomePageSimulation.business.CourseManager;
import kodlamaioHomePageSimulation.business.EducatorManager;
import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;
import kodlamaioHomePageSimulation.core.logging.concretes.DatabaseLogger;
import kodlamaioHomePageSimulation.core.logging.concretes.FileLogger;
import kodlamaioHomePageSimulation.core.logging.concretes.MailLogger;
import kodlamaioHomePageSimulation.dataAccess.concretes.hibernate.HibernateEducatorDao;
import kodlamaioHomePageSimulation.dataAccess.concretes.jdbc.JdbcCategoryDao;
import kodlamaioHomePageSimulation.dataAccess.concretes.jdbc.JdbcCourseDao;
import kodlamaioHomePageSimulation.entities.Category;
import kodlamaioHomePageSimulation.entities.Course;
import kodlamaioHomePageSimulation.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseLogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		
		Educator educator = new Educator(1L,"Furkan","Kundakcı");
		Category category = new Category(1L,"Programlama");
		Course course = new Course(1L,1L,"Java","Java & Spring",10,"image url");
		
		
		educatorManager.add(educator);
		categoryManager.add(category);
		courseManager.add(course);
	}

}
