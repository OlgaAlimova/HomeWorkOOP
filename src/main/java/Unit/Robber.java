//разбойник

package Unit;

public class Robber extends Character {
    String jump;
    String crawl;
    String knife;
    String axe;
    String cut;
    String chop;
    String hide;
    String steal;
    public Robber(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
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
    public String getAxe() {
        return axe;
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
}
