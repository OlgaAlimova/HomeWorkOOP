package Unit;

import java.util.Objects;
import java.util.Random;

public class Person {

    String persona;
    public String getPersona() {
        Random rnd = new Random();
        int index = rnd.nextInt(7);

        if (index == 1) {
            Peasant persona = new Peasant(getNames()) {
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Крестьянин!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 2) {
            Robber persona = new Robber(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Разбойник!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 3) {
            Spearman persona = new Spearman(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Копейщик!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 4) {
            Sniper persona = new Sniper(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Снайпер!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 5) {
            Crossbowman persona = new Crossbowman(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Арбалетчик!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 6) {
            Sorcerer persona = new Sorcerer(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Колдун!";
                }
            };
            System.out.println(persona.getInfo());
        }
        if (index == 7) {
            Monk persona = new Monk(getNames()){
                @Override
                public void step(int a) {
                    return;
                }

                @Override
                public String getInfo() {
                    return "Я Монах!";
                }
            };
            System.out.println(persona.getInfo());

        }
        return persona;
    }


    private static String getNames() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
