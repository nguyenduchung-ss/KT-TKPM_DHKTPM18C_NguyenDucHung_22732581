package factory.armor;

public class PlateArmor extends Armor {
    public PlateArmor() {
        super("Plate Armor", 70);
    }

    @Override
    public void defend() {
        System.out.println("[Armor] Chan do bang " + name + " — giap: " + defense);
    }
}
