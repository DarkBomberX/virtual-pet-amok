import java.util.HashMap;

import java.util.Map;

public class PetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void boardPet(VirtualPet petToBoard) {
		pets.put(petToBoard.getName(), petToBoard);
	}

	public void adoptPet(String name) {
		pets.remove(name);
	}

	public void feedAllPet() {
		for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
			VirtualPet pet = entry.getValue();
			pet.feed();
		}
	}

	public void waterAllPet() {
		for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
			VirtualPet pet = entry.getValue();
			pet.water();
		}
	}

	public void playWithPet(String name) {
		showOnePet(name).play();
	}

	public void tickAll() {
		for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
			VirtualPet pet = entry.getValue();
			pet.tick();
		}
	}

	public Map<String, VirtualPet> showAllPets() {
		return pets;
	}

	public VirtualPet showOnePet(String name) {
		return pets.get(name);
	}

}
