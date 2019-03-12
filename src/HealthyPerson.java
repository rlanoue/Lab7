
public class HealthyPerson extends Person {

	protected String reason; 

	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.reason = reason; 
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub



		if (!(p instanceof HealthyPerson))
		{
			return 0; 		
		}
		else 
		{
			HealthyPerson unbanished = (HealthyPerson) p;

			if (p.getName().compareTo(unbanished.getName()) > 0)
			{
				return -1; 
			}
			else if (p.getName().compareTo(unbanished.getName()) < 0)
			{
				return 1; 
			}
			else
			{
				return 0; 
			}
		}

	}
	public String getReason()
	{
		return reason; 
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), getReason());
	}
}
