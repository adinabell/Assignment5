package Assignment5;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Observer2 extends Elections implements Observer{


	public Observer2(Observable observable) {
		
		elec = new ElectoralCollegeElection3();
		pop = new PopularElection2();
		
		observable.addObserver(this);
		display();
	}
	@Override
	public void update(Observable observable, Object arg) {
		if(arg instanceof VotingPlace.pushObject ){
			VotingPlace.pushObject votingStats =  (VotingPlace.pushObject)arg; 
			this.states = votingStats.getStates();
			display();
		}
		
	}
	
	public void display()
	{
		System.out.println("\nObserver 2:");
		displayMessage();
		String popular = pop.calculatePop(states);
		 String electoral = elec.calculateElec(states);		
		 projectedWinner(popular, electoral);

	}
	
	
	

			
			
			
			
}
