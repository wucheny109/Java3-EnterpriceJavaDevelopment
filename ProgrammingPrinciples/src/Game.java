
public class Game {

	public static void main(String[] args) {
		Player player = new Player(new Sniper());
		player.setWeapon1(new Pistol());
		player.setWeapon2(new Shotgun());
	}
}
