package person;

import person.guns.Knife;

public class Queen extends Person {
    public Queen() {
        gun = new Knife();
    }

    @Override
    public void display() {
        System.out.println("Sou a rainha!");
    }

}
