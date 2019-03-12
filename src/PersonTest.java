import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		
		SickPerson Adrian = new SickPerson("Adrian", 13, 2); 
		HealthyPerson Ariana = new HealthyPerson("Ariana", 11, "Flu Shot"); 
		
		Assert.assertNotNull(Adrian);
		
		Assert.assertEquals(13, Adrian.getAge());
		Assert.assertEquals(2, Adrian.getSeverity());
		Assert.assertEquals("Adrian", Adrian.getName());
		
		Assert.assertNotNull(Ariana); 
		Assert.assertEquals("Ariana", Ariana.getName());
		Assert.assertEquals(11, Ariana.getAge()); 
		Assert.assertEquals("Yearly", Ariana.getReason());
	}

	@Test
	public void testGetName() {
		
		Person Bob = new SickPerson("Bob", 61, -1); 
		Person Boren = new HealthyPerson("Boren", 24, "Yearly Checkup"); 
		
		Assert.assertEquals("Bob", Bob.getName());
		Assert.assertEquals("Boren", Boren.getName());
		
	}

	@Test
	public void testGetAge() {
		
		Person Charles = new SickPerson("Charles", 41, 8);
		Person Carter = new HealthyPerson("Carter", 4, "Visting his sick father, Charles");
		
		Assert.assertEquals("Charles", Charles.getAge());
		Assert.assertEquals("Carter", Carter.getAge());

	}

	@Test
	public void testCompareTo() {
		
		Person David = new SickPerson("David", 29, 9);
		Person Dean = new SickPerson("Dean", 25, 5);
		Person Daniel = new SickPerson("Daniel", 22, 2);
		
		Assert.assertEquals(-1, David.compareTo(Dean));
		Assert.assertEquals(-1, David.compareTo(Daniel));
		Assert.assertEquals(1, Dean.compareTo(David));
		Assert.assertEquals(-1, Dean.compareTo(Daniel));
		Assert.assertEquals(1, Daniel.compareTo(David));
		Assert.assertEquals(1, Daniel.compareTo(Dean));
		
		Assert.assertEquals(0, David.compareTo(David)); 
		
		
		
		Person Ethan = new HealthyPerson("Ethan", 34, "Removal of a cast");
		Person Evan = new HealthyPerson("Evan", 38, "Allergies");
		Person Eve = new HealthyPerson("Eve", 31, "Thinks she has super rare disease from being on web.md too much"); 
		
		Assert.assertEquals(1, Ethan.compareTo(Evan));
		Assert.assertEquals(1, Ethan.compareTo(Eve));
		Assert.assertEquals(-1, Evan.compareTo(Ethan));
		Assert.assertEquals(1, Evan.compareTo(Eve));
		Assert.assertEquals(1, Eve.compareTo(Ethan));
		Assert.assertEquals(1, Eve.compareTo(Evan));
		
		Assert.assertEquals(0, Eve.compareTo(Eve));
		
		Assert.assertEquals(0, David.compareTo(Ethan));
		Assert.assertEquals(0, Eve.compareTo(Dean));
				
		
	}

	@Test
	public void testToString() {
		
		Assert.assertEquals("%s ");
		//fail("Not yet implemented");
	}

}
