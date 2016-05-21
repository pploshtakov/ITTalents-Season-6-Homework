import java.util.Scanner;

public class Task17 {
	// Задача 17:
	// Да се състави програма, която извежда квадрат, чийто страни са
	// оформени със знака *, а вътрешността е запълнена със въведен
	// знак.
	// Входни данни b - дължина на страната число от интервала
	// [3..20], c - желан знак.
	// Програмата да използва цикъл for.
	// Пример: 4 +
	// Изход:
	// ****
	// *++*
	// *++*
	// ****
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input lenght's squared from 3 to 20
		int lenght;
		do {
			System.out.println("Please enter lenght's squared!(3 to 20!)");
			lenght = sc.nextInt();
		} while (lenght < 3 || lenght > 20);
		// input char
		System.out.println("Please enter a symbol!");
		char ch = sc.next().charAt(0);
		// for loop for print squared
		for (int i = 0; i < lenght; i++) {
			// for first and last row print only *
			if (i == 0 || i == lenght - 1) {
				for (int j = 0; j < lenght; j++) {
					System.out.print("*");
				}
			} else {
				// between them print * for start and end between them print
				// chars
				for (int j = 0; j < lenght; j++) {
					if (j == 0 || j == lenght - 1) {
						System.out.print("*");
					} else {
						System.out.print(ch);
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
