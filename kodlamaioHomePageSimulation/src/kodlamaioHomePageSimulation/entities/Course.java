package kodlamaioHomePageSimulation.entities;

public class Course {
	
	private Long courseId;
	private Long educatorId;
	private String name;
	private String description;
	private int price;
	private String imagePath;

	public Course(Long courseId, Long educatorId, String name, String description, int price, String imagePath) {
		super();
		this.courseId = courseId;
		this.educatorId = educatorId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imagePath = imagePath;
	}

	public Course() {
		super();
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(Long educatorId) {
		this.educatorId = educatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
