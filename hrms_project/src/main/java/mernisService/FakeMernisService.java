package mernisService;

public class FakeMernisService {
	public boolean ActivateByPersonalInfo(long nationalId, String firstName, String lastName, int yearOfBirth)

	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}
}
