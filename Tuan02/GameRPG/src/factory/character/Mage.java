package factory.character;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 80);
    }

    @Override
    public void showInfo() {
        System.out.println("[Mage] Ten: " + name + " | HP: " + hp);
    }
}
