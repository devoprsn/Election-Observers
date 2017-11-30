
import java.util.ArrayList;

public class RepublicanPopularVoteStrategy implements IPopularVote{

	public String report(ArrayList<State> states)
	{
		int rep=0, dem=0;
		for(State state:states)
		{
			rep+=state.getRepublicanVotes();
			dem+=state.getDemocraticVotes();
		}
		dem-=(dem*.05);
		
		return "";
	}
}
