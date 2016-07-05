package personClasses;

public class Employee extends Person {	
	//	Кла�?ът Employee да на�?лед�?ва Person и да дефинира:
	//		Полета:
	//		daySalary показва дневната заплата на работника
	private double daySalary;
	//		Кон�?труктор които инициализира в�?ичките му полета (�?об�?твени
	//		и на�?ледени)
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	private void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Day salary must be a bigger then zerro!(default is 40)");
			this.daySalary = 40;
		}
	}
	//	Методи:
	//		В �?лучай че на работник �?е наложи да работи извън работно
	//		време, на него му �?е дължи допълнителна �?ума пари (overtime) за
	//		ча�?овете които е работил. Сумата �?е пре�?м�?та по �?ледни�? начин: ако
	//		работника, н�?ма навършени 18 години, дължимата �?ума е 0. В
	//		противен �?лучай, за в�?еки отработен ча�?, на работника �?е заплаща
	//		�?умата ко�?то получава на ча�? (зави�?и от дневната заплата) умножена
	//		по 1,5.
	//		метод calculateOvertime(double hours) който пре�?м�?та и връща �?тойно�?тта
	//		на �?умата ко�?то му �?е дължи при работа извън работно време
	public double calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		} else {
			return ((this.daySalary / 8) * 1.5) * hours;
		}
	}
	//		метод showEmployeeInfo(), който показва информаци�? за човека, както и
	//		информаци�? за дневната му заплата
	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary: " + this.daySalary);
	}


}
