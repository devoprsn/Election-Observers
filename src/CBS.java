import java.util.Observable;
import java.util.Observer;

public class CBS extends VotingNews implements Observer{
	private String name;
	public CBS() 
	{
		super(new DemocraticPopularVoteStrategy(), new DemocraticElectoralStrategy1());
		name="CBS";
	}

	@Override
	public void update(Observable obs, Object obj) 
	{
		if(obj instanceof VotingPolls.VotingStats)
		{
			VotingPolls.VotingStats votingStats=(VotingPolls.VotingStats)obj;
			String str1=reportPopularVote(votingStats.states);
			String str2=reportElectoralVote(votingStats.states);
			displayResults(str1, str2);
		}
	}
	
	public void displayResults(String str1, String str2)
	{
		System.out.println(name);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(getLegalMessage()+"\n");
	}
}
