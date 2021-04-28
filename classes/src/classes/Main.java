package classes;

public class Main {

	public static void main(String[] args) {
		//classlar reference type'tır.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	}

}