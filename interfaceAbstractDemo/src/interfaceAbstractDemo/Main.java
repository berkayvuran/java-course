package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager (); 
		
		Customer customer = new Customer();
		
		customer.id=1;
		customer.firstName="Berkay";
		customer.lastName="Vuran";
		customer.dateOfBirth="11 Haziran";
		customer.nationalityId="TCKN";
		
		customerManager.save(customer);

	}
}
