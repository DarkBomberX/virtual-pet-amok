import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PetShelterTest {
	
	OrganicCat testRealCat;
	OrganicDog testRealDog;
	MechanicalCat testRobotCat;
	MechanicalDog testRobotDog;
	PetShelter testPets;
	
	@BeforeEach
	public void setup() {
		testRealCat = new OrganicCat("Majima", "Cool");
		testRealDog = new OrganicDog("Jack", "Big and Soft");
		testRobotCat = new MechanicalCat("Meow-zzt", "cool and cruel");
	
	}
	
	/* not sure how to get this test to work right */
	
//	@Test
//	void testBoardPet() {
//		PetShelter.boardPet(testRealCat);
//	}
//
//	@Test
//	void testAdoptPet() {
//		fail("Not yet implemented");
//	}

	@Test
	void testFeedAllPet() {
		testRealCat.getHunger();
		testRealDog.getHunger();
		testPets.feedAllPet();
		assertEquals(10, testRealCat.getHunger());
		assertEquals(10, testRealDog.getHunger());
		
	}

	@Test
	void testWaterAllPet() {
		fail("Not yet implemented");
	}

	@Test
	void testOilPets() {
		fail("Not yet implemented");
	}

	@Test
	void testWalkPets() {
		fail("Not yet implemented");
	}

	@Test
	void testCleanCage() {
		fail("Not yet implemented");
	}

	@Test
	void testCleanLitter() {
		fail("Not yet implemented");
	}

	@Test
	void testPlayWithPet() {
		fail("Not yet implemented");
	}

	@Test
	void testTickAll() {
		fail("Not yet implemented");
	}

	@Test
	void testShowAllPets() {
		fail("Not yet implemented");
	}

	@Test
	void testShowOnePet() {
		fail("Not yet implemented");
	}

}
