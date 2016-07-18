package interfaces;

public interface ISecuredNotepad {
	static boolean ifPassIsStrong(String pass) {
		return pass.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,}");
	}
	
	
}
