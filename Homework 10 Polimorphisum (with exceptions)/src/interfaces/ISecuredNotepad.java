package interfaces;

public interface ISecuredNotepad extends INotepad {
	static boolean isPassStrong(String pass) {
		return pass.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,}");
	}
	boolean checkPass(String pass);
}
