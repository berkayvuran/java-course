package kodlamaio.hrms_project.business.abstracts;

import java.util.List;

import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
}
