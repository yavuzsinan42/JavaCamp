package kodlamaProject;

public class StudentManager extends UserManager {

	public void addUser(Student user){
		System.out.println("��renci "+user.firstName+" "+user.lastName+" Eklendi.");
		System.out.println("��renci No: "+user.studentNumber);
	}
	public void registerLesson(Student user){
		System.out.println("��renci "+user.firstName+" "+user.lastName+" Ders Eklendi.");
		user.numberOfLesson++;
		System.out.println("Ders Say�s�: "+user.numberOfLesson);
	}
}
