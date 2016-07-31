package persons;

public class Nurse extends Person {
	
	private int internship;
	/**
	 * When you create a new nurse she is with zero internship!
	 *  
	 * @param name
	 * @param age
	 * @param mobileNumber
	 * @param isMale
	 */
	public Nurse(String name, int age, String mobileNumber, Genders gender) {
		super(name, age, mobileNumber, gender);
		this.internship = 0;
	}
	
	//up internship with one year
	public void upInternship() {
		this.internship++;
	}
	
}
