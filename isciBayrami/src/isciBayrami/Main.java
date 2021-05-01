package isciBayrami;

public class Main {

	public static void main(String[] args) {
		Human human = new Human(82*2, 128);
		HumanManager humanManager = new HumanManager();

		if(human.getHopeLevel() > human.getUnscrupulousnessLevel()) {
			humanManager.spreadThatOpinion();
		}else {
			humanManager.changeTheMindset();
		}
	}
}