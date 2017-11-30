import java.util.ArrayList;

public class DemocraticElectoralStrategy1 implements IElectoral{

	@Override
	public String report(ArrayList<State> states) 
	{
		State max=maxElectoralVotes(states);
		int rep=0, dem=0;
		for(State state:states)
		{
			if(state.equals(max) || state.getDemocraticVotes()>state.getRepublicanVotes())
			{
				dem+=state.getElectoralVote();
			}
			else if(state.getRepublicanVotes()>state.getDemocraticVotes())
			{
				rep+=state.getElectoralVote();
			}
			else 
			{
				dem=state.getElectoralVote()/2;
				rep=state.getElectoralVote()/2;
			}
		}
		return "";
	}

	private State maxElectoralVotes(ArrayList<State> states)
	{
		State max=states.get(0);
		for(int i=1; i<states.size(); i++)
		{
			if(states.get(i).getElectoralVote()>max.getElectoralVote())
			{
				max=states.get(i);
			}
		}
		
		return max;
	}
}
