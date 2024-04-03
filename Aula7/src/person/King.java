package person;

import person.guns.Sword;

public class King extends Person {

    public King() {
        gun = new Sword();
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Rei!");
    }
}
