package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TitleService;
import kodlamaio.hrms.dataAccess.abstracts.TitleDao;
import kodlamaio.hrms.entities.concretes.Title;

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

}