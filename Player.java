package TEST;

public class Player extends GameObject{
	private String name;
	private int health;
	
	public Player(int x, int y, int width, int height, String name, int health) {
		super (x,y,width,height);
		
		setName(name);
		setHealth(health);
	}
		
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
	
}
