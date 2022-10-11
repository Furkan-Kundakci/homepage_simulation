package kodlamaioHomePageSimulation.entities;

public class Educator {
	
	private Long educatorId;
	private String firstName;
	private String lastName;

	public Educator(Long educatorId, String firstName, String lastName) {
		super();
		this.educatorId = educatorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Educator() {
		super();
	}

	public Long getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(Long educatorId) {
		this.educatorId = educatorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
