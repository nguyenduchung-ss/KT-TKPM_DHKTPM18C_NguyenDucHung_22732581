package factory.weapon;

public class Staff extends Weapon {
    public Staff() {
        super("Magic Staff", 80);
    }

    @Override
    public void attack() {
        System.out.println("[Weapon] Phong phep bang " + name + " — sat thuong: " + damage);
    }
}
