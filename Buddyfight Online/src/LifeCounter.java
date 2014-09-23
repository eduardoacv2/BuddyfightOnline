
public class LifeCounter {

	int life;
	
	public LifeCounter(){
		life = 10;
	}

	public int showLife(){
		return life;
	}
	
	public int reduceLife(){
		life--;
		return life;
	}
	
	public int gainLife(){
		life++;
		return life;
	}
}
