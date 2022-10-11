package kodlamaioHomePageSimulation.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioHomePageSimulation.core.logging.abstracts.BaseLogger;
import kodlamaioHomePageSimulation.dataAccess.abstracts.CategoryDao;
import kodlamaioHomePageSimulation.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	List<Category> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void logger(BaseLogger[] loggers) {
		for (BaseLogger logger : loggers) {
			logger.log(logger + "Loglandı.");
		}
	}

	public List<Category> getAll() {
		logger(loggers);
		return categoryDao.getAll();
	}

	public Category getById(Long categoryId) {
		logger(loggers);
		return categoryDao.getById(categoryId);
	}

	public void add(Category category) throws Exception {
		for (Category categoryBrowsing : categories) {
			if (categoryBrowsing.getName().equals(category.getName())) {
				throw new Exception("Mevcut Kategori.");
			}
		}
		categoryDao.add(category);
		logger(loggers);
	}

	public void update(Long categoryId, Category category) {
		for (Category categoryBrowsing : categories) {
			if (categoryBrowsing.getCategoryId() == categoryId) {
				categoryDao.add(category);
			}
		}
		logger(loggers);
	}

	public void delete(Long categoryId) {
		List<Category> categories = categoryDao.getAll();

		for (Category categoryBrowsing : categories) {
			if (categoryBrowsing.getCategoryId().equals(categoryId)) {
				categoryDao.delete(categoryId);
			}
		}
		logger(loggers);
	}
}
