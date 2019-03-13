
public class HealthyPerson extends Person {

	private String reason; 

	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.reason = reason; 
	}
/**
 * Implementation method for Person's compareTo method().
 */
	@Override
	protected int compareToImpl(Person p) {
		if 	((p instanceof HealthyPerson))	 
		{
		
			for (int i = 0; i < p.getName().length(); i++)
			{
				if (getName().charAt(i) < p.getName().charAt(i))
				{
					return 1;
				}
				else if (getName().charAt(i) > p.getName().charAt(i))
				{
					return -1; 
				}
			}
		}
		else
		{
			return 0; 
		}
		return 0;
	}
		

	 
/**
 * Gives some information about the HealthyPerson.
 */
	public String toString()
	{
		return String.format("%s Severity level %s", this.getName(), this.reason);
	}

	public String getReason() {
		// TODO Auto-generated method stub
		return this.reason;
	}
}
