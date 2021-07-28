package constructor;

import entity.Weapon;

import java.util.ArrayList;

import entity.Potion;

public class ItemConstructor {
	
	ArrayList<Weapon> weapon = new ArrayList<>();
	ArrayList<Potion> potion = new ArrayList<>();
	
	public ArrayList<Weapon> initWeapons() {
		Weapon bronzeW = new Weapon("Bronze Sword", 1000);
		bronzeW.setDamage(4);
		weapon.add(bronzeW);
		
		Weapon ironW = new Weapon("Iron Sword", 2500);
		ironW.setDamage(6);
		weapon.add(ironW);
		
		Weapon steelW = new Weapon("Steel Sword", 4000);
		steelW.setDamage(11);
		weapon.add(steelW);
		
		Weapon blackW = new Weapon("Black Sword", 5000);
		blackW.setDamage(14);
		weapon.add(blackW);
		
		Weapon mithrilW = new Weapon("Mithril Sword", 5900);
		mithrilW.setDamage(16);
		weapon.add(mithrilW);
		
		Weapon adamantW = new Weapon("Adamant Sword", 7000);
		adamantW.setDamage(23);
		weapon.add(adamantW);
		
		Weapon runeW = new Weapon("Rune Sword", 10000);
		runeW.setDamage(38);
		weapon.add(runeW);
		
		Weapon dragonW = new Weapon("Dragon Sword", 20000);
		dragonW.setDamage(65);
		weapon.add(dragonW);
		
		return weapon;
	}
	
	public ArrayList<Potion> initPotions(){
		Potion shrimp = new Potion("Shrimp", 100);
		shrimp.setHeal(3); 
		potion.add(shrimp);
		
		Potion chicken = new Potion("Chicken", 150);
		chicken.setHeal(8); 
		potion.add(chicken);
		
		Potion salmon = new Potion("Salmon", 240);
		salmon.setHeal(15); 
		potion.add(salmon);
		
		Potion lobster = new Potion("Lobster", 350);
		lobster.setHeal(26); 
		potion.add(lobster);
		
		Potion mantray = new Potion("Mantray", 420);
		mantray.setHeal(33); 
		potion.add(mantray);
		
		Potion karambwan = new Potion("Karambwan", 490);
		karambwan.setHeal(40); 
		potion.add(karambwan);
		
		Potion shark = new Potion("Shark", 570);
		shark.setHeal(48); 
		potion.add(shark);
		
		Potion angler = new Potion("Angler fish", 700);
		angler.setHeal(65);
		potion.add(angler);
		
		Potion full = new Potion("Full restore", 1000);
		full.setHeal(0);
		potion.add(full);
		
		return potion;
	}
}
