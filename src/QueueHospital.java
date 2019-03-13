import java.util.ArrayList;

public class QueueHospital<PatientType> extends Hospital<PatientType> {

	public QueueHospital()
	{
		super();
	} 

	ArrayList<PatientType> queueHospital = new ArrayList<PatientType>(); 
	/**
	 * Add a patient to the Hospital.
	 */
	@Override
	public void addPatient(PatientType patient) {
		queueHospital.add(patient); 
	}
	/**
	 * Find and return the patient who will next be treated.
	 */
	@Override
	public PatientType nextPatient() {
		// TODO Auto-generated method stub
		PatientType nextPatient = null; 
		for (int i = 0; i < queueHospital.size(); i++)
		{
			nextPatient = queueHospital.get(i); 
		}
		return nextPatient;
	}
	/**
	 * Treats the next patient and removes them from the Hospital.
	 */
	@Override
	public PatientType treatNextPatient() {
		// TODO Auto-generated method stub
		PatientType treatNextPatient = null; 
		for (int i = 0; i < queueHospital.size(); i++)
		{
			treatNextPatient = queueHospital.get(i); 
			queueHospital.remove(i); 
		}
		return treatNextPatient;
	}
	/**
	 * Calculate and return the number of patients still in the hospital
	 */
	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return queueHospital.size();
	}

	/**
	 * Gives a String for the hospital type.
	 */
	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "QueueHospital";
	}
	/**
	 * Prints all patient information.
	 */
	@Override
	public String allPatientInfo() {
		// TODO Auto-generated method stub
		String records = ""; 
		for (int i = 0; i < queueHospital.size(); i++)
		{
			String patientRecord = queueHospital.get(i).toString(); 
			records.concat(patientRecord);
		}
		return records;
	}

}
