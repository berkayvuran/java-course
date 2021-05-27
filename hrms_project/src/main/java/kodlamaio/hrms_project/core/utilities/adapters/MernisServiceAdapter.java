package kodlamaio.hrms_project.core.utilities.adapters;

import org.springframework.stereotype.Service;

import mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ActivationService {

	@Override
	public boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth) {
		FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ActivateByPersonalInfo(nationalId, firstName, lastName, yearOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
