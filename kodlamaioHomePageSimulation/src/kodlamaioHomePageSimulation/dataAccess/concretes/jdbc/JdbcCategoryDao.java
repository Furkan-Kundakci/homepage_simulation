package kodlamaioHomePageSimulation.dataAccess.concretes.jdbc;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.CategoryDao;
import kodlamaioHomePageSimulation.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public List<Category> getAll() {
		System.out.println("Jdbc ile veriler getirildi.");
		return null;
	}

	@Override
	public Category getById(Long categeoryId) {
		System.out.println("Jdbc ile " + categeoryId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long categoryId, Category category) {
		System.out.println("Jdbc ile " + categoryId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long categoryId) {
		System.out.println("Jdbc ile " + categoryId + ". veri silindi");
	}

}
