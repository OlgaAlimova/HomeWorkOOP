//монах

package Unit;

public class Monk extends Character {
    String magic_book;
    String healing_charms;
    String read_spell;
    String heal;
    public Monk(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getMagic_book() {
        return magic_book;
    }
    public String getHealing_charms() {
        return healing_charms;
    }
    public String getRead_spell() {
        return read_spell;
    }
    public String getHeal() {
        return heal;
    }
}
