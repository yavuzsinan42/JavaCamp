package interfaces;

public class CustomerManager {
	private Logger[] loggers;
public CustomerManager(Logger... loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("M��teri eklendi : "+customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer);
		/*
		for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+"veri taban�na logland�");*/
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : "+customer.getFirstName());
		Utils.runLoggers(loggers, customer);
		/*
		for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}
		*/
		//logger.log(customer.getFirstName()+"veri taban�na logland�");
	}
}
