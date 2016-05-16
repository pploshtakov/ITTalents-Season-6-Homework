import java.util.Scanner;

public class Task08 {
	// Задача 8: По зададено число n, да се изведе на екрана таблица по
	// следния начин:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a positive number larger then 0!");
			n = sc.nextInt();
		} while (n < 1);
		int x = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(x);
			}
			x += 2;
			System.out.println();
		}
		sc.close();
	}

}
