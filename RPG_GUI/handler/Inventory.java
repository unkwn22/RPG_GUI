package handler;

import java.util.ArrayList;

import entity.Potion;
import entity.Weapon;

public class Inventory {
	
	static ArrayList<Weapon> wList = new ArrayList<>();
	static ArrayList<Potion> pList = new ArrayList<>();
	static ArrayList<Weapon> current = new ArrayList<>();
	
	InvenInit init = new InvenInit();
	
	public void playerInventory() {
		while(true) {
			System.out.println("1. Equip | 2. Use | 3. Toss | 0. Exit");
			int choice = Start.input.NumInput();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				init.equipWeapon();
			}else if(choice == 2) {
				init.usePotion();
			}else if(choice == 3) {
				while(true) {
					System.out.println("Which item would you like to toss?");
					System.out.println("1. Weapon | 2. Potion | 0. Back");
					choice = Start.input.NumInput();
					if(choice == 0) {
						break;
					}else if(choice == 1) {
						init.tossWeapon();
					}else if(choice == 2) {
						init.tossPotion();
					}
				}
			}
		}
	}
}
