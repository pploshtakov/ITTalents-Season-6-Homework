package main;

import assemblyLine.AssemblyLine;
import carAndParts.Car;

public class CarFactory {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Thread line = new AssemblyLine();
		line.start();
		try {
			line.join();
		} catch (InterruptedException e) {
			System.out.println("Assembly line stopped work!");
		}
		Car newCar = new Car();
		long end = System.currentTimeMillis() - start;
		System.out.println("New car was created for " + (end/1000) + " seconds.");
	}

}
