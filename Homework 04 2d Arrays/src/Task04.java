
public class Task04 {
	// Задача 4:
	// Имате предварително въведени стойности на елементи в двумерен
	// масив - естествени числа.
	// Да се състави програма, чрез която се извеждат стойностите на
	// елементите в двумерен масив след обръщането му на +90 градуса.

	public static void main(String[] args) {
		// create matrix
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// print matrix
		System.out.println("Input matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[j].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
		}
		// print matrix +90
		System.out.println("Input matrix + 90'.");
		for (int j = 0; j < matrix.length; j++) {
			for (int i = matrix.length - 1; i >= 0; i--) {
				if (i == 0) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
		}
	}

}
