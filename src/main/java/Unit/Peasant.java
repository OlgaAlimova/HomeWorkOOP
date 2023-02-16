//Крестьянин

package Unit;

public class Peasant extends Character {

    String shovel;
    String pitchfork;
    String carry;
    String collect;

    public Peasant(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getShovel() {
        return shovel;
    }
    public String getPitchfork() {
        return pitchfork;
    }
    public String getCarry() {
        return carry;
    }
    public String getCollect() {
        return collect;
    }
}
