package factory.armor;

public abstract class Armor {
    protected String name;
    protected int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public abstract void defend();
}
