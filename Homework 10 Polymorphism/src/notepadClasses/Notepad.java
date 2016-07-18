package notepadClasses;

import interfaces.INotepad;

public abstract class Notepad implements INotepad {
	private String title;
	private Page[] pages;
	
	public Notepad(String title, int numberOfPages) {
		this.setTitle(title);
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
		} else {
			System.out.println("Number of pages must be bigger than zero, you create default notepad with 50 pages!");
			this.pages = new Page[50];
		}
		//create pages
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page("Page " + Integer.toString(i + 1));
		}
	}
	
	protected void setTitle(String title) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			this.title = "Default notepad";
			System.out.println("Notepad's title is: Default notepad");
		}
	}
	@Override
	public void addTextToPage(String textToAdded, int numberOfPage) {
		if (isThereSuchPage(numberOfPage)) {
			this.getPages()[numberOfPage - 1].addText(textToAdded);
		}
	}

	@Override
	public void replaceTextToPage(String newText, int numberOfPage) {
		if (isThereSuchPage(numberOfPage)) {
			this.getPages()[numberOfPage - 1].delText();
			this.getPages()[numberOfPage - 1].addText(newText);
		}
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		if (isThereSuchPage(numberOfPage)) {
			this.getPages()[numberOfPage - 1].delText();
		}		
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < getPages().length; i++) {
			System.out.println(this.getPages()[i].viewText());
		}
	}
	// is has such page
	private boolean isThereSuchPage (int number) {
		if (number > 0 && number <= this.getPages().length) {
			return true;
		} else {
			System.out.println("There isn't such page!");
			return false;
		}
	}
	
	public Page[] getPages() {
		return pages;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public void searchWord(String word) {
		boolean hasWord = false;
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				System.out.println("There is \"" + word + "\" on page " + (i + 1));
				hasWord = true;
			}
		}
		if (hasWord) {
			return;
		} else {
			System.out.println("There isn't \"" + word + "\" on any page!");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean hasPagesWithDigits = false;
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				System.out.println(pages[i].viewText());
				hasPagesWithDigits = true;
			}
		}
		if (hasPagesWithDigits) {
			return;
		} else {
			System.out.println("There aren't pages with digits!");
		}
	}
	
}
