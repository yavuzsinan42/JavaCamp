package kodlamaProject;

public class StudentManager extends UserManager {

	public void addUser(Student user){
		System.out.println("Öðrenci "+user.firstName+" "+user.lastName+" Eklendi.");
		System.out.println("Öðrenci No: "+user.studentNumber);
	}
	public void registerLesson(Student user){
		System.out.println("Öðrenci "+user.firstName+" "+user.lastName+" Ders Eklendi.");
		user.numberOfLesson++;
		System.out.println("Ders Sayýsý: "+user.numberOfLesson);
	}
}
