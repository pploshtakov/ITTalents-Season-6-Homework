import java.util.Scanner;

public class Task07 {
	// Задача 7:
	// Напишете програма, която първо чете масив и после създава нов
	// масив със същия размер по следния начин: стойността на всеки
	// елемент от втория масив да е равна на сбора от предходния и
	// следващият елемент на съответния елемент от първия масив. Първият
	// и последният елемент на втория масив трябва да си останат равни на
	// първият и последният от елемент от първия масив.
	// Да се изведе получения масив.

	public static void main(String[] args) {
		// enter a positive value for length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for first array length!");
			length = sc.nextInt();
		} while (length < 1);
		// create array and fill in
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell from firs array " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// create new array with same length
		int[] arr1 = new int[length];
		for (int i = 0; i < arr1.length; i++) {
			// fill in, first and last one cell of second array are same as
			// those of first
			if (i == 0 || i == arr1.length - 1) {
				arr1[i] = arr[i];
			}
			// all else is equal (arr[i-1] + arr[i+1]) from first array
			else {
				arr1[i] = arr[i - 1] + arr[i + 1];
			}
		}
		// print arrays
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
		sc.close();
	}

}
