package classes;

public class Main {

	public static void main(String[] args) {
		// classlar reference type'tır.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();

		// value
		// value type'ta heap'e hiçbir şey gitmez. her şey stack te olur.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		// reference type
		// reference type'ta heap'e veri gider, bu yüzden veri tutulmaya devam eder.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}