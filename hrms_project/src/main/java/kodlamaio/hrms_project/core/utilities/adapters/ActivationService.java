package kodlamaio.hrms_project.core.utilities.adapters;

public interface ActivationService {
	boolean validateByMernis(long nationalityId, String firstName, String lastName, int yearOfBirth);

}
