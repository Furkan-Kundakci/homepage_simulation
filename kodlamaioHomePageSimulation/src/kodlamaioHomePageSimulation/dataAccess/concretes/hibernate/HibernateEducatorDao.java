package kodlamaioHomePageSimulation.dataAccess.concretes.hibernate;

import java.util.List;

import kodlamaioHomePageSimulation.dataAccess.abstracts.EducatorDao;
import kodlamaioHomePageSimulation.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public List<Educator> getAll() {
		System.out.println("Hibernate ile veriler getirildi.");
		return null;
	}

	@Override
	public Educator getById(Long educatorId) {
		System.out.println("Hibernate ile " + educatorId + ". veri getirildi.");
		return null;
	}

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile ekleme işlemi başarılı.");
	}

	@Override
	public void update(Long educatorId, Educator educator) {
		System.out.println("Hibernate ile " + educatorId + ". veri güncellendi.");
	}

	@Override
	public void delete(Long educatorId) {
		System.out.println("Hibernate ile " + educatorId + ". veri silindi");
	}

}
