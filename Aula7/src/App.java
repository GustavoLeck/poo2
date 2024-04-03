import person.*;
import person.guns.Sword;
import person.guns.Unarmed;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------");
        System.out.println("Começando a invasão!");
        System.out.println("--------------------------");

        System.out.println(" -> Os atacantes começam a correr em direção ao castelo");

        Person goblin = new Goblin();

        goblin.display();
        System.out.println(" -> Os atacantes disparam flechas para dentro do castelo");
        goblin.performAtack();
        System.out.println(
                " -> Os goblins trocam os arcos pelas espadas dos defensores derrotados e começama quebrar a porta");
        goblin.setGun(new Sword());
        goblin.performAtack();
        goblin.performAtack();
        goblin.performAtack();
        goblin.performAtack();

        System.out.println(" -> Os atacantes quebram a porta e estão dentro do castelo");

        System.out.println(" -> Dentro do castelo a útima defesa do reino fica de pé!");

        Person king = new King();
        Person queen = new Queen();
        Person warrior = new Warrior();

        king.display();
        System.out.println("*O rei ataca.");
        queen.display();
        System.out.println("*A rainha ataca.");
        warrior.display();
        System.out.println("*O guerreiro ataca.");
        System.out.println(" -> Juntos eles atacam o goblin deixando desarmado!");

        king.performAtack();
        queen.performAtack();
        warrior.performAtack();

        goblin.setGun(new Unarmed());

        System.out.println(" -> Mesmo assim o goblin ataca novamente, com as proprias mãos!");

        goblin.performAtack();

        System.out.println(" -> Após o ataque do goblin desesperado, os defensores realizam sua ultima investida.");

        System.out.println("*O rei ataca.");
        king.display();
        System.out.println("*A rainha ataca.");
        queen.display();
        System.out.println("*O guerreiro ataca.");
        warrior.display();

        System.out.println(" -> E assim o goblin é derrotado e o reino fica a salvo! Por enquanto...");

        System.out.println("FIM");

    }
}