package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setName("Laptop");

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		productManager.add2(1, "", "", 2, 200, "");
		
		System.out.println(product.getKod());
	}

}
