package Assignment5;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Observer5 extends Elections implements Observer{

	

		public Observer5(Observable observable) {
		
			elec = new ElectoralCollegeElection5();
			pop = new PopularElection3();
		
			observable.addObserver(this);
			
		}
		
		@Override
		public void update(Observable observable, Object arg) {
			if(arg instanceof VotingPlace.pushObject ){
				 VotingPlace.pushObject votingStats =  ( VotingPlace.pushObject)arg; 
				 this.states = votingStats.getStates();
				display();
			}
			
		}
		
		public void display()
		{
			System.out.println("\nObserver 5:");
			displayMessage();
			String popular = pop.calculatePop(states);
			 String electoral = elec.calculateElec(states);		
			 projectedWinner(popular, electoral);

		}
}
