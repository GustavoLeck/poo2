package person;

import person.guns.Bow;

public class Goblin extends Person {

    public Goblin() {
        gun = new Bow();
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Goblin, vou tomar o reino!");
    }
}
