import java.util.ArrayList;

public class RepublicanElectoralStrategy2 implements IElectoral{

	@Override
	public String report(ArrayList<State> states) 
	{
		//
		int rep=0, dem=0;
		for(State state:states)
		{
			if(state.getDemocraticVotes()>state.getRepublicanVotes())
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
}
