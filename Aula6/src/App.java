import duck.*;
import duck.caracteristicas.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------");
        System.out.println("Começando a pataquada!");
        System.out.println("--------------------------");

        System.out.println(" -> Adicionando general pato de verdade ao esquadrão....");

        Duck patoVerdade = new RealDuck();

        patoVerdade.display();
        patoVerdade.performFly();
        patoVerdade.performQuack();
        System.out.println("--------------------------");

        System.out.println(" -> Adicionando cabo pato de borracha ao esquadrão....");
        Duck patoBorracha = new RubberDuck();

        patoBorracha.display();
        patoBorracha.performFly();
        patoBorracha.performQuack();

        System.out.println(" - Adicionando asas de avião no pato de borracha...");

        patoBorracha.setFlyBehavior(new FlyWithWings());
        patoBorracha.performFly();

        System.out.println("--------------------------");

        System.out.println(" -> Adicionando recruta pato de madeira ao esquadrão....");
        Duck patoMadeira = new WoodDuck();
        patoMadeira.display();
        patoMadeira.performFly();
        patoMadeira.performQuack();

        System.out.println(" - Alterando DNA do pato de madeira para criar um super soldado....");
        patoMadeira.setFlyBehavior(new FlyWithWings());
        patoMadeira.setQuackBehavior(new Miau());

        patoMadeira.display();
        patoMadeira.performFly();
        patoMadeira.performQuack();

        System.out.println("Aah não! O pato de madeira se deu mau!");
        System.out.println("FIM");

    }
}