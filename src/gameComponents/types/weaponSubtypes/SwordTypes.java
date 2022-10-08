package gameComponents.types.weaponSubtypes;

public enum SwordTypes {
    SHORTSWORD("Shortsword"),
    LONGSWORD("Longsword"),
    GREATSWORD("Greatsword"),
    SWORD_AND_SHIELD("Sword and shield");

    private final String name;

    SwordTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
