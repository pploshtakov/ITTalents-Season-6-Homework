import java.util.Scanner;

public class Task06 {
	// Задача 6:
	// Напишете програма, която първо чете 2 масива и после извежда
	// съобщение дали са еднакви, и дали са с еднакъв размер.

	public static void main(String[] args) {
		// enter positive values for lengths
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for first array length!");
			length = sc.nextInt();
		} while (length < 1);
		int length1;
		do {
			System.out.println("Please enter a positive value for second array length!");
			length1 = sc.nextInt();
		} while (length1 < 1);
		// create arrays and fill in
		int[] arr = new int[length];
		int[] arr1 = new int[length1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell from firs array " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter a value for cell from second array " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		// compare lengths
		boolean lengthsAreEqual = true;
		boolean arraysAreEqual = true;
		if (length != length1) {
			lengthsAreEqual = false;
			arraysAreEqual = false;
		} else {
			// if lengths are equal compare arrays
			for (int i = 0; i < arr1.length; i++) {
				if (arr[i] != arr1[i]) {
					arraysAreEqual = false;
					break;
				}
			}
		}
		// print input arrays
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
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		System.out.println();
		System.out.println(lengthsAreEqual ? "Arrays are with equal lengths!" : "Arrays aren't with equal lengts! ");
		System.out.println(arraysAreEqual ? "Arrays are equal!" : "Arrays aren't equal!");
		sc.close();
	}

}
