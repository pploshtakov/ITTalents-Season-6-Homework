package personClasses;

public class Person {
	//	Кла�?ът Person репрезентиращ човек да има �?ледните
	//	Полета:
	//	name - име
	private String name;
	//	age - години
	private int age;
	//	isMale - поле, показващо пола
	private boolean isMale;
	private static int defaultNames = 1;
	//	Ко�?труктори:
	//		Един�?твен кон�?труктор, �? параметри за в�?ичките полета на кла�?а
	public Person(String name, int age, boolean isMale) {
		super();
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Do not typed name, default name John Doe " + Integer.toString(defaultNames++));
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age must be a zerro or bigger, please set again(default is 0)");
			this.age = 0;
		}
	}
	public boolean isMale() {
		return isMale;
	}
	
	//		Метод:
	//		Метод showPersonInfo, който показва информаци�? за човека (изпи�?ва
	//		на конзолата �?тойно�?тта на в�?ичките му полета по подход�?щ начин)
	public void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Is male: " + this.isMale);
	}

}
