package oopIntro;

public class Product {

	// constructor
	// 1 constructor çalýþmak zorunda, bu yapýda birden fazla constructor varsa yalnýzca 1'i çalýþýr
	public Product() {
		System.out.println("Ben çalýþtým");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
