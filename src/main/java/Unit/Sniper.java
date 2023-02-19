//снайпер

package Unit;

public abstract class Sniper extends Shooters {
    String lie_down, crawl, rifle, cartridge_pack, disguise, hide, load;

    public Sniper(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Sniper(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
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
    public String getDisguise() {
        return disguise;
    }
    public String getHide() {
        return hide;
    }
    public String getLoad() {
        return load;
    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }

}
