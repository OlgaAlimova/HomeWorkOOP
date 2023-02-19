package Unit;

public abstract class Shooters extends Character {
    String shoot;
    String name;

    public Shooters(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        this.shoot = shoot;
    }

    public String getShoot() {
        return shoot;
    }
}
