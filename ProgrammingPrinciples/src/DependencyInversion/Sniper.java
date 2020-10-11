package DependencyInversion;

public class Sniper implements Weapon, SecondaryOption {

	@Override
	public void shoot() {
		//Shoot the Sniper
	}
	
	public void secondaryFire() {
		//Zoom the scope
	}
	
	@Override
	public void reload() {
		//Reload the Sniper
	}
}
