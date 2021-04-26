package oopHomework;

public class Main {

	public static void main(String[] args) {
		// özellik nesnesi 1: Üst menü
		// özellik nesnesi 2: Eðitimler alaný
		// iþ sýnýfý: Menü düzenleme alaný

		// özellik nesnesi 1 için:

		JavaCampProperty javaCampProperty1 = new JavaCampProperty(1, "C# + ANGULAR", "2 ay sürecek...", "Engin Demiroð",
				0);
		JavaCampProperty javaCampProperty2 = new JavaCampProperty(2, "JAVA + REACT", "2 ay sürecek...", "Engin Demiroð",
				0);
		JavaCampProperty javaCampProperty3 = new JavaCampProperty(3, "Temel Kurs", "PYTHON, JAVA...", "Engin Demiroð",
				0);

		JavaCampProperty[] javaCampProperties = { javaCampProperty1, javaCampProperty2, javaCampProperty3 };

		for (JavaCampProperty javaCampProperty : javaCampProperties) {
			System.out.println(javaCampProperty.name + " isimli eðitim, " + javaCampProperty.creator
					+ " tarafýndan hazýrlanmýþtýr.");
		}

		System.out.println("------------------");
		
		// özellik nesnesi 2 için:

		Menu menu1 = new Menu(1, "Kampa Hazýrlýk");
		Menu menu2 = new Menu(2, "Sýk Sorulan Sorular");
		Menu menu3 = new Menu(3, "Giriþ Yap");
		Menu menu4 = new Menu(4, "Kayýt Ol");

		Menu[] menus = { menu1, menu2, menu3, menu4 };

		for (Menu menu : menus) {
			System.out.println("Burada bir menü bileþeni olarak " + menu.name + " yer almaktadýr.");
		}

		System.out.println("------------------");
		
		// iþ sýnýfý için:
		
		MenuManager menuManager = new MenuManager();
		menuManager.changeVisibility(menu1);
		menuManager.changePriorty(menu2);

	}

}
