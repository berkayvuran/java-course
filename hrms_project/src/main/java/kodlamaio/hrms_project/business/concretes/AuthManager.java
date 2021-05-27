package kodlamaio.hrms_project.business.concretes;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.ActivationCodeService;
import kodlamaio.hrms_project.business.abstracts.AuthService;
import kodlamaio.hrms_project.business.abstracts.CandidateService;
import kodlamaio.hrms_project.business.abstracts.EmployerService;
import kodlamaio.hrms_project.business.abstracts.UserService;
import kodlamaio.hrms_project.core.activation.ActivationService;
import kodlamaio.hrms_project.core.utilities.results.ErrorResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.core.utilities.results.SuccessResult;
import kodlamaio.hrms_project.entities.concretes.ActivationCode;
import kodlamaio.hrms_project.entities.concretes.Candidate;
import kodlamaio.hrms_project.entities.concretes.Employer;

@Service
public class AuthManager implements AuthService {

	private UserService userService;
	private EmployerService employerService;
	private CandidateService candidateService;
	private ActivationCodeService activationCodeService;
	private ActivationService activationService;
	private kodlamaio.hrms_project.core.utilities.adapters.ActivationService activationService2;
	
	@Autowired
	public AuthManager(UserService userService, EmployerService employerService, CandidateService candidateService,
			ActivationCodeService activationCodeService, ActivationService activationService,
			kodlamaio.hrms_project.core.utilities.adapters.ActivationService activationService2) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.candidateService = candidateService;
		this.activationCodeService = activationCodeService;
		this.activationService = activationService;
		this.activationService2 = activationService2;
	}

	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {
		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}

		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebSite())) {

			return new ErrorResult("Invalid email address.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + " already exists.");
		}

		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {

			return new ErrorResult("Passwords do not match.");
		}

		employerService.add(employer);
		String code = activationService.sendCode();
		activationCodeRecord(code, employer.getId(), employer.getEmail());
		return new SuccessResult("Registration has been successfully completed");
	}

	private void activationCodeRecord(String code, int id, String email) {
		ActivationCode activationCode = new ActivationCode(id, code, false, LocalDate.now());
		this.activationCodeService.add(activationCode);
		System.out.println("Verification code has been sent to " + email );
	
	}

	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {
		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}

	private boolean checkIfEmailExists(String email) {
		if (this.userService.getUserByEmail(email).getData() == null) {

			return true;
		}

		return false;
	}

	private boolean checkIfNullInfoForEmployer(Employer employer) {
		if (employer.getCompanyName() != null && employer.getWebSite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfEqualEmailAndDomain(String email, String webSite) {
		String[] emailArr = email.split("@", 2);
		String domain = webSite.substring(4, webSite.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}

	@Override
	public Result registerCandidate(Candidate candidate, String confirmPassword) {
		if (checkIfRealPerson(Long.parseLong(candidate.getNationalityId()), candidate.getFirstName(),
				candidate.getLastName(), candidate.getBirthDate().getYear()) == false) {
			return new ErrorResult("TCKN could not be verified.");
		}

		if (!checkIfNullInfoForCandidate(candidate, confirmPassword)) {

			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}

		if (!checkIfExistsTcNo(candidate.getNationalityId())) {

			return new ErrorResult(candidate.getNationalityId() + " already exists.");
		}

		if (!checkIfEmailExists(candidate.getEmail())) {

			return new ErrorResult(candidate.getEmail() + " already exists.");
		}

		
		candidateService.add(candidate);
		String code = activationService.sendCode();
		activationCodeRecord(code, candidate.getId(), candidate.getEmail());
		return new SuccessResult("Registration has been successfully completed");
	}

	private boolean checkIfExistsTcNo(String nationalityId) {
		if (this.candidateService.getCandidateByNationalityId(nationalityId).getData() == null) {
			return true;
		}
		return false;
	}

	private boolean checkIfNullInfoForCandidate(Candidate candidate, String confirmPassword) {
		if (candidate.getFirstName() != null && candidate.getLastName() != null && candidate.getNationalityId() != null
				&& candidate.getBirthDate() != null && candidate.getPassword() != null && candidate.getEmail() != null
				&& confirmPassword != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfRealPerson(long nationalId, String firstName, String lastName, int yearOfBirth) {

		if (activationService2.validateByMernis(nationalId, firstName, lastName, yearOfBirth)) {
			return true;
		}
		return false;
	}

}
