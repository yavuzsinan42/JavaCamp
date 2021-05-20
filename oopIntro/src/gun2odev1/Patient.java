package gun2odev1;
import java.util.Date;

public class Patient {
	String identityNumber; 
	String name;
	String surname;
	Date  dateOfBirth;
	
	public Patient() {
		
	}
	public Patient(String identityNumber, String name, String surname, Date  dateOfBirth) {
		this.identityNumber = identityNumber;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}
	
}
