
public class HealthyPerson extends Person {

	protected String reason; 

	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.reason = reason; 
	}

	@Override
	protected int compareToImpl(Person p) {
		if 	((p instanceof HealthyPerson))	 
		{
		
			for (int i = 0; i < p.getName().length(); i++)
			{
				if (getName().charAt(i) < p.getName().charAt(i))
				{
					//System.out.println(p.getName().charAt(i));
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
		//return 0;
	}//

	public String getReason()
	{
		return reason; 
	}

	public String toString()
	{
		return String.format("%s Severity level %s", this.getName(), reason);
	}
}
