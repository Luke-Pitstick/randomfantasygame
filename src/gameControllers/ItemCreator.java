package gameControllers;
import gameComponents.baseClasses.Item;
import gameComponents.items.Armor;
import gameComponents.items.SpellBook;
import gameComponents.items.Staff;
import gameComponents.items.Weapon;
import gameComponents.magic.AttackSpell;
import utilities.RandomNumGen;

public class ItemCreator {
    public static Item createItem() {
        // TODO
        return null;
    }

    public static Weapon createWeapon(String rarity) {
        // TODO
        return null;
    }

    public static Armor createArmor(String rarity) {
        // TODO
        return null;
    }

    public static AttackSpell createAttackSpell(String rarity) {
        // TODO
        return null;
    }

    public static Staff createStaff(String rarity) {
        // TODO
        return null;
    }

    public static SpellBook createSpellBook(String rarity) {
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

    public static Item getRandomItem(String rarity) {
        String itemType = getRandomItemType();

        return switch (itemType) {
            case "Weapon" -> createWeapon(rarity);
            case "Armor" -> createArmor(rarity);
            case "SpellBook" -> createSpellBook(rarity);
            case "Staff" -> createStaff(rarity);
            default -> createItem();
        };
    }

    public static String getRandomRarity() {
        int randomNum = RandomNumGen.randomNum(1, 6);

        return switch (randomNum) {
            case 2 -> "Uncommon";
            case 3 -> "Rare";
            case 4 -> "Epic";
            case 5 -> "Legendary";
            case 6 -> "Mythical";
            default -> "Common";
        };
    }
}
