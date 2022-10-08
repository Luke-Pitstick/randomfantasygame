package gameComponents.types.weaponSubtypes;

public enum DaggerTypes {
    ASSASSIN_DAGGER("Assassin Dagger"),
    BASTARD_DAGGER("Bastard Dagger"),
    BATTLE_DAGGER("Battle Dagger"),
    CEREMONIAL_DAGGER("Ceremonial Dagger");

    private String name;

    DaggerTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
