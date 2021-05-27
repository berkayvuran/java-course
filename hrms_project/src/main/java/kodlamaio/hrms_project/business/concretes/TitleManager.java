package kodlamaio.hrms_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.TitleService;
import kodlamaio.hrms_project.dataAccess.abstracts.TitleDao;
import kodlamaio.hrms_project.entities.concretes.Title;

@Service
public class TitleManager implements TitleService {

	private TitleDao titleDao;

	@Autowired
	public TitleManager(TitleDao titleDao) {
		super();
		this.titleDao = titleDao;
	}

	@Override
	public List<Title> getAll() {

		return this.titleDao.findAll();
	}

	@Override
	public List<Title> findByNameOrderByName() {
		
		return this.titleDao.findAll();
	}


}