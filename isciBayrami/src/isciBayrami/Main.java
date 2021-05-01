package isciBayrami;

public class Main {

	public static void main(String[] args) {
		Human human = new Human();
		HumanManager humanManager = new HumanManager();
		
		human.hopeLevel  = (82*2); //million + 
		human.unscrupulousnessLevel = 128;//billion
		
		if(human.unscrupulousnessLevel < human.hopeLevel) {
			humanManager.spreadThatOpinion();
		}else {
			humanManager.changeTheMindset();
		}
	}
}
