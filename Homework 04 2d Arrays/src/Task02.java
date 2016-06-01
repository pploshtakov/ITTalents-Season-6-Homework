import java.util.Scanner;

public class Task02 {
	// Задача 2:
	// Имате квадратен двумерен масив от естествени числа, чийто стойности
	// се въвеждат от конзолата. Да се отпечатат диагоналите на масива.

	public static void main(String[] args) {
		// enter a positive value for rows and columns
		Scanner sc = new Scanner(System.in);
		int side;
		do {
			System.out.println("Please enter a positive value for side of square!");
			side = sc.nextInt();
		} while (side < 1);
		// create matrix side x side
		int[][] matrix = new int[side][side];
		// enter a value for each cell
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please enter a value for row " + i + " column " + j);
				matrix[i][j] = sc.nextInt();
			}
		}
		// print matrix
		System.out.println("Input matrix.");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
		}
		// print diagonals
		System.out.print("Главен диагонал: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i]);
		}
		System.out.println();
		System.out.print("Вторичен диагонал: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j == matrix.length - 1) {
					System.out.print(matrix[i][j]);
				}
			}
		}
		sc.close();
	}

}
