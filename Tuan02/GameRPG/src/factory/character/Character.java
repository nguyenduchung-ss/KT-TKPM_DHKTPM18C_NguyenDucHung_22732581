package factory.character;

public abstract class Character {
    protected String name;
    protected int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void showInfo();

    public String getName() { return name; }
}
