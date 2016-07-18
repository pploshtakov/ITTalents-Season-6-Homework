package notepadClasses;

import interfaces.IElectronicDevice;
import interfaces.ISecuredNotepad;

public class ElectronicSecuredNotepad extends Secured implements IElectronicDevice, ISecuredNotepad {
	@Override
	public void searchWord(String word) {
		if (isStarted()) {
			super.searchWord(word);
		} else {
			System.out.println("You must first turn on the device!");
		}
		
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("You must first turn on the device!");
		}
	}

	boolean isStarted;
	//if you wont create object from this class must be use createSecureNotepad()!
	private ElectronicSecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages);
		this.password = pass;
		this.isStarted = false;
	}
	//object from this class created only by strong pass
	public static ElectronicSecuredNotepad createElectronicSecureNotepad (String title, int numberOfPages, String pass) {
		if (ISecuredNotepad.ifPassIsStrong(pass)) {
			return new ElectronicSecuredNotepad(title, numberOfPages, pass);
		} else {
			System.out.println("The password needs to have at least 5 symbols, at least one small letter, capital letter and a number! \nElectronicSecureNotepad cannot be created!");
			return null;
		}
	}
	
	@Override
	public void start() {
		if (!this.isStarted) {
			this.isStarted = true;
		}
		System.out.println("Device is started!");
	}

	@Override
	public void stop() {
		if (this.isStarted) {
			this.isStarted = false;
		}
		System.out.println("Device is stopped!");
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addTextToPage(String textToAdded, int numberOfPage) {
		if (isStarted()) {
			super.addTextToPage(textToAdded, numberOfPage);
		} else {
			System.out.println("You must first turn on the device!");
		}
	}

	@Override
	public void replaceTextToPage(String newText, int numberOfPage) {
		if (isStarted()) {
			super.replaceTextToPage(newText, numberOfPage);
		} else {
			System.out.println("You must first turn on the device!");
		}
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		if (isStarted()) {
			super.delTextToPage(numberOfPage);
		} else {
			System.out.println("You must first turn on the device!");
		}
	}

	@Override
	public void printAllPages() {
		if (isStarted()) {
			super.printAllPages();
		} else {
			System.out.println("You must first turn on the device!");
		}
	}
	
	

}
