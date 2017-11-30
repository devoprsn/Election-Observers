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
			if(dem>rep)
			{
				demElectoral+=state.getElectoralVote();
			}
			else if(rep>dem)
			{
				repElectoral+=state.getElectoralVote();
			}
			else 
			{
				demElectoral=state.getElectoralVote()/2;
				repElectoral=state.getElectoralVote()/2;
			}
		}
		return "";
	}


}
