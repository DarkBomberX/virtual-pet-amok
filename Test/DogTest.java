import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
	
	Dog testPet;

	@Before
		public void setup() {
		testPet = new Dog("Jack", "Big and Sleepy");
	}
	
	@Test
	public void testTick() {
		testPet.getCage();
		testPet.getHappiness();
		testPet.tick();
		assertEquals(9, testPet.getCage());
		assertEquals(4, testPet.getHappiness());
	}

	@Test
	public void testWalk() {
		testPet.walk();
		assertEquals(10, testPet.getCage());
	}

	@Test
	public void testCleanCage() {
		testPet.tick();
		testPet.cleanCage();
		assertEquals(10, testPet.getCage());
	}

}
