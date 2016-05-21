import java.util.Scanner;

public class Task22 {
	// Задача 22:
	// Да се състави програма, която извежда първите 10 най-малки
	// числа, които се делят на 2, 3 или на 5 и които са по-големи от
	// въведено естествено число.
	// Числата се извеждат, заедно с техния пореден номер.
	// Входни данни: число от интервала [1..999]
	// Пример: 1
	// Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
	// Използвайте цикъл while.

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input number 1 to 999
		int num;
		do {
			System.out.println("Please enter a number between 1 and 999");
			num = sc.nextInt();
		} while (num < 1 || num > 999);
		// print 10 numbers (use counter)
		int count = 1;
		num++;
		while (count <= 10) {
			// division by 2
			if (num % 2 == 0) {
				if (count == 10) {
					System.out.print(count + ":" + num);
					count++;
					num++;
					continue;
				} else {
					System.out.print(count + ":" + num + ",");
					count++;
					num++;
					continue;
				}

			} else if (num % 3 == 0) {
				// division by 3
				if (count == 10) {
					System.out.print(count + ":" + num);
					count++;
					num++;
					continue;
				} else {
					System.out.print(count + ":" + num + ",");
					count++;
					num++;
					continue;
				}
			} else if (num % 5 == 0) {
				// division by 5
				if (count == 10) {
					System.out.print(count + ":" + num);
					count++;
					num++;
					continue;
				} else {
					System.out.print(count + ":" + num + ",");
					count++;
					num++;
					continue;
				}
			} else {
				num++;
			}
			sc.close();
		}

	}

}
