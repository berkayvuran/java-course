package kodlamaio.hrms_project.core.activation;

public interface ActivationService {
	void sendLink(String email);
	String sendCode();
}
