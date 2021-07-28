package constructor;

import entity.Weapon;

import java.lang.reflect.Array;
import java.util.ArrayList;

import entity.Potion;

public class ItemConstructor {
	
	ArrayList<Weapon> weapon = new ArrayList<>();
	ArrayList<Potion> potion = new ArrayList<>();
//	ArrayList<Helmet> helmet = new ArrayList<>();
//	ArrayList<Body> body = new ArrayList<>();
//	ArrayList<Legs> legs = new ArrayList<>();
//	ArrayList<Boots> boots = new ArrayList<>();
//	ArrayList<Gloves> gloves = new ArrayList<>();
//	ArrayList<Ring> ring = new ArrayList<>();
//	ArrayList<Cape> cape = new ArrayList<>();



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
}
