import java.util.Scanner;

public class Task02 {
	// Задача 2:
	// Нека по въведен масив да се конструира нов, като половината му
	// елементи са точно като на оригиналния, а другите да са тези
	// елементи, но в обратен ред. Последно, да се изведе новия масив
	// на екрана.
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// positive value for length
		int length;
		do {
			System.out.println("Please enter a positive value for array length!");
			length = sc.nextInt();
		} while (length < 1);
		// create array
		int[] arr = new int[length];
		// fill in
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// create new array by length * 2
		int[] arr1 = new int[length * 2];
		// for 0 to arr1.length
		for (int i = 0; i < arr1.length; i++) {
			// for first half's array fill in with values from first array
			if (i < arr.length) {
				arr1[i] = arr[i];
			} else {
				// for the second fill in same values but reverse
				arr1[i] = arr[(arr.length * 2) - (i + 1)];
			}
		}
		// print arrays
		System.out.println("Input array.");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		System.out.println("New array.");
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		sc.close();
	}

}
