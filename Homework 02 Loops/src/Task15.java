import java.util.Scanner;

public class Task15 {
	// Задача 15: Да се състави програма, която да изчисли сумата на
	// всички числа от 1 до въведено число N.
	// Пример: 5
	// Изход: 15
	// Използвайте цикъл do-while.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Please enter a number!");
		num = sc.nextInt();

		int sum = 0;
		int temp = 1;
		if (num >= 0) {
			do {
				sum += temp;
				temp++;
			} while (temp <= num);
		} else {
			do {
				sum += temp;
				temp--;
			} while (temp >= num);
		}
		System.out.println("SUM 1 to " + num + " = " + sum);
		sc.close();
	}

}
