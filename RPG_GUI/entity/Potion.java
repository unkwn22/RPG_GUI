package entity;

public class Potion extends Item {
	
	private int heal;
//	private int quantity;
	
	public Potion(String name, int cost) {
		super(name, cost);
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	
}
