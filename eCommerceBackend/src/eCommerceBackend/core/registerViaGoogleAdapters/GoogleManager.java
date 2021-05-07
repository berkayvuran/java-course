package eCommerceBackend.core.registerViaGoogleAdapters;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.core.utilities.BusinessRules;
import eCommerceBackend.entities.concretes.Customer;
import eCommerceBackend.signUpViaGoogle.RegisterViaGoogle;

public class GoogleManager implements AuthService {

	RegisterViaGoogle registerViaGoogle = new RegisterViaGoogle();

	@Override
	public boolean validate(Customer customer) {
		boolean result = false;

		result = registerViaGoogle.register(customer.getId(), customer.getFirstName(), customer.getLastName(),
				customer.getEmail(), customer.getPassword());
		if (result != true) {
			return false;
		}
		System.out.println("Google ile kayýt baþarýlý bir þekilde gerçekleþti.");
		return true;
	}

	@Override
	public boolean login(Customer customer) {
		boolean result = BusinessRules.run(isFirstandLastNameEmpty(customer));
		return result;
	}

	private boolean isFirstandLastNameEmpty(Customer customer) {
		if (customer.getEmail() == null || customer.getPassword() == null) {
			System.out.println("Kullanýcý adý veya parola eksik.");
			return false;
		}
		System.out.println("Sisteme baþarýyla giriþ yapýldý.");
		return true;
	}

}
