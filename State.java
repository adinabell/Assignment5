package Assignment5;

public class State {

	String name;
	int repPopVote;
	int demPopVote;
	int electoralVote;
	
	
	public State(String name, int repPopVote, int demPopVote, int electoralVote) {
		this.name = name;
		this.repPopVote = repPopVote;
		this.electoralVote= electoralVote;
		this.demPopVote = demPopVote;
			
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRepPopVote() {
		return repPopVote;
	}

	public void setRepPopVote(int repPopVote) {
		this.repPopVote = repPopVote;
	}

	public int getDemPopVote() {
		return demPopVote;
	}

	public void setDemPopVote(int demPopVote) {
		this.demPopVote = demPopVote;
	}

	public int getElectoralVote() {
		return electoralVote;
	}

	public void setElectoralVote(int electoralVote) {
		this.electoralVote = electoralVote;
	}

	
}
