package bankClients;

public abstract class Person {
	private String name;
	private String adress;
	private double money;
	private double salary;
	
	
	
	public Person(String name, String adress, double money, double salary) {
		//TODO validate inputs data
		this.name = name;
		this.adress = adress;
		this.money = money;
		this.salary = salary;
	}



	public double getMoney() {
		return money;
	}
}
