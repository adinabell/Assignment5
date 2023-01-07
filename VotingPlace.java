package Assignment5;	

import java.util.ArrayList;
import java.util.Observable;

//I used the push method to push notifications 

public class VotingPlace extends Observable {

	
	public class pushObject {
		private ArrayList<State> states;
		
		
		public pushObject(ArrayList<State> states) {
			this.states = states;
		}
		
		public ArrayList<State> getStates(){
			return states;
			
		}
	}
	
	ArrayList<State> states;
	
	public void numsChange() {
		
		setChanged();
		notifyObservers(new pushObject(states));
			
			
			
		
	}
	
	
	
	public void setStates(ArrayList<State> states) {
		this.states = states;
		numsChange();
	}
}
