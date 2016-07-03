package carShopTask;

public class CarShop {
	private Car[] cars;
	private int freePlaces;
	//	17. Add constructor
	//	 CarShop(int capacity) – init the array cars
	public CarShop(int capacity) {
		this.cars = new Car[capacity];
		this.freePlaces = capacity;
	}
	//	18. boolean addCar(Car car)
	//	adds the car to the shop
	boolean addCar(Car car) {
		if (this.freePlaces > 0) {
			this.cars[cars.length - this.freePlaces--] = car;
			return true;
		} else {
			System.out.println("Do not have free places!");
			return false;
		}
	}
	//	19. Car getNextCar()
	//	return the next car in the shop
	Car getNextCar() {
		if (this.freePlaces < this.cars.length) {
			return this.cars[this.cars.length - (this.freePlaces + 1)];
		} else {
			System.out.println("Do not have cars!");
			return null;
		}
	}
	//	20. void sellNextCar(Person buyer)
	//	get the next car and sell it to the buyer
	void sellNextCar(Person buyer) {
		if (this.getNextCar() != null && buyer.buyCar(getNextCar())) {
			System.out.println("Car is sell");
			this.removeCar(getNextCar());
		}
	}
	//	21. boolean removeCar(Car car)
	//	removes the car from the shop. It must be called after the selling car to a
	//	buyer
	boolean removeCar(Car car) {
		if (this.freePlaces < this.cars.length) {
			this.cars[this.cars.length - (this.freePlaces++ + 1)] = null;
			return true;
		} else {
			return false;
		}
	}
	//	22. void showAllCarsInTheShop()
	//	print information for all the cars to the console
	void showAllCarsInTheShop() {
		if (this.freePlaces != this.cars.length) {
			for(int i = 0; i < this.cars.length - this.freePlaces; i++) {
				this.cars[i].printInfo();
			}
		} else {
			System.out.println("Do not have cars!");
		}
	}
	
}
