package Assignment5;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Observable;

public abstract class Elections {

	//each observer is going to extend elections
	
	protected ArrayList<State> states;
	
	protected CalculatePop pop;
	
	protected CalculateElec elec;
	
	protected String Date_Formatter= "yyyy-MM-dd HH-MM";
	
	//update method 
	
	public abstract void update(Observable Observable, Object State);
	public abstract void display();
	
	
	public void displayMessage() {
		
		//Print the legal notice
		System.out.println( "All reports are purely observational and not legally binding in any way");
		
		
		
		
		Date date = new Date();	
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = sdf.format(date);
	    
	    System.out.println(dateString);

	   
		
	}
	
	public void projectedWinner(String popular, String electoral) {
		
		if (popular.equals("Republican Party")) {
			
			System.out.println( "The projected winner is the Republican Party!");
		}
		else if (popular.equals("Democatic Party")) {
			System.out.println( "The projected winner is the Democratic Party!");

		}
		
		else {
			System.out.println("The projected winner can not be determined");

		}
		
		
	}
	
}