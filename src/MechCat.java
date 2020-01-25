
public class MechCat extends Cat implements MechInterface {

	private int oil;

	public MechCat(String name, String description) {
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
	}

}
