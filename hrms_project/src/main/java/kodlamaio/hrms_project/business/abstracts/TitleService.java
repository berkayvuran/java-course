package kodlamaio.hrms_project.business.abstracts;

import java.util.List;

import kodlamaio.hrms_project.entities.concretes.Title;

public interface TitleService {
	List<Title> getAll();
	List<Title> findByNameOrderByName ();
}
