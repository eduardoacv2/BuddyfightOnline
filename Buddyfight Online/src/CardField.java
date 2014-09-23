import java.util.ArrayList;


public class CardField {

	ArrayList<Card> zone;
	Card active = null;
	String type;
	boolean standing;
	boolean hasActive;
	
	/*
	 * Creates a zone for card to be played to. The first element in the array is the active card, 
	 * while the rest are considered the soul for the active card. Variable standing determines
	 * if the card in the zone has been used, if there is no active card, the value is false; if 
	 * there is an active card, then standing is true if the card hasn't been used from its 
	 * zone and therefore is standing, otherwise the value is false, and the unit is resting.
	 */
			
	public CardField(String t){
		zone = new ArrayList<Card>(10);
		hasActive = false;
        standing =  false;
        type = t;
	}
	
	/*
	 * Makes use of the CardField object by adding and setting an active card to the Card Zone. Set the card
	 * as active in the variable. 
	 */
	
	public void setActive(Card c){
		zone.add(0, c);
		active = zone.get(0);
		hasActive = true;
		standing = true;
	}
	
	/*
	 * Places cards into the soul of the active card. If the zone has no active card (isn't in play) the 
	 * function returns false. If it has an active card, then it places the card into the soul, and 
	 * returns true.
	 */
	
	public boolean addToSoul(Card c){
		if(hasActive){
			zone.add(c);
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	 * Retires active card to the drop zone, if the card had soul, then it is all sent to the drop zone
	 * as well.
	 */
	public boolean retireActive(CardDropZone d){
		
		if(hasActive){
			for(int i = zone.size()-1 ; i >= 0; i--){
				d.getCard(zone.get(i));
				zone.remove(i);
			}
			hasActive = false;
			standing = false;
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	 * Sends active card to gauge. If the card had soul, then it is all sent to the drop zone.
	 */
	public boolean activeToGauge(CardGauge g, CardDropZone d){
		if(hasActive){
			for(int i = zone.size()-1 ; i >= 1; i--){
				d.getCard(zone.get(i));
				zone.remove(i);
			}
			g.addGauge(active);
			zone.remove(0);
			hasActive = false;
			standing = false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean removeSoul(int i, CardDropZone d){
		if(i > 0 && zone.size() >  i){
			d.getCard(zone.get(i));
			zone.remove(i);
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	public boolean gaugeSoul(int i, CardGauge g){
		if(i > 0 && zone.size() >  i){
			g.addGauge(zone.get(i));
			zone.remove(i);
			return true;
		}
		else{
			return false;
		}
	} This will be implemented if the game ever needs it.
	 */
	
	public Card getActive(){
		return active;
	}
	
	public boolean hasActive(){
		return hasActive;
	}
	
	public boolean isStanding(){
		return standing;
	}
	public void standUnit(){
		if(hasActive){
			standing = true;
		}
	}
	
	public void restUnit(){
		if(hasActive){
			standing = false;
		}
	}
	
	public ArrayList<Card> getContent(){
		return zone;
	}
	
	public void setContent(ArrayList<Card> z){
		zone = z;
	}
	
	public boolean activeSentToHand(CardHand h, CardDropZone d){
		if(hasActive){
			for(int i = zone.size()-1 ; i >= 1; i--){
				d.getCard(zone.get(i));
				zone.remove(i);
			}
			h.getCard(active);
			zone.remove(0);
			hasActive = false;
			standing = false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String t){
		type = t;
	}
	
	public CardField moveZones(CardField f){
		CardField temp = new CardField(this.getType());
		temp = this;
		zone= f.getContent();
		active= f.getActive();
		standing = f.isStanding();
	    hasActive = f.hasActive();	
		return temp;
	}
	
}
