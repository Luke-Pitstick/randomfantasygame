package gameComponents;

public class Item {
    protected String name;
    protected double price;
    protected String description;
    protected String type;
    protected String subtype;
    protected String rarity;
    protected int id;

    public Item(String name, double price, String description, String type, String subtype, String rarity, int id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
        this.subtype = subtype;
        this.rarity = rarity;
        this.id = id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getType() {
        return this.type;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getRarity() {
        return this.rarity;
    }

}
