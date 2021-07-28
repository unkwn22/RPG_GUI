package entity;

public abstract class Unit {
	
	private String name;
	private int MAX_HP;
	private int hp;
	private int damage;
	
	public Unit(String name, int MAX_HP, int hp, int damage) {
		this.name = name;
		this.MAX_HP = MAX_HP;
		this.hp = hp;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMAX_HP() {
		return MAX_HP;
	}

	public void setMAX_HP(int mAX_HP) {
		MAX_HP = mAX_HP;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
