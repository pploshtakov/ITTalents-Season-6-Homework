package notepadClasses;

public class SecuredNotepad extends Secured {

	public SecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages, pass);
	}

	@Override
	public boolean checkPass(String pass) {
		// TODO Auto-generated method stub
		return false;
	}

}
