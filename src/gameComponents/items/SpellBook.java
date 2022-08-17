package gameComponents.items;

public class SpellBook extends Staff{
    public SpellBook(String name, double price, String description, String subtype, String rarity, int attack, int defense, int spellSlots, float durability, String element) {
        super(name, price, description, subtype, rarity, attack, defense, spellSlots, durability, element);
        if (spellSlots > 20) {
            throw new IllegalArgumentException("Spell slots cannot be more than 20");
        }

        this.modifier = 1;
    }
}
