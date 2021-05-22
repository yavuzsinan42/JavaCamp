package asInterfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	
	public void add() {
		// iþ kodlarý burada yazýlýr
		customerDal.Add();
	}
}
