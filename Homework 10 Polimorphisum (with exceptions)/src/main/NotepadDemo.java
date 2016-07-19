package main;

import notepadClasses.SecuredNotepad;

public class NotepadDemo {

	public static void main(String[] args) {
		SecuredNotepad secure = new SecuredNotepad("Secure", 10, "123");
		secure.addTextToPage("", 2);
		secure.printAllPages();
	}

}
