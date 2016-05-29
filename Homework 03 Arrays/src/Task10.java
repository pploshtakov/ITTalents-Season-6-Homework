import java.util.Scanner;

public class Task10 {
	// Задача 10:
	// Да се състави програма, чрез която се въвеждат 7 цели числа в
	// едномерен масив.
	// Програмата да изведе числото, което е най-близко до средната
	// стойност на въведените числа.
	// Пример: 1,2,3,4,5,6,7
	// Изход: средна стойност 4, най-близка стойност 4

	public static void main(String[] args) {
		// enter a length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for length!");
			length = sc.nextInt();
		} while (length < 1);
		int[] arr = new int[length];
		// fill in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// calculate the middle value
		int sum = 0;
		int mid;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		mid = sum / arr.length;
		// search nearest value in the array
		int nearest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mid) {
				nearest = arr[i];
				break;
			} else if (arr[i] < nearest && arr[i] > mid || arr[i] < mid && arr[i] > nearest) {
				nearest = arr[i];
			}
		}
		// print array
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		// print the middle value and nearest
		System.out.println();
		System.out.println("The middle value of array is: " + mid + "; The nearest value to middle is: " + nearest);
		sc.close();
	}

}
