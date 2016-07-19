package notepadClasses;

import interfaces.INotepad;

public abstract class Notepad implements INotepad{
	private String title;
	private Page[] pages;
	
	public Notepad(String title,int numberOfPages) {
		this.setTitle(title);
		this.setPages(numberOfPages);
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page(Integer.toString(i + 1));
		}
	}

	@Override
	public void addTextToPage(String text, int numberOfPage) {
		this.pages[numberOfPage - 1].addText(text);
	}

	@Override
	public void replaceTextToPage(String text, int numberOfPage) {
		this.pages[numberOfPage - 1].delText();
		this.pages[numberOfPage - 1].addText(text);
	}

	@Override
	public void delTextToPage(int numberOfPage) {
		this.pages[numberOfPage - 1].delText();
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(this.pages[i].viewPage());
		}
	}

	private void setPages(int numberOfPages) {
		if (this.pages != null) {
			System.out.println("Do not make a change for pages!");
			return;
		}
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
		} else {
			this.pages = new Page[10];
			System.out.println("Number of pages must be bigger than zerro, default pages are 10!");
		}
	}

	private void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("You don't typed a title, default title is \"Default Notepad\"");
			this.title = "Default Notepad";
		}
	}
}
