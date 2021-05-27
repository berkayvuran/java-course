package kodlamaio.hrms_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.EmployeeService;
import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms_project.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms_project.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public DataResult<List<Employee>> getAll() {
	
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}


	

}
