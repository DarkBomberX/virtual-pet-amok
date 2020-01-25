
public class MechDog extends Dog implements MechInterface {

	private int oil;
	
	public MechDog(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oilPet() {
		oil = oil +5;
	}

	@Override
	public int getOil() {
		
		return oil;
	}

	
}
