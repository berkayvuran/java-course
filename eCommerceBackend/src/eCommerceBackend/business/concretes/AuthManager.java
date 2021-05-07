package eCommerceBackend.business.concretes;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.core.utilities.BusinessRules;
import eCommerceBackend.entities.concretes.Customer;
import java.util.regex.Pattern;


public class AuthManager implements AuthService {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean validate(Customer customer) {
		boolean result = BusinessRules.run(ifPasswordCheckLength(customer),
				ifFirstNameCheckLength(customer),
				ifLastNameCheckLength(customer),
				ifEmailFormatCheckValid(customer));
		return result;
	}
	
	private boolean ifPasswordCheckLength (Customer customer) {
		if (customer.getPassword().length()<6) {
			System.out.println("Parolanýz en az 6 karakter olmalýdýr.");
			return false;
		}
		return true;
	}
	
	private boolean ifFirstNameCheckLength (Customer customer) {
		if (customer.getFirstName().length()<2) {
			System.out.println("Ýsminiz en az 2 karakter olmalýdýr.");
			return false;
		}
		return true;
	}
	
	private boolean ifLastNameCheckLength (Customer customer) {
		if (customer.getLastName().length()<2) {
			System.out.println("Soy isminiz en az 2 karakter olmalýdýr.");
			return false;
		}
		return true;
	}
	
	private boolean ifEmailFormatCheckValid (Customer email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email.getEmail()).find();
	}


	@Override
	public boolean login(Customer customer) {
		boolean result = BusinessRules.run(isFirstandLastNameEmpty(customer));
		return result;
	}
	
	private boolean isFirstandLastNameEmpty (Customer customer) {
		if(customer.getEmail()==null || customer.getPassword()==null) {
			System.out.println("Kullanýcý adý veya parola eksik.");
			return false;
		}
		System.out.println("Sisteme baþarýyla giriþ yapýldý.");
		return true;
	}

}
