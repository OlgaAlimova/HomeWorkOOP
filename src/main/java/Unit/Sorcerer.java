//колдун

package Unit;

public abstract class Sorcerer extends Magicians {
    String lie_down, staff, magic_crystal, attack, view_crystal;

    public Sorcerer(Integer current_health, Integer max_health, String walk, String run, String sleep, String eat, String move) {
        super(current_health, max_health, walk, run, sleep, eat, move);
        super.name = name;
    }

    public Sorcerer(String name) {
        super(50, 100, "walk", "run", "sleep", "eat", "move");
        super.name = name;
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

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }
}
