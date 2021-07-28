package entity;

public class Monster extends Unit {

	private int gpDrop;
	private int expDrop;

	public Monster(String name, int MAX_HP, int hp, int damage, int def, int lvl, int gpDrop, int expDrop) {
		super(name, MAX_HP, hp, damage, def, lvl);
		this.gpDrop = gpDrop;
		this.expDrop = expDrop;
	}

	public int getGpDrop() {
		return gpDrop;
	}

	public void setGpDrop(int gpDrop) {
		this.gpDrop = gpDrop;
	}

	public int getExpDrop(){
		return expDrop;
	}

	public void setExpDrop(int expDrop){
		this.expDrop = expDrop;
	}
	
}
