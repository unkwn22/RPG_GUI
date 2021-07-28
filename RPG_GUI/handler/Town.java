package handler;

import java.util.ArrayList;

import entity.Human;
import entity.Monster;
import entity.Potion;
import entity.Weapon;

public class Town {
	
	static Human player = null;
	Shop s = null;
	Battle b = null;
	Inventory inven = new Inventory();
	
	//constructor only called once from app.Main class
	public Town(Human player, ArrayList<Weapon> weapons, ArrayList<Potion> potions, ArrayList<Monster> monster) {
		Town.player = player;
		s = new Shop(weapons, potions);
		b = new Battle(monster);
	}
	
	public void town() {
		while(true) {
			System.out.print("Name: " + player.getName() + " | HP: " + player.getMAX_HP() + "/" 
			+ player.getHp() + " | Coins: " + player.getGp() + " | Equipped: ");
			if(Inventory.current.size() == 0) {
				System.out.print("nothing" + " | Damage: " + player.getDamage());
			}else {
				System.out.print(Inventory.current.get(0).getName() + " | Damage: " + player.getDamage());
			}
			System.out.print(" | Gender: " + player.getGender() + "\n");
			System.out.println("1. Battle | 2. Shop | 3. Inventory | 4. Save | 5. Quit");
			int choice = Start.input.NumInput();
			if(choice == 1) {
				b.viewBattle();
			}else if(choice == 2) {
				s.mainShop();
			}else if(choice == 3) {
				inven.playerInventory();
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				break;
			}
		}
	}
}
