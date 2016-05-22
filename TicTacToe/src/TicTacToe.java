import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// welcome message and add players
		System.out.println("Let's play.");
		System.out.println("Player one play with X!");
		System.out.println("Player two play with O!");
		// boolean variables - who wins
		boolean player1Won = false;
		boolean player2Won = false;
		// variables for a desk
		char x1 = '*';
		char x2 = '*';
		char x3 = '*';
		char y1 = '*';
		char y2 = '*';
		char y3 = '*';
		char z1 = '*';
		char z2 = '*';
		char z3 = '*';
		// print desk
		do {
			for (int i = 0; i <= 6; i++) {
				if (i == 0) {
					System.out.println("  1" + "  2" + "  3");
				} else if (i == 1) {
					System.out.println(" " + x1 + " |" + x2 + " |" + x3);
				} else if (i == 2) {
					System.out.println("X__|__|__");
				} else if (i == 3) {
					System.out.println(" " + y1 + " |" + y2 + " |" + y3);
				} else if (i == 4) {
					System.out.println("Y__|__|__");
				} else if (i == 5) {
					System.out.println(" " + z1 + " |" + z2 + " |" + z3);
				} else {
					System.out.println("Z  |  |  ");
				}
			}
			// player 1 play
			System.out.println("Player 1 it's your turn!");
			char row;
			do {
				System.out.println("Please enter coordinates X, Y or Z!");
				row = sc.next().charAt(0);
			} while (row != 'x' && row != 'y' && row != 'Z');
			int colum;
			do {
				System.out.println("Please enter coordinates 1,2 or 3!");
				colum = sc.nextInt();
			} while (colum != 1 && colum != 2 && colum != 3);
			if (row == 'x' && colum == 1) {
				x1 = 'X';
			} else if (row == 'x' && colum == 2) {
				x2 = 'X';
			} else if (row == 'x' && colum == 3) {
				x3 = 'X';
			} else if (row == 'y' && colum == 1) {
				y1 = 'X';
			} else if (row == 'y' && colum == 2) {
				y2 = 'X';
			} else if (row == 'y' && colum == 3) {
				y3 = 'X';
			} else if (row == 'z' && colum == 1) {
				z1 = 'X';
			} else if (row == 'z' && colum == 2) {
				z2 = 'X';
			} else {
				z3 = 'X';
			}
			// check for winner
			if ((x1 == y1 && x1 == z1 && x1 != '*') || (x2 == y2 && x2 == z2 && x2 != '*')
					|| (x3 == y3 && x3 == z3 && x3 != '*') || (x1 == x2 && x1 == x3 && x1 != '*')
					|| (y1 == y2 && y1 == y3 && y1 != '*') || (z1 == z2 && z1 == z3 && z1 != '*')
					|| (x1 == y2 && x1 == z3 && x1 != '*') || (x3 == y2 && x3 == z1 && x3 != '*')) {
				player1Won = true;
				break;
			}
			// player 2 play
			System.out.println("Player 2 it's your turn!");
			do {
				System.out.println("Please enter coordinates X, Y or Z!");
				row = sc.next().charAt(0);
			} while (row != 'x' && row != 'y' && row != 'Z');
			do {
				System.out.println("Please enter coordinates 1,2 or 3!");
				colum = sc.nextInt();
			} while (colum != 1 && colum != 2 && colum != 3);
			if (row == 'x' && colum == 1) {
				x1 = 'O';
			} else if (row == 'x' && colum == 2) {
				x2 = 'O';
			} else if (row == 'x' && colum == 3) {
				x3 = 'O';
			} else if (row == 'y' && colum == 1) {
				y1 = 'O';
			} else if (row == 'y' && colum == 2) {
				y2 = 'O';
			} else if (row == 'y' && colum == 3) {
				y3 = 'O';
			} else if (row == 'z' && colum == 1) {
				z1 = 'O';
			} else if (row == 'z' && colum == 2) {
				z2 = 'O';
			} else {
				z3 = 'O';
			}
			// check for winner
			if ((x1 == y1 && x1 == z1 && x1 != '*') || (x2 == y2 && x2 == z2 && x2 != '*')
					|| (x3 == y3 && x3 == z3 && x3 != '*') || (x1 == x2 && x1 == x3 && x1 != '*')
					|| (y1 == y2 && y1 == y3 && y1 != '*') || (z1 == z2 && z1 == z3 && z1 != '*')
					|| (x1 == y2 && x1 == z3 && x1 != '*') || (x3 == y2 && x3 == z1 && x3 != '*')) {
				player2Won = true;
				break;
			}
		} while (true);
		//print desk and winner
		System.out.println("  1" + "  2" + "  3");
		System.out.println(" " + x1 + " |" + x2 + " |" + x3);
		System.out.println("X__|__|__");
		System.out.println(" " + y1 + " |" + y2 + " |" + y3);
		System.out.println("Y__|__|__");
		System.out.println(" " + z1 + " |" + z2 + " |" + z3);
		System.out.println("Z  |  |  ");
		if (player1Won) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Pleyer 2 wins!");
		}
	}

}
