//снайпер

package Unit;

public class Sniper extends Character {
    String lie_down;
    String crawl;
    String rifle;
    String cartridge_pack;
    String disguise;
    String hide;
    String shoot;
    String load;

    public Sniper(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getLie_down() {
        return lie_down;
    }
    public String getCrawl() {
        return crawl;
    }
    public String getRifle() {
        return rifle;
    }
    public String getCartridge_pack() {
        return cartridge_pack;
    }
    public String getHide() {
        return hide;
    }
    public String getShoot() {
        return shoot;
    }
    public String getLoad() {
        return load;
    }

}
