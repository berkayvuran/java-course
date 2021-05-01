package interfaces;

//customermanager loglamaya baðýmlý
public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	// loosly - tightly coupled
	// tightly coupled ama bunu loosly coupled hale getirmemiz gerekiyor.
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getLastName());
		
	}
}
