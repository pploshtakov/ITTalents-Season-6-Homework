import java.util.Scanner;

public class TheMaze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] card = new char[20][20];
		//player
		char player = '@';
		//rock
		char rock = 'o';
		int countStars = 0;
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card[i].length; j++) {
				//framework 
				if(i == 0 || i == card.length - 1) {
					card[i][j] = '_';
					continue;
				}
				if (j == 0 || j == card[i].length - 1) {
					card[i][j] = '|';
				}
				//random stars
				if (countStars < 40) {
					int randI = 0;
					int randJ = 0;
					while(card[randI][randJ] != '*') {
						randI = 1 + (int) (Math.random() * 19);
						randJ = 1 + (int) (Math.random() * 19);
						if (card[randI][randJ] != '*') {
							card[randI][randJ] = '*';
							countStars++;
						}
					}
				}
			}
		}
		//player started from card[1][1]
		card[1][1] = player;
		//rock started from card[2][2]
		card[2][2] = rock;
		//player's move
		char move;
		do {
			System.out.println("Please enter 'w' for up, 'x for down, 'd' for right or 'a' for left!" );
			move = sc.nextLine().charAt(0);
		}while(move == 'w' || move == 'x' || move == 'd' || move == 'a');
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card.length; j++) {
				System.out.print(card[i][j] + "");
			}
			System.out.println();
		}
	}

}
