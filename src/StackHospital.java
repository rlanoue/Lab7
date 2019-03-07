import java.util.ArrayList;
import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>
{

	public StackHospital()
	{
		super();
	}

	ArrayList<PatientType> stackHospital = new ArrayList<PatientType>(); 
	
	@Override
	public void addPatient(PatientType patient) 
	{			
		stackHospital.add(patient);
	}

	@Override
	public PatientType nextPatient() 
	{
		PatientType nextPatient = null; 
		for (int i = 0; i < stackHospital.size(); i++)
		{
			nextPatient= stackHospital.get(i); 
		}
		return nextPatient;
	}

	@Override
	public PatientType treatNextPatient() 
	{
		return null;
	}

	@Override
	public int numPatients() 
	{
		return 0;
	}

	@Override
	public String hospitalType() 
	{
		return null;
	}

	@Override
	public String allPatientInfo() 
	{
		return null;
	}
}





LinkedList<String> authorsList = new LinkedList<String>();

authorsList.add("Gamow");
authorsList.add("Penrose");
authorsList.add("Hawking");

authorsList.add(1, "Greene");
