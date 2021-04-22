package intro;
//commit try
public class Main {

	public static void main(String[] args) {

		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "Kültür bakanlýðý Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);

		
		String [] krediler =
			{
					"Hýzlý Kredi",
					"Mutlu emekli kredisi",
					"Konut kredisi",
					"Çiftçi kredisi",
					"Msb kredisi",
					"Meb kredisi",
					"Kültür bakanlýðý kredisi"
			};
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		//deðer tiplerde (stack) deðer atamasý yapýlýr ama baðlantý kalmaz
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//referans tiplerde (heap) ise baðlantý kalýr 
		int [] sayilar1 = {1,2,3,4,5};
		int [] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//metinsel tiplerde arka planda chararray olarak tutulur fakat buna raðmen deðer tip gibi çalýþýr
		String sehir1 = "Ankara";
		String sehir2 ="Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
	}

}