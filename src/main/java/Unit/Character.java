package Unit;

//
public abstract class Character implements MyInterface {

    private static int manCnt = 10;
    public static int getManCnt() {return manCnt;}

    private Integer current_health;
    public void setCurrent_health(int current_health) {if (current_health >= 0) this.current_health = current_health;}
    public Integer getCurrent_health() {return current_health;}
    protected Integer max_health;
    protected String walk, run, sleep, eat, move;

    public Character(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        this.current_health = current_health;
        this.max_health = max_health;
        this.walk = walk;
        this.run = run;
        this.sleep = sleep;
        this.eat = eat;
        this.move = move;
        manCnt++;

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
