package assemblyLine;

import carAndParts.Car.Engine;
import carAndParts.Car.Frame;
import carAndParts.Car.Seat;
import carAndParts.Car.Tire;

public class AssemblyLine extends Thread {
	Thread line1 = new FirstLine();
	Thread line2 = new SecondLine();
	Thread line3 = new ThirdLine();
	
	@Override
	public void run() {
		line1.start();
		line2.start();
		line3.start();
		try {
			line1.join();
			line2.join();
			line3.join();
		} catch (InterruptedException e) {
			System.out.println("Assembly line stopped work!");
		}
	}
	
	private class FirstLine extends Thread {
		Thread engine = new Engine();
		Thread tire1 = new Tire();
		Thread seat1 = new Seat();
		
		@Override
		public void run() {
			try {
				engine.start();
				engine.join();
				tire1.start();
				tire1.join();
				seat1.start();
				seat1.join();
			} catch (InterruptedException e) {
				System.out.println("First line stopped work!");
			}
		}
	}
	
	private class SecondLine extends Thread {
		Thread frame = new Frame();
		Thread tire2 = new Tire();
		Thread tire3 = new Tire();
		Thread seat2 = new Seat();
		@Override
		public void run() {
			try {
				frame.start();
				frame.join();
				tire2.start();
				tire2.join();
				tire3.start();
				tire3.join();
				seat2.start();
				seat2.join();
			} catch (InterruptedException e) {
				System.out.println("Second line stopped work!");
			}
			
		}
	}
	
	private class ThirdLine extends Thread {
		Thread tire4 = new Tire();
		Thread seat3 = new Seat();
		Thread seat4 = new Seat();
		Thread seat5 = new Seat();
		@Override
		public void run() {
			try {
				tire4.start();
				tire4.join();
				seat3.start();
				seat3.join();
				seat4.start();
				seat4.join();
				seat5.start();
				seat5.join();
			} catch (InterruptedException e) {
				System.out.println("Third line stopped work!");
			}
		}
	}
}
