import java.util.Scanner;

public class Task17 {
	// Задача 17:
	// Една редица от естествени числа ще наричаме зигзагообразна нагоре,
	// ако за елементите и са изпълняват условията:
	// N1 < N2 > N3 < N4 > N5 <..
	// Съставете програма, която проверява дали въведени в едномерен
	// масив редица от числа изпълняват горните изисквания.
	// Пример: 1 3 2 4 3 7
	// Изход: изпълнява изискванията за зигзагообразна нагоре редица

	public static void main(String[] args) {
		// import scanner
		Scanner sc = new Scanner(System.in);
		// enter a positive value for length
		int length;
		do {
			System.out.println("Please enter a positive value for array length!");
			length = sc.nextInt();
		} while (length < 1);
		// fill in array
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// приемаме че масива е зигзагообразен нагоре
		boolean isZigzag = true;
		// chech zigzag
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i - 1] > arr[i] || (i != arr.length - 1 && arr[i + 1] > arr[i])) {
				isZigzag = false;
				break;
			} else if (i == arr.length - 1 && arr[i - 1] > arr[i]) {
				isZigzag = false;
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
		// масива е/не е зигзагообразен нагоре
		System.out.println();
		System.out.println(isZigzag ? "Масива е зигзагообразен нагоре!" : "Масива не е зигзагообразен нагоре!");
		sc.close();
	}

}
