
public class MechCat extends Cat implements MechInterface {

	private int oil;

	public MechCat(String name, String description) {
		super(name, description);
		
	}

	@Override
	public void oilPet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getOil() {
		oil = oil +5;
		return 0;
	}

}
