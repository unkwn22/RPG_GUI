package handler;

import java.util.ArrayList;

import entity.Human;
import entity.Monster;
import entity.Potion;
import entity.Weapon;
import entity.Helmet;
import entity.Body;
import entity.Legs;
import entity.Gloves;
import entity.Ring;


public class Town {
	
	static Human player = null;
	Shop s = null;
	Battle b = null;
	Inventory inven = new Inventory();
	
	//constructor only called once from app.Main class
	public Town(Human player, ArrayList<Weapon> weapons, ArrayList<Potion> potions, ArrayList<Monster> monster, ArrayList<Helmet> helmets,
				ArrayList<Body> body, ArrayList<Legs> legs, ArrayList<Gloves> gloves, ArrayList<Ring> rings) {
		Town.player = player;
		s = new Shop(weapons, potions, helmets, body, legs, gloves, rings);
		b = new Battle(monster);
	}
	
	public void town() {
		while(true) {
			System.out.println("┌----------Player-Stats-----------┐");
			System.out.println("Name: " + player.getName());
			System.out.println("Gender: " + player.getGender());
			System.out.println("Coins: " + player.getGp());
			System.out.println("HP: " + player.getMAX_HP() + " / " + player.getHp());
			inven.init.viewEquipments();
			System.out.println("EXP: " + player.getMAX_EXP() + " / " + player.getExp());
			System.out.println("└---------------------------------┘");
			System.out.println("┌------------------------Town-------------------------┐");
			System.out.println("1. Battle | 2. Shop | 3. Inventory | 4. Save | 5. Quit");
			int choice = Start.input.NumInput();
			Start.clear.clear();
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
