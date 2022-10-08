package gameComponents.types.weaponSubtypes;

public enum BowTypes {
    SHORTBOW("Shortbow"),
    LONGBOW("Longbow");
    private String name;

    BowTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
