package handler;

import java.util.ArrayList;

import entity.*;

public class Inventory {
	
	static ArrayList<Weapon> wList = new ArrayList<>();
	static ArrayList<Potion> pList = new ArrayList<>();
	static ArrayList<Helmet> hList = new ArrayList<>();
	static ArrayList<Body> bList = new ArrayList<>();
	static ArrayList<Legs> l_List = new ArrayList<>();
	static ArrayList<Gloves> gList = new ArrayList<>();
	static ArrayList<Ring> rList = new ArrayList<>();

	static ArrayList<Item> current = new ArrayList<>();
	static ArrayList<Armour> currentArmour = new ArrayList();
	
	InvenInit init = new InvenInit();

	public Inventory(){
		current.add(null);
		currentArmour.add(null);
		currentArmour.add(null);
		currentArmour.add(null);
		currentArmour.add(null);
		currentArmour.add(null);
	}

	public void playerInventory() {

		while(true) {
			System.out.println("1. Equip | 2. Use | 3. Toss | 0. Exit");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(choice == 1) {
				while(true){
					init.viewEquipments();
					System.out.println("1. Weapon | 2. Helmet | 3. Body | 4. Legs | 5. Gloves | 6. Ring | 0. Back");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0){
						break;
					}
					else if(choice == 1){
						init.equipment("weapon");
					}
					else if(choice == 2){
						init.equipment("helmet");
					}
					else if(choice == 3){
						init.equipment("body");
					}
					else if(choice == 4){
						init.equipment("leg");
					}
					else if(choice == 5){
						init.equipment("glove");
					}
					else if(choice == 6){
						init.equipment("ring");
					}
				}
			}else if(choice == 2) {
				init.usePotion();
			}else if(choice == 3) {
				while(true) {
					System.out.println("Which item would you like to toss?");
					System.out.println("1. Weapon | 2. Potion | 3. Armour | 0. Back");
					choice = Start.input.NumInput();
					Start.clear.clear();
					if(choice == 0) {
						break;
					}else if(choice == 1) {
						init.tossWeapon();
					}else if(choice == 2) {
						init.tossPotion();
					}else if(choice == 3){
						while(true){
							System.out.println("1. Helmet | 2. Body | 3. Legs | 4. Gloves | 5. Ring | 0. Back");
							choice = Start.input.NumInput();
							Start.clear.clear();
							if(choice == 0){
								break;
							}else if(choice == 1){
								init.tossHelmet();
							}else if(choice == 2){
								init.tossBody();
							}else if(choice == 3){
								init.tossLegs();
							}else if(choice == 4){
								init.tossGloves();
							}else if(choice == 5){
								init.tossRing();
							}
						}
					}
				}
			}
		}
	}
}
