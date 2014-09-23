import java.awt.image.BufferedImage;

/*
 * This class defines the Card object, its values, and its getters and setters; 
 * @author: Eduardo J. Acevedo Candelaria
 */
public class Card {

	private int power;
	private int defense;
	private int critical;
	private String name;
	private String skill;
	private BufferedImage image;
	private String world;
	private String attribute;
	private int size;
	private String flavor;
	private String type;
	
	
	
	/*
	 * Constructs an empty Card object.
	 */
	public Card(){
		power = -1;
		defense = -1;
		critical = -1;
		name = null;
		skill = null;
		image = null;
		world = null;
		attribute = null;
		size = -2;
		flavor = null;
		type = null;
	}
	
	/*
	 * Constructs a Card Object
	 * @param p is an integer number representing the attacking power of the card.
	 * @param d is an integer number representing the defending power of the card.
	 * @param c is an integer number representing the critical power, or damage dealt, by the card.
	 * @param n is a string representing the name of the card.
	 * @param i is a BufferedImage object which contains the artwork of the card.
	 * @param w is a string which contains the world the card belongs to
	 * @param a is a string which contains the attribute(s) of the card
	 * @param si is an integer number which contains the size of a monster card, which range from 0 to 3. A value
	 * of -1 indicates the card is not a monster.
	 * @param f is a string which contains the flavor text of the card.
	 * @param String t is a string which contains the type of the card, the types should be: 'MONSTER', 'IMPACT',
	 * 'ITEM', 'FLAG', or  'SPELL'. Other values will return error messages.
	 */
	public Card(int p, int d, int c, String n, String s, BufferedImage i, String w, String a, int si, String f, String t){
		power = p;
		defense = d;
		name = n;
		skill = s;
		image = i;
		setWorld(w);
		setSize(si);
		setFlavor(f);
		setType(t);
	}
	
	/*
	 * A list of getters and setters.
	 */
	public int getPower(){
		return power;
	}
	
	public int getDefense(){
		return defense;
	}
	
	public int getCritical(){
		return critical;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSkill(){
		return skill;
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public void setPower(int p){
		power = p;	
	}
	
	public void setDefense(int d){
		defense = d;
	}
	
	public void setCritical(int c){
		critical = c;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setSkill(String s){
		skill = s;
	}
	
	public void setImage(BufferedImage i){
		image = i;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
