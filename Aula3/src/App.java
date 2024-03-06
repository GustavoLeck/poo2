import enums.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Serviço iniciado --");

        System.out.println("-> Adicionando guitarras ao estoque...");
        Inventory inventoryGuitars = new Inventory();

        System.out.println("    -> Guitarra 1");
        GuitarSpec sepc1 = new GuitarSpec(Model.STRATOCASTER, Builder.FENDER, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);
        inventoryGuitars.addGuitar("123", 100, sepc1);

        System.out.println("    -> Guitarra 2");
        GuitarSpec spec2 = new GuitarSpec(Model.LES_PAUL, Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);
        inventoryGuitars.addGuitar("123", 100, spec2);
        System.out.println("-> Guitarras adicionadas ao estoque: ");
        System.out.println(inventoryGuitars.toString());

        GuitarSpec specSearch = new GuitarSpec(Model.LES_PAUL, Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);
        Guitar parametrosGuitarra = new Guitar("456", 250, specSearch);
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
