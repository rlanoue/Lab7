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

	/**
	 * Add a patient to the Hospital.
	 */
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
			}}}

	/**
	 * Find and return the patient who will next be treated.
	 */
	@Override
	public PatientType nextPatient() {
		int nextPatientIndex = priorityQueueHospital.size()-1; 
		return priorityQueueHospital.get(nextPatientIndex); 
	}
	/**
	 * Treats the next patient and removes them from the Hospital.
	 */
	@Override
	public PatientType treatNextPatient() {
		int nextPatientIndex = priorityQueueHospital.size()-1;
		priorityQueueHospital.remove(nextPatientIndex); 
		return priorityQueueHospital.get(nextPatientIndex);
	}

	/**
	 * Calculate and return the number of patients still in the hospital 
	 */
	@Override
	public int numPatients() {
		int numPatients = priorityQueueHospital.size(); 
		return numPatients; 
	}
	/**
	 * Gives a String for the hospital type.
	 */
	@Override
	public String hospitalType() {
		return "PriorityQueueHospital"; 
	}
	/**
	 * Prints all patient information.
	 */
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
