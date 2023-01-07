package Assignment5;

import java.util.ArrayList;

public class ElectoralCollegeElection3 implements CalculateElec {

	@Override
	public String calculateElec(ArrayList<State> states) {
		int repTotal =0;
		int demTotal =0;
		State mostElectoralVotes = null;
		int electoralVoteCount;
		
		int tempElectoralVotes = states.get(0).getElectoralVote();
		
		for(int i =1; i<states.size(); i++) {
			
			electoralVoteCount = states.get(i).getElectoralVote();
			
			if (electoralVoteCount > tempElectoralVotes ) {
				tempElectoralVotes = electoralVoteCount;
				mostElectoralVotes = states.get(i);
				
			}
			
			
		}
		
		for (int i =0; i<states.size(); i++) {
			if (mostElectoralVotes == states.get(i)) {
				demTotal += states.get(i).getElectoralVote();
			}
			else {

				if ( states.get(i).getDemPopVote()>  states.get(i).getRepPopVote()) {
					demTotal += states.get(i).getElectoralVote();
				}
				else {
					repTotal +=states.get(i).getElectoralVote();
				}
			
			}
		}
		
		
		if (demTotal > repTotal) {
			 return "Democatic Party";
			
		}
		
		  else if(repTotal > demTotal) {
			 return "Republican Party";
		}
			 
		  else {
			 return "Tie";
		}

	}

	
}
