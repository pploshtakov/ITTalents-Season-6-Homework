package persons;

public abstract class Person {
	private String name;
	private int age;
	private String mobileNumber;
	private String gander;
	public enum Genders {MALE,FEMALE};
	
	
	public Person(String name, int age, String mobileNumber, Genders gender ) {
		this.setAge(age);
		this.setMobileNumber(mobileNumber);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Do not typed name!");
			this.name = "Jon Doe";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age must be zero or bigger!");
		}
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		if (mobileNumber.matches("(?:0359|\\+359|0)[7-9][0-9]{9})")) {
			this.mobileNumber = mobileNumber;
		} else {
			System.out.println("Incorrect number!");
			this.mobileNumber = "0000000000";
		}
	}
	
	
}
