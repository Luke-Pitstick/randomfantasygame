package gameComponents;

public class Weapon extends Item {
    protected final int attack;
    protected final int defense;
    protected double durability;
    protected final boolean magic;

    public Weapon(String name, double price, String description, String weaponType, String rarity, int attack, int defense, double durability, boolean magic, int id) {
        super(name, price, description, "Weapon", weaponType, rarity, id);
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
}
