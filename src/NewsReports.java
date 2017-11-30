import java.util.ArrayList;

public class NewsReports {
	public static void main(String[] args)
	{
		ArrayList<State> states=new ArrayList<State>();
		State newYork=new State("New York", 20);
		State ohio=new State("Ohio", 15);
		State utah=new State("Utah", 9);
		State california=new State("California", 23);
		State alabama=new State("Alabama", 12);
			states.add(ohio); 
			states.add(newYork);
			states.add(utah);
			states.add(california);
			states.add(alabama);
		VotingPolls v=new VotingPolls(states);
		NBC n=new NBC();
		FoxNews f=new FoxNews();
		CNN c=new CNN();
			v.addObserver(n);
			v.addObserver(f);
			v.addObserver(c);
			
		ohio.addDemocraticVotes(5);
		v.addVotes(ohio);
	}
}
