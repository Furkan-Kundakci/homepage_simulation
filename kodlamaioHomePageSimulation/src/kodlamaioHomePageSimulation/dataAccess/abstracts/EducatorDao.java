package kodlamaioHomePageSimulation.dataAccess.abstracts;

import java.util.List;

import kodlamaioHomePageSimulation.entities.Educator;

public interface EducatorDao {

	List<Educator> getAll();

	Educator getById(Long educatorId);

	void add(Educator educator);

	void update(Long educatorId, Educator educator);

	void delete(Long educatorId);

}
