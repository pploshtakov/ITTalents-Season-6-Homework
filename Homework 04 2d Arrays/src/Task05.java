
public class Task05 {
	// Задача 5:
	// Да се състави програма, при която предварително са въведени
	// естествени числа в двумерен масив 4*4 елемента.
	// Програмата да извежда резултат от проверката какво е съотношението
	// на най-голямата сума по редове спрямо най-голямата сума по колони.

	public static void main(String[] args) {
		// create matrix 4*4
		int[][] matrix = { { 25, 15, 89, 34 }, { 47, 11, 13, 10 }, { 98, 84, 51, 62 }, { 46, 42, 98, 11 } };
		// variables maxSumRow and maxSumCol
		int maxSumRow = 0;
		int maxSumCol = 0;
		// calculate sum of every row
		// calculate sum of every column
		for (int i = 0; i < matrix.length; i++) {
			int sumRow = 0;
			int sumCol = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sumRow += matrix[i][j];
				sumCol += matrix[j][i];
				// print matrix
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
			}
		}
		// print maxSumRow and maxSumCol and who is the bigger
		System.out.println("Max sum of row = " + maxSumRow);
		System.out.println("Max sum of column = " + maxSumCol);
		if (maxSumRow > maxSumCol) {
			System.out.println("Max sum of row > max sum of column!");
		} else if (maxSumCol > maxSumRow) {
			System.out.println("Max sum of row < max sum of column!");
		} else {
			System.out.println("Max sum of row = max sum of column!");
		}
	}

}
