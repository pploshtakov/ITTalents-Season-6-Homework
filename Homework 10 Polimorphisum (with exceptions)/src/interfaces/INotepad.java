package interfaces;

public interface INotepad {
	void addTextToPage (String text, int numberOfPage);
	void replaceTextToPage (String text, int numberOfPage);
	void delTextToPage (int numberOfPage);
	void printAllPages ();
}
