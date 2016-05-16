import java.util.Scanner;

public class Task10 {
	// Задача 10: Въведете число от клавиатурата и определете дали е
	// просто. Просто число е това което се дели САМО на 1 и на себе
	// си.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number!");
		int number = sc.nextInt();
		int num = number;
		if (number < 0) {
			num *= -1;
		}
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("The number isn't prime!");
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("The number is prime!");
		}
		sc.close();
	}

}
