//копейщик

package Unit;

public abstract class Spearman extends Simpletons {
    String spear, shield, chop_strike, defend;

    public Spearman(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Spearman(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
    }

    public String getSpear() {
        return spear;
    }
    public String getShield() {
        return shield;
    }
    public String getChop_strike() {
        return chop_strike;
    }
    public String getDefend() {
        return defend;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }

}
