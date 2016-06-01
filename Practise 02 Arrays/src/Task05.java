import java.util.Scanner;

public class Task05 {
	// 5. Напишете програма, която за дадена матрица m x n от числа
	// намира реда, в който сумата от елементите е максимална.

	public static void main(String[] args) {
		// enter a positive value for rows and columns
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Please enter a positive value for rows!");
			row = sc.nextInt();
			System.out.println("Please enter a positive value for columns!");
			col = sc.nextInt();
		} while (row < 1 || col < 1);
		// create matrix row * column
		int[][] matrix = new int[row][col];
		// fill in matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please enter a value for row " + (i + 1) + " column " + (j + 1));
				matrix[i][j] = sc.nextInt();
			}
		}
		// variable for max sum
		int maxSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			// print matrix
			// calculate sum for each row and save max
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (i == 0) {
					maxSum = sum;
				}
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		// print max sum
		System.out.println("Max sum of row = " + maxSum);
		sc.close();

	}

}
