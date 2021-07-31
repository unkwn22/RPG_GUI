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
						//localizing weapon's damage and accuracy
						int damage = Inventory.wList.get(choice-1).getDamage();
						int accuracy = Inventory.wList.get(choice-1).getAccuracy();
						//checks if its a fresh starter
						if(Inventory.current.get(0) == null){
							Inventory.current.remove(0);
							Inventory.current.add(Inventory.wList.get(choice-1));
							Inventory.wList.remove(choice-1);
							//if its already wielding something
						}else{
							Inventory.current.add(Inventory.wList.get(choice-1));
							Inventory.wList.add((Weapon) Inventory.current.get(0));
							Inventory.wList.remove(choice-1);
							Inventory.current.remove(0);
						}
						//setting plus damage and accuracy
						Town.player.setPlusDam(damage);
						Town.player.setPlusAcc(accuracy);
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
					int defense = Inventory.hList.get(choice-1).getDef();
					if(choice <= Inventory.hList.size()){
						if(Inventory.currentArmour.get(0) == null){
							Inventory.currentArmour.set(0, Inventory.hList.get(choice-1));
							Inventory.hList.remove(choice-1);
						}else{
							//preventing plus def stack
							Town.player.setPlusDef(Town.player.getPlusDef() - Inventory.currentArmour.get(0).getDef());
							Inventory.hList.add((Helmet) Inventory.currentArmour.get(0));
							Inventory.currentArmour.set(0, Inventory.hList.get(choice-1));
							Inventory.hList.remove(choice-1);
						}
						Town.player.setPlusDef(Town.player.getPlusDef() + defense);
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
						int defense = Inventory.bList.get(choice-1).getDef();
						if(Inventory.currentArmour.get(1) == null){
							Inventory.currentArmour.set(1, Inventory.bList.get(choice-1));
							Inventory.bList.remove(choice-1);
						}else{
							Town.player.setPlusDef(Town.player.getPlusDef() - Inventory.currentArmour.get(1).getDef());
							Inventory.bList.add((Body) Inventory.currentArmour.get(1));
							Inventory.currentArmour.set(1, Inventory.bList.get(choice-1));
							Inventory.bList.remove(choice-1);
						}
						Town.player.setPlusDef(Town.player.getPlusDef() + defense);
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
						int defense = Inventory.l_List.get(choice-1).getDef();
						if(Inventory.currentArmour.get(2) == null){
							Inventory.currentArmour.set(2, Inventory.l_List.get(choice-1));
							Inventory.l_List.remove(choice-1);
						}else{
							Town.player.setPlusDef(Town.player.getPlusDef() - Inventory.currentArmour.get(2).getDef());
							Inventory.l_List.add((Legs) Inventory.currentArmour.get(2));
							Inventory.currentArmour.set(2, Inventory.l_List.get(choice-1));
							Inventory.l_List.remove(choice-1);
						}
						Town.player.setPlusDef(Town.player.getPlusDef() + defense);
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
					int defense = Inventory.gList.get(choice-1).getDef();
					int accuracy = Inventory.gList.get(choice-1).getAccuracy();
					if(choice <= Inventory.gList.size()){
						if(Inventory.currentArmour.get(3) == null){
							Inventory.currentArmour.set(3, Inventory.gList.get(choice-1));
							Inventory.gList.remove(choice-1);
						}else{
							Town.player.setPlusDef(Town.player.getPlusDef() - Inventory.currentArmour.get(3).getDef());
							//since currentArmour element is set to Armour, casting it to gloves and finding out the accuracy
							Gloves gloves = (Gloves) Inventory.currentArmour.get(3);
							Town.player.setPlusAcc(Town.player.getPlusAcc() - gloves.getAccuracy());
							Inventory.gList.add((Gloves) Inventory.currentArmour.get(3));
							Inventory.currentArmour.set(3, Inventory.gList.get(choice-1));
							Inventory.gList.remove(choice-1);
						}
						Town.player.setPlusDef(Town.player.getPlusDef() + defense);
						Town.player.setPlusAcc(Town.player.getPlusAcc() + accuracy);
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
						int defense = Inventory.rList.get(choice-1).getDef();
						int accuracy = Inventory.rList.get(choice-1).getAccuracy();
						if(Inventory.currentArmour.get(4) == null){
							Inventory.currentArmour.set(4, Inventory.rList.get(choice-1));
							Inventory.rList.remove(choice-1);
						}else{
							Town.player.setPlusDef(Town.player.getPlusDef() - Inventory.currentArmour.get(4).getDef());
							Ring ring = (Ring) Inventory.currentArmour.get(4);
							Town.player.setPlusAcc(Town.player.getPlusAcc() - ring.getAccuracy());
							Inventory.rList.add((Ring) Inventory.currentArmour.get(4));
							Inventory.currentArmour.set(4, Inventory.rList.get(choice-1));
							Inventory.rList.remove(choice-1);
						}
						Town.player.setPlusDef(Town.player.getPlusDef() + defense);
						Town.player.setPlusAcc(Town.player.getPlusAcc() + accuracy);
					}
				}
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
		System.out.println("Current Damage: " + Town.player.getDamage() + " +" + Town.player.getPlusDam());
		System.out.println("Current Defense: " + Town.player.getDef() + " +" + Town.player.getPlusDef());
		System.out.println("Current Accuracy: " + Town.player.getAcc() + " +" + Town.player.getPlusAcc());
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
			for(int i = 0; i < Inventory.wList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.wList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.wList.get(i).getDamage());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.wList.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("potion")) {
			firstLength = 18;
			System.out.println("┌---Name-------------Heal--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.pList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.pList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.pList.get(i).getHeal());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("helmet")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.hList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.hList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.hList.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("body")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.bList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.bList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.bList.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("leg")){
			firstLength = 18;
			System.out.println("┌---Name-----------Defense-┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.l_List.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.l_List.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.l_List.get(i).getDef());
				System.out.println(sb);
			}
			System.out.println("└--------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("glove")){
			firstLength = 18;
			secondLength = 32;
			System.out.println("┌---Name-----------Defense----Accuracy--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.gList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.gList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.gList.get(i).getDef());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.gList.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}else if(type.equals("ring")){
			firstLength = 18;
			secondLength = 32;
			System.out.println("┌---Name-----------Defense----Accuracy--┐");
			//using string builder to measure spaces in between stats
			for(int i = 0; i < Inventory.rList.size(); i++){
				StringBuilder sb = new StringBuilder();
				sb.append("[" + (i+1) + "] ");
				String weaponName = Inventory.rList.get(i).getName();
				int firstRemainingSpaces = firstLength - weaponName.length();
				sb.append(weaponName);
				for(int j = 0; j < firstRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.rList.get(i).getDef());
				int secondRemainingSpaces = secondLength - sb.length();
				for(int j = 0; j < secondRemainingSpaces; j++){
					sb.append(" ");
				}
				sb.append(Inventory.rList.get(i).getAccuracy());
				System.out.println(sb);
			}
			System.out.println("└---------------------------------------┘");
			System.out.println("[0] Back");
		}
	}

	//Toss
	public void tossWeapon() {
		while(true) {
			view("weapon");
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

	public void tossPotion() {
		while(true) {
			view("potion");
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

	public void tossHelmet(){
		while(true){
			view("helmet");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.hList.size() > 0) {
				Inventory.hList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}

	public void tossBody(){
		while(true){
			view("body");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.bList.size() > 0) {
				Inventory.bList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}

	public void tossLegs(){
		while(true){
			view("leg");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.l_List.size() > 0) {
				Inventory.l_List.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}

	public void tossGloves(){
		while(true){
			view("glove");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.gList.size() > 0) {
				Inventory.gList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}

	public void tossRing(){
		while(true){
			view("ring");
			int choice = Start.input.NumInput();
			Start.clear.clear();
			if(choice == 0) {
				break;
			}else if(Inventory.rList.size() > 0) {
				Inventory.rList.remove(choice-1);
			}else {
				System.out.println("There's nothing to toss");
			}
		}
	}
}
