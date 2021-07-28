package handler;

import java.util.ArrayList;

import entity.Potion;
import entity.Weapon;

public class Shop {
	
	//static variables used around the handler package
	static ArrayList<Weapon> weapons = null;
	static ArrayList<Potion> potions = null;
	ShopInit init = new ShopInit();
	InvenInit invenInit = new InvenInit();
	
	//only called once from town constructor
	public Shop(ArrayList<Weapon> weapons, ArrayList<Potion> potions) {
		Shop.weapons = weapons;
		Shop.potions = potions;
	}
	
	public void mainShop() {
		while(true) {
			System.out.println("1. Buy | 2. Sell | 0. Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				buyShop();
			}else if(choice == 2) {
				sellShop();
			}
		}
	}
	
	public void buyShop() {
		//viewing for weapons, potions 
		boolean wView = false;
		boolean pView = false;
		
		while(true) {
			System.out.println("1. Weapons | 2. Potions | 0.Back");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				wView = true;
				while(wView) {
					for(int i = 0; i < weapons.size(); i++) {
						System.out.println("[" + (i+1) + "]" + weapons.get(i).getName() + " | " + weapons.get(i).getCost() + " | " + weapons.get(i).getDamage());
					}
					System.out.println("[0] Back");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					if(choice == 0) {
						wView = false;
					}else {
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "weapon");
					}
				}
			}else if(choice == 2) {
				pView = true;
				while(pView) {
					for(int i = 0; i < potions.size(); i++) {
						System.out.println("[" + (i+1) + "]" + potions.get(i).getName() + " | " + potions.get(i).getCost() + " | " + potions.get(i).getHeal());
					}
					System.out.println("[0] Back");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					if(choice == 0) {
						pView = false;
					}else {
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "potion");
					}
				}
			}
		}
	}
	
	public void sellShop() {
		while(true) {
			System.out.println("1. Weapon | 2. Potion | 0. Back");
			int choice = Start.input.NumInput();
			if(choice == 0){
				break;
			}else if(choice == 1) {
				while(true){
					invenInit.view("weapon");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to sell?");
					choice = Start.input.NumInput();
					if(choice == 0){
						break;
					}else if(Inventory.wList.size() == 0) {
						System.out.println("There's nothing to sell");
					}else{
						int cost = Inventory.wList.get(choice-1).getCost();
						double tax = cost * 0.2;
						int sellPrice = cost - (int)tax;
						Inventory.wList.remove(choice-1);
						Town.player.setGp(Town.player.getGp() + sellPrice);
						System.out.println("Sold");
					}
				}
			}else if(choice == 2) {
				while(true){
					invenInit.view("potion");
					choice = Start.input.NumInput();
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to sell?");
					choice = Start.input.NumInput();
					if(choice == 0){
						break;
					}else if(Inventory.pList.size() == 0) {
						System.out.println("There's nothing to sell");
					}else{
						int cost = Inventory.pList.get(choice-1).getCost();
						double tax = cost * 0.2;
						int sellPrice = cost - (int)tax;
						Inventory.pList.remove(choice-1);
						Town.player.setGp(Town.player.getGp() + sellPrice);
						System.out.println("Sold");
					}
				}
			}
		}
	}

}
