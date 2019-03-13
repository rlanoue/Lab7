
public class SickPerson extends Person {

	 int severity;

	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity; 
	}

	@Override
	protected int compareToImpl(Person p) {

		

		if (!(p instanceof SickPerson))
		{
			return 0; 		
		}

		else {
			SickPerson banished = (SickPerson) p; 

			if (severity > banished.getSeverity())
			{ 
				return -1; 
			}
			else if (severity < banished.getSeverity())
			{
				return 1; 
			}
			else 
			{
				return 0;
			} 
		}
	
	}

	

	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), getSeverity());
	}
	
	public int getSeverity() {
		return severity; 
	
	}

}
