package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);

	}

	// void operasyon: emir operasyonu.
	// void operasyonlar� bir fonksiyona atanamaz.

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void guncelle() {
		System.out.println("G�ncellendi");

	}

	public static int topla (int sayi1, int sayi2) {
		return sayi1+sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
