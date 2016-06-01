import java.util.Scanner;

public class Task06 {
	// 6. Напишете програма, която за дадена матрица от символи
	// отпечатва на екрана елементите, които се намират на главния
	// диагонал.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create matrix 5*5
		char[][] chMatrix = new char[5][5];
		// fill in with symbols from console
		for (int i = 0; i < chMatrix.length; i++) {
			for (int j = 0; j < chMatrix[i].length; j++) {
				System.out.println("Please enter a symbol for row " + (i + 1) + " column " + (j + 1));
				chMatrix[i][j] = sc.nextLine().charAt(0);
			}
		}
		// print matrix
		for (int i = 0; i < chMatrix.length; i++) {
			for (int j = 0; j < chMatrix[i].length; j++) {
				if (j == chMatrix[i].length - 1) {
					System.out.print(chMatrix[i][j]);
				} else {
					System.out.print(chMatrix[i][j] + " ");
				}
			}
			System.out.println();
		}
		// print diagonal
		System.out.println();
		System.out.println("Diagonal: ");
		for (int i = 0; i < chMatrix.length; i++) {
			if (i == chMatrix.length - 1) {
				System.out.print(chMatrix[i][i]);
			} else {
				System.out.print(chMatrix[i][i] + ",");
			}
		}
		sc.close();
	}

}
