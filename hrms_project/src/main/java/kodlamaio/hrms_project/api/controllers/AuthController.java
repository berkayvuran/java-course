package kodlamaio.hrms_project.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms_project.business.abstracts.AuthService;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.Candidate;
import kodlamaio.hrms_project.entities.concretes.Employer;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmpolyer(@RequestBody Employer employer, String confirmPassword)
	{
		return authService.registerEmployer(employer, confirmPassword);
	}
	
	@PostMapping("/registerCandidate")
	public Result registerCandidate(@RequestBody Candidate candidate, String confirmPassword)
	{
		return authService.registerCandidate(candidate, confirmPassword);
	}
	
}
