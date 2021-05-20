package gun2odev1;

public class AppointmentManager {
	String doctor = getStatus("Dr.Mehmet Oz");
	public boolean makeAnAppointment(Patient patient) {
		if(doctor=="Available") {
			System.out.println("Randevu Alýndý");
			return true;
		}
		else {
			System.out.println("Randevu Alýnamadý");
			return false;
		}
		}
	}
}
