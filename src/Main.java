import gameComponents.Player;
import gameComponents.Weapon;
import gameComponents.Armor;
import utilities.IdGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Weapon excalibur = new Weapon("Excalibur", 10000, "A legendary sword of britannic origin", "Longsword", "Legendary", 15, 12, 100, true, IdGenerator.generateId());
        Armor chainmail = new Armor("Chainmail", 1, 100, false, 50, "chainmail armor", "Armor", "Chainmail", "Common", IdGenerator.generateId());
        Player luke = new Player("Luke", 100, new Weapon("Frost", 105, "A longsword of germanic origin", "Longsword", "Common", 8, 6, 100, false, IdGenerator.generateId()), chainmail);
        Player max = new Player("Max", 100, new Weapon("Death Bringer", 500, "A combination of a sword and shield marked by death.", "Sword and Shield", "Rare", 10, 10, 100, true, IdGenerator.generateId()), chainmail);
        ArrayList<Player> players = new ArrayList<>(){
            {
                add(luke);
                add(max);
            }
        };

        luke.attack(max);
        max.attack(luke);
        printAllStats(players);
        
        luke.setWeapon(excalibur);
        luke.attack(max);
        printAllStats(players);


    }
    private static void printAllStats(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.getStats());
            System.out.println();
        }
    }
}

