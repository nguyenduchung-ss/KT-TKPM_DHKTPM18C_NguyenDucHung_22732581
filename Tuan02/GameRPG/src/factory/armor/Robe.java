package factory.armor;

public class Robe extends Armor {
    public Robe() {
        super("Magic Robe", 30);
    }

    @Override
    public void defend() {
        System.out.println("[Armor] Khang phep bang " + name + " — giap: " + defense);
    }
}
