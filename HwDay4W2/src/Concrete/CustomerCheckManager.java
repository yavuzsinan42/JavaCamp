package Concrete;
import Abstract.ICustomerCheckService;
import Entities.Customer;

//Test için kullanýlacak olan doðrulama sýnýfý
public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
