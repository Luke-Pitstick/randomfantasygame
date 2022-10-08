package gameComponents.types.weaponSubtypes;

public enum FistTypes {
    KNUCKLES("Knuckles"),
    FISTS("Fists"),
    CLAWS("Claws");

    private String name;

    FistTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
