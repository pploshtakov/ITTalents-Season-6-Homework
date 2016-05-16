import java.util.Scanner;

public class Task08 {
	// Задача 8:
	// Да се състави програма, която чете от конзолата 4-цифренo
	// естествено число от интервала [1000.. 9999]. От това число се
	// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
	// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
	// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
	// ново число e по-малко <, равно = или по-голямо от 2-то число.
	// Пример: 3332 Изход: по-малко (32<33)
	// Пример: 1144 Изход: равни (14=14)
	// Пример: 9875 Изход: по-голямо (95>87)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1000 and 9999!");
		int number = sc.nextInt();
		int num = number;
		int a = num % 10;
		num = num / 10;
		int b = num % 10;
		num /= 10;
		int c = num % 10;
		int d = num / 10;
		System.out.println("Input number = " + number);
		int x = (d * 10) + a;
		int y = (c * 10) + b;
		if (x < y) {
			System.out.println(x + " < " + y);
		} else if (x == y) {
			System.out.println(x + " = " + y);
		} else {
			System.out.println(x + " > " + y);

		}
		sc.close();
	}

}
