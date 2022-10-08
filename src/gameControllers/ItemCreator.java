package gameControllers;
import gameComponents.baseClasses.Item;
import gameComponents.items.Armor;
import gameComponents.items.SpellBook;
import gameComponents.items.Staff;
import gameComponents.items.Weapon;
import gameComponents.magic.AttackSpell;
import gameComponents.types.Rarity;

import utilities.RandomNumGen;

public class ItemCreator {
    public static Item createItem() {
        // TODO
        return null;
    }

    public static Weapon createWeapon(Rarity rarity) {
        // TODO
        return null;
    }

    public static Armor createArmor(Rarity rarity) {
        // TODO
        return null;
    }

    public static AttackSpell createAttackSpell(Rarity rarity) {
        // TODO
        return null;
    }

    public static Staff createStaff(Rarity rarity) {
        // TODO
        return null;
    }

    public static SpellBook createSpellBook(Rarity rarity) {
        // TODO
        return null;
    }

    private static String getRandomItemType() {
        int randomNum = RandomNumGen.randomNum(1, 6);

        return switch (randomNum) {
            case 1 -> "Weapon";
            case 2 -> "Armor";
            case 3 -> "SpellBook";
            case 4 -> "Staff";
            case 5 -> "AttackSpell";
            case 6 -> "DefenseSpell";
            default -> "Item";
        };
    }

    public static Item getRandomItem(Rarity rarity) {
        String itemType = getRandomItemType();

        return switch (itemType) {
            case "Weapon" -> createWeapon(rarity);
            case "Armor" -> createArmor(rarity);
            case "SpellBook" -> createSpellBook(rarity);
            case "Staff" -> createStaff(rarity);
            default -> createItem();
        };
    }

    public static Rarity getRandomRarity() {
        int randomNum = RandomNumGen.randomNum(1, 6);

        return switch (randomNum) {
            case 2 -> Rarity.UNCOMMON;
            case 3 -> Rarity.RARE;
            case 4 -> Rarity.EPIC;
            case 5 -> Rarity.LEGENDARY;
            case 6 -> Rarity.MYTHIC;
            default -> Rarity.COMMON;
        };
    }
}
