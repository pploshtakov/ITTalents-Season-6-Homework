import java.util.Scanner;

public class Task03 {
	// Задача 3:
	// Имате двумерен масив от числа, чийто стойности са въведени
	// предварително. Да се отпечатат сумата на елементите на масива,
	// както и средноаритметичното на тези числа.

	public static void main(String[] args) {
		// enter a positive values for rows and columns
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Please enter a positive value for rows!");
			row = sc.nextInt();
			System.out.println("Please enter a positive value for columns!");
			col = sc.nextInt();
		} while (row < 1 || col < 1);
		// create matrix row x column
		double[][] matrix = new double[row][col];
		// enter a value for each cell
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please enter a value for row " + i + " column " + j);
				matrix[i][j] = sc.nextDouble();
			}
		}
		// sum and average
		double sum = 0;
		// print matrix and calculate sum
		System.out.println("Input matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
		}
		// print sum and average
		double average = sum / (matrix.length * matrix[0].length);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		sc.close();
	}

}
