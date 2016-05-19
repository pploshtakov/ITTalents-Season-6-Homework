import java.util.Scanner;

public class Task11 {
	// Задача 11: Въведете число N чрез конзолата и изкарайте като
	// резултат следния триъгълник с височина N:
	// *
	// ***
	// *****
	// .................
	// Кaто допълнително упражнение – нарисувайте същия
	// триъгълник, но незапълнен
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		do {
			System.out.println("Please enter a positive number!");
			height = sc.nextInt();
		} while (height < 1);
		for (int i = 1; i <= height; i++) {
			for (int j = i; j < height; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) - 1; k++) {
				// if (i == height) {
				// System.out.print(".");
				// } else {
				System.out.print("*");
				// }
			}
			System.out.println();
		}
		sc.close();
	}

}
