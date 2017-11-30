import java.util.*;
import java.time.*;

public abstract class VotingNews implements Observer{
	private IPopularVote p;
	private IElectoral e;
	
	public VotingNews(IPopularVote p, IElectoral e) 
	{
		this.p=p;
		this.e=e;
	}
	
	public String reportPopularVote(ArrayList<State> states)
	{
		return p.report(states);
	}
	
	public String reportElectoralVote(ArrayList<State> states)
	{
		return e.report(states);
	}
	
	public String getLegalMessage()
	{
		StringBuilder s=new StringBuilder("Disclaimer: all reports are purely observational and not legally binding in any way.");
		s.append(LocalDate.now()+" "+LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute());
		
		return s.toString();		
	}
}
