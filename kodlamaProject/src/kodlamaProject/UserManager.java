package kodlamaProject;

public class UserManager {
	public void addUser(User user){
		System.out.println("Kullan�c� "+user.firstName+" "+user.lastName+" Eklendi.");
	}
	
	public void addUser( User[] users) {
		for(User user: users) {
			addUser(user);
		}
	}
	
}
