package Assignment5;

import java.util.ArrayList;

public class PopularElection3 implements CalculatePop{

	
	@Override
	public String calculatePop(ArrayList<State> states) {
		int demTotal = 0;
		int repTotal =0;
		
		
	for(State state: states) {
		demTotal += state.getDemPopVote();
		
		repTotal += state.getRepPopVote();
			
	}
	
	System.out.println("The Democratic Popular vote total is:" + demTotal);
	
	System.out.println("The Republican Popular vote total is:" + repTotal);

		
	
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
