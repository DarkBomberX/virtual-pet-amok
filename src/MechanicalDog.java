
public class MechanicalDog extends Dog implements MechanicalInterface {

	private int oil;
	
	public MechanicalDog(String name, String description) {
		super(name, description);
		this.oil = 10;
	}

	public void oilPet() {
		oil = oil +5;
	}
	
	@Override
	public void tick() {
		super.tick();
		oil--;
		if (oil <= 2) {
			setHealth(getHealth() - 1);
		}
	}

	public int getOil() {
		
		return oil;
	}

	
}
