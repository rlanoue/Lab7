import java.util.ArrayList;

public class QueueHospital<PatientType> extends Hospital<PatientType> {

	public QueueHospital()
	{
		super();
	} 
	
	ArrayList<PatientType> queueHospital = new ArrayList<PatientType>(); 
	
	@Override
	public void addPatient(PatientType patient) {
		queueHospital.add(patient); 
	}

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

	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return queueHospital.size();
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "QueueHospital";
	}

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
