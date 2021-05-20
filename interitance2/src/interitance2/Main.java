package interitance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
		customerManager.add(new EmailLogger());
		customerManager.add(new FileLogger());
	}

}
