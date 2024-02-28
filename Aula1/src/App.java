import enums.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Serviço iniciado --");

        System.out.println("-> Adicionando guitarras ao estoque...");
        Inventory inventoryGuitars = new Inventory();

        System.out.println("    -> Guitarra 1");
        inventoryGuitars.addGuitar("123", 100, Builder.FENDER, Model.STRATOCASTER, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);

        System.out.println("    -> Guitarra 2");
        inventoryGuitars.addGuitar("123", 100, Builder.GIBSON, Model.LES_PAUL, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);

        System.out.println("-> Guitarras adicionadas ao estoque: ");
        System.out.println(inventoryGuitars.toString());

        Guitar parametrosGuitarra = new Guitar("456", 250, Builder.GIBSON, Model.LES_PAUL, Type.ELETRIC,
                BackWood.BASSWOOD,
                TopWood.ALDER);
        System.out.println("Guitarra sendo pesquisada: ".concat(parametrosGuitarra.toString()));

        Guitar guitarFounded = inventoryGuitars.guitarSearch(parametrosGuitarra);
        if (guitarFounded == null) {
            System.out.println("Nenhuma guitarra encontrada.");
            return;
        }
        System.out.println("Guitarra encontrada: ".concat(guitarFounded.toString()));
        return;
    }
}
