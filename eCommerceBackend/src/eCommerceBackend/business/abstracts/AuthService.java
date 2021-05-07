package eCommerceBackend.business.abstracts;

import eCommerceBackend.entities.concretes.Customer;

public interface AuthService {

		boolean validate(Customer customer);
		boolean login(Customer customer);
}
