package gameComponents.items;

import gameComponents.baseClasses.Item;

public class Armor extends Item {
    protected int defense;
    protected double durability;
    protected boolean magic;

    public Armor(String name, int defense, double durability, boolean magic, double price, String description, String armorType, String rarity) {
        super(name, price, description, "Armor", armorType, rarity);
        this.defense = defense;
        this.durability = durability;
        this.magic = magic;
    }

    public int getDefense() {
        return defense;
    }

    public double getDurability() {
        return durability;
    }

    public boolean isMagic() {
        return magic;
    }

    public void lowerDurability(int amount) {
        this.durability -= amount;
    }

    public void raiseDurability(int amount) {
        this.durability += amount;
    }

    public String toString() {
        return String.format("Name: %s\nDefense: %d\nDurability: %.2f\nMagic: %b\nPrice: %.2f\nDescription: %s\nType: Armor\nArmor Type: %s\nRarity: %s\nId: %d", this.name, this.defense, this.durability, this.magic, this.price, this.description, this.subtype, this.rarity, this.id);
    }
}
