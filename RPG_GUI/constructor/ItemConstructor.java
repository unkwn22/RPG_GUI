package constructor;

import entity.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemConstructor {
	
	ArrayList<Weapon> weapon = new ArrayList<>();
	ArrayList<Potion> potion = new ArrayList<>();
	ArrayList<Helmet> helmet = new ArrayList<>();
	ArrayList<Body> body = new ArrayList<>();
	ArrayList<Legs> legs = new ArrayList<>();
	ArrayList<Gloves> gloves = new ArrayList<>();
	ArrayList<Ring> ring = new ArrayList<>();

	//Weapons initializer
	public ArrayList<Weapon> initWeapons() {
		String[] swordName = {"Bronze Sword", "Iron Sword", "Steel Sword", "Black Sword", "Mithril Sword", "Adamant Sword", "Rune Sword", "Dragon Sword"};
		int[] swordCost = {1000, 2500, 4000, 5000, 5900, 7000, 10000, 20000};
		int[] swordDamage = {4, 6, 11, 14, 16, 23, 38, 65};
		int[] swordAccuracy = {30, 40, 50, 60, 70, 75, 80, 90};

		for(int i = 0; i < swordName.length; i++){
			weaponAdder(swordName[i], swordCost[i], swordDamage[i], swordAccuracy[i]);
		}

		return weapon;
	}

	public void weaponAdder(String name, int cost, int damage, int accuracy){
		Weapon sword = new Weapon(name, cost, damage, accuracy);
		weapon.add(sword);
	}

	//Potions initializer
	public ArrayList<Potion> initPotions(){
		String[] foodName = {"Shrimp", "Chicken", "Salmon", "Lobster","Mantray", "Karambwan", "Shark", "Angler fish", "Full restore"};
		int[] foodCost = {100, 150, 240, 350, 420, 490, 570, 700, 1000};
		int[] foodHeal = {3, 8, 15, 26, 33, 40, 48, 65, 100000};

		for(int i = 0; i < foodName.length; i++){
			potionAdder(foodName[i], foodCost[i], foodHeal[i]);
		}
		return potion;
	}

	public void potionAdder(String name, int cost, int heal){
		Potion food = new Potion(name, cost, heal);
		potion.add(food);
	}

	//Helmets initializer
	public ArrayList<Helmet> initHelmets(){
		String[] helmetName = {"Bronze helm", "Iron helm", "Steel helm", "Black helm", "Mithril helm", "Adamant helm", "Rune helm", "Dragon helm"};
		int[] helmetCost = {600, 700, 800, 900, 1050, 1200, 1300, 1500};
		int[] helmetDef = {3, 5, 7, 9, 11, 15, 20, 25};

		for(int i = 0; i < helmetName.length; i++){
			helmet_body_legsAdder(1 ,helmetName[i], helmetCost[i], helmetDef[i]);
		}

		return helmet;
	}

	//Body initializer
	public ArrayList<Body> initBody(){
		String[] bodyName = {"Bronze body", "Iron body", "Steel body", "Black body", "Mithril body", "Adamant body", "Rune body", "Dragon body"};
		int[] bodyCost = {1600, 1700, 1800, 1900, 2000, 2100, 2400, 2600};
		int[] bodyDef = {10, 11, 12, 13, 14, 15, 18, 20};


		for(int i = 0; i < bodyName.length; i++){
			helmet_body_legsAdder(2 ,bodyName[i], bodyCost[i], bodyDef[i]);
		}

		return body;
	}

	//Legs initializer
	public ArrayList<Legs> initLegs(){
		String[] legsName = {"Bronze legs", "Iron legs", "Steel legs", "Black legs", "Mithril legs", "Adamant legs", "Rune legs", "Dragon legs"};
		int[] legsCost = {600, 700, 800, 900, 1050, 1200, 1300, 1500};
		int[] legsDef = {3, 5, 7, 9, 11, 15, 20, 25};

		for(int i = 0; i < legsName.length; i++){
			helmet_body_legsAdder(3 ,legsName[i], legsCost[i], legsDef[i]);
		}

		return legs;
	}

	public void helmet_body_legsAdder(int type, String name, int cost, int def){
		if(type == 1){
			Helmet armourHead = new Helmet(name, cost, def);
			helmet.add(armourHead);
		}else if(type == 2){
			Body armourBody = new Body(name, cost, def);
			body.add(armourBody);
		}else if(type == 3){
			Legs armourLegs = new Legs(name, cost, def);
			legs.add(armourLegs);
		}
	}

	//Gloves initializer
	public ArrayList<Gloves> initGloves(){
		String[] glovesName = {"Bronze gloves", "Iron gloves", "Steel gloves", "Black gloves", "Mithril gloves", "Adamant gloves", "Rune gloves", "Dragon gloves"};
		int[] glovesCost = {300, 400, 500, 600, 700, 800, 1000, 1200};
		int[] glovesDef = {2, 3, 4, 5, 6, 7, 8, 9};
		int[] glovesAcc = {5, 6, 7, 8, 9, 10, 12, 15};

		for(int i = 0; i < glovesName.length; i++){
			gloves_ringAdder(1, glovesName[i], glovesCost[i], glovesDef[i], glovesAcc[i]);
		}

		return gloves;
	}

	//Ring initializer
	public ArrayList<Ring> initRing(){
		String[] ringName = {"Wooden ring", "Steel ring", "Gold ring", "Diamond ring", "Ring of fortune", "Ring of power", "Ring of death", "Ring of God"};
		int[] ringCost = {100, 300, 600, 1200, 2000, 2500, 3000, 5000};
		int[] ringDef = {1, 3, 6, 12, 13, 14, 15, 20};
		int[] ringAcc = {35, 42, 47, 52, 55, 60, 65, 70};

		for(int i = 0; i < ringName.length; i++){
			gloves_ringAdder(2, ringName[i], ringCost[i], ringDef[i], ringAcc[i]);
		}

		return ring;
	}

	public void gloves_ringAdder(int type, String name, int cost, int def, int acc){
		if(type == 1){
			Gloves armourGloves = new Gloves(name, cost, def, acc);
			gloves.add(armourGloves);
		}else if(type == 2){
			Ring armourRing = new Ring(name, cost, def, acc);
			ring.add(armourRing);
		}
	}


}
