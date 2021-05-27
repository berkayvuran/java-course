package kodlamaio.hrms_project.business.abstracts;

import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.Candidate;
import kodlamaio.hrms_project.entities.concretes.Employer;

public interface AuthService {

	Result registerEmployer (Employer employer, String confirmPassword);
	Result registerCandidate (Candidate candidate, String confirmPassword);
}
