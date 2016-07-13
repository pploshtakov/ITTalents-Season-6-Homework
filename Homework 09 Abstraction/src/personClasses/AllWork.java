package personClasses;

public class AllWork {
	//	Да се създаде клас AllWork, които репрезентира множеството от всички
	//	задачи, които трябва да свършат работниците в офиса.
	//	Класът да съдържа следните полета:
	//		- tasks – масив, съдържащ всички задачи
	private Task[] tasks;
	//		- freePlacesForTasks – числова стойност, която показва колко
	//		свободни места за нови задачи има в масива (след създаване на обекта
	//		AllWork, в него няма добавени задачи и тази стойност е 10)
	private int freePlacesForTasks;
	//		currentUnassignedTask – указва индекса на текущата свободна(по
	//				която няма работник които да работи) задача.
	private int currentUnassignedTask;
	//				Всяка задача може да бъде давана на точно 1 работник, които да
	//				работи по нея. Когато някои работник си свърши задачата, той си взима
	//				от обекта AllWork първата свободна задача. Това поле указва индекса
	//				на текущата такава задача в масива tasks (началната му стойност е 0 –
	//				първата задача)
	//				Да се направи констуктор без параметри, който инициализира по
	//				подходящ начин полетата на AllWork
	public AllWork() {
		this.tasks = new Task[10];
		this.freePlacesForTasks = this.tasks.length;
		this.currentUnassignedTask = 0;
	}
	//				метод addTask, чрез който се добавя задача към множеството от задачи
	public void addTask (Task task) {
		if (this.freePlacesForTasks > 0) {
			this.tasks[this.tasks.length - this.freePlacesForTasks] = task;
			this.freePlacesForTasks--;
		} else {
			System.out.println("There are no free places for tasks.");
		}
	}
	//				метод getNextTask който връща следващата незаета задача.
	public Task getNextTask () {
		if (this.currentUnassignedTask < this.tasks.length) {
			return this.tasks[this.currentUnassignedTask++];
		} else {
			if (!this.isAllWorkDone()) {
				this.currentUnassignedTask = 0;
				return this.tasks[this.currentUnassignedTask++];
			}
			System.out.println("All tasks are done!");
			return this.tasks[this.currentUnassignedTask];
		}
	}
	//				Метод isAllWorkDone, който проверява, дали всички задачи са
	//				направени (една задача е направена, ако по нея остават 0 часа работа)
	//				Да се спазва принципа за капсулация на данни!!!
	public boolean isAllWorkDone () {
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] != null && tasks[i].getWorkingHours() > 0) {
				return false;
			}
		}
		return true;
	}

}
