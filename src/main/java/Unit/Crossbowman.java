//арбалетчик

package Unit;

public class Crossbowman extends Character {

    String jump;
    String crossbow;
    String archer;
    String shield;
    String take_stand;
    String shoot;
    String charge;
    String defend;
    public Crossbowman(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getJump() {
        return jump;
    }
    public String getCrossbow() {
        return crossbow;
    }
    public String getArcher() {
        return archer;
    }
    public String getShield() {
        return shield;
    }
    public String getTake_stand() {
        return take_stand;
    }
    public String getShoot() {
        return shoot;
    }
    public String getCharge() {
        return charge;
    }
    public String getDefend() {
        return defend;
    }


}
