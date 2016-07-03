package carShopTask;

public class Car {
	private String model;
	private double price;
	private int maxSpeed;
	private int maxGear;
	
	public Car(String model, double price, int maxSpeed, int maxGear) {
		this.model = model;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.maxGear = maxGear;
	}
	public double getPrice() {
		return price;
	}
	public void printInfo() {
		System.out.println(this.model);
		System.out.println(this.maxSpeed);
		System.out.println(this.maxGear);
		System.out.println(this.price);
		System.out.println("---------------------");
	}

}
