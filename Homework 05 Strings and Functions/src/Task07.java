import java.util.Scanner;

public class Task07 {
	// Задача 7:
	// Да се състави програма, която чете набор от думи разделени с
	// интервал.
	// Като резултат да се извеждат броя на въведените думи, както и броя
	// знаци в най-дългата дума.
	// Пример: asd fg hjkl
	// Изход: 3 думи, най-дългата е с 4 символа.
	public static void main(String[] args) {
		// enter words
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a few words separated by spaces!");
		String words = sc.nextLine();
		// validate words
		words = validateInput(words, sc);
		// count words
		words = words.replaceAll("( )+", " ");
		String[] strWords = words.split(" ");
		// save index of biggest word
		int biggestWordIndex = whoWordIsBiggest(strWords);
		// print words
		System.out.println("Input words: " + words);
		// print count
		System.out.println(strWords.length + " words.");
		// print biggest word
		System.out.println("The biggest word is: " + strWords[biggestWordIndex]);

	}

	private static int whoWordIsBiggest(String[] strWords) {
		int biggestWord = 0;
		for (int i = 1; i < strWords.length; i++) {
			if (strWords[i].length() > strWords[biggestWord].length()) {
				biggestWord = i;
			}
		}
		return biggestWord;
	}

	private static String validateInput(String words, Scanner sc) {
		while (!words.matches("^[a-zA-Z\\s]*$")) {
			System.out.println("Please enter again, only words separated by spaces!");
			words = sc.nextLine();
		}
		return words;
	}

}
