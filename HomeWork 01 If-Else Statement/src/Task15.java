import java.util.Scanner;

public class Task15 {
	// Задача 15:
	// Да се състави програма, която въвежда естествено число от интервала
	// [0..24].
	// Програмата да изведе съответстващо съобщение съобразно въведения
	// час.
	// Периодите са:
	// [18..4] - Добър вечер;
	// [4..9] - Добро утро;
	// [9..18] - Добър ден
	// Пример: 10
	// Изход: Добър ден

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a time! (0..24)");
		int time = sc.nextInt();
		if (time >= 9 && time < 18) {
			System.out.println("Good afternoon!");
		} else if (time >= 18 && time < 24 || time >= 0 && time < 4) {
			System.out.println("Good evening!");
		} else if (time >= 4 && time < 9) {
			System.out.println("Good morning!");
		} else {
			System.out.println("No such hour!");
		}
		sc.close();
	}

}
