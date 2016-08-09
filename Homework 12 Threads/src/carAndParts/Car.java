package carAndParts;

public class Car {
	private String model;
	private int serialNumber;
	private static int uniqueNumber = 1;
	
	public Car() {
		this.model = "Mercedes";
		this.serialNumber = uniqueNumber++;
	}
	
	public static class Tire extends Thread {
		@Override
		public void run() {
			System.out.println("Start creating tire...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Tire do not created!");
			}
			System.out.println("Tire was created!");
		}
	}
	
	public static class Seat extends Thread {
		@Override
		public void run() {
			System.out.println("Start creating seat...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Seat do not created!");
			}
			System.out.println("Seat was created!");
		}
	}
	
	public static class Engine extends Thread {
		@Override
		public void run() {
			System.out.println("Start creating engine...");
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				System.out.println("Engine do not created!");
			}
			System.out.println("Engine was created!");
		}
	}
	
	public static class Frame extends Thread {
		@Override
		public void run() {
			System.out.println("Start creating frame...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Frame do not created!");
			}
			System.out.println("Frame was created!");
		}
	}
}
