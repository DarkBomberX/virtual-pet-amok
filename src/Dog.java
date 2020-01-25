
public class Dog extends VirtualPet {

	private int happiness;

	public Dog(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public void walk() {
		happiness = happiness +5;
	}

}
