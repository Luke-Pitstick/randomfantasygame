package gameComponents.items;

import gameComponents.baseClasses.Item;
import gameComponents.types.Rarity;

public class Weapon extends Item {
    protected final int attack;
    protected final int defense;
    protected double durability;
    protected final boolean magic;

    public Weapon(String name, double price, String description,String weaponType,  String subType, Rarity rarity, int attack, int defense, double durability, boolean magic) {
        super(name, price, description, weaponType, subType, rarity);
        if (durability > 100) {
            throw new IllegalArgumentException("Durability cannot be greater than 100");
        }
        else {
            this.attack = attack;
            this.defense = defense;
            this.durability = durability;
            this.magic = magic;
        }
    }

    public Weapon(String name, double price, String description, String weaponType,  String subType, Rarity rarity, int attack, int defense, double durability) {
        super(name, price, description, weaponType, subType, rarity);
        if (durability > 100) {
            throw new IllegalArgumentException("Durability cannot be greater than 100");
        }
        else {
            this.attack = attack;
            this.defense = defense;
            this.durability = durability;
            this.magic = false;
        }
    }

    public Weapon(String name, double price, String description, String weaponType, Rarity rarity, int attack, int defense, double durability) {
        super(name, price, description, weaponType, "None", rarity);
        if (durability > 100) {
            throw new IllegalArgumentException("Durability cannot be greater than 100");
        }
        else {
            this.attack = attack;
            this.defense = defense;
            this.durability = durability;
            this.magic = false;
        }
    }

    public void lowerDurability(double amount) {
        this.durability -= amount;
    }

    public void raiseDurability(double amount) {
        this.durability += amount;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public double getDurability() {
        return this.durability;
    }
    public String toString() {
        return String.format("Name: %s\nAttack: %s\nDefense: %d\nDurability: %.2f\nMagic: %b\nPrice: %.2f\nDescription: %s\nType: Weapon\nWeapon Type: %s\nRarity: %s\nId: %d", this.name, this.attack, this.defense, this.durability, this.magic, this.price, this.description, this.subtype, this.rarity, this.id);
    }
}
