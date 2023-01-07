package Assignment5;

import java.util.ArrayList;

public class ElectoralCollegeElection1 implements CalculateElec{

	@Override
	public String calculateElec(ArrayList<State> states) {
		
		int repElecTotal =0;
		int demElecTotal=0;
		for(int i =0; i < states.size();i++) {
			if(i==0) {
				repElecTotal += states.get(i).getElectoralVote();  
            }
			else {
				if (states.get(i).getDemPopVote() > states.get(i).getRepPopVote()) {
					demElecTotal += states.get(i).getElectoralVote();
				}
				else {
					repElecTotal += states.get(i).getElectoralVote();
				}
			}
			
		}
		if (demElecTotal > repElecTotal) {
			return "Democatic Party";
			
		}
		
		else if(repElecTotal > demElecTotal) {
			return "Republican Party";
		}
			 
		else {
			return "Tie";
		}

		
		}
	
		

}
