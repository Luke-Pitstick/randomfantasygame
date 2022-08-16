import gameComponents.baseClasses.Player;
import gameComponents.items.Weapon;
import gameComponents.items.Armor;
import gameComponents.magic.AttackSpell;
import gameComponents.items.Staff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Weapon excalibur = new Weapon("Excalibur", 10000, "A legendary sword of britannic origin", "Sword", "Longsword", "Legendary", 15, 12, 100, true);
        Armor chainmail = new Armor("Chainmail", 3, 100, false, 50, "chainmail armor", "Chainmail", "Common");
        Weapon frost = new Weapon("Frost", 105, "A longsword of germanic origin", "Sword", "Longsword", "Common", 8, 6, 100, false);
        Weapon deathBringer = new Weapon("Death Bringer", 500, "A combination of a sword and shield marked by death.", "Sword and shield", "Shortsword and Shield", "Rare", 10, 10, 100, true);
        Staff fireBringer = new Staff("Fire Bringer", 100, "A fire staff of germanic origin", "Attack", "Common", 5, 0, 3, 100, "Fire");

        Player luke = new Player("Luke", 100, frost, chainmail);
        Player max = new Player("Max", 100, fireBringer, chainmail);
        ArrayList<Player> players = new ArrayList<>(){
            {
                add(luke);
                add(max);
            }
        };

        AttackSpell fireball = new AttackSpell("Fireball", 100, "A spell that creates a ball of fire", "Fire", 5);
        fireBringer.addSpell(fireball);
        System.out.println(fireBringer.getSpellBook());
        fireBringer.setCurrentSpell(0);

        max.attack(luke);

        System.out.println(luke);
        System.out.println(max);
    }
    private static void printAllStats(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.toString());
            System.out.println();
        }
    }
}

