package gameComponents.baseClasses;

import gameComponents.items.Armor;
import gameComponents.items.Staff;
import gameComponents.items.Weapon;
import gameComponents.magic.AttackSpell;
import gameComponents.types.Rarity;

import java.util.ArrayList;



public class Player {
    private String name;
    private final Inventory inventory;
    private double health;

    private double maxHealth;

    private double maxMana;

    private double mana;
    private Weapon weapon;
    private Armor armor;

    public Player(String name, double health, double mana, Weapon weapon, Armor armor, int inventorySize) {
        if (health > 100) {
            throw new IllegalArgumentException("Health cannot be greater than 100");
        }
        else {
            this.name = name;
            this.health = health;
            this.mana = mana;
            this.weapon = weapon;
            this.armor = armor;
            this.inventory = new Inventory(10);
            this.inventory.add(weapon);
            this.inventory.add(armor);
        }
    }

    public Player(String name, double health, double mana, int inventorySize) {
        if (health > 100) {
            throw new IllegalArgumentException("Health cannot be greater than 100");
        }
        else {
            this.name = name;
            this.health = health;
            this.mana = mana;
            this.weapon = new Weapon("fists", 0, "unarmed fists", "unarmed", Rarity.COMMON, 1, 1, 100);
            this.armor = new Armor("Cloth Cloak", 1, 100, false, 5, "A simple cloth cloak", "Cloak", Rarity.COMMON);
            this.inventory = new Inventory(10);
            this.inventory.add(weapon);
            this.inventory.add(armor);
        }
    }

    public void lowerHealth(double amount) {
        this.health -= amount;
    }

    public void raiseHealth(double amount) {
        this.health += amount;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Weapon getWeapon() {
        return weapon;
    }
    public Armor getArmor() {
        return armor;
    }

    public double getHealth() {
        return health;
    }

    public int getTotalDefense() {
        return this.armor.getDefense() + this.weapon.getDefense();
    }

    public void castSpell(Player target) {
        if (this.weapon instanceof Staff staff) {
            double modifier = 1;
            double castModifier = staff.getModifier();

            if (staff.getCurrentSpell() != null) {
                if (staff.getCurrentSpell() instanceof AttackSpell attackSpell) {
                    int manaCost = attackSpell.getManaCost();
                    if (manaCost < this.mana) {
                        this.mana -= manaCost;
                        if (staff.getCurrentSpell().getElement().equals(staff.getElement())) {
                            modifier = 1.5;
                        }
                        target.lowerHealth(attackSpell.getAttack() * modifier * castModifier);
                        staff.lowerDurability(1);
                    }
                    else {
                        System.out.println("Not enough mana");
                    }
                }
                else {
                    System.out.println("This spell is not an attack spell");
                }
            }
            else {
                System.out.println("This staff has no spell");
            }
        }
        else {
            System.out.println("Currently equipped weapon is not a staff");
        }
    }

    public void attack(Player target) {
        if (!(this.weapon instanceof Staff)) {
            Weapon defendingWeapon = target.getWeapon();
            int totalDefense = getTotalDefense();
            int totalAttack = this.weapon.getAttack() - defendingWeapon.getDefense();

            if (totalAttack < 0) {
                totalAttack = 0;
            }

            target.lowerHealth(totalAttack);
            defendingWeapon.lowerDurability(1);
            this.weapon.lowerDurability(1);
        }
        else {
            System.out.println("Currently equipped weapon is a staff");
        }

    }

    public String toString() {
        return String.format("Name: %s\nHealth: %.2f\nMana: %.2f\nWeapon: %s\nArmor: %s\nInventory Size: %d", this.name, this.health, this.mana, this.weapon.getName(),         
                             this.armor.getName(), inventory.getSize());
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void addItemToInventory(Item item) {
        this.inventory.add(item);
    }

    public void addItemToInventory(Item[] items) {
        this.inventory.add(items);
    }
    
    public void removeItemFromInventory(int index) {
        this.inventory.remove(index);
    }
}
