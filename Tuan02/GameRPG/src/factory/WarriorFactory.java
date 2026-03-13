package factory;

import factory.character.Character;
import factory.character.Warrior;
import factory.weapon.Weapon;
import factory.weapon.Sword;
import factory.armor.Armor;
import factory.armor.PlateArmor;

public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
