package app;

import java.util.ArrayList;

import constructor.ItemConstructor;
import constructor.UnitConstructor;
import entity.*;
import handler.Start;
import handler.Town;

public class Main {
	Start s = new Start();
	Human player = null;
	ItemConstructor i = new ItemConstructor();
	UnitConstructor u = new UnitConstructor();

	ArrayList<Weapon> weapon = null;
	ArrayList<Helmet> helmet = null;
	ArrayList<Body> body = null;
	ArrayList<Legs> legs = null;
	ArrayList<Gloves> glove = null;
	ArrayList<Ring> ring = null;

	ArrayList<Potion> potion = null;

	ArrayList<Monster> monster = null;
	
	public Main() {
		player = s.characterSettings();
		weapon = i.initWeapons();
		potion = i.initPotions();
		helmet = i.initHelmets();
		body = i.initBody();
		legs = i.initLegs();
		glove = i.initGloves();
		ring = i.initRing();

		monster = u.initMonsters();
		Town t = new Town(player, weapon, potion, monster, helmet, body, legs, glove, ring);
		t.town();
	}

	public static void main(String[] args) {
		new Main();
	}
}
