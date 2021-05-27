package kodlamaio.hrms_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.TitleService;
import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms_project.core.utilities.results.SuccessResult;
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
	public DataResult<List<Title>> getAll() {

		return new SuccessDataResult<List<Title>>
		(this.titleDao.findAll(), "Data Listelendi");
				
	}

	@Override
	public Result add(Title title) {
		this.titleDao.save(title);
		return new SuccessResult("Ünvan eklendi");
	}

}