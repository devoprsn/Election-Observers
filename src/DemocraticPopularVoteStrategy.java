import java.util.ArrayList;

public class DemocraticPopularVoteStrategy implements IPopularVote{

	@Override
	public String report(ArrayList<State> states) 
	{
		int rep=0, dem=0;
		State max=maxRepublicanVotes(states);
		for(State state:states)
		{
			if(!state.equals(max))
			{
				rep+=state.getRepublicanVotes();
			}		
			dem+=state.getDemocraticVotes();
		}
		return "";
	}

	private State maxRepublicanVotes(ArrayList<State> states)
	{ 
		State max=states.get(0);		
		for(int i=1; i<states.size(); i++)
		{
			if(states.get(i).getRepublicanVotes()>max.getRepublicanVotes())
			{
				max=states.get(i);
			}
		}
		
		return max;
	}
}
