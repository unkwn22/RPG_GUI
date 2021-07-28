package app;

import java.util.ArrayList;

import constructor.ItemConstructor;
import constructor.UnitConstructor;
import entity.Human;
import entity.Monster;
import entity.Potion;
import entity.Weapon;
import handler.Start;
import handler.Town;

//push test 6

public class Main {
	Start s = new Start();
	Human player = null;
	ItemConstructor i = new ItemConstructor();
	UnitConstructor u = new UnitConstructor();
	ArrayList<Weapon> weapon = null;
	ArrayList<Potion> potion = null;
	ArrayList<Monster> monster = null;
	
	public Main() {
		player = s.characterSettings();
		weapon = i.initWeapons();
		potion = i.initPotions();
		monster = u.initMonsters();
		Town t = new Town(player, weapon, potion, monster);
		t.town();
	}

	public static void main(String[] args) {
		new Main();
	}
}
