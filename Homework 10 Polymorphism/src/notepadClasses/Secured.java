package notepadClasses;

import java.util.Scanner;

import interfaces.ISecuredNotepad;

public abstract class Secured extends Notepad implements ISecuredNotepad {
	@Override
	public void searchWord(String word) {
		System.out.println("To add text you need password! ");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.searchWord(word);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("To add text you need password! ");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Wrong password!");
		}
	}

	protected String password;

	public Secured(String title, int numberOfPages) {
		super(title, numberOfPages);
	}
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addTextToPage(String textToAdded, int numberOfPage) {
		System.out.println("To add text you need password! ");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.addTextToPage(textToAdded, numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void replaceTextToPage(String newText, int numberOfPage) {
		System.out.println("To replace text you need password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.replaceTextToPage(newText, numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		System.out.println("To delete text you need password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.delTextToPage(numberOfPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void printAllPages() {
		System.out.println("To print pages you nees password!");
		String pass = requestPass();
		if (checkPass(pass)) {
			super.printAllPages();
		} else {
			System.out.println("Wrong password!");
		}
	}


	private String requestPass() {
		System.out.println("Please enter a pasword for " + this.getTitle());
		String pass = sc.nextLine();
		while (!checkPass(pass) && !pass.equals("escape")) {
			System.out.println("Please enter again!");
			System.out.println("If you don't know pass - enter escape!");
			pass = sc.nextLine();
		}
		return pass;
	}

	private boolean checkPass(String pass) {
		return this.password.equals(pass);
	}
}
