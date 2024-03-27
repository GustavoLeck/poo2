package duck.caracteristicas;

import interfaces.*;

public class Mute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("O pato diz: * Silencio... ");
    }

}
