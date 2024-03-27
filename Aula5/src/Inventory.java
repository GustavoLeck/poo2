import java.util.*;

public class Inventory {
    private List<Instrument> Inventory;

    public Inventory() {
        Inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(
            String serialNumber,
            double price,
            InstrumentSpec spec) {
        Instrument instrument = null;

        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, spec);
        }

        if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, spec);
        }

        Inventory.add(instrument);
        return;
    }

    public Instrument getInstrument(String serialNumber) {

        for (Instrument instrumentNow : Inventory) {
            if (instrumentNow.getSerialNumber() == serialNumber) {
                return instrumentNow;
            }
        }
        return null;
    }

    public List<Instrument> instrumentSearch(Instrument searchInstrument) {
        List<Instrument> findedInstruments = new LinkedList<Instrument>();
        for (Instrument instrumentNow : Inventory) {
            if (instrumentNow instanceof Guitar) {
                Guitar guitar = (Guitar) searchInstrument;
                if (guitar.getSpec().matches(searchInstrument.getSpec())) {
                    findedInstruments.add(instrumentNow);
                    continue;
                }
            }
            if (instrumentNow instanceof Mandolin) {
                Mandolin mandolin = (Mandolin) instrumentNow;
                if (mandolin.getSpec().matches(instrumentNow.getSpec())) {
                    findedInstruments.add(instrumentNow);
                    continue;
                }
            }
        }
        return findedInstruments;
    }

}
