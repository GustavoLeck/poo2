import enums.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Serviço iniciado --");

        System.out.println("-> Adicionando guitarras ao estoque...");
        Inventory inventoryInstruments = new Inventory();

        System.out.println("    -> Guitarra 1");
        InstrumentSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, BackWood.ALDER, TopWood.ALDER,
                Model.LES_PAUL, 6);
        inventoryInstruments.addInstrument("abc123", 120, guitarSpec1);

        System.out.println("    -> Guitarra 2");
        InstrumentSpec guitarSpec2 = new GuitarSpec(Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD, TopWood.BASSWOOD,
                Model.LES_PAUL, 6);
        inventoryInstruments.addInstrument("def456", 140, guitarSpec1);

        System.out.println("    -> Guitarra 3");
        InstrumentSpec guitarSpec3 = new GuitarSpec(Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD, TopWood.ALDER,
                Model.LES_PAUL, 12);
        inventoryInstruments.addInstrument("def456", 140, guitarSpec1);

        System.out.println("    -> Bandolin 1");
        InstrumentSpec bandolin1 = new MandolinSpec(Builder.FENDER, Type.ACOUSTIC, BackWood.ALDER, TopWood.ALDER,
                Model.LES_PAUL, Style.ELETRIC);

        InstrumentSpec bandolin1 = new MandolinSpec(Builder.FENDER, Type.ACOUSTIC, BackWood.ALDER, TopWood.ALDER,
                Model.LES_PAUL, Style.INLAY);

        System.out.println("    -> Bandolin 2");

        System.out.println("-> Instrumentos adicionadas ao estoque: ");
        System.out.println(inventoryInstruments.toString());

        // -----------------------------------------------------------------------------------------

        GuitarSpec specSearch = new GuitarSpec(Model.LES_PAUL, Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD,
                TopWood.ALDER);
        Guitar parametrosGuitarra = new Guitar("456", 250, specSearch);
        System.out.println("Guitarra sendo pesquisada: ".concat(parametrosGuitarra.toString()));

        Instrument instrumentFounded = inventoryInstruments.instrumentSearch(parametrosGuitarra);
        if (instrumentFounded == null) {
            System.out.println("Nenhuma guitarra encontrada.");
            return;
        }
        System.out.println("Guitarra encontrada: ".concat(instrumentFounded.toString()));
        return;
    }
}
