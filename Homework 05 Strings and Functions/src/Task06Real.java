import java.util.Scanner;

public class Task06Real {
	/*
	 * Задача 6: Да се състави програма, чрез която се въвежда изречение с
	 * отделни думи. Като резултат на екрана да се извежда същия текст, но всяка
	 * отделна дума да започва с главна буква, а следващите я букви да са малки.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entar a sentence.");
		String sen = sc.nextLine();
		String senNew = uppercaseFirstLetters(sen);
		System.out.println(sen);
		System.out.println(senNew);
		sc.close();
	}

	static String uppercaseFirstLetters(String sen) {
		char[] chars = sen.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				chars[i] = Character.toUpperCase(chars[i]);
				toLowerAll(chars, i + 1);
			} else if (chars[i] == ' ' || chars[i] == '.' || chars[i] == ',' || chars[i] == '!' || chars[i] == '?'
					|| chars[i] == ':' || chars[i] == '-') {
				chars[i + 1] = Character.toUpperCase(chars[i + 1]);
				toLowerAll(chars, i + 2);
			}
		}
		return new String(chars);
	}

	private static void toLowerAll(char[] chars, int i) {
		for (int j = i; j < chars.length; j++) {
			chars[j] = Character.toLowerCase(chars[j]);
		}
	}
}
