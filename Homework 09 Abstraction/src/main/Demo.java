package main;

import personClasses.AllWork;
import personClasses.Employee;
import personClasses.Task;

public class Demo {
	//counter for days
	static int numberOfDay = 1;
	public static void main(String[] args) throws Throwable {
		//		Да се създаде програма в която се създава обект от клас AllWork, който
		//		се запълва със задачи(10-12 задачи) с различно време.
		AllWork allWork = new AllWork();
		allWork.addTask(new Task("Montly inventory", 18));
		allWork.addTask(new Task("Dayly report", 2));
		allWork.addTask(new Task("Dayly inventory", 4));
		allWork.addTask(new Task("Sales report", 8));
		allWork.addTask(new Task("Montly inventory", 10));
		allWork.addTask(new Task("Montly inventory", 12));
		allWork.addTask(new Task("Montly inventory", 6));
		allWork.addTask(new Task("Montly inventory", 8));
		allWork.addTask(new Task("Montly inventory", 7));
		allWork.addTask(new Task("Montly inventory", 14));
		//test for free places
		allWork.addTask(new Task("Montly inventory", 18));
		System.out.println("-----------------------------");
		
		// Да се създадът
		//		и няколко (3-4) работника. В един безкраен цикъл, да се даде старт на
		//		работата и всички работници да започнат да си теглят задачи и да
		//		работят по тях. Всяка итерация на цикъла е 1 ден в офиса и приключва
		//		когато всичките работници си изработят 8те часа за деня.
		Employee.setNewTasksForAll(allWork);
		Employee pesho = new Employee("Pesho");
		Employee ivo = new Employee("Ivo");
		Employee simo = new Employee("Simo");
		newDayInOffice(pesho, ivo, simo);
		while (true) {
			while (employeesHaveHoursLeft(pesho, ivo, simo)) {
				//if all work is done - break
				if (allWork.isAllWorkDone()) {
					break;
				}
				pesho.work();
				ivo.work();
				simo.work();
			}
			//if all work is done - break
			if (allWork.isAllWorkDone()) {
				break;
			} else {  
				newDayInOffice(pesho, ivo, simo);
			}
		}
		System.out.println("All tasks are done for " + numberOfDay + " days!");
		
		
		
		
	}
	private static boolean employeesHaveHoursLeft(Employee...employees ) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].isHaveHoursLeft()) {
				return true;
			}
		}
		return false;
	}
	//start new day for all employees
	static void newDayInOffice (Employee...employees) throws InterruptedException {
		for (int i = 0; i < employees.length; i++) {
			employees[i].startWorkingDay();
		}
		System.out.println("New day in office! Day " + numberOfDay++);
		Thread.sleep(2000);
		System.out.println("---------NEW DAY!!!-----------");
	}
}
