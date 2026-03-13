package factory;

import factory.character.Character;
import factory.weapon.Weapon;
import factory.armor.Armor;

public interface CharacterFactory {
    Character createCharacter(String name);
    Weapon createWeapon();
    Armor createArmor();
}
