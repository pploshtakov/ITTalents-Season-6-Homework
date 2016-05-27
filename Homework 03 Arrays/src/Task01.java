import java.util.Scanner;

public class Task01 {
	/*
	 * Задача 1: Да се прочете масив и да се намери най-малкото число кратно на
	 * 3 от масива.
	 */
	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input length for array, it's a positive number
		int length;
		do {
			System.out.println("Please enter a positive value for array length!");
			length = sc.nextInt();
		} while (length < 1);
		// create array with this length
		int[] arr = new int[length];
		// fill in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// for 0 to array's length chech for division by 3 and save in variable
		int theSmaller = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				// save only the smaller value
				if (theSmaller == 0 || arr[i] < theSmaller && arr[i] % 3 == 0) {
					theSmaller = arr[i];
				}
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
		// print the smaller value
		if (theSmaller == 0) {
			System.out.println("Don't have value division by 3!");
		} else {
			System.out.println("The smaller value division by 3 is " + theSmaller);
		}
		sc.close();
	}

}
