package kodlamaio.hrms_project.business.abstracts;

import java.util.List;

import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.Title;

public interface TitleService {
	DataResult<List<Title>> getAll();
	Result add(Title title);
	
}
