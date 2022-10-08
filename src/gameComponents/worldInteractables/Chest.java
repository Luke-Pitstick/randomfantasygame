package gameComponents.worldInteractables;

import gameComponents.baseClasses.Item;
import gameComponents.types.Rarity;
import gameControllers.ItemCreator;
import gameComponents.types.Rarity;
import utilities.RandomNumGen;

public class Chest {
    protected Item[] items;
    protected Rarity rarity;
    protected int chestSize;

    public Chest() {
        this.chestSize = RandomNumGen.randomNum(1, 5);
        this.items = new Item[this.chestSize];

        addItems(this.items, this.chestSize);
    }

    private static void addItems(Item[] items, int length) {
        for (int i = 0; i < length; i++) {
            Rarity rarity = ItemCreator.getRandomRarity();

            Item item = ItemCreator.getRandomItem(rarity);

        }
    }
}
