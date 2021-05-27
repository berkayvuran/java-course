package kodlamaio.hrms_project.business.abstracts;

import java.util.List;

import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.entities.concretes.Employee;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();

}
