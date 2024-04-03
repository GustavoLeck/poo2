package person;

import interfaces.AtackBehvior;

public abstract class Person {
    AtackBehvior gun;

    public abstract void display();

    public void performAtack() {
        gun.Atack();
    }

    public void setGun(AtackBehvior newGun) {
        gun = newGun;
    }

}
