package persons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Doctor extends Person {
	private String specialization;
	private ArrayList<Patient> patients;
	public Doctor(String name, int age, String mobileNumber, String specialization, Genders gender) {
		super(name, age, mobileNumber, gender);
		//TODO validate specializations
		this.specialization = specialization;
		this.patients = new ArrayList<>();
	}

	public ArrayList<Patient> getPatients() {
		return (ArrayList<Patient>) Collections.unmodifiableList(this.patients);
	}
}
