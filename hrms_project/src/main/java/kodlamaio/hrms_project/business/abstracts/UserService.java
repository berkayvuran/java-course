package kodlamaio.hrms_project.business.abstracts;

import java.util.List;

import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail (String email);
	
}
