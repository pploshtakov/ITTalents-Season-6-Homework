import java.util.Scanner;

public class Task08 {
	// Задача 8:
	// Да се състави програма, чрез която се въвежда ред от символи
	// (стринг, низ).
	// Програмата да изведе на екрана дали въведения стринг е палиндром,
	// т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
	// Вход: капак
	// Изход: да.
	// Вход: тенджера
	// Изход: не.
	public static void main(String[] args) {
		// enter a word
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = sc.nextLine();
		// print word
		System.out.println("Input word " + word);
		// check for palindrome
		chekPalindrome(word);
		sc.close();
	}

	static void chekPalindrome(String word) {
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			char x = chars[i];
			chars[i] = chars[chars.length - (i + 1)];
			chars[chars.length - (i + 1)] = x;
		}
		String reverseWord = new String(chars);
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println("It's palindrome.");
		} else {
			System.out.println("It isn't palindrome.");
		}
	}
}
