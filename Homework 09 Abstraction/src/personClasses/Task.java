package personClasses;

public class Task {
	private String name;
	//	workingHours – числов тип, който показва колко часа остават на
	//	задачата за да бъде изпълнена
	private int workingHours;
	// var for default names
	private static int defaultName = 1;
	//	Класът да има конструктор които задава валидни стойности на 2-те
	//	полета.
	public Task(String name, int workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
	}
	//	Да се направят подходящи методи за достъпване на полетата (setters
	//			and getters).
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Do not typed name, default name is " + defaultName);
			this.name = "Task" + Integer.toString(defaultName++);
		}
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Working hours must be zero or more, set default is 0!");
			this.workingHours = 0;
		}
	}
}
