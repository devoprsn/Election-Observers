
import java.util.*;

public class VotingPolls extends Observable{
	
	public class VotingStats 
	{
		public ArrayList<State> states;
		public VotingStats(ArrayList<State> states)
		{
			this.states=new ArrayList<State>(states.size());
			for(State state:states)
			{
				this.states.add(state); 
			}
		}
	}

	private ArrayList<State> states; 
	
	public VotingPolls(ArrayList<State> states) 
	{
		this.states=states;	
	}
	
	public void addVotes(String state, int repVotes, int demVotes)
	{
		for(State s: states)
		{
			if(s.getName().equalsIgnoreCase(state))
			{
				s.addRepublicanVotes(repVotes);
				s.addDemocraticVotes(demVotes);
				break;
			}
		}
		votesChanged();
	}
	
	public void votesChanged()
	{
		setChanged();
		notifyObservers(new VotingStats(states));
	}
}
