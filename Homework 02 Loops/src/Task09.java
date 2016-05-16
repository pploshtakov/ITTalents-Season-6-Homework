import java.util.Scanner;

public class Task09 {
	// Да се прочетат 2 числа от клавиатурата А и В.
	// Да се изведат всички числа от А до В на степен 2(разделени с
	// запетая).Ако някое число е кратно на 3, да се изведе съобщение че
	// числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
	// пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for A!");
		int a = sc.nextInt();
		System.out.println("Please enter a value for B!");
		int b = sc.nextInt();
		System.out.println("Input numbers: " + a + "," + b);
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print("skip " + i + ",");
			} else {
				int x = i * i;
				System.out.print(x + ",");
				sum += x;
			}
			if (sum > 200) {
				break;
			}
		}
		sc.close();
	}

}
