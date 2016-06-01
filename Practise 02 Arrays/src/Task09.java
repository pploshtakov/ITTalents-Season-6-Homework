
public class Task09 {
	// 9. Дадена е правоъ­гълна матрица с числа. Да се намери в нея
	// максималната подмат­рица с размер 2 х 2 и да се отпечата на
	// конзолата. Под максимална подматрица се разбира
	// подматрица, която има максимална сума на елементите, които я
	// съставят.

	public static void main(String[] args) {
		// insert matrix
		int[][] matrix = { { 25, 18, 42, 35, 11, 20 }, { 85, 19, 78, 35, 12, 29 }, { 11, 15, 19, 14, 25, 23 },
				{ 45, 83, 64, 27, 84, 33 }, { 34, 42, 38, 24, 19, 16 } };
		// variables for first index of sub matrix
		int iMaxSum = 0;
		int jMaxSum = 0;
		// variable for max sum
		int maxSum = 0;
		// search max sum in sub matrix 2x2
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				if (i == 0 && j == 0) {
					maxSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
				} else {
					if (maxSum < matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]) {
						maxSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
						iMaxSum = i;
						jMaxSum = j;
					}
				}
			}
		}
		// print matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
		// print sub matrix and max sum
		System.out.println("Sub matrix with max sum:");
		System.out.print(matrix[iMaxSum][jMaxSum] + "," + matrix[iMaxSum][jMaxSum + 1]);
		System.out.println();
		System.out.print(matrix[iMaxSum + 1][jMaxSum] + "," + matrix[iMaxSum + 1][jMaxSum + 1]);
		System.out.println();
		System.out.println("Max sum = " + maxSum);
	}

}
