import java.util.Scanner;

public class Task05 {
	// Задача 5:
	// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
	// ред.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for X!");
		int x = sc.nextInt();
		System.out.println("Please enter value for Y!");
		int y = sc.nextInt();
		System.out.println("Please enter value for Z!");
		int z = sc.nextInt();
		if (x >= y && x >= z && y >= z) {
			System.out.println(x + ";" + y + ";" + z);
		} else if (x <= y && x <= z && y <= z) {
			System.out.println(z + ";" + y + ";" + x);
		} else if (x >= y && x <= z) {
			System.out.println(z + ";" + x + ";" + y);
		} else if (x <= y && x >= z) {
			System.out.println(y + ";" + x + ";" + z);
		} else if (x >= z && z >= y) {
			System.out.println(x + ";" + z + ";" + y);
		} else {
			System.out.println(y + ";" + z + ";" + x);
		}
		sc.close();
	}

}
