import java.util.Scanner;

public class Task13 {
	// Задача 13: Да се състави програма, която извежда всички
	// естествени трицифрени числа, които имат сбор на цифрите равен
	// на дадено число.
	// Дадено : sum, където 2>=sum<=27.
	// Пример: 26
	// Изход: 899, 989, 998.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		do {
			System.out.println("Please enter a number between 2 and 27!");
			sum = sc.nextInt();
		} while (sum < 2 || sum > 27);
		for (int i = 101; i <= 999; i++) {
			int temp = i;
			int a = temp % 10;
			temp /= 10;
			int b = temp % 10;
			temp /= 10;
			int c = temp;
			if (a + b + c == sum) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
