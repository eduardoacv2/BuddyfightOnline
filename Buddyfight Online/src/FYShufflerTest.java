import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class FYShufflerTest {
	
	static ArrayList<Integer> deck = new ArrayList<Integer>(50);
	static Iterator<Integer> ite = deck.iterator();
	
	private static void fill(){
		for(int i = 0; i < 50; i++){
			deck.add(i, i);
		}
	}
	 
	private static void shuffle(){
		Random rand = new Random();
		for(int s = 0; s < 10; s++){
			for(int i = deck.size() - 1; i > 0; i--){
				int temp;
				int r= rand.nextInt(i + 1);
				temp = deck.get(r);
				deck.set(r, deck.get(i));
				deck.set(i, temp);
			}
		}
	}
	
	private static void print(){
			for(int i = 0; i < deck.size(); i++){
				System.out.print(deck.get(i) + " ");
			}
			System.out.print("\n\n");
	}
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			fill();
			shuffle();
			print();
			deck.clear();
		}
		return;
	}

}
