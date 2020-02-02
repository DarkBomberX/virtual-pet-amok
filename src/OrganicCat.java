
public class OrganicCat extends VirtualPet implements OrganicInterface {

	private int hunger;
	private int thirst;
	private int bathroom;
	
	public OrganicCat(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public void feed() {
		hunger= hunger + 5;		
	}
	public void bathroom() {
		bathroom= bathroom + 5;
		
	}

	public void water() {
		thirst= thirst +5;
		
	}
	
	@Override
	public void tick() {
		super.tick();
		hunger--;
		bathroom--;
		thirst--;
	}


	public int getHunger() {
		return hunger;
	}


	public int getBathroom() {
		return bathroom;
	}


	public int getThrist() {
		return thirst;
	}

}
