import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * This class works with the deck and all its functions. Contents, shuffling, etc.
 * @author: Eduardo J. Acevedo Candelaria
 */
public class CardDeck {

	ArrayList<Card> deck;
	Card buddy;
	Card flag;
	
	/*
	 * Creates an ArrayList of Card objects
	 */
	
	public CardDeck(){
		deck = new ArrayList<Card>(50);
	}
	
	public Iterator<Card> iterator(){
		return deck.iterator();
	}
	
	/*
	 * Shuffles the array's elements randomly, using the Fisher-Yates algorithm
	 */
	
	
	public void shuffle(){
		Random rand = new Random();
		for(int s = 0; s < 10; s++){
			for(int i = deck.size() - 1; i > 0; i--){
				Card temp = new Card();
				int r= rand.nextInt(i + 1);
				temp = deck.get(r);
				deck.set(r, deck.get(i));
				deck.set(i, temp);
			}
		}
	}
	
	/*
	 * Sends the first element from the deck (top of the deck) to the CardHand h.
	 */
	public void draw(CardHand h){
		if(deck.size() > 0){
			h.getCard(deck.remove(0));
		}
	}
	
	/*
	 * Sends the first element from the deck (top of the deck) to the Drop Zone.
	 */
	public void mill(CardDropZone d){
		if(deck.size() > 0){
			d.getCard(deck.remove(0));
		}
	}
	
	/*
	 * Sends the first element from the deck (top of the deck) to the gauge.
	 */
	public void chargeGauge(CardGauge g){
		if(deck.size() > 0){
			g.addGauge(deck.remove(0));
		}
	}

	/*
	 * Receives a card to add to the top of the deck. 
	 */
	public void receiveTopCard(Card c){
			deck.add(0, c);
	}
	
	/*
	 * Receives a card to add to the bottom of the deck.
	 */
	public void receiveBotCard(Card c){
			deck.add(c);
	}

	/*
	 * Sends the chosen card (input from listeners) in deck to the drop zone
	 */
	public void sendCardToDrop(Card c, CardDropZone d){
		if (deck.size() > 0){
		d.getCard(c);
		deck.remove(c);
		}
	}
	
	/*
	 * Sends the chosen card (input from listeners) in deck to the hand.
	 */
	public void sendCardToHand(Card c, CardHand h){
		if (deck.size() > 0){
		h.getCard(c);
		deck.remove(c);
		}
	}
	
	/*
	 * Sends the top card in deck to the soul (CardField element after first). Fails if the addToSoul fails.
	 */
	public void sendTopToSoul(Card c, CardField f){
		boolean worked = false;
		if (deck.size() > 0){
		worked = f.addToSoul(deck.get(0));
		if(worked)
			deck.remove(0);
		}
	}
	
	/*
	 * Sends the chosen card (input from listeners) to the soul. Fails if the addToSoul fails.
	 */
	public void sendCardToSoul(Card c, CardField f){
		boolean worked = false;
		if (deck.size() > 0){
		worked = f.addToSoul(c);
		if(worked)
			deck.remove(c);
		}
	}
	
	/*
	 * Sets the buddy card for the deck.
	 */
	public boolean setBuddy(Card c){
		if(c.getType().equals("MONSTER")){
			buddy = c;
			return true;
		}
		else
			return false;
	}
	
	/*
	 * Sends information on who the buddy card is.
	 */
	public Card getBuddy(){
		return buddy;
	}
	
	/*
	 * Sets the flag to be used for the deck.
	 */
	public boolean setFlag(Card c){
		if(c.getType().equals("FLAG")){
			flag = c;
			return true;
		}
		else
			return false;
	}
	
	/*
	 * Returns the information on the flag.
	 */
	public Card getFlag(){
		return flag;
	}
	
	/*
	public void sendCardToGauge(Card c, CardGauge g){
		g.addGauge(c);
		deck.remove(c);
	} This will be added if the game ever needs the function.
	*/
	
	public void displayDeck(){
		/*
		 * Code to display will go here
		 */
	}
}
