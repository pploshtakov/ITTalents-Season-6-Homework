import java.util.Scanner;

public class Task16 {
	// Задача 16:
	// Въведено е трицифрено естествено число от вида abc.
	// Трябва да се провери дали:
	// ако a = b = c - Изход: цифрите са равни;
	// ако a>b>c - Изход: цифрите са във възходящ ред;
	// ако a<b<c цифрите са в низходящ ред;
	// и изход: цифрите са ненаредени, за неописаните случаи.
	// Да се състави програма, която извежда резултата от проверката за
	// наредба на цифрите в числото.
	// Пример: 345
	// Изход: възходящ ред.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 100 and 999!");
		int number = sc.nextInt();
		int num = number;
		int a = num % 10;
		num /= 10;
		int b = num % 10;
		int c = num / 10;
		System.out.println("Input number is " + number);
		if (a == b && a == c) {
			System.out.println(c + " = " + b + " = " + a + " the numbers are equal!");
		} else if (a < b && b < c) {
			System.out.println(c + " > " + b + " > " + a + " the numbers are in descending order!");
		} else if (a > b && b > c) {
			System.out.println(c + " < " + b + " < " + a + " the numbers are in ascending order!");
		} else {
			System.out.println("The numbers are unordered!");
		}
		sc.close();
	}

}
