package notepadClasses;

import interfaces.IElectronicDevice;
import myExceptions.WeakPasswordExceptions;

public class ElectronicSecuredNotepad extends Secured implements IElectronicDevice {

	private boolean isStarted = false;

	public ElectronicSecuredNotepad(String title, int numberOfPages, String pass) throws WeakPasswordExceptions {
		super(title, numberOfPages, pass);
	}
	
	 static private void printMessageToStart() {
		 System.out.println("First you need to started device!");
	}

	@Override
	public void addTextToPage(String text, int numberOfPage) {
		if (isStarted()) {
			super.addTextToPage(text, numberOfPage);
		} else {
			printMessageToStart();
		}
		
	}

	@Override
	public void replaceTextToPage(String text, int numberOfPage) {
		if (isStarted()) {
			super.replaceTextToPage(text, numberOfPage);
		} else {
			printMessageToStart();
		}
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		if (isStarted()) {
			super.delTextToPage(numberOfPage);
		} else {
			printMessageToStart();
		}
	}

	@Override
	public void printAllPages() {
		if (isStarted()) {
			super.printAllPages();
		} else {
			printMessageToStart();
		}
	}

	@Override
	public void start() {
		if (isStarted ) {
			System.out.println("Device is already included!");
		} else {
			isStarted = true;
		}
	}

	@Override
	public void stop() {
		if (isStarted) {
			isStarted = false;
		} else {
			System.out.println("Device is alredy disconnected!");
		}
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

}
