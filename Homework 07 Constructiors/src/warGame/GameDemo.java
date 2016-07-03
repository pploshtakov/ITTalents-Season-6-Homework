package warGame;

import java.util.Random;

public class GameDemo {

	public static void main(String[] args) {
		Card[] deck = Card.makeNewDeck();
		Player pesho = new Player("Pesho");
		Player ivan = new Player("Ivan");
		shuffleDeck(deck);
		dealCards(pesho, ivan, deck);
		warGame(pesho, ivan);
	}

	private static void warGame(Player p1, Player p2) {
		while (p1.haveCards > 0 && p2.haveCards > 0) {
			Card p1Card = p1.dropCard();
			Card p2Card = p2.dropCard();
			System.out.println(p1.getName() + " droped " + p1Card.getTitle());
			System.out.println(p2.getName() + " droped " + p2Card.getTitle());
			compareCards(p1Card, p2Card, p1, p2);
			System.out.println("-----------------------------");
			if (p1.haveCards == 0 || p2.haveCards == 0) {
				if (p1.getFreePlacesCards() < p2.getFreePlacesCards()) {
					System.out.println(p1.getName() + " win!");
				} else if (p1.getFreePlacesCards() > p2.getFreePlacesCards()) {
					System.out.println(p2.getName() + " win!");
				} else {
					System.out.println("No winner!");
				}
			}
		}
	}


	private static void war(Player p1, Player p2, Card p1Card, Card p2Card) {
		if (p1.haveCards >= 3 && p2.haveCards >= 3) {
			Card p1Card1 = p1.dropCard();
			Card p1Card2 = p1.dropCard();
			Card p1Card3 = p1.dropCard();
			System.out.println(p1.getName() + " droped " + p1Card1.getTitle() + "," + p1Card2.getTitle() + "," + p1Card3.getTitle());
			Card p2Card1 = p2.dropCard();
			Card p2Card2 = p2.dropCard();
			Card p2Card3 = p2.dropCard();
			System.out.println(p2.getName() + " droped " + p2Card1.getTitle() + "," + p2Card2.getTitle() + "," + p2Card3.getTitle());
			int winner = compareCards(p1Card3, p2Card3, p1, p2);
			if (winner == 1) {
				p1.takeCards(p1Card1, p2Card1);
				p1.takeCards(p1Card2, p2Card2);
			} else {
				p2.takeCards(p1Card1, p2Card1);
				p2.takeCards(p1Card2, p2Card2);
			}
		} else {
			warGame(p1, p2);
		}
	}

	private static int compareCards(Card p1Card, Card p2Card, Player p1, Player p2) {
		if (p1Card.getPower() > p2Card.getPower()) {
			System.out.println(p1.getName() + " won this hend!");
			p1.takeCards(p1Card, p2Card);
			return 1;
		} else if (p1Card.getPower() < p2Card.getPower()) {
			System.out.println(p2.getName() + " won this hend!");
			p2.takeCards(p1Card, p2Card);
			return 2;
		} else {
			System.out.println("The cards are same power, it's a war!");
			war(p1, p2, p1Card, p2Card);
		}
		return 0;
	}

	private static void dealCards(Player p1, Player p2, Card[] deck) {
		int cardIndex = 0;
		for (int i = 0; i < p1.myCards.length; i++) {
			p1.myCards[i] = deck[cardIndex++];
			p1.haveCards++;
			p2.myCards[i] = deck[cardIndex++];
			p2.haveCards++;
		}
	}

	private static void shuffleDeck(Card[] deck) {
		int newI;
	    Card temp;
	    Random randIndex = new Random();

	    for (int i = 0; i < deck.length; i++) {

	        // pick a random index between 0 and cardsInDeck - 1
	        newI = randIndex.nextInt(deck.length);

	        // swap cards[i] and cards[newI]
	        temp = deck[i];
	        deck[i] = deck[newI];
	        deck[newI] = temp;
	    }
	}
}
