
import java.util.*;

public class VotingPolls extends Observable{
	
	public class VotingStats 
	{
		public ArrayList<State> states;
		public VotingStats(ArrayList<State> states)
		{
			 this.states=states; //shallow?
		}
		public ArrayList<State> getStates()
		{
			return states;
		}
	}

	private ArrayList<State> states; 
	
	public VotingPolls(ArrayList<State> states) 
	{
		this.states=states;
		
	}
	
	public void addVotes(State state)
	{
		for(State s: states)
		{
			if(state.getName().equals(s.getName()))
			{
				s.setDemocraticVotes(state.getDemocraticVotes());
				s.setRepublicanVotes(state.getRepublicanVotes());
			}
		}
		votesChanged();
	}
	
//	public void setAllVotes(ArrayList<State> states)
	
	public void votesChanged()
	{
		setChanged();
		notifyObservers(new VotingStats(states));
	}
}
