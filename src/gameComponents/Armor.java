package gameComponents;

public class Armor extends Item{
    protected int defense;
    protected double durability;
    protected boolean magic;

    public Armor(String name, int defense, double durability, boolean magic, double price, String description, String type, String subtype, String rarity, int id) {
        super(name, price, description, type, subtype, rarity, id);
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

    public String getStats() {
        return String.format("Name: %s\nDefense: %d\nDurability: %.2f\nMagic: %b", this.name, this.defense, this.durability, this.magic);
    }
}
