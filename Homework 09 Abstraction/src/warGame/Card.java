package warGame;

public class Card {
	private int power;
	private String title;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	public static Card[] makeNewDeck() {
		Card[] deck = new Card[52];
		fillDeck(deck);
		return deck;
	}
	private static void fillDeck(Card[] deck) {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card();
		}
		int card = 1;
		switch (card) {
		case 1:
			deck[0].setTitle("2c");
			deck[0].setPower(2);
		case 2:
			deck[1].setTitle("2d");
			deck[1].setPower(2);
		case 3:
			deck[2].setTitle("2h");
			deck[2].setPower(2);
		case 4:
			deck[3].setTitle("2s");
			deck[3].setPower(2);
		case 5:
			deck[4].setTitle("3c");
			deck[4].setPower(3);
		case 6:
			deck[5].setTitle("3d");
			deck[5].setPower(3);
		case 7:
			deck[6].setTitle("3h");
			deck[6].setPower(3);
		case 8:
			deck[7].setTitle("3s");
			deck[7].setPower(3);
		case 9:
			deck[8].setTitle("4c");
			deck[8].setPower(4);
		case 10:
			deck[9].setTitle("4d");
			deck[9].setPower(4);
		case 11:
			deck[10].setTitle("4h");
			deck[10].setPower(4);
		case 12:
			deck[11].setTitle("4s");
			deck[11].setPower(4);
		case 13:
			deck[12].setTitle("5c");
			deck[12].setPower(5);
		case 14:
			deck[13].setTitle("5d");
			deck[13].setPower(5);
		case 15:
			deck[14].setTitle("5h");
			deck[14].setPower(5);
		case 16:
			deck[15].setTitle("5s");
			deck[15].setPower(5);
		case 17:
			deck[16].setTitle("6c");
			deck[16].setPower(6);
		case 18:
			deck[17].setTitle("6d");
			deck[17].setPower(6);
		case 19:
			deck[18].setTitle("6h");
			deck[18].setPower(6);
		case 20:
			deck[19].setTitle("6s");
			deck[19].setPower(6);
		case 21:
			deck[20].setTitle("7c");
			deck[20].setPower(7);
		case 22:
			deck[21].setTitle("7d");
			deck[21].setPower(7);
		case 23:
			deck[22].setTitle("7h");
			deck[22].setPower(7);
		case 24:
			deck[23].setTitle("7s");
			deck[23].setPower(7);
		case 25:
			deck[24].setTitle("8c");
			deck[24].setPower(8);
		case 26:
			deck[25].setTitle("8d");
			deck[25].setPower(8);
		case 27:
			deck[26].setTitle("8h");
			deck[26].setPower(8);
		case 28:
			deck[27].setTitle("8s");
			deck[27].setPower(8);
		case 29:
			deck[28].setTitle("9c");
			deck[28].setPower(9);
		case 30:
			deck[29].setTitle("9d");
			deck[29].setPower(9);
		case 31:
			deck[30].setTitle("9h");
			deck[30].setPower(9);
		case 32:
			deck[31].setTitle("9s");
			deck[31].setPower(9);
		case 33:
			deck[32].setTitle("10c");
			deck[32].setPower(10);
		case 34:
			deck[33].setTitle("10d");
			deck[33].setPower(10);
		case 35:
			deck[34].setTitle("10h");
			deck[34].setPower(10);
		case 36:
			deck[35].setTitle("10s");
			deck[35].setPower(10);
		case 37:
			deck[36].setTitle("Jc");
			deck[36].setPower(11);
		case 38:
			deck[37].setTitle("Jh");
			deck[37].setPower(11);
		case 39:
			deck[38].setTitle("Jh");
			deck[38].setPower(11);
		case 40:
			deck[39].setTitle("Js");
			deck[39].setPower(11);
		case 41:
			deck[40].setTitle("Qc");
			deck[40].setPower(12);
		case 42:
			deck[41].setTitle("Qd");
			deck[41].setPower(12);
		case 43:
			deck[42].setTitle("Qh");
			deck[42].setPower(12);
		case 44:
			deck[43].setTitle("Qs");
			deck[43].setPower(12);
		case 45:
			deck[44].setTitle("Kc");
			deck[44].setPower(13);
		case 46:
			deck[45].setTitle("Kd");
			deck[45].setPower(13);
		case 47:
			deck[46].setTitle("Kh");
			deck[46].setPower(13);
		case 48:
			deck[47].setTitle("Ks");
			deck[47].setPower(13);
		case 49:
			deck[48].setTitle("Ac");
			deck[48].setPower(14);
		case 50:
			deck[49].setTitle("Ad");
			deck[49].setPower(14);
		case 51:
			deck[50].setTitle("Ah");
			deck[50].setPower(14);
		default:
			deck[51].setTitle("As");
			deck[51].setPower(14);
		}
	}

	
}
