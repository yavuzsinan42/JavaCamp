package Abstract;
import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	public void save(Customer customer) {
		System.out.println("Saved to db : "+ customer.getFirstName());
	}
}
 