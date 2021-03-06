
public class Dog extends VirtualPet {

	private int happiness;
	private int cage;

	public Dog(String name, String description) {
		super(name, description);
		this.happiness = 5;
		this.cage = 10;
	}

	public void walk() {
		happiness = happiness +5;
	}

	public void cleanCage() {
		cage = 10;
		
	}
	
	@Override
	public void tick() {
		super.tick();
		cage--;
		happiness--;
		if (happiness <= 2) {
			setHealth(getHealth() - 1);
		}
	}

	public int getCage() {
		return cage;
	}
	
	public int getHappiness() {
		return happiness;
	}

}
