package gameComponents.baseClasses;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<Item>();
    private int size;
    
    public Inventory(Item[] initialItems, int size) {
        for (Item item : initialItems) {
            this.items.add(item);
        }
        this.size = size;
    }

    public Inventory(int size) {
        this.size = size;
    }

    public HashMap<Integer, Item> getItems() {
        HashMap<Integer, Item> output = new HashMap<Integer, Item>();

        for (int i = 0; i < this.items.size(); i++) {
            output.put(i, items.get(0));
        } 

        return output;
    }

    public void add(Item itemToAdd) {
        this.items.add(itemToAdd);
    }

    public void add(Item[] items) {
        for (Item item: items) {
            this.items.add(item);
        }
    }

    public void remove(int index) {
        this.items.remove(index);
    }

    public int getSize() {
        return this.size;
    }

    public void changeSize(int newSize) {
        this.size = newSize;
    }
}