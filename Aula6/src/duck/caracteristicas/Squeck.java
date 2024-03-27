package duck.caracteristicas;

import interfaces.*;

public class Squeck implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("O pato diz: *Squeeeck");
    }
}
