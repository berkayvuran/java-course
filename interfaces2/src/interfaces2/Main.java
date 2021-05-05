package interfaces2;

public class Main {

	public static void main(String[] args) {
		// bir class birden fazla interface i implement edebiliyor, 1 class'ý extend edebilir
		// 3 temel katman var, arayüz, iþ, veri eriþim katmanlarý. katmanlar arasý geçiþler genellikle baðýmlýlýklarý önlemek için interface ile yapýlýr.
		
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();

	}

}
