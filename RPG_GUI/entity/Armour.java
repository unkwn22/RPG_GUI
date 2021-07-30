package entity;

public class Armour extends Item{

    private int def;

    public Armour(String name, int cost, int def) {
        super(name, cost);
        this.def = def;
    }
}
