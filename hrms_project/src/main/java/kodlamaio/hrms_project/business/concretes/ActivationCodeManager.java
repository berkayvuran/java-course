package kodlamaio.hrms_project.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.ActivationCodeService;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.core.utilities.results.SuccessResult;
import kodlamaio.hrms_project.dataAccess.abstracts.ActivationCodeDao;
import kodlamaio.hrms_project.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager implements ActivationCodeService {

	private ActivationCodeDao activationCodeDao;
	
	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		super();
		this.activationCodeDao = activationCodeDao;
	}

	@Override
	public Result add(ActivationCode code) {
		this.activationCodeDao.save(code);
		return new SuccessResult("Code has been saved.");
	}

}
