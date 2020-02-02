import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PetShelter virtualPetShelter = new PetShelter();
		boolean running = true;
		while (running) {
			System.out.println("Welcome to Eddie's Pet Shelter!");
			tellOptions();

			String pick = input.nextLine();

			if (pick.equals("1")) {
				boardPet(input, virtualPetShelter);
			} else if (pick.equals("2")) {
				adoptPet(input, virtualPetShelter);
			} else if (pick.equals("3")) {
				virtualPetShelter.feedAllPet();
				virtualPetShelter.tickAll();
			} else if (pick.equals("4")) {
				virtualPetShelter.walkPets();
			} else if (pick.equals("5")) {
				virtualPetShelter.oilPets();
			} else if (pick.equals("6")) {
				virtualPetShelter.cleanCage();
			} else if (pick.equals("7")) {
				virtualPetShelter.cleanLitter();
			} else if (pick.equals("8")) {
				virtualPetShelter.waterAllPet();
				virtualPetShelter.tickAll();
			} else if (pick.equals("9")) {
				playWithPet(input, virtualPetShelter);
				virtualPetShelter.tickAll();
			} else if (pick.equals("10")) {
				listPets(virtualPetShelter);
			} else if (pick.equals("11")) {
				running = false;
				System.out.println("See you later, Dawgs!");
			} else {
				System.out.println("Pick a valid Option");
			}

		}

	}

	public static void tellOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1: Board a Pet");
		System.out.println("2: Adopt a Pet");
		System.out.println("3: Feed The Pets");
		System.out.println("4: Walk The Dog");
		System.out.println("5: Oil All The Robots");
		System.out.println("6: Clean Dog Cages");
		System.out.println("7: Clean Litter Box");
		System.out.println("8: Water All Pets");
		System.out.println("9: Pick a Pet to Play With");
		System.out.println("10: Wanna Take a Peek At The Pets?");
	}

	public static void boardPet(Scanner input, PetShelter virtualPetShelter) {
		System.out.println("Are You Boarding a Cat or Dog?");
		String catOrDog = input.nextLine().toUpperCase();
		System.out.println("Is your pet real or a robot?");
		String robotOrReal = input.nextLine().toUpperCase();
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine().toUpperCase();
		System.out.println("What's it like?");
		String description = input.nextLine().toUpperCase();

		VirtualPet vp = null;
		switch (catOrDog) {
		case "CAT":
			switch (robotOrReal) {
			case "REAL":
				vp = new OrganicCat(name, description);
				break;
			default:
				vp = new MechanicalCat(name, description);
				break;
			}
			break;
		default:
			switch (robotOrReal) {
			case "REAL":
				vp = new OrganicDog(name, description);
				break;
			default:
				vp = new MechanicalDog(name, description);
				break;
			}
			break;
		}
		virtualPetShelter.boardPet(vp);
	}

	public static void listPets(PetShelter virtualPetShelter) {

		for (Map.Entry<String, VirtualPet> entry : virtualPetShelter.showAllPets().entrySet()) {
			VirtualPet pet = entry.getValue();

			System.out.println(pet.getName() + " : " + pet.getDescription());
		}
	}

	public static void adoptPet(Scanner input, PetShelter virtualPetShelter) {
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine().toUpperCase();
		virtualPetShelter.adoptPet(name);
		System.out.println("You Adopted " + name);
	}

	public static void playWithPet(Scanner input, PetShelter virtualPetShelter) {
		listPets(virtualPetShelter);
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine().toUpperCase();
		virtualPetShelter.playWithPet(name);
	}

}
