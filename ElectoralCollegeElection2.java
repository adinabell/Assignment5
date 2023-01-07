package Assignment5;

import java.util.ArrayList;

public class ElectoralCollegeElection2 implements CalculateElec {

	
		@Override
		public String calculateElec(ArrayList<State> states) {
			
			int repTotal = 0;
			int demTotal = 0;
			State smallestStateDiff = states.get(0);
			int stateDiff;
			int tempDiff = states.get(0).getDemPopVote() - states.get(0).getRepPopVote();
			
			for(int i=1; i< states.size();i++) {
				
				stateDiff = states.get(i).getDemPopVote() - states.get(i).getRepPopVote();
				
				//tempDiff = stateDiff;
				
				if (stateDiff < tempDiff) {
					
					smallestStateDiff =states.get(i);
					tempDiff = stateDiff;

				}
				
				}
				

			for(int i=0; i< states.size();i++) {
				if ( smallestStateDiff == states.get(i) ) {
					if (states.get(i).getElectoralVote()  % 2 == 0) {
						repTotal += states.get(i).getElectoralVote()/2;
						demTotal +=states.get(i).getElectoralVote() /2;
			
					}
					
					else {
				
							repTotal += (states.get(i).getElectoralVote()/2 ) + 1;
							demTotal +=states.get(i).getElectoralVote() /2 ;
				
					}
					
					
				}
				else {

					if ( states.get(i).getDemPopVote()>  states.get(i).getRepPopVote()) {
						demTotal += states.get(i).getElectoralVote();
					}
					else {
						repTotal += states.get(i).getElectoralVote();
					}
				
					//regular honest way
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
