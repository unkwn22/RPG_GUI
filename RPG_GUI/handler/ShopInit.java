package handler;

//Initiating purchases
public class ShopInit {

	//both purchase and sell
	private int current_gp;
	private int cost;
	private String item_name = null;

	//for selling purposes
	private double tax;
	private int sellPrice;

	public void purchase(int choice, String type) {
		if(type.equals("weapon")) {
			//Localizing variables due to long typing
			current_gp = Town.player.getGp();
			cost = Shop.weapons.get(choice-1).getCost();
			item_name = Shop.weapons.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.wList.add(Shop.weapons.get(choice-1));
			}
		}else if(type.equals("potion")) {
			//Localizing variables due to long typing
			current_gp = Town.player.getGp();
			cost = Shop.potions.get(choice-1).getCost();
			item_name = Shop.potions.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.pList.add(Shop.potions.get(choice-1));
			}
		}else if(type.equals("helmet")){
			current_gp = Town.player.getGp();
			cost = Shop.helmets.get(choice-1).getCost();
			item_name = Shop.helmets.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.hList.add(Shop.helmets.get(choice-1));
			}
		}else if(type.equals("body")){
			current_gp = Town.player.getGp();
			cost = Shop.body.get(choice-1).getCost();
			item_name = Shop.body.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.bList.add(Shop.body.get(choice-1));
			}
		}else if(type.equals("leg")){
			current_gp = Town.player.getGp();
			cost = Shop.legs.get(choice-1).getCost();
			item_name = Shop.legs.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.l_List.add(Shop.legs.get(choice-1));
			}
		}else if(type.equals("glove")){
			current_gp = Town.player.getGp();
			cost = Shop.gloves.get(choice-1).getCost();
			item_name = Shop.gloves.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.gList.add(Shop.gloves.get(choice-1));
			}
		}else if(type.equals("ring")){
			current_gp = Town.player.getGp();
			cost = Shop.rings.get(choice-1).getCost();
			item_name = Shop.rings.get(choice-1).getName();
			if(current_gp < cost) {
				System.out.println("Insuffient gold");
			}else {
				current_gp -= cost;
				Town.player.setGp(current_gp);
				System.out.println("Bought one " + item_name);
				Inventory.rList.add(Shop.rings.get(choice-1));
			}
		}
	}

	public int findCost(int choice, String type){
		int itemCost = 0;

		if(type.equals("weapon")){
			for(int i = 0; i < Shop.weapons.size(); i++){
				if(Inventory.wList.get(choice-1).getName().equals(Shop.weapons.get(i).getName())){
					itemCost = Shop.weapons.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("helmet")){
			for(int i = 0; i < Shop.helmets.size(); i++){
				if(Inventory.hList.get(choice-1).getName().equals(Shop.helmets.get(i).getName())){
					itemCost = Shop.helmets.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("body")){
			for(int i = 0; i < Shop.body.size(); i++){
				if(Inventory.bList.get(choice-1).getName().equals(Shop.body.get(i).getName())){
					itemCost = Shop.body.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("leg")){
			for(int i = 0; i < Shop.legs.size(); i++){
				if(Inventory.l_List.get(choice-1).getName().equals(Shop.legs.get(i).getName())){
					itemCost = Shop.legs.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("glove")){
			for(int i = 0; i < Shop.gloves.size(); i++){
				if(Inventory.gList.get(choice-1).getName().equals(Shop.gloves.get(i).getName())){
					itemCost = Shop.gloves.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("ring")){
			for(int i = 0; i < Shop.rings.size(); i++){
				if(Inventory.rList.get(choice-1).getName().equals(Shop.rings.get(i).getName())){
					itemCost = Shop.rings.get(i).getCost();
					break;
				}
			}
		}else if(type.equals("potion")){
			for(int i = 0; i < Shop.potions.size(); i++){
				if(Inventory.pList.get(choice-1).getName().equals(Shop.potions.get(i).getName())){
					itemCost = Shop.potions.get(i).getCost();
					break;
				}
			}
		}

		return itemCost;
	}

	public void sell(int choice, String type){
		if(type.equals("weapon")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "weapon");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.wList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("potion")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "potion");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.pList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("helmet")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "helmet");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.hList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("body")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "body");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.bList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("leg")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "leg");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.l_List.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("glove")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "glove");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.gList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}else if(type.equals("ring")){
			current_gp = Town.player.getGp();
			cost = findCost(choice, "ring");
			tax = cost * 0.2;
			sellPrice = cost - (int)tax;
			Inventory.rList.remove(choice-1);
			Town.player.setGp(Town.player.getGp() + sellPrice);
			System.out.println("Sold");
		}
	}
}
