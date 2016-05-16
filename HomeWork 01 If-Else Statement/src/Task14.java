import java.util.Scanner;

public class Task14 {
	// Да се състави програма, която по въведени координати на 2 позиции
	// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
	// различен цвят.
	//
	// Шахматната дъска е квадратна.
	// Въвеждат се две двойки числа от интервала [1..8].
	// Пример: 2 2 3 2
	// Изход: Позициите са с различен цвят
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter X coordinates on the board!");
		int x = sc.nextInt();
		System.out.println("Please enter Y coordinates on the board!");
		int y = sc.nextInt();
		System.out.println("Please enter X1 coordinates on the board!");
		int x1 = sc.nextInt();
		System.out.println("Please enter Y1 coordinates on the board!");
		int y1 = sc.nextInt();
		if ((x + y) % 2 == 0 && (x1 + y1) % 2 == 0 || (x + y) % 2 != 0 && (x1 + y1) % 2 != 0) {
			System.out.println("Positions are a same colors!");
		} else {
			System.out.println("Positions are a different colors!");
		}
		sc.close();
	}

}
