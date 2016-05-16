import java.util.Scanner;

public class Task01 {
	// Задача 1:
	// Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	// клавиатурата A и B (може да са с плаваща запетая – double).
	// После да се прочете 3-то число C и да се провери дали то е м/у A и B.
	// Да се изведе подходящо съобщение за това дали C е между A и B.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for A!");
		double a = sc.nextDouble();
		System.out.println("Please enter value for B!");
		double b = sc.nextDouble();
		System.out.println("Please enter value for C!");
		double c = sc.nextDouble();
		System.out.println("Entries: A = " + a + "; B = " + b + "; C = " + c);
		if (a == c && b == c) {
			System.out.println("A = B = C");
		} else if (c < a && c < b) {
			System.out.println("C < A & B");
		} else if (c > a && c > b) {
			System.out.println("C > A & B");
		} else if (c < b && c > a || c < a && c > b) {
			System.out.println("The value of C is between A & B!");
		} else if (c == a && c != b) {
			System.out.println("C == A");
		} else {
			System.out.println("C == B");
		}
		sc.close();
	}

}
