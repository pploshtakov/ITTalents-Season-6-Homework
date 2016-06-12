import java.util.Scanner;

public class Task01 {
	// Задача 1:
	// Да се състави програма, чрез която се въвеждат два низа съдържащи
	// до 40 главни и малки букви.
	// Като резултат на екрана да се извеждат низовете само с главни и само
	// с малки букви.
	// Пример: Abcd Efgh
	// Изход: ABCD abcd EFGH efgh

	public static void main(String[] args) {
		// input 2 texts, max 40 symbols
		Scanner sc = new Scanner(System.in);
		String text = textValidation(null, sc);
		String text1 = textValidation(null, sc);
		// method to upper case
		String newUpText = text.toUpperCase();
		String newUpText1 = text1.toUpperCase();
		// method to lower case
		String newLowText = text.toLowerCase();
		String newLowText1 = text1.toLowerCase();
		// print input texts
		System.out.println("Input texts: " + text + "; " + text1);
		// print new texts
		System.out.println("To upper case: " + newUpText + "; " + newUpText1);
		System.out.println("To upper case: " + newLowText + "; " + newLowText1);
		sc.close();
	}

	// text validation
	static String textValidation(String s, Scanner sc) {
		while (s == null || s.length() > 40) {
			System.out.println("Please enter a text(max 40 symbols)!");
			s = sc.nextLine();
		}
		return s;

	}
}
