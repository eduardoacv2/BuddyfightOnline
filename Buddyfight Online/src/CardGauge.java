import java.util.ArrayList;


public class CardGauge {

	ArrayList<Card> gauge;
	
	public CardGauge(){
		gauge = new ArrayList<Card>(50);
	}
	
	public void addGauge(Card c){
		gauge.add(c);
	}
	
	public void useGauge(CardDropZone d, Card c){
		d.getCard(c);
		gauge.remove(c);
	}
	
	public void gaugeToHand(CardHand h, Card c){
		h.getCard(c);
		gauge.remove(c);
	}
	
	public void gaugeToTopDeck(CardDeck d, Card c){
		d.receiveTopCard(c);
		gauge.remove(c);
	}
	
	public void gaugeToBotDeck(CardDeck d, Card c){
		d.receiveBotCard(c);
		gauge.remove(c);
	}
}
