package handler;

import java.util.ArrayList;

import entity.*;

public class Shop {
	
	//static variables used around the handler package
	static ArrayList<Weapon> weapons = null;
	static ArrayList<Potion> potions = null;
	static ArrayList<Helmet> helmets = null;
	static ArrayList<Body> body = null;
	static ArrayList<Legs> legs = null;
	static ArrayList<Gloves> gloves = null;
	static ArrayList<Ring> rings = null;

	ShopInit init = new ShopInit();
	InvenInit invenInit = new InvenInit();
	
	//only called once from town constructor
	public Shop(ArrayList<Weapon> weapons, ArrayList<Potion> potions, ArrayList<Helmet> helmets,
				ArrayList<Body> body, ArrayList<Legs> legs, ArrayList<Gloves> gloves, ArrayList<Ring> rings) {
		Shop.weapons = weapons;
		Shop.potions = potions;
		Shop.helmets = helmets;
		Shop.body = body;
		Shop.legs = legs;
		Shop.gloves = gloves;
		Shop.rings = rings;
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

	//Buying
	public void buyShop() {
		while(true) {
			System.out.println("1. Weapons | 2. Potions | 3. Armour | 0. Back");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				while(true) {
					for(int i = 0; i < weapons.size(); i++) {
						System.out.println("[" + (i+1) + "]" + weapons.get(i).getName() + " | " + weapons.get(i).getCost() + " | " + weapons.get(i).getDamage());
					}
					System.out.println("[0] Back");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					if(choice == 0) {
						break;
					}else if(choice <= weapons.size()){
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "weapon");
					}
				}
			}else if(choice == 2) {
				while(true) {
					for(int i = 0; i < potions.size(); i++) {
						System.out.println("[" + (i+1) + "]" + potions.get(i).getName() + " | " + potions.get(i).getCost() + " | " + potions.get(i).getHeal());
					}
					System.out.println("[0] Back");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					if(choice == 0) {
						break;
					}else if(choice <= potions.size()){
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "potion");
					}
				}
			}else if(choice == 3){
				while(true){
					System.out.println("1. Helmets | 2. Body | 3. Legs | 4. Gloves | 5. Rings | 0. Back");
					System.out.println("[0] Back");
					choice = Start.input.NumInput();
					if(choice == 0) {
						break;
					}else if(choice == 1){
						while(true){
							for(int i = 0; i < helmets.size(); i++) {
								System.out.println("[" + (i+1) + "]" + helmets.get(i).getName() + " | " + helmets.get(i).getCost() + " | " + helmets.get(i).getDef());
							}
							System.out.println("[0] Back");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							if(choice == 0) {
								break;
							}else if(choice <= helmets.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "helmet");
							}
						}
					}else if(choice == 2){
						while(true){
							for(int i = 0; i < body.size(); i++) {
								System.out.println("[" + (i+1) + "]" + body.get(i).getName() + " | " + body.get(i).getCost() + " | " + body.get(i).getDef());
							}
							System.out.println("[0] Back");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							if(choice == 0) {
								break;
							}else if(choice <= body.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "body");
							}
						}
					}else if(choice == 3){
						while(true){
							for(int i = 0; i < legs.size(); i++) {
								System.out.println("[" + (i+1) + "]" + legs.get(i).getName() + " | " + legs.get(i).getCost() + " | " + legs.get(i).getDef());
							}
							System.out.println("[0] Back");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							if(choice == 0) {
								break;
							}else if(choice <= legs.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "leg");
							}
						}
					}else if(choice == 4){
						while(true){
							for(int i = 0; i < gloves.size(); i++) {
								System.out.println("[" + (i+1) + "]" + gloves.get(i).getName() + " | " + gloves.get(i).getCost() + " | " + gloves.get(i).getDef() + " | " + gloves.get(i).getAccuracy());
							}
							System.out.println("[0] Back");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							if(choice == 0) {
								break;
							}else if(choice <= gloves.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "glove");
							}
						}
					}else if(choice == 5){
						while(true){
							for(int i = 0; i < rings.size(); i++) {
								System.out.println("[" + (i+1) + "]" + rings.get(i).getName() + " | " + rings.get(i).getCost() + " | " + rings.get(i).getDef() + " | " + rings.get(i).getAccuracy());
							}
							System.out.println("[0] Back");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							if(choice == 0) {
								break;
							}else if(choice <= rings.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "ring");
							}
						}
					}
				}
			}
		}
	}

	//Selling
	public void sellShop() {
		while(true) {
			System.out.println("1. Weapon | 2. Potion | 3. Armour | 0. Back");
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
					}
					if(Inventory.wList.size() == 0) {
						System.out.println("There's nothing to sell");
					}else if(choice <= Inventory.wList.size()){
						init.sell(choice, "weapon");
					}
				}
			}else if(choice == 2) {
				while(true){
					invenInit.view("potion");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to sell?");
					choice = Start.input.NumInput();
					if(choice == 0){
						break;
					}
					if(Inventory.pList.size() == 0) {
						System.out.println("There's nothing to sell");
					}else if(choice <= Inventory.pList.size()){
						init.sell(choice, "potion");
					}
				}
			}else if(choice == 3){
				while(true){
					System.out.println("1. Helmets | 2. Body | 3. Legs | 4. Gloves | 5. Rings | 0. Back");
					System.out.println("[0] Back");
					choice = Start.input.NumInput();
					if(choice == 0){
						break;
					}else if(choice == 1){
						while(true){
							invenInit.view("helmet");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							if(choice == 0){
								break;
							}
							if(Inventory.hList.size() == 0) {
								System.out.println("There's nothing to sell");
							}else if(choice <= Inventory.hList.size()){
								init.sell(choice, "helmet");
							}
						}
					}else if(choice == 2){
						while(true){
							invenInit.view("body");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							if(choice == 0){
								break;
							}
							if(Inventory.bList.size() == 0) {
								System.out.println("There's nothing to sell");
							}else if(choice <= Inventory.bList.size()){
								init.sell(choice, "body");
							}
						}
					}else if(choice == 3){
						while(true){
							invenInit.view("leg");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							if(choice == 0){
								break;
							}
							if(Inventory.l_List.size() == 0) {
								System.out.println("There's nothing to sell");
							}else if(choice <= Inventory.l_List.size()){
								init.sell(choice, "leg");
							}
						}
					}else if(choice == 4){
						while(true){
							invenInit.view("glove");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							if(choice == 0){
								break;
							}
							if(Inventory.gList.size() == 0) {
								System.out.println("There's nothing to sell");
							}else if(choice <= Inventory.gList.size()){
								init.sell(choice, "glove");
							}
						}
					}else if(choice == 5){
						while(true){
							invenInit.view("ring");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							if(choice == 0){
								break;
							}
							if(Inventory.rList.size() == 0) {
								System.out.println("There's nothing to sell");
							}else if(choice <= Inventory.rList.size()){
								init.sell(choice, "ring");
							}
						}
					}
				}
			}
		}
	}

}
