package kodlamaioHomework;

public class StudentManager extends UserManager {
	public void givenIncludedNumber (Student student) {
		System.out.println(student.firstName + " " + student.lastName + " isimli öðrencinin dahil olduðu eðitim sayýsý = " + student.numberOfTrainingsIncluded);
	}
}