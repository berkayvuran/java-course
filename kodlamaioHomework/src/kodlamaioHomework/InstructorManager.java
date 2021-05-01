package kodlamaioHomework;

public class InstructorManager extends UserManager {
	public void givenTrainingsNumber (Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli eðitmenin verdiði eðitim sayýsý = " + instructor.numberOfTrainingsGiven);
	}
}