import java.util.List;

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
        inventoryInstruments.addInstrument("def456", 140, guitarSpec2);

        System.out.println("    -> Guitarra 3");
        InstrumentSpec guitarSpec3 = new GuitarSpec(Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD, TopWood.ALDER,
                Model.LES_PAUL, 12);
        inventoryInstruments.addInstrument("def456", 140, guitarSpec3);

        System.out.println("    -> Bandolin 1");
        InstrumentSpec bandolin1 = new MandolinSpec(Builder.FENDER, Type.ACOUSTIC, BackWood.ALDER, TopWood.ALDER,
                Model.LES_PAUL, Estilo.INLAY);
        inventoryInstruments.addInstrument("ghi789", 90, bandolin1);

        System.out.println("    -> Bandolin 2");
        InstrumentSpec bandolin2 = new MandolinSpec(Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD, TopWood.ALDER,
                Model.LES_PAUL, Estilo.INLAY);
        inventoryInstruments.addInstrument("jkl741", 110, bandolin2);

        System.out.println("-> Instrumentos adicionadas ao estoque: ");
        System.out.println(inventoryInstruments.toString());

        // -----------------------------------------------------------------------------------------

        InstrumentSpec specSearch = new GuitarSpec(Builder.GIBSON, Type.ELETRIC, BackWood.BASSWOOD, TopWood.ALDER,
                Model.LES_PAUL, 12);
        Instrument parametrosInstrumento = new Guitar("456", 250, specSearch);

        System.out.println("Guitarra sendo pesquisada: ".concat(parametrosInstrumento.toString()));

        List<Instrument> instrumentFounded = inventoryInstruments.instrumentSearch(parametrosInstrumento);
        if (instrumentFounded == null) {
            System.out.println("Nenhuma guitarra encontrada.");
            return;
        }
        System.out.println("Guitarra encontrada: ");
        System.out.println(instrumentFounded);
        return;
    }
}
