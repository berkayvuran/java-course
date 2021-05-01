package kodlamaioHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println(user.firstName + " " + user.lastName + " sistemden silindi");
	}
	public void update(User user) {
		System.out.println(user.firstName + " " + user.lastName + " güncellendi");
	}
}
