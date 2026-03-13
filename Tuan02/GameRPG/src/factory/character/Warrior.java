package factory.character;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150);
    }

    @Override
    public void showInfo() {
        System.out.println("[Warrior] Ten: " + name + " | HP: " + hp);
    }
}
