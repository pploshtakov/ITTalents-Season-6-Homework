import java.util.Scanner;

public class Task25 {
	// Задача 25:
	// Да се направи програма, която по дадено число N, да изчислява
	// N!, т.е. 1*2*3*4...*N.
	// Пример: 5
	// Изход: 120
	// Използвайте цикъл do-while.
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input a number
		System.out.println("Please enter a value for N!");
		int n = sc.nextInt();
		// multiplication's variable
		long mul = 1;
		int temp = 1;
		// loop from 1 to N
		// positive n
		if (n > 0) {
			do {
				mul = mul * temp;
				temp++;
			} while (temp <= n);
		}
		// zero
		else if (n == 0) {
			mul = 0;
		}
		// negative n
		else {
			temp = -1;
			do {
				mul = mul * temp;
				temp--;
			} while (temp >= n);
		}
		System.out.println(n + "!" + " = " + mul);
		sc.close();
	}

}
