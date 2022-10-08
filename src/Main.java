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

        Player luke = new Player("Luke", 100, 100, frost, chainmail, 10);
        Player max = new Player("Max", 100, 100, fireBringer, chainmail, 10);
        ArrayList<Player> players = new ArrayList<>(){
            {
                add(luke);
                add(max);
            }
        };
        AttackSpell fireball = new AttackSpell("Fireball", 25, "A spell that creates a ball of fire", "Fire", 5);
        AttackSpell frostbolt = new AttackSpell("Frostbolt", 10, "A spell that creates a ball of frost", "Frost", 3);

        fireBringer.addSpell(fireball);
        fireBringer.addSpell(frostbolt);
        System.out.println(fireBringer.getSpells());
        fireBringer.setCurrentSpell(0);

        max.castSpell(luke);

        System.out.println(luke);
        System.out.println(max);
    }
}

