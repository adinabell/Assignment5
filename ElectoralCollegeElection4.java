package Assignment5;

import java.util.ArrayList;

public class ElectoralCollegeElection4 implements CalculateElec {

	
	

	@Override
	public String calculateElec(ArrayList<State> states) {
		
		int repMultipliedVotes;
		int demElectoralTotal = 0;
		int repElectoralTotal = 0;
		
		
		for (int i=0; i<states.size();i++) {
			repMultipliedVotes = (int) (states.get(i).getRepPopVote() * .02);
			
			
			if ( states.get(i).getDemPopVote()> repMultipliedVotes) {
				demElectoralTotal += states.get(i).getElectoralVote();
			}
			else {
				repElectoralTotal += states.get(i).getElectoralVote();
			}
			
			
		
	}
		
		if (demElectoralTotal > repElectoralTotal) {
			 return "Democatic Party";
			
		}
		
		  else if(repElectoralTotal > demElectoralTotal) {
			 return "Republican Party";
		}
			 
		  else {
			 return "Tie";
		}
	}
	
	
}
