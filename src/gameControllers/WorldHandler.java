package gameControllers;
import gameComponents.worldInteractables.Chest;

public class WorldHandler {
    public static Chest createChest() {
        return new Chest();
    }
}
