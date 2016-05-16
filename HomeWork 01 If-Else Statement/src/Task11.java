import java.util.Scanner;

public class Task11 {
	// Задача 11:
	// Съставете програма, която по дадено трицифренo число проверява
	// дали числото се дели на всяка своя цифра. Във въведеното число да
	// няма цифра 0.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 111 and 999!(Inside a number doesn't have zero!)");
		int number = sc.nextInt();
		int num = number;
		int a = num % 10;
		num /= 10;
		int b = num % 10;
		int c = num / 10;
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("Program can not be executed by division by zero!");
		} else {
			if (number % a == 0) {
				System.out.println(number + " is divisible by " + a);
			} else {
				System.out.println(number + " isn't divisible by " + a);
			}
			if (number % b == 0) {
				System.out.println(number + " is divisible by " + b);
			} else {
				System.out.println(number + " isn't divisible by " + b);
			}
			if (number % c == 0) {
				System.out.println(number + " is divisible by " + c);
			} else {
				System.out.println(number + " isn't divisible by " + c);
			}
			if (number % a != 0 && number % b != 0 && number % c != 0) {
				System.out.println(number + " isn't divisible by all " + c + "," + b + " and " + a);
			}
		}
		sc.close();
	}

}
