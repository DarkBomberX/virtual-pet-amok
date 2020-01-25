
public class MechDog extends Dog implements MechInterface {

	private int oil;
	
	public MechDog(String name, String description) {
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
	}

	public int getOil() {
		
		return oil;
	}

	
}
