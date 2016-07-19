package notepadClasses;

public class Page {
	private String title;
	private String text;
	
	
	
	public Page(String title) {
		this.title = title;
	}

	public void addText (String text) {
		if (this.text == null) {
			this.text = text;
		} else {
			this.text += (" " + text);
		}
	}
	
	public void delText () {
		this.text = null;
	}
	
	public String viewPage () {
		if (this.text == null && this.title == null) {
			System.out.println("This is empty page!");
		} else if (this.title == null) {
			return "No title \n" + this.text;
		} else if (this.text == null) {
			return this.title + "\n" + "No text!";
		} else {
			return this.title + "\n" + this.text;
		}
		return null;
	}

	public String getText() {
		return this.text	;
	}
	
}
