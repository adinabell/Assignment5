package Assignment5;

import java.util.ArrayList;

public class ElectoralCollegeElection5 implements CalculateElec{

	@Override
	public String calculateElec(ArrayList<State> states) {
		int demElectoralTotal = 0;
		int repElectoralTotal =0;
		
		
	for(State state: states) {
		
		if ( state.getDemPopVote()>  state.getRepPopVote()) {
			demElectoralTotal += state.getElectoralVote();
		}
		else {
			repElectoralTotal += state.getElectoralVote();
		}
	
			
	}
	
	System.out.println("The Democratic Popular vote total is:" + demElectoralTotal);
	
	System.out.println("The Republican Popular vote total is:" + repElectoralTotal);

		
	
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
