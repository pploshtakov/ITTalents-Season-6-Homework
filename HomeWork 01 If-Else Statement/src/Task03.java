import java.util.Scanner;

public class Task03 {
	// Задача 3:
	// Въведете 2 различни числа от конзолата и разменете стойността им.
	// Разпечатайте новите стойности
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for X!");
		int x = sc.nextInt();
		System.out.println("Please enter value for Y!");
		int y = sc.nextInt();
		System.out.println("Input data: X = " + x + "; Y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Output data: X = " + x + "; Y = " + y);
		sc.close();
	}

}
