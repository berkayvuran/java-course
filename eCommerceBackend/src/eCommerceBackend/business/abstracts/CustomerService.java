package eCommerceBackend.business.abstracts;

import java.util.List;
import eCommerceBackend.entities.concretes.Customer;

public interface CustomerService {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer getCustomer(int id);
	List<Customer> getAll();
	void customerVerify(Customer customer, int verificationCode);
}
