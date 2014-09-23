
public class CardDisplay {

	Card display1;
	Card display2;
	
	public CardDisplay(){
		display1 = null;
		display2 = null;
	}
	
	public void setDisplay(Card c, int player){
		if(player == 1){
			display1 = c;
		}
		else if(player == 2){
			display2 = c;
		}
	}

}
