import java.util.ArrayList;

public class CardHand {

	ArrayList<Card> hand;
	public CardHand(){
		hand = new ArrayList<Card>(6);
	}
	
	public Card getCard(Card c){
		hand.add(c);
		return c;
	}

	
}
