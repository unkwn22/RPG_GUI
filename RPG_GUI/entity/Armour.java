package entity;

public class Armour extends Item{

    private int def;

    public Armour(String name, int cost, int def) {
        super(name, cost);
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
