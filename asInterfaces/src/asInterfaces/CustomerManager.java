package asInterfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	
	public void add() {
		// i� kodlar� burada yaz�l�r
		customerDal.Add();
	}
}
