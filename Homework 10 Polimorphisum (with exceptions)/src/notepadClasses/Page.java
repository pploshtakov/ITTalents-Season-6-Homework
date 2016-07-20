package notepadClasses;

public class Page {
	private String title;
	private String text;
	
	
	
	public Page(String title) {
		this.title = title;
	}
	
	public boolean searchWord(String word) {
		return this.text.contains(word);
	}
	
	public boolean containsDigits() {
		char[] ch = this.text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				System.out.println("In the text there is digits!");
				return true;
			}
		}
		System.out.println("In the text there isn't digits!");
		return false;
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
