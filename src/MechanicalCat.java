
public class MechanicalCat extends Cat implements MechanicalInterface {

	private int oil;

	public MechanicalCat(String name, String description) {
		super(name, description);
		this.oil = 10;
	}

	public void oilPet() {
		oil = oil + 10;

	}

	public int getOil() {
		return oil;
	}
	
	@Override
	public void tick() {
		super.tick();
		oil--;
		if (oil <= 2) {
			setHealth(getHealth() - 1);
		}
	}

}
