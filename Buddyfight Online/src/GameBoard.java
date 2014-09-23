import java.util.ArrayList;


public class GameBoard {

	int player;
	CardHand hand;
	CardGauge gauge;
	CardDeck deck;
	CardDropZone drop;
	CardField monsterLeft;
	CardField monsterCenter;
	CardField monsterRight;
	CardField flag;
	CardField weapon;
	CardField buddy;
	ArrayList<CardField> spells = new ArrayList<CardField>(); 
	LifeCounter life;
	
	public GameBoard(int p, CardDeck d){
		this.player = p;
		this.hand = new CardHand();
		this.gauge = new CardGauge();
		this.deck = d;
		this.drop = new CardDropZone();
		this.monsterLeft = new CardField("MONSTER");
		this.monsterCenter = new CardField("MONSTER");
		this.monsterRight = new CardField("MONSTER");
		this.flag = new CardField("FLAG");
		this.spells.add(new CardField("SPELL"));
		this.buddy = new CardField("BUDDY");
		this.life = new LifeCounter();
		deck.shuffle();
		buddy.setActive(deck.getBuddy());
		flag.setActive(deck.getFlag());
		for(int i = 0; i < 6; i++)
			deck.draw(hand);
		for(int j = 0; j < 2; j++)
			deck.chargeGauge(gauge);
	}
	
	

}
