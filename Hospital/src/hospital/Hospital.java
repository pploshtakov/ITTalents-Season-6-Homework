package hospital;

import java.util.ArrayList;
import java.util.Iterator;

import persons.Doctor;

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
	
	public void howManyPatients(Doctor doc) {
		System.out.println("Doctor " + doc.getName() + " have " + doc.getPatients().size() + " patients.");
	}
	
	public void printInfoForAllDoctorsPatients() {
		for(Department dep : departments) {
			ArrayList<Doctor> docs = dep.getDoctors();
			for (Doctor doc : docs) {
				this.howManyPatients(doc);
			}
		}
	}
}
