package notepadClasses;

import myExceptions.WeakPasswordExceptions;

public class SecuredNotepad extends Secured {

	public SecuredNotepad(String title, int numberOfPages, String pass) throws WeakPasswordExceptions {
		super(title, numberOfPages, pass);
	}

	

}
