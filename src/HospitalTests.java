import org.junit.Assert;
import org.junit.Test;


public class HospitalTests  {

	Hospital<Person> stackHos = new StackHospital<Person>();
	Hospital<Person> qHos = new QueueHospital<Person>();
	Hospital<Person> priorQHos = new PriorityQueueHospital<Person>(); 

	Person sickPatient = new SickPerson("Jake", 19, 7);
	Person healthyPatient = new HealthyPerson("Paul", 9, "Ate a dinosaur");

	@Test
	public void HospitalTest() {

		//Hospital stackHos = new StackHospital("StackHospital", )

	}
	/**
	 * test add patients
	 */
	@Test
	public void testaddPatient() {
		stackHos.addPatient(sickPatient);
		stackHos.addPatient(healthyPatient);

		qHos.addPatient(sickPatient);
		qHos.addPatient(healthyPatient);

		priorQHos.addPatient(sickPatient);
		//priorQHos.addPatient(healthyPatient);
	}

	//@Test - wouldnt compile
	/*
	 * public void testAllPatientInfo() { Assert.
	 * assertEquals("Jake, a 19-year old. Severity level 7Paul, a 9-year old. In for Ate a dinosaur"
	 * , stackHos.allPatientInfo()); Assert.
	 * assertEquals("Jake, a 19-year old. Severity level 7Paul, a 9-year old. In for Ate a dinosaur"
	 * , qHos.allPatientInfo()); Assert.
	 * assertEquals("Jake, a 19-year old. Severity level 7Paul, a 9-year old. In for Ate a dinosaur"
	 * , priorQHos.allPatientInfo()); }
	 */

	/**
	 * test the type
	 */
	@Test
	public void testHospitalType()
	{
		Assert.assertEquals("StackHospital", stackHos.hospitalType());
		Assert.assertEquals("QueueHospital", qHos.hospitalType());
		Assert.assertEquals("PriorityQueueHospital", priorQHos.hospitalType());
	}

	/* - wouldnt compile
	 * @Test public void testNextPatient() { Assert.assertEquals(sickPatient,
	 * stackHos.nextPatient()); Assert.assertEquals(sickPatient,
	 * qHos.nextPatient()); Assert.assertEquals(sickPatient,
	 * priorQHos.nextPatient()); }
	 */
	/**
	 * test the number returned of patients
	 */
	@Test
	public void testNumPatients()
	{
		Assert.assertEquals(2, stackHos.numPatients());
		Assert.assertEquals(2, qHos.numPatients());
		Assert.assertEquals(2, priorQHos.numPatients());
	}

	/**
	 * test the string returned
	 */
	@Test
	public void testToString()
	{
		Assert.assertEquals("A %s-type hospital with %d patients", stackHos.toString());
		Assert.assertEquals("A %s-type hospital with %d patients", qHos.toString());
		Assert.assertEquals("A %s-type hospital with %d patients", priorQHos.toString());
	}

	/**
	 * test the treating the next patient with removal 
	 */
	@Test
	public void testTreatNextPatient()
	{
		Assert.assertEquals(healthyPatient, stackHos.treatNextPatient());
		Assert.assertEquals(healthyPatient, qHos.treatNextPatient());
		Assert.assertEquals(healthyPatient, priorQHos.treatNextPatient());
	}
}
