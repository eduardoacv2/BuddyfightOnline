
/*
 * @author Eduardo
 *
 */
public class GamePhase {

	String phase;
	int numP;
	
	public GamePhase(){
		phase = "Start";
		numP = 0;
	}
	
	public void phaseSwitch(int p){
		if(p == 0){
			phase = "Start";
			numP = p;
		}
		else if(p == 1){
			phase = "Main";
			numP = p;
		}
		else if(p == 2){
			phase = "Attack";
			numP =p;
		}
		else if(p == 3){
			phase = "Final";
			numP = p; 
		}
	}
	
	public String getPhase(){
		return phase;
	}
	
	public int getNumPhase(){
		return numP;
	}

}
