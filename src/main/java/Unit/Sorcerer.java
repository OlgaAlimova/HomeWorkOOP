//колдун

package Unit;

public class Sorcerer extends Character {
    String lie_down;
    String staff;
    String magic_crystal;
    String attack;
    String view_crystal;

    public Sorcerer(String name, Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(name, current_health, max_health, walk, run, sleep, eat, move);
    }

    public String getLie_down() {
        return lie_down;
    }
    public String getStaff() {
        return staff;
    }
    public String getMagic_crystal() {
        return magic_crystal;
    }
    public String getAttack() {
        return attack;
    }
    public String getView_crystal() {
        return view_crystal;
    }
}
