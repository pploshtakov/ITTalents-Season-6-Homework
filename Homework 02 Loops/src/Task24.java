import java.util.Scanner;

public class Task24 {
	// Задача 24:
	// Едно число X е палиндром, aко се чете еднакво отпред назад и
	// отзад напред.
	// Да се състави програма, която проверява дали въведено число е
	// палиндром.
	// Входни данни: N - естествено число от интервала [10 .. 30000].
	// Пример: 17571
	// Изход: числото е палиндром
	// Използвайте цикъл do-while.

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input number between 10 and 30000
		int number;
		do {
			System.out.println("Please enter a number between 10 and 30000!");
			number = sc.nextInt();
		} while (number < 10 || number > 30000);
		// split the number
		// gather the number in reverse
		// help variables
		int num = number;
		int reverse = 0;
		int temp;
		do {
			temp = num % 10;
			num /= 10;
			reverse = (reverse * 10) + temp;
		} while (num >= 1);
		// check palindrome
		System.out.println(number == reverse ? "The number is palindrome!" : "The number isn't palindrome!");
		sc.close();
	}

}
