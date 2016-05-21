import java.util.Scanner;

public class Task16 {
	// Задача 16:
	// Да се състави програма, чрез която се въвеждат 2 естествени
	// числа N, M от интервала [10..5555].
	// Програмата, чрез цикъл for, да извежда всички числа от
	// интервала, които са кратни на 50 в низходящ ред.
	// Пример: 25,249
	// Изход: 200,150,100, 50.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Please enter value for N from 10 to 5555!");
			n = sc.nextInt();
		} while (n < 10 || n > 5555);
		do {
			System.out.println("Please enter value for M from 10 to 5555!");
			m = sc.nextInt();
		} while (m < 10 || m > 5555);
		// print input numbers
		System.out.println("Input numbers " + n + "," + m);
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = m; i >= n; i--) {
			// do not print comma for last number
			if (i % 50 == 0) {
				if (i == n || i < n + 50) {
					System.out.println(i);
				} else {
					System.out.print(i + ",");
				}
			}
		}
		sc.close();
	}

}
