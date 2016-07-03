package warGame;

public class Player {
	private String name;
	public Card[] myCards = new Card[26];
	private Card[] wonCards = new Card[52];
	private int freePlacesCards = 52;
	public Player(String name) {
		this.name = name;
	}
	public int getFreePlacesCards() {
		return freePlacesCards;
	}
	int haveCards = 0;
	public Card dropCard() {
		return myCards[myCards.length - haveCards--];
	}
	public String getName() {
		return this.name;
	}
	public void takeCards(Card p1Card, Card p2Card) {
		if (freePlacesCards > 0) {
			this.wonCards[wonCards.length - this.freePlacesCards--] = p1Card;
			this.wonCards[wonCards.length - this.freePlacesCards--] = p2Card;
		}
	}
}
