//арбалетчик

package Unit;

public abstract class Crossbowman extends Shooters {

    String jump, crossbow, archer, shield, take_stand, shoot, charge, defend;

    public Crossbowman(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Crossbowman(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
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
    public String getCharge() {
        return charge;
    }
    public String getDefend() {
        return defend;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }


}
