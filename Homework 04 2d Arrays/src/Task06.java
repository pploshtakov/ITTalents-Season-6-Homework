
public class Task06 {
	// Задача 6:
	// Имате предварително въведени стойности от естествени числа.
	// Числата са въведени в квадратна таблица с размери 6 реда и 6
	// колони.
	// Да се състави програма, чрез която се намира сумата на всички
	// елементи от редовете с четни номера: 2,4 и 6.
	// Програмата да извежда и сумата на всеки отделен ред
	public static void main(String[] args) {
		// create matrix 6*6
		int[][] matrix = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		// print matrix
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
		System.out.println();
		int sumFromAll = 0;
		for (int i = 1; i < matrix.length; i += 2) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				// calculate sum from every rows 2,4 and 6
				// print sum from each row
				sum += matrix[i][j];
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j] + " sum = " + sum);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			System.out.println();
			sumFromAll += sum;
		}
		// print whole sum
		System.out.println("Sum from all elements of 2,4 and 6 row = " + sumFromAll);
	}

}
