import java.util.Observable;
import java.util.Observer;

public class News12 extends VotingNews implements Observer {
	private String name;
	public News12() 
	{
		super(new RepublicanPopularVoteStrategy(), new RepublicanElectoralStrategy1());	
		name="News12";
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
