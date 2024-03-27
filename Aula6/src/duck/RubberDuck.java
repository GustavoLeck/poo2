package duck;

import duck.caracteristicas.FlyNoWay;
import duck.caracteristicas.Squeck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeck();
    }

    @Override
    public void display() {
        System.out.println("Pato de borracha!");
    }
}
