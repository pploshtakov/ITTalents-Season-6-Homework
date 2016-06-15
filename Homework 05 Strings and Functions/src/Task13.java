
public class Task13 {
	// Задача 13:
	// Да се създаде метод, който приема два масива от числа и връща
	// масив, съдържащ всички елементи на подадените масиви, като в
	// първата част на масива са елементите на първия подаден масив,
	// а във втората част – тези на втория подаден масив.
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11 };
		int[] arr1 = { 2, 4, 6, 8, 0, };
		int[] arrNew = createNewArray(arr, arr1);
		printArray(arrNew);
	}

	static int[] createNewArray(int[] arr, int[] arr1) {
		int[] newArr = new int[arr.length + arr1.length];
		for (int i = 0; i < newArr.length; i++) {
			if (i < arr.length) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr1[i - arr.length];
			}
		}
		return newArr;
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
