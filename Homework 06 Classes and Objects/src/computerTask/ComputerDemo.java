package computerTask;

public class ComputerDemo {

	public static void main(String[] args) {
		//		Да се създадат 2 обекта от тип Computer.
		Computer lenovo = new Computer();
		Computer hp = new Computer();
		//		Да се зададат стойности на всеки от компютрите за year, price,
		//		hardDiskMemory, freeMemory, operationSystem.
		lenovo.year = 2016;
		lenovo.price = 1000;
		lenovo.hardDiscMemory = 1024;
		lenovo.freeMemory = 1024;
		lenovo.operationSystem = "Windows 8";
		hp.year = 2016;
		hp.price = 1200;
		hp.hardDiscMemory = 1024;
		hp.freeMemory = 512;
		hp.operationSystem = "Windows 10";
		//		Нека единият компютър
		//		да е лаптоп.
		hp.isNotebook = true;
		//		На единия от двата компютъра да се задели памет 100
		//		(чрез метода useMemory)
		hp.useMemory(100);
		//		, а на другия, да се смени операционната
		//		система (чрез метода changeOperationSystem),
		lenovo.changeOperationSystem("Windows 10");
		//		след което да се	
		//		изведат на екрана всичките полета на двата компютъра.
		printSystemInfo(lenovo);
		printSystemInfo(hp);
	}

	private static void printSystemInfo(Computer pc) {
		System.out.println("Year of production: " + pc.year);
		System.out.println("Hard disc memory: " + pc.hardDiscMemory);
		System.out.println("Free memory: " + pc.freeMemory);
		System.out.println("Operation system is: " + pc.operationSystem);
		System.out.println("Is Notebook: " + pc.isNotebook);
	}

}
