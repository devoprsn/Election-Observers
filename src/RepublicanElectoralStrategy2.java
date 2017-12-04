import java.util.ArrayList;

public class RepublicanElectoralStrategy2 implements IElectoral{

	@Override
	public String report(ArrayList<State> states) 
	{
		int rep=0, dem=0;
		State smallestLead=smallestLead(states);
		for(State state:states)
		{
			if(state==smallestLead)
			{
				dem+=state.getElectoralVote()/2;
				rep+=state.getElectoralVote()/2;
				if(state.getElectoralVote()%2!=0)
				{
					rep+=1;
				}
			}
			else if(state.getDemocraticVotes()>state.getRepublicanVotes())
			{
				dem+=state.getElectoralVote();
			}
			else if(state.getRepublicanVotes()>state.getDemocraticVotes())
			{
				rep+=state.getElectoralVote();
			}
			else if(state.getRepublicanVotes()==0 && state.getDemocraticVotes()==0)
			{			
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
	
	private State smallestLead(ArrayList<State> states)
	{
		State s=null;
		int diff;
		for(State state:states)
		{
			if(state.getDemocraticVotes()>state.getRepublicanVotes())
			{
				if(s!=null)
				{
					diff=state.getDemocraticVotes()-state.getRepublicanVotes();
					if(diff<(s.getDemocraticVotes()-s.getRepublicanVotes()))
					{
						s=state;
					}
				}
				else
				{
					s=state;
				}
			}
		}
		
		return s;
	}
}
