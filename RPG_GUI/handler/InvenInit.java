package handler;

import java.util.ArrayList;

import entity.*;

//initiating inventory items
public class InvenInit {
	
	public void equipment(String type) {
		if(type.equals("weapon")){
			while(true){
				viewEquipments();
				view("weapon");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.wList.size() > 0){
					if(choice <= Inventory.wList.size()){
						if(Inventory.current.get(0) == null){
							Inventory.current.remove(0);
							Inventory.current.add(Inventory.wList.get(choice-1));
							Inventory.wList.remove(choice-1);
						}else{
							Inventory.current.add(Inventory.wList.get(choice-1));
							Inventory.wList.add((Weapon) Inventory.current.get(0));
							Inventory.wList.remove(choice-1);
							Inventory.current.remove(0);
						}
					}
				}
			}
		} else if(type.equals("helmet")){
			while(true){
				viewEquipments();
				view("helmet");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.hList.size() > 0){
					if(choice <= Inventory.hList.size()){
						if(Inventory.currentArmour.get(0) == null){
							Inventory.currentArmour.set(0, Inventory.hList.get(choice-1));
							Inventory.hList.remove(choice-1);
						}else{
							Inventory.hList.add((Helmet) Inventory.currentArmour.get(0));
							Inventory.currentArmour.set(0, Inventory.hList.get(choice-1));
							Inventory.hList.remove(choice-1);
						}
					}
				}
			}
		}
		else if(type.equals("body")){
			while(true){
				viewEquipments();
				view("body");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.bList.size() > 0){
					if(choice <= Inventory.bList.size()){
						if(Inventory.currentArmour.get(1) == null){
							Inventory.currentArmour.set(1, Inventory.bList.get(choice-1));
							Inventory.bList.remove(choice-1);
						}else{
							Inventory.bList.add((Body) Inventory.currentArmour.get(1));
							Inventory.currentArmour.set(1, Inventory.bList.get(choice-1));
							Inventory.bList.remove(choice-1);
						}
					}
				}
			}
		}
		else if(type.equals("leg")){
			while(true){
				viewEquipments();
				view("leg");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.l_List.size() > 0){
					if(choice <= Inventory.l_List.size()){
						if(Inventory.currentArmour.get(2) == null){
							Inventory.currentArmour.set(2, Inventory.l_List.get(choice-1));
							Inventory.l_List.remove(choice-1);
						}else{
							Inventory.l_List.add((Legs) Inventory.currentArmour.get(2));
							Inventory.currentArmour.set(2, Inventory.l_List.get(choice-1));
							Inventory.l_List.remove(choice-1);
						}
					}
				}
			}
		}
		else if(type.equals("glove")){
			while(true){
				viewEquipments();
				view("glove");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.gList.size() > 0){
					if(choice <= Inventory.gList.size()){
						if(Inventory.currentArmour.get(3) == null){
							Inventory.currentArmour.set(3, Inventory.gList.get(choice-1));
							Inventory.gList.remove(choice-1);
						}else{
							Inventory.gList.add((Gloves) Inventory.currentArmour.get(3));
							Inventory.currentArmour.set(3, Inventory.gList.get(choice-1));
							Inventory.gList.remove(choice-1);
						}
					}
				}
			}
		}
		else if(type.equals("ring")){
			while(true){
				viewEquipments();
				view("ring");
				System.out.println("What would you like to equip?");
				int choice = Start.input.NumInput();
				Start.clear.clear();
				if(choice == 0){
					break;
				}else if(Inventory.rList.size() > 0){
					if(choice <= Inventory.rList.size()){
						if(Inventory.currentArmour.get(4) == null){
							Inventory.currentArmour.set(4, Inventory.rList.get(choice-1));
							Inventory.rList.remove(choice-1);
						}else{
							Inventory.rList.add((Ring) Inventory.currentArmour.get(4));
							Inventory.currentArmour.set(4, Inventory.rList.get(choice-1));
							Inventory.rList.remove(choice-1);
						}
					}
				}
			}
		}
	}
	
	public void tossWeapon() {
		while(true) {
			view("weapon");
			System.out.println("Which weapon would you like to toss?");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.wList.size() > 0) {
				Inventory.wList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}
	
	public void usePotion() {
		while(true) {
			view("potion");
			System.out.println("Which potion would you like to use?");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.pList.size() > 0 && Town.player.getHp() < Town.player.getMAX_HP()){
				System.out.println("Healed!");
				int currentHp = Town.player.getHp();
				int currentMax = Town.player.getMAX_HP();
				int potionHp = Inventory.pList.get(choice-1).getHeal();
				int result = currentHp + potionHp;
				if(result < currentMax) {
					Town.player.setHp(result);
				}else {
					Town.player.setHp(currentMax);
				}
				Inventory.pList.remove(choice-1);
			}
		}
	}
	
	public void tossPotion() {
		while(true) {
			view("potion");
			System.out.println("Which potion would you like to toss?");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.pList.size() > 0) {
				Inventory.pList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}

	//Equipment status
	public void viewEquipments(){
		for(int i = 0; i < 5; i++){
			if(i == 0){
				//Helmet
				if(Inventory.currentArmour.get(i) == null){
					System.out.println("[Nothing]");
				}else {
					System.out.println("[" + Inventory.currentArmour.get(i).getName() + "]");
				}
			}else if(i == 1){
				//Body
				if(Inventory.currentArmour.get(i) == null){
					System.out.print("[Nothing]");
				}else{
					System.out.print("[" + Inventory.currentArmour.get(i).getName() + "]");
				}

				//Weapon
				if(Inventory.current.get(0) == null){
					System.out.println("[Nothing]");
				}else{
					System.out.println("[" + Inventory.current.get(0).getName() + "]");
				}
			}else if(i == 2){
				//Legs
				if(Inventory.currentArmour.get(i) == null){
					System.out.println("[Nothing]");
				}else{
					System.out.println("[" + Inventory.currentArmour.get(i).getName() + "]");
				}
			}else if(i == 3){
				if(Inventory.currentArmour.get(i) == null){
					System.out.print("[Nothing]");
				}else{
					System.out.print("[" + Inventory.currentArmour.get(i).getName() + "]");
				}
			}else if(i == 4){
				if(Inventory.currentArmour.get(i) == null){
					System.out.println("[Nothing]");
				}else{
					System.out.println("[" + Inventory.currentArmour.get(i).getName() + "]");
				}
			}
		}
	}
	
	//viewing inventory items
	public void view(String type) {
		if(type.equals("weapon")) {
			for(int i = 0; i < Inventory.wList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.wList.get(i).getName() + " | " + Inventory.wList.get(i).getDamage());
			}
			System.out.println("[0] Back");
		}else if(type.equals("potion")) {
			for(int i = 0; i < Inventory.pList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.pList.get(i).getName() + " | " + Inventory.pList.get(i).getHeal());
			}
			System.out.println("[0] Back");
		}else if(type.equals("helmet")){
			for(int i = 0; i < Inventory.hList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.hList.get(i).getName() + " | " + Inventory.hList.get(i).getDef());
			}
			System.out.println("[0] Back");
		}else if(type.equals("body")){
			for(int i = 0; i < Inventory.bList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.bList.get(i).getName() + " | " + Inventory.bList.get(i).getDef());
			}
			System.out.println("[0] Back");
		}else if(type.equals("leg")){
			for(int i = 0; i < Inventory.l_List.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.l_List.get(i).getName() + " | " + Inventory.l_List.get(i).getDef());
			}
			System.out.println("[0] Back");
		}else if(type.equals("glove")){
			for(int i = 0; i < Inventory.gList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.gList.get(i).getName() + " | " + Inventory.gList.get(i).getDef());
			}
			System.out.println("[0] Back");
		}else if(type.equals("ring")){
			for(int i = 0; i < Inventory.rList.size(); i++) {
				System.out.println("[" + (i+1) + "]" + Inventory.rList.get(i).getName() + " | " + Inventory.rList.get(i).getDef());
			}
			System.out.println("[0] Back");
		}
	}
	
	
}
