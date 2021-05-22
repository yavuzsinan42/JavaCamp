import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MerniceServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		
		Customer customer = new Customer(1,"Yavuz Sinan","Aydemir",LocalDate.of(1998, 1, 22),"41111111111");
		
		
		
		customerManager.save(customer);
	}

}
