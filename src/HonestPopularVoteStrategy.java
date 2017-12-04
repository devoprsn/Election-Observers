import java.util.ArrayList;

public class HonestPopularVoteStrategy implements IPopularVote{

	public String report(ArrayList<State> states)
	{
		int rep=0, dem=0;
		for(State state:states)
		{
			rep+=state.getRepublicanVotes();
			dem+=state.getDemocraticVotes();
		}
		
		StringBuilder result=new StringBuilder("Popular vote- ");
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
