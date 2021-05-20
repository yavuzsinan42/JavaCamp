package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer yavuz = new IndividualCustomer();
		yavuz.customerNumber ="1453";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "1212";
				
		SendikaCustomer soforler = new SendikaCustomer();
		soforler.customerNumber="42";
		CustomerManager customerManager = new CustomerManager();
		
		//customerManager.add(hepsiBurada);
		//customerManager.add(yavuz);
		//customerManager.add(soforler);	
		
		Customer[] customers = {yavuz, soforler, hepsiBurada};
		customerManager.addMultiple(customers);
	}

}
