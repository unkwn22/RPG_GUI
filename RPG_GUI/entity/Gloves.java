package entity;

public class Gloves extends Armour{

    private int accuracy;

    public Gloves(String name, int cost, int def, int accuracy) {
        super(name, cost, def);
        this.accuracy = accuracy;
    }
}
