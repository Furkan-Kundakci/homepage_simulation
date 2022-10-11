package kodlamaioHomePageSimulation.dataAccess.concretes.jdbc;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.EducatorDao;
import kodlamaioHomePageSimulation.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {

	@Override
	public List<Educator> getAll() {
		System.out.println("Jdbc ile veriler getirildi.");
		return null;
	}

	@Override
	public Educator getById(Long educatorId) {
		System.out.println("Jdbc ile " + educatorId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Educator educator) {
		System.out.println("Jdbc ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long educatorId, Educator educator) {
		System.out.println("Jdbc ile " + educatorId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long educatorId) {
		System.out.println("Jdbc ile " + educatorId + ". veri silindi");
	}

}
