package gameComponents.types.weaponSubtypes;

public enum MaceTypes {
    CLUB("Club"),
    MACE("Mace"),
    MORNINGSTAR("Morningstar"),
    FLAIL("Flail"),
    WARHAMMER("Warhammer"),
    MAUL("Maul");

    private String name;

    MaceTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
