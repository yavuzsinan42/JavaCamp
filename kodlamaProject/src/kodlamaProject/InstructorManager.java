package kodlamaProject;

public class InstructorManager extends UserManager{
	public void addUser(Instructor user){
		System.out.println("Kullan�c� "+user.firstName+" "+user.lastName+" Eklendi.");
		System.out.println(user.certificate);
	}
	public void addLesson(Instructor user){
		System.out.println("E�itmen "+user.firstName+" "+user.lastName+" "+ user.lesson+"  Dersi Eklendi.");
		System.out.println("E�itmen: "+user.certificate);
	}

}
