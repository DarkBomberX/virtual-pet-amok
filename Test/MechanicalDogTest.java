import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MechanicalDogTest {

	MechanicalDog testPet;

	@BeforeEach
		public void setup() {
		testPet = new MechanicalDog("Jack", "Big and Sleepy");
	}
	
	@Test
	void testTick() {
		
		int originalHealth = testPet.getHealth();
		for(int i = 0; i<=2; i++){
		    testPet.tick();
		}
		int testedHealth = testPet.getHealth();
		assertEquals(1, originalHealth - testedHealth);
	}

	@Test
	void testOilPet() {
		testPet.getOil();
		testPet.oilPet();
		assertEquals(15, testPet.getOil());
	}

	@Test
	void testGetOil() {
	}

}
