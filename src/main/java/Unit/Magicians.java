package Unit;

public abstract class Magicians extends Character {
    String use_magic;
    String name;

    public Magicians(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        this.use_magic = use_magic;
    }

    public String getUse_magic() {
        return use_magic;
    }
}
