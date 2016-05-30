
public class Task07 {
	// Задача 7:
	// Имате предварително въведени стойности от естествени числа,
	// въведени в квадратна таблица с размери 6 реда и 6 колони.
	// Да се състави програма , чрез която се намира сумата на всички
	// елементи, чиято сума на индекси за ред и колона е четно число.
	// Програмата да извежда формираните суми за всеки отделен ред на
	// квадратната таблица, както и общата сума от тези елементи.
	// Да се използва само един цикъл.

	public static void main(String[] args) {
		// insert matrix 6*6
		int[][] matrix = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		// calculate sum for each cells witch addition row + col % 2 = 0 for
		// every row
		// calculate maxsum from all elements
		int maxSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			if (i % 2 == 0) {
				sum = matrix[i][0] + matrix[i][2] + matrix[i][4];
				System.out.print(matrix[i][0] + "," + matrix[i][2] + "," + matrix[i][4] + " sum = " + sum);
				System.out.println();
			} else {
				sum = matrix[i][1] + matrix[i][3] + matrix[i][5];
				System.out.print(matrix[i][1] + "," + matrix[i][3] + "," + matrix[i][5] + " sum = " + sum);
				System.out.println();
			}
			maxSum += sum;
		}
		// print maxsum
		System.out.println("Max sum = " + maxSum);
	}

}
