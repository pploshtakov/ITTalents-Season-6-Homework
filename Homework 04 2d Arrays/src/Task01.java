
public class Task01 {
	// Задача 1:
	// Имате двумерен масив 6х5 от естествени числа, чийто стойности са
	// въведени предварително.
	// Да се състави програма, чрез която се извеждат елементите от масива
	// с най-малката и най-голямата стойност.

	public static void main(String[] args) {
		// create matrix 6x5
		int[][] matrix = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		// values for min and max = matrix[o][o]
		int min = matrix[0][0];
		int max = min;
		// if matrix[i][j] < min or > max
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
		}
		// print matrix
		// print min and max
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}

}
