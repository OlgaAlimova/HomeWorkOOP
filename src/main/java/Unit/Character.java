package Unit;

//
public class Character {
    protected String name;
    protected Integer current_health;
    protected Integer max_health;
    protected String walk;
    protected String run;
    protected String sleep;
    protected String eat;
    protected String move;

    public Character(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        this.name = name;
        this.current_health = current_health;
        this.max_health = max_health;
        this.walk = walk;
        this.run = run;
        this.sleep = sleep;
        this.eat = eat;
        this.move = move;

    }

    public String getName() {
        return name;
    }

    public Integer getCurrent_health() {
        return current_health;
    }

    public Integer getMax_health() {
        return max_health;
    }

    public String getWalk() {
        return walk;
    }

    public String getRun() {
        return run;
    }

    public String getSleep() {
        return sleep;
    }

    public String getEat() {
        return eat;
    }

    public String getMove() {
        return move;
    }

}
