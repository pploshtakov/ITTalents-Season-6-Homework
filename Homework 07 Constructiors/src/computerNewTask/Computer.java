package computerNewTask;
//Създайте клас Computer, който представя компютър.
//Класът да има следните полета:

public class Computer {
//	year – числова стойност, показваща година на производство на
//	компютъра
	int year;
//	price – числова стойност (не е задължително да е цяло число),
//	показваща цената на компютъра
	double price;
//	isNotebook – булева стойност – дали компютъра е преносим или не
	boolean isNotebook;
//	hardDiskMemory – числова стойност за размера на хардиска
	int hardDiscMemory;
//	freeMemory – числова стойност, показваща размера на свободната
//	памет
	int freeMemory;
//	operationSystem – текстово поле за операционната система на
//	компютъра
	String operationSystem;
	
	
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, int hardDiscMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
	}
	
	
	
	Computer(int year, double price, boolean isNotebook, int hardDiscMemory, int freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	int comparePrice(Computer c) {
		return this.price >= c.price ? this.price == c.price ? 0 : -1 : 1;
	}
	
	

//	Класът да дефинира следните методи:
//		-метод changeOperationSystem(newOperationSystem), който сменя
//		стойността на полето operationSystem със стойността, подадена като
//		параметър.
	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}
//		-метод useMemory(memory), който намалява свободната памет
//		(freeMemory) със стойността, подадена като аргумент.
//		Ако стойността на аргумента е по-голяма от свободната памет,
//		извежда съобщение "Not enough free memory!"
	void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}



}
