package TEST;

public class MeleeEnemy extends Enemy{
	public MeleeEnemy(int x, int y, int health, int damage, int width, int height, String type) {
		super(x,y,health,damage,width,height,type);
		
	}
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(damage) {
		this.damage = damage;
	}
}
