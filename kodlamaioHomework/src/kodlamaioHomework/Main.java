package kodlamaioHomework;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setFirstName("Berkay");
		student1.setLastName("Vuran");
		student1.setEmail("berkaypsy@gmail.com");
		student1.setPhoneNumber("+9055555555");
		student1.setNumberOfTrainingsIncluded(5);
			
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemirog@....com");
		instructor1.setPhoneNumber("+9055555555");
		instructor1.setNumberOfTrainingsGiven(3);
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.add(student1);
		userManager.add(instructor1);
		studentManager.givenIncludedNumber(student1);
		instructorManager.givenTrainingsNumber(instructor1);

	}

}
