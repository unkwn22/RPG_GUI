package constructor;

import entity.Human;
import entity.Monster;

import java.util.ArrayList;

public class UnitConstructor {

    ArrayList<Monster> monster = new ArrayList<>();

    public ArrayList<Monster> initMonsters(){

        Monster goblin = new Monster("Goblin", 5, 5, 2, 3, 30,3,  5, 10);
        monster.add(goblin);

        return monster;
    }
	
}
