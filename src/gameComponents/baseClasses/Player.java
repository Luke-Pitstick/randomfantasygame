package gameComponents.baseClasses;

import gameComponents.items.Armor;
import gameComponents.items.Staff;
import gameComponents.items.Weapon;
import gameComponents.magic.AttackSpell;

import java.util.ArrayList;
import java.util.Objects;


public class Player {
    private String name;
    private final ArrayList<Item> inventory;
    private double health;
    private Weapon weapon;
    private Armor armor;

    public Player(String name, double health, Weapon weapon, Armor armor) {
        if (health > 100) {
            throw new IllegalArgumentException("Health cannot be greater than 100");
        }
        else {
            this.name = name;
            this.health = health;
            this.weapon = weapon;
            this.armor = armor;
            this.inventory = new ArrayList<>();
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

            if (staff.getCurrentSpell() != null) {
                if (staff.getCurrentSpell() instanceof AttackSpell attackSpell) {
                    if (staff.getCurrentSpell().getElement().equals(staff.getElement())) {
                        modifier = 1.5;
                    }
                    target.lowerHealth(attackSpell.getAttack() * modifier);
                    staff.lowerDurability(1);
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



    public String toString() {
        return String.format("Name: %s\nHealth: %f\nWeapon: %s\nArmor: %s\nInventory Size: %d", this.name, this.health, this.weapon.getName(), this.armor.getName(), inventory.size());
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void addItem(Item item) {
        this.inventory.add(item);
    }

}
