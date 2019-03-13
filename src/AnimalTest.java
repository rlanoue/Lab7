import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {

	
	Animal Pitbull = new Animal("Pitbull", 1);
	Animal FrenchB = new Animal("French Bulldog", 4);
	Animal Beagle = new Animal("Beagle", 4);
	
	
	/**
	 * tests the constructor for animal class
	 */
	@Test
	public void AnimalTest() {
		Animal GoldenR = new Animal("Golden Retrival", 19);
		Animal Collie = new Animal("Collie", 2);
	}
	/**
	 * tests getBreed method of animal
	 */
	@Test
	public void testGetBreed() {
		
		Assert.assertEquals("Pitbull", Pitbull.getBreed());
	}
	
	/**
	 * tests getAge method of animal
	 */
	@Test
	public void testGetAge()
	{
		Assert.assertEquals(4, FrenchB.getAge());
	}
	
	/**
	 * tests compareToImpl method of animal
	 */
	@Test
	public void compareToImpl() {
		// TODO Auto-generated method stub
		Assert.assertEquals(3, Pitbull.compareTo(FrenchB));
		Assert.assertEquals(-3, FrenchB.compareTo(Pitbull));
		Assert.assertEquals(0, Beagle.compareTo(FrenchB));

		
		
	}
	
	/**
	 * tests toString method of animal
	 */
	@Test
	public void testToString() {
		
		String test = "A 1-year old Pitbull.";
		String actual = Pitbull.toString(); 
		
		Assert.assertEquals(test, actual);
	}
}