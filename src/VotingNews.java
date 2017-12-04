import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

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
		StringBuilder s=new StringBuilder("Disclaimer: all reports are purely observational and not legally binding in any way. ");		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a");
		s.append(LocalDateTime.now().format(formatter));
		//LocalDate.now()+" "+LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()
		
		return s.toString();		
	}
}
