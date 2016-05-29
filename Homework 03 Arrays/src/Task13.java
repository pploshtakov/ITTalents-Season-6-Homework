import java.util.Scanner;

public class Task13 {
	// Задача 13:
	// Да се състави програма, чрез която се въвежда число и се представя
	// като число в двоична бройна система.
	// Програмата, чрез масив, да изчислява последователно всички цифри
	// на въведеното естествено число в 2-ична бройна система.
	// Пример: 99
	// Изход: 1100011

	public static void main(String[] args) {
		// enter a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number!");
		int num = sc.nextInt();
		// chech positive or negative
		// if is negative : isNegative = true; num * -1;
		boolean isNegative = false;
		if (num < 0) {
			isNegative = true;
			num *= -1;
		}
		// count numbers
		int countNum = 0;
		int num1 = num;
		while (num1 > 0) {
			num1 /= 2;
			countNum++;
		}
		// create array with needed length
		int[] toBinary = new int[countNum + 1];
		// calculate number to binary numeral system
		for (int i = 0; i < toBinary.length; i++) {
			if (i == 0) {
				if (isNegative) {
					toBinary[i] = 1;
				} else {
					toBinary[i] = 0;
				}
			} else {
				toBinary[toBinary.length - i] = num % 2;
				num /= 2;
			}
		}
		// print array
		System.out.println("Firs digit is for +/- , if is 1 the number is negative!");
		for (int i = 0; i < toBinary.length; i++) {
			System.out.print(toBinary[i]);
		}
		sc.close();
	}

}
