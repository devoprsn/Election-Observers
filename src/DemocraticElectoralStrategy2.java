import java.util.ArrayList;

public class DemocraticElectoralStrategy2 implements IElectoral{

	@Override
	public String report(ArrayList<State> states) 
	{
		int repElectoral=0, demElectoral=0,
			rep=0, dem=0;
		for(State state:states)
		{
			rep=state.getRepublicanVotes();
			rep-=(rep*.02);
			dem=state.getDemocraticVotes();
			dem+=(rep*.02);
			if(rep==0 && dem==0)
			{			
			}
			else if(dem>rep)
			{
				demElectoral+=state.getElectoralVote();
			}
			else if(rep>dem)
			{
				repElectoral+=state.getElectoralVote();
			}
			else 
			{
				demElectoral+=state.getElectoralVote()/2;
				repElectoral+=state.getElectoralVote()/2;
			}
		}

		StringBuilder result=new StringBuilder("Electoral vote- ");
		if(repElectoral>demElectoral)
			result.append("Republican candidate in the lead.\n");
		else if(demElectoral>repElectoral)
			result.append("Democratic candidate in the lead.\n");
		else
			result.append("Both candidates tied.\n");
		
		result.append("Total Republican votes: "+repElectoral+", Total Democratic votes: "+demElectoral);
		return result.toString();
	}


}
