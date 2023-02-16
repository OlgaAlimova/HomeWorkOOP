//копейщик

package Unit;

public class Spearman extends Character {
    String spear;
    String axe;
    String shield;
    String chop_strike;
    String defend;

    public Spearman(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getSpear() {
        return spear;
    }
    public String getAxe() {
        return axe;
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

}
