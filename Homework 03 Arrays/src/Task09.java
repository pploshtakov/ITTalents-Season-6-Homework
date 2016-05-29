import java.util.Scanner;

public class Task09 {
	// Задача 9:
	// Напишете програма, в която потребителя въвежда масив, след което
	// елементите на масива се обръщат в обратен ред (Целта не е масива да
	// се отпечата в обратен ред, ами първо да се обърне, след което да се
	// отпечата в нормален ред). Пробвайте да решите задачата първо с един
	// допълнителен масив и после без да използвате друг масив.

	public static void main(String[] args) {
		// enter length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for length!");
			length = sc.nextInt();
		} while (length < 1);
		int[] arr = new int[length];
		// enter values for any cells
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// print input array
		System.out.println("Input array is: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		// slap first and last cells, second and last - 1 etc.
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;
		}
		// print array
		System.out.println();
		System.out.println("New array is: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		sc.close();
	}

}
