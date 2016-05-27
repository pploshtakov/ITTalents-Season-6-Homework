import java.util.Scanner;

public class Task04 {
	// Задача 4:
	// Да се прочете масив и да се отпечата дали е огледален.
	// Следните масиви са огледални:
	// [3 7 7 3]
	// [4]
	// [1 55 1]
	// [6 27 -1 5 7 7 5 -1 27 6]
	public static void main(String[] args) {
		// enter a positive value for length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for array length!");
			length = sc.nextInt();
		} while (length < 1);
		// create array
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// check for mirror
		boolean isMiroor = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - (i + 1)]) {
				isMiroor = false;
				break;
			}
		}
		// it's mirror/is't mirror
		System.out.println(isMiroor ? "Array is mirror's!" : "Array isn't mirror's!");
		sc.close();
	}

}
