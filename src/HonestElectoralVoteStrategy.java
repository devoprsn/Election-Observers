import java.util.ArrayList;

public class HonestElectoralVoteStrategy implements IElectoral{

	@Override
	public String report(ArrayList<State> states)
	{
		int rep=0, dem=0;
		for(State state:states)
		{
			if(state.getRepublicanVotes()==0 && state.getDemocraticVotes()==0)
			{			
			}
			else if(state.getDemocraticVotes()>state.getRepublicanVotes())
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

}
