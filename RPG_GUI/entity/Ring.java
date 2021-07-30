package entity;

public class Ring extends Armour{

    private int accuracy;

    public Ring(String name, int cost, int def, int accuracy) {
        super(name, cost, def);
        this.accuracy = accuracy;
    }
}
