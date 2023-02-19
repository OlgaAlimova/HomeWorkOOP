package Unit;

public abstract class Simpletons extends Character {
    String axe;
    String name;

    public Simpletons(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        this.axe = axe;
    }

    public String getAxe() {
        return axe;
    }
}
