package kodlamaProject;

public class UserManager {
	public void addUser(User user){
		System.out.println("Kullanýcý "+user.firstName+" "+user.lastName+" Eklendi.");
	}
	
	public void addUser( User[] users) {
		for(User user: users) {
			addUser(user);
		}
	}
	
}
