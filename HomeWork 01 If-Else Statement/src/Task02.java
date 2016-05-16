import java.util.Scanner;

public class Task02 {
	// Задача 2:
	// Въведете 2 различни целочислени числа от конзолата. Запишете
	// тяхната сума, разлика, произведение, остатък от деление и
	// целочислено деление в отделни променливи и разпечатайте тези
	// резултати в конзолата. Опитайте същото с числа с плаваща запетая.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for X!");
		int x = sc.nextInt();
		System.out.println("Please enter value for Y!");
		int y = sc.nextInt();
		System.out.println("Entries: X = " + x + "; Y = " + y);
		int z = x + y;
		int z1 = x - y;
		int z2 = x * y;
		if (y != 0) {
			int z3 = x / y;
			int z4 = x % y;
			System.out.println("X / Y = " + z3);
			System.out.println("X % Y = " + z4);
		} else {
			System.out.println("Dividing by Zero is undefined.");
		}
		System.out.println("X + Y = " + z);
		System.out.println("X - Y = " + z1);
		System.out.println("X * Y = " + z2);
		sc.close();
	}
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Please enter value for X!");
	// double x = sc.nextDouble();
	// System.out.println("Please enter value for Y!");
	// double y = sc.nextDouble();
	// System.out.println("Entries: X = " + x + "; Y = " + y);
	// double z = x + y;
	// double z1 = x - y;
	// double z2 = x * y;
	// if (y != 0) {
	// double z3 = x / y;
	// double z4 = x % y;
	// System.out.println("X / Y = " + z3);
	// System.out.println("X % Y = " + z4);
	// } else {
	// System.out.println("Dividing by Zero is undefined.");
	// }
	// System.out.println("X + Y = " + z);
	// System.out.println("X - Y = " + z1);
	// System.out.println("X * Y = " + z2);
	// sc.close();
	// }

}
