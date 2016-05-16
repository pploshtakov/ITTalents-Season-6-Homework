import java.util.Scanner;

public class Task04 {
	// Задача 4:
	// Въведете 2 различни числа от конзолата и ги разпечатайте в
	// нарастващ ред.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for X!");
		int x = sc.nextInt();
		System.out.println("Please enter value for Y!");
		int y = sc.nextInt();
		if (x <= y) {
			System.out.println(x + ";" + y);
		} else {
			System.out.println(y + ";" + x);
		}
		sc.close();
	}

}
