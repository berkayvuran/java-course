package kodlamaio.hrms_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.UserService;
import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms_project.core.utilities.results.SuccessResult;
import kodlamaio.hrms_project.dataAccess.abstracts.UserDao;
import kodlamaio.hrms_project.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	//@Override
	//public Result add(User user) {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User has been added");
	}

}
