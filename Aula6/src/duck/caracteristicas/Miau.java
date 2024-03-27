package duck.caracteristicas;

import interfaces.*;

public class Miau implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("O pato diz: * Miaaauuu");
    }

}
