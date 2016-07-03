package encapsulationTask;

public class Employee {
	//	Да се създаде клас Employee репрезентиращ работник.
	//	Класът да има следните полета:
	//	name – име на работника
	private String name;
	//	currentTask – обект от тип Task, който показва текущата задача в/у
	//	която работи работника
	private Task currentTask;
	//	hoursLeft – числова стойност, която показва колко работни часа
	//	остават на работника (за днес)
	private int hoursLeft;
	// var for default names
		private static int defaultName = 1;
	//	Класът да има конструктор с 1 параметър, който инициализира полето
	//	name
	
	public Employee(String name) {
		this.setName(name);
	}
	//	Да се направят подходящи getter-и и setter-и за полетата на класа
	//	(setter-ите да проверяват дали данните са валидни - името да не
	//	празно, часовете да са положително число...).

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Do not typed name, default name is Employee" + defaultName);
			this.name = "Employee" + Integer.toString(defaultName++);
		}	}
	public Task getCurrentTask() {
		return currentTask;
	}
	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Please set new task!");
		}
	}
	public int getHoursLeft() {
		return hoursLeft;
	}
	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Hours left must be zero or more - set default 0!");
			this.hoursLeft = 0;
		}
	}
	//	Да се направи метод без параметри work() на класа Employee. С
	//	извикването на този метод, работника за който е извикан метода
	//	работи по текущата си задача (ако има такава). Например ако
	//	работника има останали 4 часа за работа, а по задачата има останали
	//	7 часа работа, след изпълнението на метода работника ще е останал с
	//	0 часа работа за деня, а по задачата ще е останало 3 часа работа. Акo работника има 8 часа, след изпълнението на метода work() работника
	//	ще е останал с 1 час работа за деня, а времето което остава на
	//	задачата да бъде свършена ще е 0.
	void work() {
		if (this.currentTask != null && this.hoursLeft > 0) {
			if (currentTask.getWorkingHours() >= this.hoursLeft) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
				this.showReport();
			} else {
				this.hoursLeft = this.hoursLeft - this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				this.showReport();
			}
		} else {
			System.out.println("Do not have current task or hours left!");
		}
	}
	//	Да се направи и метод showReport, който се извиква след като
	//	работника поработи в/у текущата си задача (извикване на work) и
	//	показва информация (принтирайки на конзолата) за:
	//	името на работника
	//	името на задачата
	//	работните часовете които остават на работника
	//	часовете които остават на текущата задача на работника за да бъде
	//	изпълнена
	private void showReport() {
		System.out.println("Name " + this.name);
		System.out.println("Task name " + this.currentTask.getName());
		System.out.println("Employee hours left " + this.hoursLeft);
		System.out.println("Current task hours left " + this.currentTask.getWorkingHours());
	}

}
