package staticDemo;
// araç amacýyla kullanýlanacak yapýlarda static kullanýlabilir
// static methodlar class ismiyle direkt çaðýrýlýr.
// manager sýnýflarý hiçbir zaman static yapýlmaz
public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
	}
	
}
