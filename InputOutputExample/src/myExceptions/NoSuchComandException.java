package myExceptions;

public class NoSuchComandException extends Exception {
	@Override
	public String getMessage() {
		return "No such comand";
	}
}
