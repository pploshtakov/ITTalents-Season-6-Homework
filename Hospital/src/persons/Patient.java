package persons;

import treatment.HealBlank;

public class Patient extends Person {
	private Doctor myDoctor;
	private HealBlank healBlank;
	
	public Patient(String name, int age, String mobileNumber, Genders gender) {
		super(name, age, mobileNumber, gender);
	}
	
	public void joinedToHospital() {
		//TODO check for free doctor, if you have joined to hospital and make healList
		//and check for free bad in respectively department
	}

	public Doctor getMyDoctor() {
		return myDoctor;
	}

	public void setMyDoctor(Doctor myDoctor) {
		if (myDoctor != null) {
			this.myDoctor = myDoctor;
		}
	}

	public HealBlank getHealBlank() {
		return healBlank;
	}

	public void setHealBlank(HealBlank healBlank) {
		if (healBlank != null) {
			this.healBlank = healBlank;
		}
	}
	
	
}
