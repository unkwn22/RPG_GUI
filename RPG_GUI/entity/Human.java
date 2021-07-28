package entity;

public class Human extends Unit {
	
	private int gp;
	//1 == male 2 == female
	private int gender;

	public Human(String name, int MAX_HP, int hp, int damage, int gp, int gender) {
		super(name, MAX_HP, hp, damage);
		this.gp = gp;
		this.gender = gender;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public String getGender() {
		if(gender == 1) {
			return "male"; 
		}else {
			return "female";
		}
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
