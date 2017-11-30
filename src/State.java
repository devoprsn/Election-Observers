

public class State {
	private String name;
	private int democraticVotes;
	private int republicanVotes;
	private int electoralVotes;
	
	public State(String name, int electoralVotes)
	{
		this.name=name;
		this.electoralVotes=electoralVotes;	
	}


	public int getDemocraticVotes() 
	{
		return democraticVotes;
	}
	
	public void setDemocraticVotes(int democraticVotes) 
	{
		this.democraticVotes = democraticVotes;
	}
	
	public int getRepublicanVotes() 
	{
		return republicanVotes;
	}
	
	public void setRepublicanVotes(int republicanVotes)
	{
		this.republicanVotes = republicanVotes;
	}
	
	public int getElectoralVote() 
	{
		return electoralVotes;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(obj.getClass()!=this.getClass())
			return false;
		
		State state=(State)obj;
		if(state.getName().equals(this.name))
			return true;
		
		return false;
	}
	
	@Override
	public String toString()
	{
		StringBuilder s=new StringBuilder(name+"\nRepublican votes: "+republicanVotes);
		s.append("\nDemocratic votes: "+democraticVotes);
		s.append("\nElectoral votes: "+electoralVotes);
		return s.toString();
	}
}
