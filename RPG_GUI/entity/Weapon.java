package entity;

public class Weapon extends Item{
	
	private int damage;

	public Weapon(String name, int cost) {
		super(name, cost);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
}
