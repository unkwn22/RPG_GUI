package entity;

public class Human extends Unit {
	
	private int gp;
	//1 == male 2 == female
	private int gender;

	private int MAX_EXP;
	private int exp;

	private int plusDam;
	private int plusDef;
	private int plusAcc;

	public Human(String name, int MAX_HP, int hp, int damage, int def, int acc, int lvl, int gp, int gender,int MAX_EXP, int exp, int plusDam, int plusDef, int plusAcc) {
		super(name, MAX_HP, hp, damage, def, acc, lvl);
		this.gp = gp;
		this.gender = gender;
		this.MAX_EXP = MAX_EXP;
		this.exp = exp;
		this.plusDam = plusDam;
		this.plusDef = plusDef;
		this.plusAcc = plusAcc;
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

	public int getPlusDef() {
		return plusDef;
	}

	public void setPlusDef(int plusDef) {
		this.plusDef = plusDef;
	}

	public int getPlusAcc() {
		return plusAcc;
	}

	public void setPlusAcc(int plusAcc) {
		this.plusAcc = plusAcc;
	}

	public int getPlusDam() {
		return plusDam;
	}

	public void setPlusDam(int plusDam) {
		this.plusDam = plusDam;
	}

	public int getMAX_EXP() {
		return MAX_EXP;
	}

	public void setMAX_EXP(int MAX_EXP) {
		this.MAX_EXP = MAX_EXP;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}
