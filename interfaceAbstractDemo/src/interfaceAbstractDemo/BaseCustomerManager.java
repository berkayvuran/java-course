package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements ICustomer {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB  : " + customer.firstName);
		
	}

}
