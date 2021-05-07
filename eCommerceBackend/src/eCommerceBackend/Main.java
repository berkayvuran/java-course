package eCommerceBackend;

import java.util.Scanner;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.business.abstracts.CustomerService;
import eCommerceBackend.business.concretes.AuthManager;
import eCommerceBackend.business.concretes.CustomerManager;
import eCommerceBackend.business.concretes.EmailManager;
import eCommerceBackend.core.registerViaGoogleAdapters.GoogleManager;
import eCommerceBackend.dataAccess.concretes.HibernateCustomerDao;
import eCommerceBackend.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		AuthService googleManager = new GoogleManager();
		
		Customer customer1 = new Customer(1, "Berkay", "Vuran", "berkay@gmail.com", "123456");
		Customer customer2 = new Customer(2, "Engin", "Demiroð", "engindemirogmail", "123");
		
		CustomerService customerService=new CustomerManager(new HibernateCustomerDao(),new AuthManager(),new EmailManager());
		customerService.getAll();
		
		customerService.add(customer1);
		
		int verificationCode=scan.nextInt();
		customerService.customerVerify(customer1, verificationCode);
		
	}

}