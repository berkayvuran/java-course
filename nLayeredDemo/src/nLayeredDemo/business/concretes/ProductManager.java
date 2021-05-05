package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements IProductService {

	private IProductDao productDao;
	private ILoggerService loggerService;
	
	public ProductManager(IProductDao productDao, ILoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
