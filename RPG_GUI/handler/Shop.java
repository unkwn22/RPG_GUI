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
			System.out.println("┌----------SHOP-----------┐");
			System.out.println("1. Buy | 2. Sell | 0. Exit");
			int choice = Start.input.NumInput();
			Start.clear.clear();
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
			System.out.println("┌---------------------BUY----------------------┐");
			System.out.println("1. Weapons | 2. Potions | 3. Armour | 0. Back");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				while(true) {
					view("weapon");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0) {
						break;
					}else if(choice <= weapons.size()){
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "weapon");
					}
				}
			}else if(choice == 2) {
				while(true) {
					view("potion");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to buy?");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0) {
						break;
					}else if(choice <= potions.size()){
						//passing through purchase method if its a weapon or a potion
						init.purchase(choice, "potion");
					}
				}
			}else if(choice == 3){
				while(true){
					System.out.println("┌-------------------------BUY-ARMOUR--------------------------┐");
					System.out.println("1. Helmets | 2. Body | 3. Legs | 4. Gloves | 5. Rings | 0. Back");
					System.out.println("[0] Back");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0) {
						break;
					}else if(choice == 1){
						while(true){
							view("helmet");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							Start.clear.clear();
							if(choice == 0) {
								break;
							}else if(choice <= helmets.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "helmet");
							}
						}
					}else if(choice == 2){
						while(true){
							view("body");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							Start.clear.clear();
							if(choice == 0) {
								break;
							}else if(choice <= body.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "body");
							}
						}
					}else if(choice == 3){
						while(true){
							view("leg");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							Start.clear.clear();
							if(choice == 0) {
								break;
							}else if(choice <= legs.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "leg");
							}
						}
					}else if(choice == 4){
						while(true){
							view("glove");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							Start.clear.clear();
							if(choice == 0) {
								break;
							}else if(choice <= gloves.size()){
								//passing through purchase method if its a weapon or a potion
								init.purchase(choice, "glove");
							}
						}
					}else if(choice == 5){
						while(true){
							view("ring");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to buy?");
							choice = Start.input.NumInput();
							Start.clear.clear();
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
			System.out.println("┌-------------------SELL--------------------┐");
			System.out.println("1. Weapon | 2. Potion | 3. Armour | 0. Back");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0){
				break;
			}else if(choice == 1) {
				while(true){
					invenInit.view("weapon");
					System.out.println("Current Gold: " + Town.player.getGp());
					System.out.println("What would you like to sell?");
					choice = Start.input.NumInput();
					Start.clear.clear();
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
					Start.clear.clear();
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
					System.out.println("┌-------------------------SELL-ARMOUR-------------------------┐");
					System.out.println("1. Helmets | 2. Body | 3. Legs | 4. Gloves | 5. Rings | 0. Back");
					System.out.println("[0] Back");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0){
						break;
					}else if(choice == 1){
						while(true){
							invenInit.view("helmet");
							System.out.println("Current Gold: " + Town.player.getGp());
							System.out.println("What would you like to sell?");
							choice = Start.input.NumInput();
							Start.clear.clear();
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
							Start.clear.clear();
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
							Start.clear.clear();
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
							Start.clear.clear();
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
							Start.clear.clear();
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

	//viewing inventory items
	public void view(String type) {
		//localizing first spaces in between name and damage
		int firstLength;
		int secondLength;
		if(type.equals("weapon")) {
			firstLength = 18;
			secondLength = 32;
			System.out.println("┌---Name------------Damage----Accuracy--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < weapons.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = weapons.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(weapons.get(i).getDamage());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(weapons.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("potion")) {
			firstLength = 18;
			System.out.println("┌---Name-------------Heal--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < potions.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String potionName = potions.get(i).getName();
				int firstRemainingSpaces = firstLength - potionName.length();
				sb.append(potionName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(potions.get(i).getHeal());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("helmet")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < helmets.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String helmetName = helmets.get(i).getName();
				int firstRemainingSpaces = firstLength - helmetName.length();
				sb.append(helmetName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(helmets.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("body")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < body.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String bodyName = body.get(i).getName();
				int firstRemainingSpaces = firstLength - bodyName.length();
				sb.append(bodyName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(body.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("leg")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < legs.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String legName = legs.get(i).getName();
				int firstRemainingSpaces = firstLength - legName.length();
				sb.append(legName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(legs.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("glove")){
			firstLength = 18;
			secondLength = 32;
			System.out.println("┌---Name-----------Defense----Accuracy--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < gloves.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String gloveName = gloves.get(i).getName();
				int firstRemainingSpaces = firstLength - gloveName.length();
				sb.append(gloveName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(gloves.get(i).getDef());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(gloves.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("ring")){
			firstLength = 18;
			secondLength = 32;
			System.out.println("┌---Name-----------Defense----Accuracy--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < rings.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String ringName = rings.get(i).getName();
				int firstRemainingSpaces = firstLength - ringName.length();
				sb.append(ringName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(rings.get(i).getDef());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(rings.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}
	}

}
