package notepadClasses;

import interfaces.ISecuredNotepad;

public class SecuredNotepad extends Secured {
	
	//if you wont create object from this class must be use createSecureNotepad()!
	private SecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages);
		this.password = pass;
	}
	//object from this class created only by strong pass
	public static SecuredNotepad createSecureNotepad (String title, int numberOfPages, String pass) {
		if (ISecuredNotepad.ifPassIsStrong(pass)) {
			return new SecuredNotepad(title, numberOfPages, pass);
		} else {
			System.out.println("The password needs to have at least 5 symbols, at least one small letter, capital letter and a number! \nSecureNotepad cannot be created!");
			return null;
		}
	}
	
}
