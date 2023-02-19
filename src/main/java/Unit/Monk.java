//монах

package Unit;

public abstract class Monk extends Magicians {
    String magic_book, healing_charms, read_spell, heal;
    public Monk(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Monk(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
        }
    @Override
    public String getInfo() {
        return "Я Монах!";
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
