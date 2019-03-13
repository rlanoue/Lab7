import java.util.Iterator;
import java.util.LinkedList;
//import java.util.PriorityQueue;

public class PriorityQueueHospital <PatientType extends Comparable <PatientType>> extends Hospital<PatientType> 
{

	public PriorityQueueHospital() {
		super();
	}

	LinkedList<PatientType> priorityQueueHospital = new LinkedList<PatientType>(); 

	Iterator<PatientType> iter = priorityQueueHospital.iterator();

	//ArrayList<PatientType> priorityClone = new ArrayList<PatientType>();

	@Override
	public void addPatient(PatientType patient) 
	{
		boolean found = false; 

		PatientType nextPatient = null; 
		int comparisonResult = patient.compareTo(nextPatient); 
		int position = 0; 

		
		while(iter.hasNext() && !found)
		{
			comparisonResult = patient.compareTo(nextPatient);
			
			if (comparisonResult == -1)
			{
				priorityQueueHospital.add(position, patient);
				position++; 
				found = false; 
			}
			else
			{
				comparisonResult = patient.compareTo(nextPatient);
				iter.next(); 
				found = true; 
			}
			
			//priorityqueueHospital.apply.push(priorityClone); 
			/*
			 * priorityqueueHospital.clone().equals(priorityClone);//priorityClone; for (int
			 * i = 0; i < priorityqueueHospital.size(); i++) { PatientType nextPatient =
			 * priorityqueueHospital.get(i); int comparisonResult =
			 * patient.compareTo(nextPatient);
			 * 
			 * 
			 * priorityqueueHospital.add(i, patient); for (int j = i; j <
			 * priorityqueueHospital.size(); j++) { priorityqueueHospital.add(i+1,
			 * priorityClone.get(j)); } break; } else if (comparisonResult == 1) {
			 * priorityqueueHospital.add(i+1, patient); for (int k = i; k <
			 * priorityqueueHospital.size(); k++) { priorityqueueHospital.add(i+2,
			 * priorityClone.get(k)); } break;
			 */
			}
		}
	

	@Override
	public PatientType nextPatient() {
		int nextPatientIndex = priorityQueueHospital.size()-1; 
		return priorityQueueHospital.get(nextPatientIndex); 
	}

	@Override
	public PatientType treatNextPatient() {
		int nextPatientIndex = priorityQueueHospital.size()-1;
		priorityQueueHospital.remove(nextPatientIndex); 
		return priorityQueueHospital.get(nextPatientIndex);
	}

	@Override
	public int numPatients() {
		int numPatients = priorityQueueHospital.size(); 
		return numPatients; 
	}

	@Override
	public String hospitalType() {
		return "PriorityQueueHospital"; 
	}

	@Override
	public String allPatientInfo() {
		String records = ""; 
		for (int i = 0; i < priorityQueueHospital.size(); i++)
		{
			String patientRecord = priorityQueueHospital.get(i).toString(); 
			records.concat(patientRecord);
		}
		return records; 
	}

}
