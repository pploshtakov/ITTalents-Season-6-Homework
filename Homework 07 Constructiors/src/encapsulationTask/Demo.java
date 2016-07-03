package encapsulationTask;

public class Demo {

	public static void main(String[] args) {
		Task monthlyInventory = new Task("Montly inventory", -5);
		monthlyInventory.setWorkingHours(8);
		Employee eli = new Employee("");
		System.out.println("-------------------");
		eli.setName("Eli");
		eli.setHoursLeft(4);
		eli.setCurrentTask(monthlyInventory);
		eli.work();
		System.out.println("-------------------");
		eli.work();
		System.out.println("-------------------");
		eli.setHoursLeft(6);
		eli.work();
	}

}
