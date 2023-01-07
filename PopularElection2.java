package Assignment5;

import java.util.ArrayList;

public class PopularElection2 implements CalculatePop{
	
	@Override
	public String calculatePop(ArrayList<State> states) {
		
		State greatestRepPopVote = null;
		int tempRepVote = 0;
		int demTotal = 0;
		int repTotal = 0;
		int repVote;
		int demVote;
		
		
		for (int i =0; i< states.size(); i++) {
			demVote = states.get(i).getDemPopVote();
			repVote = states.get(i).getRepPopVote();
			
			if (repVote > tempRepVote) {
				greatestRepPopVote = states.get(i);
			
				tempRepVote = repVote;
				
			}
			
			repTotal += states.get(i).getRepPopVote();
			
			demTotal += states.get(i).getDemPopVote();
			
			
		}
		
		repTotal -= greatestRepPopVote.getRepPopVote();
		

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
