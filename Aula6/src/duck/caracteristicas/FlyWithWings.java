package duck.caracteristicas;

import interfaces.*;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Estou Voando!");
    }
}
