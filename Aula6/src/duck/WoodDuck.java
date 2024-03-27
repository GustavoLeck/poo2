package duck;

import duck.caracteristicas.FlyNoWay;
import duck.caracteristicas.Mute;

public class WoodDuck extends Duck {

    public WoodDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("Pato de madeira!");
    }
}
