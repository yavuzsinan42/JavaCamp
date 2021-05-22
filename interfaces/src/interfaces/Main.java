package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new EmailLogger(),new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers); 
		Customer yavuz = new Customer(1,"Yavuz Sinan","Aydemir");
		customerManager.add(yavuz);

	}

}
