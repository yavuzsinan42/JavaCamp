package gun2odev1;

public class AppointmentManager {
	String doctor = getStatus("Dr.Mehmet Oz");
	public boolean makeAnAppointment(Patient patient) {
		if(doctor=="Available") {
			System.out.println("Randevu Al�nd�");
			return true;
		}
		else {
			System.out.println("Randevu Al�namad�");
			return false;
		}
		}
	}
}
