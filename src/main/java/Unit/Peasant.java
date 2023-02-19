//Крестьянин

package Unit;

public abstract class Peasant extends Simpletons {

    String shovel, pitchfork, carry, collect;

    public Peasant(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Peasant(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
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

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
