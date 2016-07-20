package main;

import java.util.Scanner;

import myExceptions.WeakPasswordExceptions;
import notepadClasses.ElectronicSecuredNotepad;
import notepadClasses.SecuredNotepad;
import notepadClasses.SimpleNotepad;

public class NotepadDemo {

	public static void main(String[] args) {
		SecuredNotepad secure;
		Scanner sc = new Scanner(System.in);
		//tests with weak pass 
		try {
			secure = new SecuredNotepad("Secure", 10, "abc123");
			secure.addTextToPage("I am secured notepad!", 1);
			secure.printAllPages();
			secure.addTextToPage("I am not awesome!", 2);
			secure.printAllPages();
			secure.replaceTextToPage("I am awesome!", 2);
			secure.printAllPages();
			secure.delTextToPage(1);
			secure.printAllPages();
		} catch (WeakPasswordExceptions e) {
			System.out.println(e.getMessage());
		}
		
		ElectronicSecuredNotepad elSecure;
		try {
			elSecure = new ElectronicSecuredNotepad("Electronic device", 10, "123");
		} catch (WeakPasswordExceptions e1) {
			System.out.println(e1.getMessage());
		}
		//test secured notepad
		try {
			secure = new SecuredNotepad("Secure", 10, "Abc123");
			secure.addTextToPage("I am secured notepad!", -1);
			secure.printAllPages();
			secure.addTextToPage("I am secured notepad!", 1);
			secure.addTextToPage("I am not awesome!", 2);
			secure.printAllPages();
			secure.replaceTextToPage("I am awesome!", 2);
			secure.printAllPages();
			secure.delTextToPage(1);
			secure.printAllPages();
		} catch (WeakPasswordExceptions e) {
			System.out.println(e.getMessage());
		}
		//test electronic device
		try {
			elSecure = new ElectronicSecuredNotepad("Electronic device", 10, "Abc123");
			elSecure.addTextToPage("I am electronic device", 1);
			elSecure.start();
			elSecure.addTextToPage("I am electronic device", 1);
			elSecure.printAllPages();
			elSecure.replaceTextToPage("I am secured electronic device", 1);
			elSecure.printAllPages();
		} catch (WeakPasswordExceptions e) {
			System.out.println(e.getMessage());
		}
		//test simple notepad
		//test addTextToPage method and printAllPages
				SimpleNotepad notepad = new SimpleNotepad(null, 3);
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
				//test methods serchWord and printAllPagesWithDigits in class notepad
				notepad.addTextToPage("has a word", 1);
				notepad.searchWord("word");
				notepad.printAllPagesWithDigits();
				sc.close();
	}
}
