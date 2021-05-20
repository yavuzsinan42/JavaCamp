package inheritance;

public class CustomerManager {
	
	/* Hatal� Kullan�m Gereksiz Kod Tekrar�
	public void add(IndividualCustomer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	
public void add(CorporateCustomer customer) {
	System.out.println(customer.customerNumber +" kaydedildi.");
	}
	*/
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}


