
public class Task11 {
	// Задача 11:
	// Да се създаде метод, който отпечатва масив в конзолата.
	public static void main(String[] args) {
		int[] arr = { 77, 66, 55, 47, 39, 22, 14, 96, 88 };
		System.out.println("Array:");
		printArray(arr);
		int[][] matrix = { { 44, 33, 55 }, { 77, 99, 72 }, { 12, 94, 51 } };
		System.out.println();
		System.out.println("Matrix:");
		printMatrix(matrix);
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

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			printArray(matrix[i]);
		}
	}
}
