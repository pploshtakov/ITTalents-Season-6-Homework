import java.util.Scanner;

public class Task03 {
	// Задача 3:
	// Да се състави програма, чрез която се въвеждат последователно две
	// редици от символи без интервали.
	// Програмата да извежда съобщение за резултата от сравнението им по
	// позиции.
	// Пример: хипопотам, хипопотук
	// Изход:
	// Двата низа са с равна дължина.
	// Разлика по позиции:
	// 8 а-у
	// 9 м-к

	public static void main(String[] args) {
		// enter texts
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text!(Without spaces!)");
		String text = sc.nextLine();
		text = checkForSpaces(text, sc);
		System.out.println("Please enter an another text!(Without spaces!)");
		String text1 = sc.nextLine();
		text1 = checkForSpaces(text1, sc);
		// print texts
		System.out.println("Input texts are: " + text + "; " + text1);
		// compare and print texts
		compareTexts(text, text1);
	}

	private static void compareTexts(String text, String text1) {
		if (text.length() >= text1.length()) {
			for (int i = 0; i < text.length(); i++) {
				if (i < text1.length()) {
					if (text.charAt(i) != text1.charAt(i)) {
						System.out.println(i + " " + text.charAt(i) + "-" + text1.charAt(i));
					}
				} else {
					System.out.println(i + " " + text.charAt(i));
				}
			}
		} else {
			for (int i = 0; i < text1.length(); i++) {
				if (i < text.length()) {
					if (text.charAt(i) != text1.charAt(i)) {
						System.out.println(i + " " + text.charAt(i) + "-" + text1.charAt(i));
					}
				} else {
					System.out.println(i + " " + text1.charAt(i));
				}
			}
		}
	}

	// check for spaces
	private static String checkForSpaces(String text, Scanner sc) {
		while (text.contains(" ")) {
			System.out.println("Text must be without spaces!");
			text = sc.nextLine();
		}
		return text;
	}

}
