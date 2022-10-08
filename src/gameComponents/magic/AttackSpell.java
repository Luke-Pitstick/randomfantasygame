package gameComponents.magic;
import gameComponents.baseClasses.Spell;

public class AttackSpell extends Spell {
    protected int attack;

    public AttackSpell(String name, int manaCost, String description, String element, int attack) {
        super(name, manaCost, description, "Attack", element);
        this.attack = attack;
    }
    public int getAttack() {
        return this.attack;
    }
}
