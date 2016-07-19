package notepadClasses;

import interfaces.ISecuredNotepad;
import myExceptions.WeakPasswordExceptions;

public abstract class Secured extends Notepad implements ISecuredNotepad {
	private String password;

	public Secured(String title, int numberOfPages, String pass) {
		super(title, numberOfPages);
		try {
			if (ISecuredNotepad.isPassStrong(pass)) {
				this.password = pass;
			} else {
				throw new WeakPasswordExceptions();
			}
		} catch (WeakPasswordExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
