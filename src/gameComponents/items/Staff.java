package gameComponents.items;
import gameComponents.baseClasses.Spell;
import gameComponents.baseClasses.Player;
import gameComponents.types.Rarity;

import java.util.Objects;

public class Staff extends Weapon{
    protected int spellSlots;
    protected final String element;
    protected int spellSlotsUsed;
    protected Spell currentSpell;
    protected Spell[] spellBook;

    protected double modifier;

    public Staff(String name, double price, String description, String subtype, Rarity rarity, int attack, int defense, int spellSlots, float durability, String element) {
        super(name, price, description, "Staff", subtype, rarity, attack, defense, durability, false);
        if (spellSlots > 6) {
            throw new IllegalArgumentException("Spell slots cannot be more than 6");
        }


        this.spellSlots = spellSlots;
        this.element = element;
        this.spellSlotsUsed = 0;
        this.currentSpell = null;
        this.spellBook = new Spell[this.spellSlots];
        this.modifier = 1.2;
    }

    public int getSpellSlots() {
        return this.spellSlots;
    }

    public int getSpellSlotsUsed() {
        return this.spellSlotsUsed;
    }

    public Spell getCurrentSpell() {
        return this.currentSpell;
    }

    public double getModifier() {
        return this.modifier;
    }
    public Spell[] getSpellBook() {
        return spellBook;
    }

    public String getSpells() {
        String output = "";

        for (int i = 0; i < this.spellBook.length; i++) {
            if (this.spellBook[i] != null) {
                output += String.format("Name: %s Index: %d\n", this.spellBook[i].getName(), i);
            }
        }
        return output;
    }



    public String getElement() {
        return this.element;
    }

    public void addSpell(Spell spell) {
        if (this.spellSlotsUsed < this.spellSlots) {
            this.spellBook[this.spellSlotsUsed] = spell;
            this.spellSlotsUsed++;
        }
        else {
            System.out.println("Spell slots are full");
        }
    }

    public void removeSpell(Spell spell) {
        for (int i = 0; i < this.spellSlotsUsed; i++) {
            if (this.spellBook[i] == spell) {
                this.spellBook[i] = null;
                this.spellSlotsUsed--;
                break;
            }
        }
    }

    public void setCurrentSpell(int index) {
        if (spellBook[index] != null) {
            this.currentSpell = spellBook[index];
        }
        else {
            System.out.println("Spell does not exist");
        }
    }
}

