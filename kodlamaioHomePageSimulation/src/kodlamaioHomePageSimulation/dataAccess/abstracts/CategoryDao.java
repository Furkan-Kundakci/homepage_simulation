package kodlamaioHomePageSimulation.dataAccess.abstracts;

import java.util.List;

import kodlamaioHomePageSimulation.entities.Category;

public interface CategoryDao {

	List<Category> getAll();

	Category getById(Long categeoryId);

	void add(Category category);

	void update(Long categoryId, Category category);

	void delete(Long categoryId);

}
