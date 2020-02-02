
public class VirtualPet {
	private String name;
	private String description;
	private int bordom;
	private int sleep;
	private int health;

	public VirtualPet(String name, String description, int bordom, int sleep, int health) {
		this.name = name;
		this.description = description;
		this.bordom = bordom;
		this.sleep = sleep;
		this.setHealth(health);
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.bordom = 10;
		this.sleep = 10;
		this.setHealth(10);
	}
	
	public void rest() {
		sleep += 10;
	}

	public void play() {
		bordom += 4;
	}

	public void tick() {
		bordom--;
		sleep--;
	}

//	Getters

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public int getHealth() {
		return health;
	}

	public int getBordom() {
		return bordom;
	}

	public int getSleep() {
		return sleep;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
