import java.util.Scanner;

public class Task09 {
	// Задача 9:
	// Да се състави програма, която чете от конзолата 2 естествени
	// двуцифрени числа a,b.
	// Програмата да изведе в конзолата дали последната цифра от
	// произведението на двете числа е четна, както и самата цифра.
	// Входни данни: a,b - естествени числа от интервала [10..99].
	// Пример: 15, 25
	// Изход: 375, 5 нечетна
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 10 and 99!");
		int x = sc.nextInt();
		System.out.println("Please enter another a number between 10 and 99!");
		int y = sc.nextInt();
		int mul = x * y;
		int a = mul % 10;
		System.out.println("Input numbers: " + x + " and " + y);
		if (a % 2 == 0) {
			System.out.println(mul + ", " + a + " an even number");
		} else {
			System.out.println(mul + ", " + a + " an odd number");

		}
		sc.close();
	}

}
