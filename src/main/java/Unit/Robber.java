//разбойник

package Unit;

public abstract class Robber extends Simpletons {
    String jump, crawl, knife, cut, chop, hide, steal;

    public Robber(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Robber(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
    }

    public String getJump() {
        return jump;
    }
    public String getCrawl() {
        return crawl;
    }
    public String getKnife() {
        return knife;
    }
    public String getCut() {
        return cut;
    }
    public String getChop() {
        return chop;
    }
    public String getHide() {
        return hide;
    }
    public String getSteal() {
        return steal;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }
}

