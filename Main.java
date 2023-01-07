package Assignment5;

import java.util.ArrayList;

public class Main {

	
	
	public static void main(String [] args) {
		
		

//
//		VotingPlace vp = new VotingPlace();
//		Observer5 honest = new Observer5(vp);
//		Observer4 demPopAndElecHonest = new Observer4(vp);
//		Observer3 popDemElecRep = new Observer3(vp);
//		Observer2 favorDem = new Observer2(vp);
//		Observer1 favorRep = new Observer1(vp);
//		
//		
		
		State PA = new State ("Pennsylvania", 4800 , 3400,20);
		
		State NJ = new State ( "NewJersey", 5900,3700, 14);
		
		State NY = new State(" NewYork", 3700, 2500, 27);
		
		State CT = new State("Conneticut", 1200, 5200, 10);
		
		State FL = new State("Florida", 4900, 3000, 19);

	    ArrayList<State> states = new ArrayList<State>();

		
		states.add(PA);
		states.add(NJ);
		states.add(NY);
		states.add(CT);
		states.add(FL);

		
		VotingPlace vp = new VotingPlace();
		Observer5 honest = new Observer5(vp);
		Observer4 demPopAndElecHonest = new Observer4(vp);
		Observer3 popDemElecRep = new Observer3(vp);
		Observer2 favorDem = new Observer2(vp);
		Observer1 favorRep = new Observer1(vp);
		
		
		
		vp.setStates(states);
		
		changeResults(vp);
		
		
		
	}
	
	public static void changeResults(VotingPlace vp) {
		
		ArrayList<State> diffStates = new ArrayList<State>();

		State TX = new State ("Texas", 5800 , 4400,28);
		
		State OH = new State ( "Ohio", 6900,4700, 24);
		
		State CA = new State(" California", 5700, 3500, 29);
		
		State AL = new State("Alabama", 4200, 3200, 7);
		
		State MI = new State("Mississippi", 5900, 5000, 29);

		
		diffStates.add(TX);
		diffStates.add(OH);
		diffStates.add(CA);
		diffStates.add(AL);
		diffStates.add(MI);

		vp.setStates(diffStates);
		

		State ID = new State ("Idaho", 2800 , 3400, 20);
		
		State WA = new State ( "Washington", 5900, 3700, 12);
		
		State OR = new State(" Oragon", 2700, 3500, 23);
		
		State MA = new State("Main", 3200, 5200, 16);
		
		State VR = new State("Vermont", 2300, 3000, 25);

		
		diffStates.add(ID);
		diffStates.add(WA);
		diffStates.add(OR);
		diffStates.add(MA);
		diffStates.add(VR);

		vp.setStates(diffStates);
	}
	
	


			
}
