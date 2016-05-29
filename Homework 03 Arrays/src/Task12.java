import java.util.Scanner;

public class Task12 {
	// Задача 12:
	// Да се състави програма, чрез която по предварително въведени 7
	// числа в едномерен масив се разменят местата на елементи с индекси:
	// - 0 и 1 чрез трета променлива;
	// - 2 и 3 чрез събиране;
	// - 4 и 5 чрез умножение.
	// Пример: 1,2,3,4,5,6,7
	// Изход: 2,1,4,3,6,5,7

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
		// print input array
		System.out.println("Input array: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		// slap 0 and 1 with new variable
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		// slap 2 and 3 with addition
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		// slap 4 and 5 with multiplication
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		// print new array
		System.out.println();
		System.out.println("Array witn new values!");
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
