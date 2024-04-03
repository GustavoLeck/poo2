package person;

import person.guns.Axel;

public class Warrior extends Person {
    public Warrior() {
        gun = new Axel();
    }

    @Override
    public void display() {
        System.out.println("Sou um guerreiro, irei proteger a realeza!");
    }

}
