package main;

import notepadClasses.ElectronicSecuredNotepad;
import notepadClasses.SecuredNotepad;
import notepadClasses.SimpleNotepad;

public class NotepadDemo {

	public static void main(String[] args) {
		SimpleNotepad notepad = new SimpleNotepad(null, 2);
		//can you make SecuredNotepad with weak pass?
		SecuredNotepad secured = SecuredNotepad.createSecureNotepad("Secured", 20, "abc");
		secured = SecuredNotepad.createSecureNotepad("Secured", 3, "Abc123");
		//test addTextToPage method and printAllPages
		notepad.addTextToPage("I'm simple notepad. ", 1);
		notepad.printAllPages();
		System.err.println("----------------------");
		notepad.addTextToPage("And I have two pages. ", 1);
		notepad.printAllPages();
		System.out.println("------------------");
		//test replaceTextToPage method
		notepad.replaceTextToPage("I can replace text from any page. ", 1);
		notepad.printAllPages();
		System.out.println("------------------------");
		//test dellTextToPage
		notepad.delTextToPage(1);
		notepad.printAllPages();
		//test securedNotepad
		System.out.println("-------------------------");
		secured.addTextToPage("I'm secured notepad! ", 1);
		secured.addTextToPage("I have three pages. ", 2);
		secured.addTextToPage("I'm awesome!", 3);
		//try add text to not-existent page
		secured.addTextToPage("What about you?", 4);
		secured.printAllPages();
		System.out.println("-------------------------");
		//test electronic device
		ElectronicSecuredNotepad tablet = ElectronicSecuredNotepad.createElectronicSecureNotepad("Tablet", 10, "asd");
		tablet = ElectronicSecuredNotepad.createElectronicSecureNotepad("Tablet", 10, "123Abc");
		//try to add text to disconnected device
		tablet.addTextToPage("I'm electronic device!", 10);
		System.out.println("---------------------");
		//test start method
		tablet.start();
		tablet.addTextToPage("I'm electronic device!", 10);
		tablet.printAllPages();
		tablet.stop();
		tablet.printAllPages();
		//test searchWord method
		notepad.addTextToPage("Test searc word method...", 2);
		notepad.getPages()[1].searchWord("method");
		//test containsDegits method
		notepad.getPages()[1].containsDigits();
		notepad.addTextToPage("123", 2);
		notepad.getPages()[1].containsDigits();
		System.out.println("------------------");
		//test methods serchWord and printAllPagesWithDigits in class notepad
		notepad.addTextToPage("has a word", 1);
		notepad.searchWord("word");
		notepad.printAllPagesWithDigits();
	}

}
