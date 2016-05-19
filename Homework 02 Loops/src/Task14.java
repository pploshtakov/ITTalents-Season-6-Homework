import java.util.Scanner;

public class Task14 {
	// Задача 14: Да се състави програма, която по въведено
	// естествено число N от интервала [10..200] извежда в обратен
	// ред всички числа, които са кратни на 7 и са по-малки от N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a number between 10 and 200!");
			n = sc.nextInt();
		} while (n < 10 || n > 200);
		for (int i = n - 1; i > 13; i--) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
