package classesWithAttributes;

public class Product {

	// attribute | field
	int _id;
	String _name;
	String _description;
	double _price;
	int _stockAmount;
	String _renk;
	String _kod;

	// getter ve setter
	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		// this = içinde bulunulan class (buradaki örnekte Product)
		// alt çizgi olanlar field alanlar.
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(int price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		_renk = renk;
	}

	public String getKod() {
		return _name.substring(0,1) + _id;
	}


}
