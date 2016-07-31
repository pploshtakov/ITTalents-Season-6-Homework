package treatment;

import java.util.ArrayList;

import persons.Doctor;
import persons.Patient;

public class HealBlank {
	private Patient patient;
	private Doctor curingDoctor;
	private ArrayList<Medicine> medicines;
	private int daysLeftOfTreatment;	
	private String diagnoseName;
	public HealBlank(Patient patient, Doctor curingDoctor, ArrayList<Medicine> medicines, int daysLeftOfTreatment,
			String diagnoseName) {
		//TODO validate fields
		this.patient = patient;
		this.curingDoctor = curingDoctor;
		this.medicines = medicines;
		this.daysLeftOfTreatment = daysLeftOfTreatment;
		this.diagnoseName = diagnoseName;
	}
}
