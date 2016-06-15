import java.util.Scanner;

public class Task12 {
	// Задача 12:
	// Да се създаде метод, който приема за входни данни число N и
	// връща масив от числа с дължина N, който съдържа всички числа
	// от 1 до N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number.");
		int n = sc.nextInt();
		n = validateNumber(n, sc);
		System.out.println("Array with number from 1 to N.");
		printArray(createArrayToN(n));
		sc.close();
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	private static int[] createArrayToN(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	private static int validateNumber(int n, Scanner sc) {
		while (n < 1) {
			System.out.println("Please enter again! Must be a positive number!");
			n = sc.nextInt();
		}
		return n;
	}

}
