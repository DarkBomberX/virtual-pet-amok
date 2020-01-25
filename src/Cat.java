
public class Cat extends VirtualPet {

	private int litter;
	
	public Cat(String name, String description) {
		super(name, description);
		this.litter = 10;
		
	}
	
	public void cleanLitter() {
		litter = 10;
	}
	
	@Override
	public void tick() {
		super.tick();
		litter--;
	}

	public int getLitter() {
		return litter;
	}
	

}
