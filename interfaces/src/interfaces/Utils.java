package interfaces;

public class Utils {
		public static void runLoggers(Logger[] loggers, Customer customer) {
			for(Logger logger:loggers) {
				logger.log(customer.getFirstName());
			}
		}
}
