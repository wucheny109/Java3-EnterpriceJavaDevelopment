
public class Player {

	//Polymorphism, define with a parent class
	//but initialize with a child class
	
	//Liskov Substitution Principle
	//Any object S can be replaced with an object T
	//without altering the functionality
	
	//private Pistol pistol;
	//private Shotgun shotgun;
	private Weapon currentWeapon;
	private Weapon weapon1;
	private Weapon weapon2;
	
	public Player(Weapon weapon) { //Dependency Injection
		currentWeapon = weapon;  //Polymorphism
	}
	
	public void leftClick() {
		currentWeapon.shoot();
	}
	
	public void rightClick() {
		currentWeapon.secondaryFire();
	}
	
	public void rButton() {
		currentWeapon.reload();
	}
	
	public void Button1Press() {
		currentWeapon = weapon1;
	}
	
	public void Button2Press() {
		currentWeapon = weapon2;
	}
	
	public void setWeapon1(Weapon weapon) {
		weapon1 = weapon;
	}
	
	public void setWeapon2(Weapon weapon) {
		weapon2 = weapon;
	}
}
