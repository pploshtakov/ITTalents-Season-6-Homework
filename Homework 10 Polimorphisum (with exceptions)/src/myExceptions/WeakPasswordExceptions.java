package myExceptions;

public class WeakPasswordExceptions extends Exception {
	@Override
	public String getMessage() {
		return "This password is weak! \nThe password needs to have at least 5 symbols, at least one small letter, capital letter and a number! \nNotepad cannot be created!";
	}

}
