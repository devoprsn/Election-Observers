import java.util.ArrayList;

public class DemocraticElectoralStrategy1 implements IElectoral{

	@Override
	public String report(ArrayList<State> states) 
	{
		State max=maxElectoralVotes(states);
		int rep=0, dem=0;
		for(State state:states)
		{
			if(state.getRepublicanVotes()==0 && state.getDemocraticVotes()==0)
			{			
			}
			else if(state.equals(max) || state.getDemocraticVotes()>state.getRepublicanVotes())
			{
				dem+=state.getElectoralVote();
			}
			else if(state.getRepublicanVotes()>state.getDemocraticVotes())
			{
				rep+=state.getElectoralVote();
			}
			else 
			{
				dem+=state.getElectoralVote()/2;
				rep+=state.getElectoralVote()/2;
			}
		}
		
		StringBuilder result=new StringBuilder("Electoral vote- ");
		if(rep>dem)
			result.append("Republican candidate in the lead.\n");
		else if(dem>rep)
			result.append("Democratic candidate in the lead.\n");
		else
			result.append("Both candidates tied.\n");
		
		result.append("Total Republican votes: "+rep+", Total Democratic votes: "+dem);
		return result.toString();
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
