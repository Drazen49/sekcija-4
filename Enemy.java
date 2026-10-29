package TEST;

public class Enemy extends GameObject {
	private String type;
	private int damage;
	
	private int health;
	
	public Enemy(int x, int y, int width, int height, String name, int health, int damage) {
		super (x,y,width,height);
		setType(type);
		setDamage(damage);
		setHealth(health);
	}
	
	public int getDamage() {
		return damage;
	}
	public void setDamage() {
		this.damage = damage;
	}
	public int getType() {
		return type;
	}
	public void setType() {
		this.type = type;
	}
	
}
