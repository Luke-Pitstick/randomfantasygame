package gameComponents.baseClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<Item>();
    private int size;
    
    public Inventory(Item[] initialItems, int size) {
        this.items.addAll(Arrays.asList(initialItems));
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
        this.items.addAll(Arrays.asList(items));
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