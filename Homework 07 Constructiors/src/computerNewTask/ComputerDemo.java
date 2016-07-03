package computerNewTask;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer hp = new Computer();
		hp.freeMemory = 2048;
		printSystemInfo(hp);
		System.out.println("---------------------");
		Computer lenovo = new Computer(2016, 999, 1024, 1024);
		Computer samsung = new Computer(2016, 1111, true, 1024, 1024, "Win 10");
		Computer dell = new Computer(2016, 999, 1024, 1024);
		System.out.println(lenovo.comparePrice(samsung));
		System.out.println(samsung.comparePrice(lenovo));
		System.out.println(lenovo.comparePrice(dell));
	}

	private static void printSystemInfo(Computer pc) {
		System.out.println("Year of production: " + pc.year);
		System.out.println("Hard disc memory: " + pc.hardDiscMemory);
		System.out.println("Free memory: " + pc.freeMemory);
		System.out.println("Operation system is: " + pc.operationSystem);
		System.out.println("Is Notebook: " + pc.isNotebook);
	}

}
