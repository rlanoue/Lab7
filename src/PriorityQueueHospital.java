import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueHospital <PatientType extends Comparable <PatientType>> extends Hospital<PatientType> 
{

	public PriorityQueueHospital() {
		super();

	}

	ArrayList<PatientType> priorityqueueHospital = new ArrayList<PatientType>(); 

	@Override
	public void addPatient(PatientType patient) 
	{
		ArrayList<PatientType> priorityClone = new ArrayList<PatientType>(); 
		//priorityqueueHospital.apply.push(priorityClone); 
		priorityqueueHospital.clone().equals(priorityClone);//priorityClone; 
		for (int i = 0; i < priorityqueueHospital.size(); i++)
		{
			PatientType nextPatient = priorityqueueHospital.get(i);
			int comparisonResult = patient.compareTo(nextPatient); 

			if (comparisonResult == -1)
			{
				priorityqueueHospital.add(i, patient); 
				for (int j = i; j < priorityqueueHospital.size(); j++) 
				{
					priorityqueueHospital.add(i+1, priorityClone.get(j));
				}
				break; 
			}
			else if (comparisonResult == 1)
			{
				priorityqueueHospital.add(i+1, patient); 
				for (int k = i; k < priorityqueueHospital.size(); k++)
				{
					priorityqueueHospital.add(i+2, priorityClone.get(k)); 
				}
				break; 
			}
		}
	}

	@Override
	public PatientType nextPatient() {
		int nextPatientIndex = priorityqueueHospital.size()-1; 
		return priorityqueueHospital.get(nextPatientIndex); 
	}

	@Override
	public PatientType treatNextPatient() {
		int nextPatientIndex = priorityqueueHospital.size()-1;
		priorityqueueHospital.remove(nextPatientIndex); 
		return priorityqueueHospital.get(nextPatientIndex);
	}

	@Override
	public int numPatients() {
		int numPatients = priorityqueueHospital.size(); 
		return numPatients; 
	}

	@Override
	public String hospitalType() {
		return "PriorityQueueHospital"; 
	}

	@Override
	public String allPatientInfo() {
		String records = ""; 
		for (int i = 0; i < priorityqueueHospital.size(); i++)
		{
			String patientRecord = priorityqueueHospital.get(i).toString(); 
			records.concat(patientRecord);
		}
		return records; 
	}

}
