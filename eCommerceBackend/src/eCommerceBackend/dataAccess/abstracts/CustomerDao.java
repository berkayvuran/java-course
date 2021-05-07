package eCommerceBackend.dataAccess.abstracts;

import java.util.List;

import eCommerceBackend.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getCustomer (int id);
	Customer getCustomerByEmail (String email);
	List<Customer> getAll();
}