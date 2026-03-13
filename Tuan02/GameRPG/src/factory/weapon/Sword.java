package factory.weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Iron Sword", 50);
    }

    @Override
    public void attack() {
        System.out.println("[Weapon] Chem bang " + name + " — sat thuong: " + damage);
    }
}
