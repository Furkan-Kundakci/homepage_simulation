package kodlamaioHomePageSimulation.dataAccess.concretes.hibernate;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.CategoryDao;
import kodlamaioHomePageSimulation.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public List<Category> getAll() {
		System.out.println("Hibernate ile veriler getirildi.");
		return null;
	}

	@Override
	public Category getById(Long categeoryId) {
		System.out.println("Hibernate ile " + categeoryId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long categoryId, Category category) {
		System.out.println("Hibernate ile " + categoryId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long categoryId) {
		System.out.println("Hibernate ile " + categoryId + ". veri silindi");
	}

}
