package Concrete;
import Abstract.ICustomerCheckService;
import Entities.Customer;

//Test i�in kullan�lacak olan do�rulama s�n�f�
public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
