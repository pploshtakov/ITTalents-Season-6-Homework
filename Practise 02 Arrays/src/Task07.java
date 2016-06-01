import java.util.Scanner;

public class Task07 {
	// 7. Напишете програма, която за дадена матрица намира
	// произведението на елементите под главния диагонал.
	public static void main(String[] args) {
		// import scanner
		Scanner sc = new Scanner(System.in);
		// create matrix 4*4
		int[][] matrix = new int[4][4];
		// fill in from console
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please enter a value for row " + (i + 1) + " column " + (j + 1));
				matrix[i][j] = sc.nextInt();
			}
		}
		// variable for sum
		int sum = 0;
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
		// calculate sum of elements under diagonal
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				sum += matrix[i][j];
			}
		}
		// print sum
		System.out.println("Sum of elements under diagonal = " + sum);
		sc.close();
	}

}
