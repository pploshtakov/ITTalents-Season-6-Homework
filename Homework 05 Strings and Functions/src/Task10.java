import java.util.Scanner;

public class Task10 {
	// Задача 10:
	// Да се състави програма, която по даден низ връща друг,
	// символите, на който са получени като към всеки код на символ
	// от ASCII таблицата е добавеното числото 5 и е записан
	// новополучения символ.
	// Пример :
	// Вход: Hello
	// Изход: Mjqqt

	public static void main(String[] args) {
		// enter text
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text.");
		String symbols = sc.nextLine();
		// for all symbols ASCII code + 5
		String newSymbols = replaceSymbols(symbols);
		// print input
		System.out.println("Input text: " + symbols);
		// print new text
		System.out.println("New text(ACII + 5): " + newSymbols);
		sc.close();
	}

	static String replaceSymbols(String s) {
		char[] symbol = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			symbol[i] = (char) ((int) (symbol[i] + 5));
		}
		s = new String(symbol);
		return s;
	}
}
