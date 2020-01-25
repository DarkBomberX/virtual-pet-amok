
public class OrganicDog extends VirtualPet implements OrganicInterface {

	private int hunger;
	private int bathroom;
	private int thirst;



	public OrganicDog(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void feed() {
		hunger= hunger + 5;		
	}

	@Override
	public void bathroom() {
		bathroom= bathroom + 5;
		
	}



	@Override
	public void water() {
		thirst= thirst +5;
		
	}



	@Override
	public int getHunger() {
		return hunger;
	}



	@Override
	public int getBathroom() {
		return bathroom;
	}



	@Override
	public int getThrist() {
		return thirst;
	}

	

}
