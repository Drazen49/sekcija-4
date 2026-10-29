package TEST;

public class BossEnemy extends Enemy{

	public BossEnemy(int x, int y, int health, int damage, int width, int height, String type) {
		super(x,y,health,damage,width,height,type);
		
	}
	public int getDamage() {
		return super.getDamage();
	}
	public void setDamage(damage) {
		this.damage = damage;
	}
}
