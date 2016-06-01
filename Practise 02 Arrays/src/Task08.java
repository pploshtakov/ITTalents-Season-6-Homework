
public class Task08 {
	// 8. Напишете програма, която за матрица от булеви стойности,
	// проверява дали се съдържа елемент със стойност true над
	// втория диагонал.
	public static void main(String[] args) {
		// insert matrix of booleans
		boolean[][] matrix = { { true, false, false, true }, { false, false, true, false },
				{ false, false, true, true }, { false, true, true, true } };
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
		// check for true over second diagonal
		boolean haveTrue = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length - (i + 1); j++) {
				if (matrix[i][j]) {
					haveTrue = true;
					break;
				}
			}
		}
		System.out.println(
				haveTrue ? "There are 'true' over second diagonal." : "There aren't 'true' over second diagonal. ");
	}

}
