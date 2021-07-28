package handler;

import java.util.ArrayList;

import entity.Weapon;

//initiating inventory items
public class InvenInit {
	
	public void equipWeapon() {
		while(true) {
			view("weapon");
			if(Inventory.current.size() == 0) {
				System.out.println("Currently equipping: Nothing");
			}else {
				System.out.println("Currently equipping: " + Inventory.current.get(0).getName());
			}
			System.out.println("What would you like to equip?");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(Inventory.wList.size() > 0) {
				ArrayList<Weapon> temp = new ArrayList<>();
				if(!Inventory.current.isEmpty()) {
					temp.add(Inventory.current.get(0));
					Inventory.current.remove(0);
					Inventory.current.add(Inventory.wList.get(choice-1));
					Inventory.wList.remove(choice-1);
					Inventory.wList.add(temp.get(0));
				}else {
					Inventory.current.add(Inventory.wList.get(choice-1));
					Inventory.wList.remove(choice-1);
					Town.player.setDamage(Inventory.current.get(0).getDamage());
				}
			}
		}
	}
	
	public void tossWeapon() {
		while(true) {
			view("weapon");
			System.out.println("Which weapon would you like to toss?");
			int choice = Start.input.NumInput();
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
			if(choice == 0) {
				break;
			}else if(Inventory.pList.size() > 0) {
				Inventory.pList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
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
		}
	}
	
	
}
