import java.util.Scanner;

public class Task11 {
	// Задача 11:
	// Да се състави програма, която въвежда от клавиатурата 7 цели числа
	// в едномерен масив
	// Програмата да изведе всички числа кратни на 5, но по големи от 5.
	// Пример: -23, -55, 17, 75, 56, 105, 134
	// Изход: 75,105 - 2 числа

	public static void main(String[] args) {
		// import scanner
		Scanner sc = new Scanner(System.in);
		// create array by 7 cells
		int[] arr = new int[7];
		// fill in from console
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
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
		System.out.println();
		int countNum = 0;
		for (int i = 0; i < arr.length; i++) {
			// for each value chech by division by 5 and whether the value is
			// bigger by 5
			// print values who are division by 5
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				countNum++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(" - " + countNum + " numbers who are division by 5 and they are bigger by 5 !");
		sc.close();
	}

}
