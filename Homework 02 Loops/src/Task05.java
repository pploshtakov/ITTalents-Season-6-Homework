import java.util.Scanner;

public class Task05 {
	// Задача 5: Да се въведат от потребителя 2 числа. И да се
	// изведат на екрана всички числа от по-малкото до по-голямото.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for n!");
		int n = sc.nextInt();
		System.out.println("Please enter a value for m!");
		int m = sc.nextInt();
		System.out.println("Input numbers: n = " + n + "; m =" + m);
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = n; i <= m; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
