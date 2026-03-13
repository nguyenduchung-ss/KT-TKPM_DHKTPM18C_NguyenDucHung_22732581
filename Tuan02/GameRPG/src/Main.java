import singleton.GameDatabase;
import factory.CharacterFactory;
import factory.WarriorFactory;
import factory.MageFactory;
import factory.character.Character;
import factory.weapon.Weapon;
import factory.armor.Armor;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== SINGLETON DEMO ==========");
        GameDatabase db1 = GameDatabase.getInstance();
        GameDatabase db2 = GameDatabase.getInstance();
        System.out.println("db1 == db2 (cung 1 instance): " + (db1 == db2));

        System.out.println();
        System.out.println("========== ABSTRACT FACTORY DEMO ==========");

        // --- Tao Warrior ---
        System.out.println("\n--- Tao nhan vat Warrior ---");
        CharacterFactory warriorFactory = new WarriorFactory();
        Character c1 = warriorFactory.createCharacter("Arthur");
        Weapon w1 = warriorFactory.createWeapon();
        Armor a1 = warriorFactory.createArmor();
        c1.showInfo();
        w1.attack();
        a1.defend();
        db1.savePlayer(c1.getClass().getSimpleName() + ":Arthur");

        // --- Tao Mage ---
        System.out.println("\n--- Tao nhan vat Mage ---");
        CharacterFactory mageFactory = new MageFactory();
        Character c2 = mageFactory.createCharacter("Merlin");
        Weapon w2 = mageFactory.createWeapon();
        Armor a2 = mageFactory.createArmor();
        c2.showInfo();
        w2.attack();
        a2.defend();
        db2.savePlayer(c2.getClass().getSimpleName() + ":Merlin");

        System.out.println("\n=> db1 va db2 cung luu vao 1 GameDatabase duy nhat!");
    }
}
