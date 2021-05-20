package kodlamaProject;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentNumber="213";
		student.firstName= "Yavuz";
		student.lastName= "Sinan";
		student.numberOfLesson=0;
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.addUser(student);
		studentManager.registerLesson(student);
		studentManager.registerLesson(student);
		studentManager.registerLesson(student);
		
		Instructor instructor = new Instructor();
		instructor.certificate="Java";
		instructor.firstName="Engin";
		instructor.lastName="Demirog";
		instructor.lesson="Kodlama";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addLesson(instructor);
				
	}

}
