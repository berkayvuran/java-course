package nLayeredDemo;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {
	// entities hariç hiçbir alan newlenmemeli
	public static void main(String[] args) {
		// ToDo: Spring IoC ile çözülecek
		IProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}
