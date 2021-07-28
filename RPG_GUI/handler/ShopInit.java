package handler;

//Initiating purchases
public class ShopInit {
	
	private int current_gp;
	private int cost;
	private String item_name = null;

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
		}
	}
}
