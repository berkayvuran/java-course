package kodlamaio.hrms_project.business.abstracts;

import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.ActivationCode;

public interface ActivationCodeService {

	Result add(ActivationCode code); 
}
