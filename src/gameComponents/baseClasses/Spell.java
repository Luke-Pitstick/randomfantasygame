package gameComponents.baseClasses;
import utilities.IdGenerator;

public class Spell {
    protected String name;
    protected int manaCost;
    protected String description;

    protected String type;
    protected String element;
    protected String rarity;
    protected int id;

    public Spell(String name, int manaCost, String description, String type, String element) {
        this.name = name;
        this.manaCost = manaCost;
        this.description = description;
        this.element = element;
        this.id = IdGenerator.generateId();
    }

    public String getName() {
        return this.name;
    }

    public int getManaCost() {
        return this.manaCost;
    }

    public String getDescription() {
        return this.description;
    }

    public String getElement() {
        return this.element;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return String.format("Name: %s\nElement: %s\nDescription: %s\nType: %s\nRarity: %s\nId: %d", this.name, this.element, this.description, this.type, this.rarity, this.id);
    }

}
