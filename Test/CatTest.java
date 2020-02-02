import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatTest {
	
	Cat testPet;
	
	@BeforeEach
	public void setup() {
		testPet = new Cat("Majima", "Fun and Playful");
	}
	

	@Test
	void testTick() {
		testPet.tick();
		assertEquals(9, testPet.getLitter());
	}


	@Test
	void testCleanLitter() {
		testPet.cleanLitter();
		assertEquals(10, testPet.getLitter());
	}

	@Test
	void testGetLitter() {
		equals(10);
	}

}
