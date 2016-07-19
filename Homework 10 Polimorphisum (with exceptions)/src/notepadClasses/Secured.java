package notepadClasses;

import java.util.Scanner;

import interfaces.ISecuredNotepad;
import myExceptions.WeakPasswordExceptions;

public abstract class Secured extends Notepad implements ISecuredNotepad {
	private String password;
	private Scanner sc = new Scanner(System.in);
	
	public Secured(String title, int numberOfPages, String pass) throws WeakPasswordExceptions {
		super(title, numberOfPages);
		if (ISecuredNotepad.isPassStrong(pass)) {
			this.password = pass;
		} else {
			throw new WeakPasswordExceptions();
		}
	}

	@Override
	public boolean checkPass(String pass) {
		return this.password.equals(pass);
	}

	@Override
	public void addTextToPage(String text, int numberOfPage) {
		System.out.println("To add text you need a password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.addTextToPage(text, numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	private String requestPass() {
		System.out.println("Please enter a password!");
		return sc.nextLine();
	}

	@Override
	public void replaceTextToPage(String text, int numberOfPage) {
		System.out.println("To replace text you need a password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.replaceTextToPage(text, numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		System.out.println("To delite text you need a password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.delTextToPage(numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void printAllPages() {
		System.out.println("To print pages you need a password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.printAllPages();
		} else {
			System.out.println("Wrong password!");
		}
	}

	
}
