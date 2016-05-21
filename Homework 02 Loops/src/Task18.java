import java.util.Scanner;

public class Task18 {
	// Задача 18:
	// Да се състави програма, чрез която се въвежда две числа от
	// интервала [1..9].
	// Програмата да извежда таблицата за умножение.
	// Максималната стойност на множителите е определена от 2-те
	// числа.
	// Пример: 2 2
	// Изход:
	// 1*1= 1;
	// 1*2= 2;
	// 2*1= 2;
	// 2*2= 4;
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input two numbers from 1 to 9
		int n;
		int m;
		do {
			System.out.println("Please enter a number between 1 to 9");
			n = sc.nextInt();
		} while (n < 1 || n > 9);
		do {
			System.out.println("Please enter another number between 1 to 9");
			m = sc.nextInt();
		} while (m < 1 || m > 9);
		// loop from 1 to n for first multiplier
		for (int i = 1; i <= n; i++) {
			// input loop from 1 to m for second multiplier
			for (int j = 1; j <= m; j++) {
				// calculate and print results
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		sc.close();
	}

}
