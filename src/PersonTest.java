import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		
		Person Tyler = new SickPerson("Tyler", 61); 
		Person Hank = new HealthyPerson("Hank", 24); 
		
		Assert.assertNotNull(Tyler);
		Assert.assertEquals("Tyler", Tyler.getName());
		Assert.assertEquals(61, Tyler.getAge());
		
		Assert.assertNotNull(Hank); 
		Assert.assertEquals("Hank", Hank.getName());
		Assert.assertEquals(24, Hank.getAge()); 
	}

	@Test
	public void testGetName() {
		
		Person Name1 = new testGetName("Adrian"); 
		
		Assert.assertEquals("Adrian", Name1.getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAge() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareToImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
