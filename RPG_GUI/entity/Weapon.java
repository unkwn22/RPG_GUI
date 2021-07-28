package entity;

public class Weapon extends Item{
	
	private int damage;
	private int accuracy;

	public Weapon(String name, int cost, int damage, int accuracy) {
		super(name, cost);
		this.damage = damage;
		this.accuracy = accuracy;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
}
