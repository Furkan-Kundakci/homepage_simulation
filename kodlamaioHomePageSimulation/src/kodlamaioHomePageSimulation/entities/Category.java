package kodlamaioHomePageSimulation.entities;

public class Category {

	private Long categoryId;
	private String name;

	public Category(Long categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public Category() {
		super();
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long id) {
		this.categoryId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
