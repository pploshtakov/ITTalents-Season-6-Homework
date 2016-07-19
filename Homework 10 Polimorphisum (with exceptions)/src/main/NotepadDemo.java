package main;

import myExceptions.WeakPasswordExceptions;
import notepadClasses.SecuredNotepad;

public class NotepadDemo {

	public static void main(String[] args) {
		SecuredNotepad secure;
		try {
			secure = new SecuredNotepad("Secure", 10, "123");
		} catch (WeakPasswordExceptions e) {
			e.getMessage();
		}
	}

}
