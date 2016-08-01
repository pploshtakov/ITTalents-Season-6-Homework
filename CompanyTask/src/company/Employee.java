package company;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private int idNumber;
	private static int uniqueID = 1;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.idNumber = uniqueID++;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}
