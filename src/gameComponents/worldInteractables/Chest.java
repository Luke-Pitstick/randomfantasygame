package gameComponents.worldInteractables;
import gameComponents.baseClasses.Item;
import gameControllers.ItemCreator;
import utilities.RandomNumGen;

public class Chest {
    protected Item[] items;
    protected String rarity;
    protected int chestSize;

    public Chest() {
        this.chestSize = RandomNumGen.randomNum(1, 5);
        this.items = new Item[this.chestSize];

        addItems(this.items, this.chestSize);
    }

    private static void addItems(Item[] items, int length) {
        for (int i = 0; i < length; i++) {
            String rarity = ItemCreator.getRandomRarity();

            Item item = ItemCreator.getRandomItem(rarity);

        }
    }
}
