import java.util.Scanner;

public class Task19 {
	// Задача 19: Да се състави програма, чрез която по въведено
	// естествено число от интервала [10..99] се извежда поредица
	// числа, при спазване на следните изисквания:
	// 1) ако предходното число е четно се извежда 0.5*числото;
	// 2) ако предходното число е нечетно се извежда 3*числото +1.
	// Извеждането продължава докато не се получи стойност 1.
	// Пример: 11
	// Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// enter a number between 10 and 99
		int num;
		do {
			System.out.println("Please enter a number between 10 and 99!");
			num = sc.nextInt();
		} while (num < 10 || num > 99);
		// infinite loop while num = 1
		while (num > 1) {
			// if n - 1 is even print 0.5 * n
			if (num % 2 == 0) {
				num /= 2;
				System.out.print(num + " ");
			} else {
				// if n - 1 is odd print 3 * n + 1
				if (num % 2 != 0) {
					num = num * 3 + 1;
					System.out.print(num + " ");
				}
			}
		}
		sc.close();
	}

}
