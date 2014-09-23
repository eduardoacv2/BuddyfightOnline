import java.util.ArrayList;


public class CardDropZone {

	ArrayList<Card> dropZone;
	public CardDropZone(){
		dropZone = new ArrayList<Card>(50);
	}
	
	public Card getCard(Card c){
		dropZone.add(c);
		return c;
	}
	
	public void sendTopDeck(CardDeck d, Card c){
		d.receiveTopCard(c);
		dropZone.remove(c);
	}
	
	public void sendBotDeck(CardDeck d, Card c){
		d.receiveBotCard(c);
		dropZone.remove(c);
	}	
	public void sendToHand(CardHand h, Card c){
		h.getCard(c);
		dropZone.remove(c);
	}
	

}
