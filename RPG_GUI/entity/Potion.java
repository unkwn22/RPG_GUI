package entity;

public class Potion extends Item {
	
	private int heal;
	
	public Potion(String name, int cost, int heal) {
		super(name, cost);
		this.heal = heal;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	
}
