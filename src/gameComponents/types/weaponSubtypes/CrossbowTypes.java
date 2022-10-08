package gameComponents.types.weaponSubtypes;

public enum CrossbowTypes {
    LIGHTCROSSBOW("Light Crossbow"),
    HEAVYCROSSBOW("Heavy Crossbow");
    private String name;

    CrossbowTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
