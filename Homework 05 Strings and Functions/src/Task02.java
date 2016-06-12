import java.util.Scanner;

public class Task02 {
	// Задача 2:
	// Да се състави програма, чрез която от клавиатурата се въвеждат
	// последователно две думи с дължина 10-20 знака.
	// Програмата да размени първите им 5 знака и да изведе дължината на
	// по-дългата, както и новото им съдържание.
	// Пример: uchilishe uchenik
	// Изход: 9 uchenishe

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter first word
		System.out.println("Please enter a word with 10 to 20 letters!");
		String word = sc.nextLine();
		word = validationWords(word, sc);
		//enter second word
		System.out.println("Please enter another word(10-20 letters)!");
		String word1 = sc.nextLine();
		word1 = validationWords(word1, sc);
		//who word is bigger
		whoWordIsBigger(word, word1);
		//exchange first five letters from first word to second
		String wordNew = word.substring(0, 5) + word1.substring(5);
		String word1New = word.substring(5) + word1.substring(0, 5);
		//print words 
		System.out.println("Input words are: " + word + "; " + word1);
		//print new word
		System.out.println("New words are: " + wordNew + "; " + word1New);
		sc.close();
	}
	static void whoWordIsBigger(String word, String word1) {
		if(word.length() > word1.length()) {
			System.out.println(word + " is the bigger - " + word.length() + " letters.");
		} else if(word.length() < word1.length()) {
			System.out.println(word1 + " is the bigger - " + word1.length() + " letters.");
		} else {
			System.out.println("Words' lengths are equal - " + word.length() + " letters.");
		}
	}
	//validation words
	static String validationWords(String word, Scanner sc) {
		while(word.length() > 20 || word.length() < 10) {
			System.out.println("Word must be 10 to 20 letters!");
			word = sc.nextLine();
		}
		return word;
	}

}
