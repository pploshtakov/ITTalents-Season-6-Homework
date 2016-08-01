package hospital;

import java.util.ArrayList;
import java.util.Iterator;

import persons.Doctor;
import persons.Patient;

public class Hospital {
	private String name;
	private String adress;
	private ArrayList<Department> departments;
	
	public Hospital() {
		this.name = "Hospital";
		this.adress = "Sofia";
		this.departments = new ArrayList<>();
		this.departments.add(new Orthopedy());
		this.departments.add(new Cardiology());
		this.departments.add(new Virology());
	}
	//chech for free bads
	public boolean isHaveFreeBadsInHospital() {
		boolean isHaveBads = false;
		for(Iterator<Department> it = departments.iterator(); it.hasNext();) {
			Department dep = it.next();
			if (dep.isHaveFreeBad()) {
				isHaveBads = true;
			}
		}
		return isHaveBads;
	}
	// count patients by one doctor
	public void howManyPatients(Doctor doc) {
		System.out.println("Doctor " + doc.getName() + " have " + doc.getPatients().size() + " patients.");
	}
	// count all patients
	public void printInfoForAllDoctorsPatients() {
		for(Department dep : departments) {
			ArrayList<Doctor> docs = dep.getDoctors();
			for (Doctor doc : docs) {
				this.howManyPatients(doc);
			}
		}
	}
	// accepts new patient
	public void acceptNewPatient(Patient patient) {
		if (this.isHaveFreeBadsInHospital()) {
			//TODO diagnose
		} else {
			System.out.println("Do not have free bads!");
		}
	}
}
