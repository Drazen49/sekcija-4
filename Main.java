package TEST;

public class Main {

	
	public static void main(String[] args) {
		GameObject object = new GameObject(10,5,32,32);
		Player player = new Player(10, 17, 30, 30, "Goran Raspopovic", 50);
		Enemy enemy = new Enemy(10,5,32,32, "Strahinja Colovic", 20, 60);
		MeleeEnemy meleeenemy = new MeleeEnemy(10,5,32,32, 20, 60, "Fikret Basanovic");
		BossEnemy bossenemy = new BossEnemy(10,5,32,32, 20, 60, "Zmaj od Sipova");
		
		System.out.println(enemy);
		System.out.println(player);
		System.out.println(bossenemy);
		System.out.println(meleeenemy);
	}
}
