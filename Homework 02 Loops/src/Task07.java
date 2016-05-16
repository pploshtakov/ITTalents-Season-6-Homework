import java.util.Scanner;

public class Task07 {
	// Задача 7: Започвайки от 3, да се изведат на екрана първите n
	// числа които се делят на 3. Числата да са разделени със запетая.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a positive number larger then 0!");
			n = sc.nextInt();
		} while (n < 1);
		int x = 3;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.println(x);
			} else {
				System.out.print(x + ",");
				x += 3;
			}
		}
		sc.close();
	}

}
