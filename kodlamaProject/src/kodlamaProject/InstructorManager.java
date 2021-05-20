package kodlamaProject;

public class InstructorManager extends UserManager{
	public void addUser(Instructor user){
		System.out.println("Kullanýcý "+user.firstName+" "+user.lastName+" Eklendi.");
		System.out.println(user.certificate);
	}
	public void addLesson(Instructor user){
		System.out.println("Eðitmen "+user.firstName+" "+user.lastName+" "+ user.lesson+"  Dersi Eklendi.");
		System.out.println("Eðitmen: "+user.certificate);
	}

}
