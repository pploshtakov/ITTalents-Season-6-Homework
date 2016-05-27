import java.util.Scanner;

public class Task08 {
	// Задача 8:
	// Напишете програма, която намира и извежда най-дългата редица от
	// еднакви поредни елементи в даден масив.

	public static void main(String[] args) {
		// enter a positive value for length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for length!");
			length = sc.nextInt();
		} while (length < 1);
		// create array and fill in
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// counter for equal numbers
		int countEqual = 0;
		int longestSeries = 0;
		// variables for first and last index by series
		int numberOfLongestSeries = 0;
		// if arr[i] = arr[i - 1] count++ else count = 0
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				countEqual++;
				if (countEqual > longestSeries) {
					longestSeries = countEqual;
					numberOfLongestSeries = arr[i - 1];
				}
			} else {
				countEqual = 0;
			}
		}
		// print array
		System.out.println("Input array:");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		// print the longest series
		if (longestSeries == 0) {
			System.out.println();
			System.out.println("Doesn't have same numbers in this array.");
		} else {
			System.out.println();
			System.out.println("The longest series is: ");
			for (int i = 0; i <= longestSeries; i++) {
				if (i == 0) {
					System.out.print("[" + numberOfLongestSeries + ",");
				} else if (i == longestSeries) {
					System.out.print(numberOfLongestSeries + "]");
				} else {
					System.out.print(numberOfLongestSeries + ",");
				}
			}
		}
		sc.close();
	}

}
