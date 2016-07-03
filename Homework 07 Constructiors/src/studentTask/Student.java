package studentTask;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	//variable for default names
	private static int defaultNames = 1;
	public Student() {
		this.setGrade(4);
		this.setYearInCollege(1);
		this.isDegree = false;
		this.money = 0;
		this.setSubject(null);
	}
	public Student(String name, String subject, int age) {
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		} else {
			this.name = Integer.toString(defaultNames);
			System.out.println("You don't typed name, default name is " + defaultNames++);
		}
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if (subject != null && !subject.isEmpty()) {
			this.subject = subject;
		} else {
			this.subject = "Student isn't subject!";
		}
	}
	public double getGrade() {
		return this.grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be grater by 0, default age is 19!");
			this.age = 19;
		}
	}
	public void setGrade(double grade) {
		if (grade > 0 && grade <= 6) {
			this.grade = grade;
		} else {
			System.out.println("Please set correct grade!");
		}
	}
	public int getYearInCollege() {
		return yearInCollege;
	}
	private void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}
	void upYear() {
		if (this.getYearInCollege() < 4) {
			this.setYearInCollege(this.getYearInCollege() + 1);
			if (this.getYearInCollege() == 4) {
				System.out.println("Congratulation, the student is degree!");
				this.isDegree = true;
			} else if (this.getYearInCollege() > 4) {
				System.out.println("The student was degree!");
			}
		}
	}
	double receiveScholarship (double minGrade, double amount) {
		if (this.age < 30 && this.getGrade() >= minGrade) {
			this.money += amount;
		} else {
			System.out.println("The student is to old or his grade is smaller then min grade!");
		}
		return this.money;
	}
	void printStudentInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Is degree: " + this.isDegree);
		System.out.println("Year in college: " + this.getYearInCollege());
		System.out.println("Subject: " + this.subject);
		System.out.println("Grade: " + this.getGrade());
		System.out.println("Money: " + this.money);
	}
	
	
	
	
}
