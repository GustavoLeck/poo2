
package duck;

import duck.caracteristicas.FlyWithWings;
import duck.caracteristicas.Quack;

public class RealDuck extends Duck {

    public RealDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Pato de verdade!");
    }
}
