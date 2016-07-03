package carShopTask;

public class Person {
	private Car[] myCars;
	private int freePlaces;
	private double money;

	public Person() {
		this.myCars = new Car[5];
		this.freePlaces = 5;
		this.money = 100000;
	}


	public boolean buyCar(Car car) {
		if (car.getPrice() <= this.money && this.freePlaces > 0) {
			this.money -= car.getPrice();
			this.myCars[this.myCars.length - this.freePlaces--] = car;
			return true;
		} else {
			System.out.println("Do not have free plasec for new car or do not have money!");
			return false;
		}
	}

}
