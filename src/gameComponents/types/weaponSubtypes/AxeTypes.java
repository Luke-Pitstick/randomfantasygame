package gameComponents.types.weaponSubtypes;

public enum AxeTypes {
    BATTLEAXE("Battleaxe"),
    HANDAXE("Handaxe"),
    THROWINGAXE("Throwing axe"),
    WARAXE("Waraxe");

    private String name;

    AxeTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
