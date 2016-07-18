package notepadClasses;

public class Page {
	//	1. Всяка страница има:
	//		заглавие
	private String title;
	//		текст
	private String text;
	//		Всяка страница ще има следната функционалност:
	//		към всяка страница може да се добавя текст
	//private int numberOfPage;
	public Page(String title) {
		this.title = title;
	}
	public void addText (String textToAdded) {
		if (textToAdded != null) {
			if (this.text == null) {
				this.text = textToAdded;
			} else {
				this.text += textToAdded;
			}
		} else {
			System.out.println("Do not typed any text!");
		}
	}
	//		текста на всяка станица може да бъде изтриван
	public void delText () {
		this.text = null;
	}
	//		всяка страница ще може да се преглежда(т.е. метод, който връща
	//		String със заглавието и текста на нов ред)
	public String viewText () {
		if (this.title == null && this.text == null) {
			return "This is empty page!";
		} else if (this.title != null && this.text != null) {
			return this.title + "\n" + this.text; 
		} else if (this.title == null && this.text != null) {
			return "No title!" + "\n" + this.text;
		} else {
			return this.title + "\n" + "No text!";
		}
	}

	//	В класа Page да се създадат следните методи:
	//		searchWord(String word) – метода проверява дали думата се съдържа
	//		в текста на страницата
	public boolean searchWord(String word) {
		if (this.text.contains(word)) {
			System.out.println("In page there is " + word);
			return true;
		} else {
			System.out.println("In page there isn't " + word);
			return false;
		}
	}
	//		containsDigits() - метода проверява дали текста на страницата
	//		съдържа числа
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

}
