package gameComponents;

import java.util.ArrayList;


public class Player {
    private String name;
    private final ArrayList<Item> inventory;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Player(String name, int health, Weapon weapon, Armor armor) {
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

    public void lowerHealth(int amount) {
        this.health -= amount;
    }

    public void raiseHealth(int amount) {
        this.health += amount;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void attack(Player player) {
        Weapon defenseWeapon = player.getWeapon();
        int totalAttack = this.weapon.getAttack() - (int)(defenseWeapon.getDefense() / 2);
        if (totalAttack < 0) {
            totalAttack = 0;
        }
        this.weapon.lowerDurability(1);
        defenseWeapon.lowerDurability(1);

        player.lowerHealth(totalAttack);
    }

    public String getStats() {
        return String.format("Name: %s\nHealth: %d\nWeapon: %s\nWeapon Durability: %.2f", this.name, this.health, this.weapon.getName(), this.weapon.getDurability());
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
