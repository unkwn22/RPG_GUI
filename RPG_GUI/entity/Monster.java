package entity;

public class Monster extends Unit {
	
	//drop level
	private int drop;

	public Monster(String name, int MAX_HP, int hp, int damage, int drop) {
		super(name, MAX_HP, hp, damage);
		this.drop = drop;
	}

	public int getDrop() {
		return drop;
	}

	public void setDrop(int drop) {
		this.drop = drop;
	}
	
}
