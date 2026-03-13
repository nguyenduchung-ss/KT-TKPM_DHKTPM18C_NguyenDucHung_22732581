package factory;

import factory.character.Character;
import factory.character.Mage;
import factory.weapon.Weapon;
import factory.weapon.Staff;
import factory.armor.Armor;
import factory.armor.Robe;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
