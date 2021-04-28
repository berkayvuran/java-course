package inheritance2;

public class CustomerManager {
	public void add() {
		// müþteri ekleme kodlarý
		// bir iþ yapan sýnýf, baþka bir iþ yapan sýnýfý kullanacaksa, asla somut
		// sýnýftan gidilmez. bunlar asla new'lenmemeli.
		System.out.println("Müþteri eklendi.");
		DatabaseLogger logger = new DatabaseLogger(); //bu kullaným yanlýþ
		logger.log();
	}
		public void add2(Logger logger) {
			// müþteri ekleme kodlarý
			System.out.println("Müþteri eklendi.");
			logger.log();
		}
}
