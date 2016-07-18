package interfaces;

public interface INotepad {
	//	Всеки бележник може да:
	//		Добавя даден текст към страница с определен номер
	void addTextToPage (String textToAdded, int numberOfPage);
	//		Добавя даден текст върху страница с определен номер (изтрива
	//		предишния и записва новия)
	void replaceTextToPage (String newText, int numberOfPage);
	//		Да трие текста от дадена страница
	void delTextToPage (int numberOfPage);
	//		Да преглежда всички страници (да принтира на конзолата заглавието
	//		и текста)
	void printAllPages ();
	//	Да се добавят следните методи в интерфейса INotepad:
	//		searchWord(String word) – проверява дали в някоя страница на
	//		бележника се съдържа думата word
	void searchWord(String word);
	//		printAllPagesWithDigits() - метода извежда на екрана съдържанието на
	//		всички страници които съдържат цифри
	void printAllPagesWithDigits();
	

}
