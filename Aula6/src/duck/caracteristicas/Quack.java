package duck.caracteristicas;

import interfaces.*;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("O pato diz: *Quack, quack!");
    }

}
